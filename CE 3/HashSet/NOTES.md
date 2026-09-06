# 🐸 HashSet in Java

### 1. What is HashSet?
- Main Difference from ArrayList: **HashSet does not store duplicate values.**
- **No Guaranteed Order:** Do not assume elements will be printed in insertion order.

#### Example:
```java
HashSet<Integer> a = new HashSet<>();
a.add(10);
a.add(20);
a.add(10);
a.add(30);
a.add(20);
System.out.println(a); // Output: [10, 20, 30] (order may vary)
```

---

### 2. How to take Input & Traverse?
- **HashSet has NO INDEX:** You cannot use `a.get(2)`, `a.set(2, 100)`, or `a.add(2, 50)`.
- Use a `for-each` loop to traverse.

```java
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> a = new HashSet<>();
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        
        // Traversal
        for(Integer num : a) {
            System.out.print(num + " ");
        }
    }
}
```

---

### 3. Key Methods & Examples

#### `add()`
Returns `boolean` (`true` if element is added, `false` if it was already present).
```java
System.out.println(a.add(10)); // true (added)
System.out.println(a.add(10)); // false (duplicate, not added)
```

#### `contains()`
Returns `boolean` if element exists.
```java
HashSet<Integer> a = new HashSet<>();
a.add(10);
a.add(20);
a.add(30);
System.out.println(a.contains(20));  // true
System.out.println(a.contains(100)); // false
```

#### `remove()`
Removes the specified value (no index matching required).
```java
HashSet<Integer> a = new HashSet<>();
a.add(10);
a.add(20);
a.add(30);
a.remove(20);
System.out.println(a); // [10, 30]
```

Other basic methods:
- `a.size()`
- `a.isEmpty()`
- `a.clear()`

---

### 4. Code Examples

#### Example 1: Remove Duplicates
```java
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println("Unique count: " + set.size());
        for(Integer num : set) {
            System.out.print(num + " ");
        }
    }
}
// Input: 8 \n 10 20 10 30 20 40 40 50
// Output: Unique count: 5 \n 10 20 30 40 50 (order may vary)
```

#### Example 2: Duplicate Detection
```java
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(!set.add(num)) {
                System.out.println(num + " is duplicate");
            }
        }
    }
}
// Input: 5 \n 10 20 30 20 10
// Output: 20 is duplicate \n 10 is duplicate
```

---

### 5. String Example
```java
HashSet<String> names = new HashSet<>();
names.add("Aman");
names.add("Riya");
names.add("Aman");
names.add("Karan");
System.out.println(names); // [Aman, Riya, Karan] (order may vary)
```
