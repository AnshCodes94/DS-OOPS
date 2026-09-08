# 📋 LinkedList Questions & Solutions

---

### Q1 — Words Starting With a Character (`A.java`)
Read $N$ strings into a `LinkedList<String>` and a character `ch`.
Print only those words that start with `ch`, preserving their original order.

**Input:**
```
7
apple banana application mango apricot orange ant
a
```

**Output:**
```
apple application apricot ant
```

---

### Q2 — Longest String (`B.java`)
Read $N$ strings into a `LinkedList<String>`. Find and print:
- Longest string
- Its index
- Its length

*(If multiple strings have the same max length, print the first one)*

**Input:**
```
6
cat elephant dog butterfly lion tiger
```

**Output:**
```
Longest: butterfly
Index: 3
Length: 9
```

---

### Q3 — Palindrome Words (`C.java`)
Read $N$ strings into an `ArrayList<String>`. Print only the strings that are palindromes. Comparison should be case-insensitive.

**Input:**
```
7
madam hello Racecar apple level Java radar
```

**Output:**
```
madam Racecar level radar
```

---

### Q4 — Student Name + Marks (`D.java`)
Maintain two lists: `names` (`String`) and `marks` (`Integer`).
Read $N$ students. Print the student having the highest marks along with marks and index.

**Input:**
```
5
Aman 78
Riya 92
Karan 85
Simran 92
Raj 70
```

**Output:**
```
Top Student: Riya
Marks: 92
Index: 1
```

---

### Q5 — Remove Names Based on String Condition (`E.java`)
Read $N$ names into a `LinkedList<String>`. Remove every name whose length is less than 5.
Then print remaining names and the count of removed names.

**Input:**
```
7
Aman Rahul Raj Simran Karan Ali Priya
```

**Output:**
```
Rahul Simran Karan Priya
Removed: 3
```

---

### Q6 — Password Validator (`F.java`)
Read $N$ passwords. A password is valid if:
- Length $\ge 8$
- Contains at least 1 uppercase letter
- Contains at least 1 lowercase letter
- Contains at least 1 digit

Print each password followed by `Valid` or `Invalid`.

**Input:**
```
5
Hello123
hello123
HELLO123
HelloWorld
Java@123
```

**Output:**
```
Hello123: Valid
hello123: Invalid
HELLO123: Invalid
HelloWorld: Invalid
Java@123: Valid
```

---

### Q7 — Convert Names to Proper Case (`G.java`)
Read $N$ names into a `LinkedList<String>`. Modify every name so that the first letter becomes uppercase and remaining letters become lowercase.

**Input:**
```
6
rAhUl AMAN riYa sImRaN karan pRiYa
```

**Output:**
```
Rahul Aman Riya Simran Karan Priya
```

---

### Q8 — Remove Consecutive Duplicate Elements (`H.java`)
Remove an element only if it is immediately repeated *(consecutive duplicates only)*.

**Input:**
```
10
10 10 20 30 30 30 40 20 20 50
```

**Output:**
```
10 20 30 40 20 50
```

---

### Q9 — Reverse Every String (`I.java`)
Read strings into a list. Reverse each individual string but don't reverse the list order.

**Input:**
```
5
hello java code world apple
```

**Output:**
```
olleh avaj edoc dlrow elppa
```

---

### Q10 — Two LinkedLists: Common Elements (`J.java`)
Read two `LinkedList<Integer>` objects. Print elements that occur in both lists preserving first list order without duplicate entries.

**Input:**
```
7
10 20 30 40 50 60 70
6
30 10 80 50 90 20
```

**Output:**
```
10 20 30 50
```

---

### Q11 — Student Result Processor (`K.java`)
Read name and marks into two parallel lists. Then print:
- Names of students who passed ($\ge 40$)
- Average marks (formatted to 2 decimals)
- Number of students above average

**Input:**
```
6
Aman 80
Riya 35
Karan 70
Simran 90
Raj 30
Neha 60
```

**Output:**
```
Passed Students: Aman Karan Simran Neha
Average: 60.83
Above Average: 3
```

---

### Q12 — Sentence Word Processor (`L.java`)
Read one complete sentence, split into words, and store in an `ArrayList<String>`. Then:
1. Print number of words.
2. Print longest word.
3. Print shortest word.
4. Print words starting with a vowel.
5. Print the sentence with every word reversed.

**Input:**
```
Java programming makes problem solving interesting
```

**Output:**
```
Word Count: 6
Longest: programming
Shortest: Java
Vowel Words: interesting
Reversed: avaJ gnimmargorp sekam melborp gnivlos gnitseretni
```
