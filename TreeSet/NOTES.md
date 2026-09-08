# 🌳 TreeSet in Java

### 1. What is TreeSet?
- **TreeSet = UNIQUE + SORTED**
- Automatically removes duplicates and sorts elements.
- **NO Index:** No positioning exists.

#### Example:
```java
TreeSet<Integer> a = new TreeSet<>();
a.add(50);
a.add(10);
a.add(30);
a.add(20);
a.add(10);
a.add(40);
System.out.println(a); // Output: [10, 20, 30, 40, 50]
```

---

### 2. TreeSet vs HashSet
| Property | HashSet | TreeSet |
|---|---|---|
| **Duplicates** | Unique elements only | Unique elements only |
| **Ordering** | No guaranteed order | Sorted order |

---

### 3. TreeSet Special Navigation Methods
Given: `TreeSet = [10, 20, 30, 40, 50]`

| Method | Definition | Example `(x = 30)` | Output |
|---|---|---|---|
| `first()` | Lowest element | `a.first()` | `10` |
| `last()` | Highest element | `a.last()` | `50` |
| `higher(x)` | Strictly greater than `x` `(> x)` | `a.higher(30)` | `40` |
| `lower(x)` | Strictly smaller than `x` `(< x)` | `a.lower(30)` | `20` |
| `ceiling(x)` | Greater than or equal to `x` `(>= x)` | `a.ceiling(30)` | `30` <br> `a.ceiling(35)` -> `40` |
| `floor(x)` | Less than or equal to `x` `(<= x)` | `a.floor(30)` | `30` <br> `a.floor(35)` -> `30` |

⚠️ **Important Note:** If no valid value matches the condition (e.g. `higher(50)` on `[10, 20, 30, 40, 50]`), it returns `null`.

---

### 4. Full TreeSet Example
```java
import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(a);
        System.out.println("First: " + a.first());
        System.out.println("Last: " + a.last());
        int x = sc.nextInt();
        System.out.println("Higher: " + a.higher(x));
        System.out.println("Lower: " + a.lower(x));
        System.out.println("Ceiling: " + a.ceiling(x));
        System.out.println("Floor: " + a.floor(x));
    }
}
// Input:
// 7
// 50 10 30 20 10 40 60
// 30
// Output:
// [10, 20, 30, 40, 50, 60]
// First: 10
// Last: 60
// Higher: 40
// Lower: 20
// Ceiling: 30
// Floor: 30
```

---

### 5. String Example
```java
TreeSet<String> names = new TreeSet<>();
names.add("Riya");
names.add("Aman");
names.add("Karan");
names.add("Aman");
System.out.println(names); // [Aman, Karan, Riya] (Alphabetical order)
```
