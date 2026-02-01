package session06;

import java.util.regex.Pattern;

public class User {
    private String id ;
    private String username ;
    private String password ;
    private String email ;

    public User(String id, String username, String password, String email ){
        this.id=id ;
        this.username=username ;
        if(!password.equals("")){
            this.password = password;
        }else {
            System.out.println("ko set dc mảng rỗng cho mật khẩu");
        };
        boolean result = Pattern.compile("^[A-Za-z0-9]+@gmail\\.com$").matcher(email).matches();
        if (result){
            this.email = email;
        }
    }

    public String getUsername() {
        return username;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(!password.equals("")){
            System.out.println("set mật khẩu thành cng");
            this.password = password;

        }else {
            System.out.println("ko set dc mảng rỗng cho mật khẩu");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void printInfo() {
        System.out.println("===== USER INFO =====");
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

    public void setEmail(String email) {
        boolean result = Pattern.compile("^[A-Za-z0-9]+@*gmail\\.com$").matcher(email).matches();
        if (result){
            System.out.println("set email thành cng");
            this.email = email;
        }
    }
}
