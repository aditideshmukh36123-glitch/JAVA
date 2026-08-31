import java.util.Scanner;

class  Factorial {
    public static void main(String[] args) {



Scanner in =new Scanner(System.in);


System.out.print("Enter Number to Find its Factorial: ");
int fact=in.nextInt();
int ans=1;

for(int i=1;i<=5;i++){
ans=ans*i;

}



System.out.println("Factorial of the Number is: "+ans);



    }
    }
