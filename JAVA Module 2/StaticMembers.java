class Employee {
    int empid;
    String name;
    static int nextEmpid = 101;
    public Employee(String name) {
        this.name = name;
        empid = nextEmpid;
        nextEmpid++;
    }
    public void show() {
        System.out.println("Employeee " + empid + " : " + name);
    }
}

class StaticMembers
 {
    public static void main(String[] args) {
        System.out.println("helloo");
        Employee e1 = new Employee("Akhilesh");
        Employee e2 = new Employee("Ansh");
        Employee e3 = new Employee("Kanav");
        e1.show();
        e2.show();
        e3.show();

    }
}