import java.util.Scanner;

class  ProductandSumSubstract {
    public static void main(String[] args) {


Scanner in =new Scanner(System.in);

System.out.print("Enter Number: ");
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

System.out.println("Answer is: "+(prod-sum));

    }
}
