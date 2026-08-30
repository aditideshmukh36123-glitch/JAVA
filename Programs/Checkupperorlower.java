import java.util.Scanner;


class Checkupperorlower {
    public static void main(String[] args) {


//check whether the alphabet is uppercase or lower case

System.out.print("Enter to check: ");

Scanner in=new Scanner(System.in);

char ch=in.next().trim().charAt(0);


if(ch>='a' && ch<='z'){

    System.out.println("Lowercase");
}else{
        System.out.println("Uppercase");

}


        /*
        
        if(ch>=65 && ch<=90){

    System.out.println("Upperercase");
}else{
        System.out.println("Lowercase");

}
        
        
        */







    }
    
    
    }
