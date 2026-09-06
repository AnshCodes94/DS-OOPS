# ⚠️ Exception Handling in Java

### 1. Core Keywords
- **`try`**: Wraps the risky code that might throw an exception.
- **`catch`**: Handles the specific exception if it occurs.
- **`finally`**: Cleanup block that **always** executes, whether an exception occurs or not.
- **`throw`**: Used to explicitly throw an exception object (`throw new MyException("Error");`).
- **`throws`**: Declared in method signature to indicate it might pass an exception up the call stack (`void check() throws Exception`).

---

### 2. Common Built-in Exceptions
| Exception | Trigger Condition |
|---|---|
| `ArithmeticException` | Division by zero (`10 / 0`) |
| `ArrayIndexOutOfBoundsException` | Accessing invalid array index (`arr[10]` when size is 3) |
| `NumberFormatException` | Converting invalid string to number (`Integer.parseInt("abc")`) |
| `NullPointerException` | Accessing method/property on a `null` reference |

---

### 3. Custom Exception Pattern
```java
class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}
```

#### Usage & Throwing:
```java
if (quantity < 0) {
    throw new InvalidQuantityException("Invalid quantity: " + quantity);
}
```

#### Catching & Message Extraction:
```java
try {
    // risky logic or validation
} catch (InvalidQuantityException e) {
    System.out.println(e.getMessage());
}
```

---

### 4. Collection + Exception Pattern
When invalid items need to be skipped while continuing to process valid items:
```java
ArrayList<Integer> validList = new ArrayList<>();
for (int i = 0; i < n; i++) {
    int val = sc.nextInt();
    try {
        if (val < 0 || val > 100) {
            throw new InvalidMarksException("Invalid marks: " + val);
        }
        validList.add(val);
    } catch (InvalidMarksException e) {
        System.out.println(e.getMessage());
    }
}
```

---

### 5. Multiple Catch Rules
- Order matters: Always catch **subclasses (specific exceptions)** first, followed by **superclasses (`Exception`)**.
```java
try {
    int res = a / b;
    System.out.println(arr[a]);
} catch (ArithmeticException e) {
    System.out.println("Division Error");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index Error");
}
```
