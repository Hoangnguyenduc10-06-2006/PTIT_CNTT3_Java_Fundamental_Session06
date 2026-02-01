package session06;

public class session06_6 {
    public static void main(String[] args) {
        User u1 = new User("U01", "nguyenvana", "123456", "vana@gmail.com");
        u1.printInfo();
        System.out.println();

        u1.setPassword("");
        u1.printInfo();

        System.out.println();


        u1.setEmail("abc@abc.com");
        u1.printInfo();

        System.out.println();


        u1.setEmail("user123@gmail.com");
        u1.printInfo();
    }
}
