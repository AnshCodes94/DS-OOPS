# 📋 Exception Handling Questions & Solutions

---

### Q1 — ArithmeticException (`A.java`)
Read two integers `a` and `b`. Calculate `a / b`.
If `b == 0`, catch `ArithmeticException` and print `Cannot divide by zero`. Otherwise print the result.

**Input:**
```
20 4
```
**Output:**
```
5
```

**Input:**
```
20 0
```
**Output:**
```
Cannot divide by zero
```

---

### Q2 — try + catch + finally (`B.java`)
Read two integers `a` and `b`. Perform `a / b` using `try`, `catch`, and `finally`.
If division by zero occurs, catch `ArithmeticException` and print `Cannot divide by zero`.
In the `finally` block, always print `Operation completed`.

**Input:**
```
20 5
```
**Output:**
```
4
Operation completed
```

**Input:**
```
20 0
```
**Output:**
```
Cannot divide by zero
Operation completed
```

---

### Q3 — ArrayIndexOutOfBoundsException (`C.java`)
Read $N$ integers into an array, then read an index `x`. Print the element at index `x`.
If the index is invalid, catch `ArrayIndexOutOfBoundsException` and print `Invalid index`.

**Input:**
```
5
10 20 30 40 50
2
```
**Output:**
```
30
```

**Input:**
```
5
10 20 30 40 50
8
```
**Output:**
```
Invalid index
```

---

### Q4 — NumberFormatException (`D.java`)
Read a String `s` and convert it into an integer using `Integer.parseInt(s)`.
If successful, print the number multiplied by 2.
If not a valid integer, catch `NumberFormatException` and print `Invalid Number`.

**Input:**
```
25
```
**Output:**
```
50
```

**Input:**
```
abc
```
**Output:**
```
Invalid Number
```

---

### Q5 — Custom Exception: Insufficient Balance (`E.java`)
Create `InsufficientBalanceException` extending `Exception`.
Read initial balance and withdrawal amount.
If withdrawal amount $>$ balance, throw custom exception with message `Insufficient Balance`.
Catch it and print the message. Otherwise print remaining balance.

**Input:**
```
5000
2000
```
**Output:**
```
3000
```

**Input:**
```
5000
7000
```
**Output:**
```
Insufficient Balance
```

---

### Q6 — Custom Exception + ArrayList (`F.java`)
Read $N$ quantities. A quantity is invalid if quantity $< 0$.
Create `InvalidQuantityException`.
For each invalid quantity:
- Throw exception and catch immediately
- Print `Invalid quantity: X`
- Skip that number

Store valid quantities in an `ArrayList` and print the sum of all valid quantities.

**Input:**
```
5
10 -5 20 -3 15
```
**Output:**
```
Invalid quantity: -5
Invalid quantity: -3
45
```

---

### Q7 — TreeSet + Exception (`G.java`)
Read $N$ integers and store them in a `TreeSet<Integer>`.
If a number is outside $0$ to $100$, throw and catch `InvalidNumberException` and print `Invalid Input`.
For valid input, `TreeSet` automatically removes duplicates and sorts ascending.

**Input:**
```
7
40 10 30 20 40 10 50
```
**Output:**
```
10 20 30 40 50
```

---

### Q8 — Custom Exception + Book Inventory (`H.java`)
Create `Book` class with `title` and `copies`.
Create `BookNotAvailableException`.
Read $N$ books (title and copies), then read a requested book title.
- If book exists and copies $> 0$: decrease copies by 1 and print `Issued: title`
- Otherwise throw custom exception and print `Book not available: title`

**Input:**
```
3
JavaBasics 2
DataStructures 0
Algorithms 1
JavaBasics
```
**Output:**
```
Issued: JavaBasics
```

---

### Q9 — Multiple Catch (`I.java`)
Read two integers `a` and `b`.
Inside `try`, calculate `a / b` and access array `arr[a]` where `arr` has size 3.
Handle separately:
- `ArithmeticException` $\rightarrow$ print `Division Error`
- `ArrayIndexOutOfBoundsException` $\rightarrow$ print `Index Error`

**Input:**
```
10 2
```
**Output:**
```
5
Index Error
```

---

### Q10 — Student Result Validator (`J.java`)
Read $N$ student marks.
Create `InvalidMarksException`. A mark is invalid if `marks < 0 || marks > 100`.
For each invalid mark:
- Throw, catch, and print `Invalid marks: X`
- Skip invalid mark

For valid marks:
- Store in `ArrayList<Integer>`
- Print `Highest: X` and `Average: XX.XX`

**Input:**
```
7
80 90 -5 70 120 60 90
```
**Output:**
```
Invalid marks: -5
Invalid marks: 120
Highest: 90
Average: 78.00
```
