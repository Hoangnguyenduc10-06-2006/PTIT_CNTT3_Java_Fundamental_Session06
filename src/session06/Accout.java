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
       int hidepass= this.password.length();
        System.out.printf( "username: %s \n email: %s \n pass:",this.username,this.email);
        for (int i =0 ;i<hidepass ;i++){
            System.out.print( "x");
            if (i == hidepass-1){
                System.out.print( "\n");
            }
        }
    }
}
