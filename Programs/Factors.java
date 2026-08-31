import java.util.Scanner;

class  Factors {
    public static void main(String[] args) {

//Subtract the Product and Sum of Digits of an Integer

Scanner in =new Scanner(System.in);

System.out.print("Enter Number to Find Factors: ");
int num=in.nextInt();
 System.out.println("The Factors are: ");
for(int i=1;i<=num;i++){

if(num%i==0){
    System.out.println(i);
}

}

    }
}
