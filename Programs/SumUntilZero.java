import java.util.Scanner;

class  SumUntilZero {
    public static void main(String[] args) {

//Subtract the Product and Sum of Digits of an Integer

Scanner in =new Scanner(System.in);


System.out.print("Enter number: ");
int num=in.nextInt();
int sum=0;

while(num!=0){
sum=sum+num;
System.out.print("Enter number: ");
num=in.nextInt();

}

System.out.print("Sum of numbers: "+sum);







    }
    }
