
# React Native Turbo Module: Utility Functions

This Turbo Module provides utility functions for string manipulation, retrieving data, and handling asynchronous operations in a React Native application. The module is designed to offer a simple interface for common operations like reversing a string, getting an array of numbers, fetching an object, and working with callbacks and promises.

## Installation

Ensure you have the necessary setup to use React Native Turbo Modules. Typically, you would install this module using your package manager, such as npm or yarn:

```bash
npm install your-module-name
# or
yarn add your-module-name
```

## Usage

Import the functions from the module and use them in your React Native application:

```javascript
import {
  reverseString,
  getNumbers,
  getObject,
  callMeLater,
  promiseNumber
} from 'your-module-name';
```

### Functions

#### 1. `reverseString(str: string): string`

Reverses the input string and returns the reversed string.

**Parameters:**

- `str`: A string that you want to reverse.

**Example:**

```javascript
const reversed = reverseString("hello");
console.log(reversed); // Output: "olleh"
```

#### 2. `getNumbers(): Array<number>`

Returns an array of numbers. The implementation of how the numbers are retrieved or generated is handled by the native module.

**Example:**

```javascript
const numbers = getNumbers();
console.log(numbers); // Output: [array of numbers]
```

#### 3. `getObject(): Record<string, string>`

Returns an object with key-value pairs. The structure and content of the object are defined by the native module.

**Example:**

```javascript
const obj = getObject();
console.log(obj); // Output: { key: "value", ... }
```

#### 4. `callMeLater(successCB: () => void, failureCB: () => void)`

Executes the `successCB` callback function if the operation is successful, otherwise executes the `failureCB` callback function. This function is useful for handling asynchronous tasks with success and failure scenarios.

**Parameters:**

- `successCB`: A callback function to be executed on success.
- `failureCB`: A callback function to be executed on failure.

**Example:**

```javascript
callMeLater(
  () => console.log("Success!"),
  () => console.log("Failure!")
);
```

#### 5. `promiseNumber(num: number): Promise<number>`

Returns a promise that resolves to a number. The specific behavior of how the number is processed is managed by the native module.

**Parameters:**

- `num`: A number that will be processed.

**Example:**

```javascript
promiseNumber(5)
  .then(result => console.log(result)) // Output: [processed number]
  .catch(error => console.error(error));
```

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
