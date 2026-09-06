# 🔗 LinkedList in Java

### 1. What is LinkedList?
- **Node-Based List:** Uses a doubly linked list architecture.
- Performance-wise: Faster insertions/removals compared to ArrayList, but slower random access (index retrieval).

---

### 2. Common Methods
Uses the same core interface as ArrayList:
- `add(x)`, `add(index, x)`
- `get(index)`, `set(index, x)`
- `remove(index)`, `remove(Object)`
- `contains(x)`, `size()`, `isEmpty()`, `clear()`

---

### 3. Key Algorithms & Patterns

#### 🔄 Reversing Strings in a List
To reverse strings in-place without reversing the collection order:
```java
for (String s : a) {
    String rev = new StringBuilder(s).reverse().toString();
    System.out.print(rev + " ");
}
```

#### 🚫 Removing Consecutive Duplicates
Compare current element with the previous one.
```java
LinkedList<Integer> b = new LinkedList<>();
b.add(a.get(0));
for (int i = 1; i < a.size(); i++) {
    if (!a.get(i).equals(a.get(i-1))) {
        b.add(a.get(i));
    }
}
```

#### 🔍 Intersection (Common Elements)
```java
for (int num : a) {
    if (b.contains(num)) {
        System.out.print(num + " ");
    }
}
```

#### 🔠 Proper Case Converter
Converts the first letter to uppercase and the rest to lowercase.
```java
for (String s : a) {
    String res = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    System.out.print(res + " ");
}
```
