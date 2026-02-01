package session06;

import java.util.Scanner;

public class session6_2 {
    public static void main(String[] args) {
        Accout acc1 =new Accout("dcu2006","123456","duc@gamil.com");
        acc1.printAccout();

        System.out.println("đổi mật khẩu");
        Scanner scanner=new Scanner(System.in);
        System.out.print("mời bạn nhập mật khaaaur mới: ");
        String newPass =scanner.nextLine();
        acc1.changepass(newPass);
        acc1.printAccout();
    }
}
