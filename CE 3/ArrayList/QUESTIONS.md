# 📋 ArrayList Questions & Solutions

---

### Q1 — Max, Min, Average (`A.java`)
Read $N$ integers into an `ArrayList`. Print the highest, lowest, and average.

**Input:**
```
5
10 40 20 80 30
```

**Output:**
```
HIGHEST : 80
LOWEST : 10
AVERAGE : 36.00
```

---

### Q2 — Remove Duplicates (`B.java`)
Read $N$ integers into an `ArrayList`. Remove all duplicate elements and print the remaining list.

**Input:**
```
7
10 20 10 30 20 40 30
```

**Output:**
```
[10, 20, 30, 40]
```

---

### Q3 — Merge Two Lists and Sort (`C.java`)
Read two `ArrayList`s of integers (size $N$ and $M$). Merge them into one and print in sorted order.

**Input:**
```
3
10 50 30
4
20 40 10 60
```

**Output:**
```
[10, 10, 20, 30, 40, 50, 60]
```

---

### Q4 — Second Largest Element (`D.java`)
Read $N$ integers into an `ArrayList`. Find and print the second largest distinct element.

**Input:**
```
6
10 80 30 80 50 20
```

**Output:**
```
50
```

---

### Q5 — Search Element (`E.java`)
Read $N$ integers into an `ArrayList`, then read a target number.
- If found, print `Found`, its first index, and how many times it appears.
- If not found, print `Not Found`.

**Input:**
```
6
10 20 30 20 40 20
20
```

**Output:**
```
Found
1
3
```

---

### Q6 — Filter Invalid Marks (`F.java`)
Read $N$ marks. Remove any mark that is less than 0 or greater than 100.
From valid marks print:
- All valid marks
- Highest
- Lowest
- Average
- Count of students who passed ($\ge 40$)

**Input:**
```
6
85 -5 90 110 40 60
```

**Output:**
```
Valid Marks: 85 90 40 60
Highest: 90
Lowest: 40
Average: 68.75
Pass Count: 4
```

---

### Q7 — Rotate ArrayList by K (`G.java`)
Read $N$ integers into an `ArrayList` and a number $K$. Rotate the list right by $K$ positions and print.

**Input:**
```
5
10 20 30 40 50
2
```

**Output:**
```
40 50 10 20 30
```

---

### Q8 — Frequency of Each Element (`H.java`)
Read $N$ integers into an `ArrayList`. For each unique element, print how many times it appears. Print each element only once.

**Input:**
```
8
10 20 10 30 20 10 40 30
```

**Output:**
```
10: 3
20: 2
30: 2
40: 1
```

---

### Q9 — Separate Even and Odd (`I.java`)
Read $N$ integers into an `ArrayList`. Print all even numbers on one line and all odd numbers on the next.

**Input:**
```
7
10 15 20 33 42 7 8
```

**Output:**
```
Even: 10 20 42 8
Odd: 15 33 7
```
