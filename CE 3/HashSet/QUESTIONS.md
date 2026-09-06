# 📋 HashSet Questions & Solutions

---

### Q1 — Remove Duplicates (`A.java`)
Read $N$ integers and use `HashSet<Integer>` to remove duplicates.

**Input:**
```
8
10 20 10 30 20 40 30 50
```

**Output:**
```
10 20 30 40 50
```

---

### Q2 — Count Unique Elements (`B.java`)
Read $N$ integers and print the number of unique elements using `HashSet`.

**Input:**
```
7
10 20 20 30 40 40 50
```

**Output:**
```
5
```

---

### Q3 — Check Whether Duplicates Exist (`C.java`)
Read $N$ integers.
- Print `Duplicate Found` if any number occurs more than once.
- Otherwise print `No Duplicate`.

**Input:**
```
6
10 20 30 20 40 50
```

**Output:**
```
Duplicate Found
```

**Input:**
```
5
10 20 30 40 50
```

**Output:**
```
No Duplicate
```

---

### Q4 — Common Elements (`D.java`)
Read two sets of integers and print elements that occur in both.
If nothing is common, print `No Common Element`.

**Input:**
```
6
10 20 30 40 50 60
5
20 40 70 80 60
```

**Output:**
```
20 40 60
```

---

### Q5 — Union of Two Sets (`E.java`)
Read two sets of integers and print their union (every distinct element appearing in either set).

**Input:**
```
4
10 20 30 40
5
30 40 50 60 70
```

**Output:**
```
10 20 30 40 50 60 70
```

---

### Q6 — First Set but NOT Second (`F.java`)
Read two sets of integers. Print elements that are present in the first set but not in the second set.
If nothing remains, print `No Unique Element`.

**Input:**
```
5
10 20 30 40 50
3
20 40 60
```

**Output:**
```
10 30 50
```

---

### Q7 — Remove Duplicate Words (`G.java`)
Read $N$ words and use `HashSet<String>` to remove duplicate words.

**Input:**
```
7
Java is easy Java is powerful Java
```

**Output:**
```
Java is easy powerful
```

---

### Q8 — Find Missing Number (`H.java`)
You are given numbers from $1$ to $N+1$, with one number missing ($N$ numbers total).
Use a `HashSet<Integer>` to find and print the missing number.

**Input:**
```
9
1 2 3 4 5 6 8 9 10
```

**Output:**
```
Missing Number = 7
```

---

### Q9 — Find All Duplicate Elements (`I.java`)
Read $N$ integers. Print every number that occurs more than once, but print each duplicate only once.

**Input:**
```
9
1 2 3 2 4 5 1 6 3
```

**Output:**
```
1 2 3
```

---

### Q10 — String + HashSet (`J.java`)
Read $N$ strings representing student names.
- If every name is unique, print `All names are unique`
- Otherwise print `Duplicate names found`
- Then print `Unique names: X`

**Input:**
```
6
Aman Riya Karan Simran Aman Neha
```

**Output:**
```
Duplicate names found
Unique names: 5
```

**Input:**
```
5
Aman Riya Karan Simran Neha
```

**Output:**
```
All names are unique
Unique names: 5
```
