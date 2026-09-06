# ☕ ArrayList in Java

### 1. What is ArrayList?
- **Dynamic Array:** Resizable array that grows or shrinks dynamically.
- Duplicates are allowed, and insertion order is preserved.

---

### 2. Quick Cheat Sheet of Methods
| Method | Description | Example |
|---|---|---|
| `add(x)` | Appends element | `a.add(10);` |
| `add(index, x)` | Inserts at specific index | `a.add(0, 50);` |
| `get(index)` | Retrieves element | `int val = a.get(2);` |
| `set(index, x)` | Updates element at index | `a.set(1, 100);` |
| `remove(index)` | Removes element at index | `a.remove(2);` |
| `size()` | Number of elements | `a.size();` |
| `contains(x)` | Checks if element exists | `a.contains(10);` |
| `indexOf(x)` | Finds first occurrence index | `a.indexOf(20);` |
| `clear()` | Deletes all elements | `a.clear();` |

---

### 3. Crucial Pitfalls & Coding Patterns

#### ⚠️ Pitfall: Removing Elements in a Loop
When you remove an element during traversal, the list shifts left. You must decrement your index pointer (`i--`) to avoid skipping elements.
```java
// Correct way to filter/remove elements
for (int i = 0; i < a.size(); i++) {
    if (a.get(i) < 0 || a.get(i) > 100) {
        a.remove(i);
        i--; // Adjust index after removal
    }
}
```

#### 🔄 Rotating a List (Right shift by K)
```java
for (int i = 0; i < k; i++) {
    int last = a.remove(a.size() - 1);
    a.add(0, last); // Add to the front
}
```

#### 🧮 Helpful `Collections` Functions
```java
Collections.sort(a);                 // Sorts list in ascending order
int freq = Collections.frequency(a, 10); // Returns frequency of 10 in list
a.addAll(b);                         // Merges list b into list a
```
