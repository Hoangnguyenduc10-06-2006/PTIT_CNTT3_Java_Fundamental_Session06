package session06;

public class Employee {
     String id;
    private String name;
    private double salary;

    public Employee(){
        this.id=null;
        this.name=null;
        this.salary=0;
    }
    public Employee(String id,String name){
        this.id=id;
        this.name=name;
        this.salary=0;
    }
    public Employee(String id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void printInfo() {
        System.out.println("Mã NV: " + id);
        System.out.println("Tên NV: " + name);
        System.out.println("Lương: " + salary);
    }

}
