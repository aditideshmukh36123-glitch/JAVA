import java.util.Scanner;

class  ProductandSumSubstract {
    public static void main(String[] args) {

//Subtract the Product and Sum of Digits of an Integer

Scanner in =new Scanner(System.in);

System.out.println("Enter Number: ");
int num=in.nextInt();


int temp=0;
int sum=0;
int prod=1;
while(num>0){

temp=num%10;
sum=sum+temp;
prod=prod*temp;
num=num/10;

}

System.out.println(prod-sum);

    }
}
