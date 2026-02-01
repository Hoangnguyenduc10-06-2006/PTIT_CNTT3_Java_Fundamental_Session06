package session06;

public class Accout {
     String username ;
     String password ;
     String email ;

    public Accout( String username , String password , String email){
        this.username=username ;
        this.password=password ;
        this.email=email ;
    }

    public void changepass(String newPass){
        this.password=newPass;
    }

    public void printAccout(){
        System.out.printf( "username: %s \n email: %s",this.username,this.email);
    }

}
