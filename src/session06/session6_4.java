package session06;

public class session6_4 {

        public static void main(String[] args) {
            Employee e1 = new Employee();



            Employee e2 = new Employee("NV01", "Nguyễn Văn A");
            e2.id="sdf";

            Employee e3 = new Employee("NV02", "Trần Thị B", 15000000);

            e1.printInfo();
            System.out.println("-------------------");
            e2.printInfo();
            System.out.println("-------------------");
            e3.printInfo();
        }

}
