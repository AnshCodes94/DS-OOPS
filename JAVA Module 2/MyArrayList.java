import java.util.*;

interface MyList {
    void add(int x);
    void add(int index, int x);
    void remove(int index);
    int get(int index);
    int size();
}

public class MyArrayList implements MyList {
    int[] a = new int[10];
    int size = 0;

    @Override
    public void add(int x) {
        if (size == a.length) {
            a = Arrays.copyOf(a, size * 2);
        }
        a[size] = x;
        size++;
    }

    public void add(int index, int x) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == a.length) {
            a = Arrays.copyOf(a, size * 2);
        }
        for (int i = size; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = x;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return a[index];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(1, 15);

        System.out.println("Size: " + list.size());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.remove(1);
        System.out.println("Size after removal: " + list.size());
        System.out.println("Element at index 0 after removal: " + list.get(0));
        System.out.println("Element at index 1 after removal: " + list.get(1));
    }
}
