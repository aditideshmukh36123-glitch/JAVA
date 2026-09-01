import java.util.Scanner;

public class Space {

    public static void main(String[] args) {



// ================================
// java           100 
// cpp            065 
// python         050 
// ================================
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                
                String s1=sc.next();
                int x=sc.nextInt();
                String s=""+x;
                
                if(x<100){
                     s="0"+x;
                }
                
                int l=s1.length();
                String sp="";
                int spaces=15-l;
                for(int j=1;j<=spaces;j++){
                    
                    sp=sp+" ";
                }
                
                
                
                System.out.println(s1+sp+s);
                

                
                
                
            }
            System.out.println("================================");

    }
}



