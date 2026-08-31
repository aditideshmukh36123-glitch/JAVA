import java.util.Scanner;


class CountOccurance {
    public static void main(String[] args) {
        
/*

//Count the occurance of any number entered by user from the number entered by user

*/

Scanner in=new Scanner(System.in);
System.out.print("Enter a Number: ");

/*
If the number is too big
System.out.print("Enter a Number: ");
BigInteger n = in.nextBigInteger();
*/
      
long num=in.nextLong();

System.out.print("Enter the number you want to count the occurance of : ");
int f=in.nextInt();


int count=0;

long temp=0;

while(num>0){


    temp=num%10;
    num=num/10;

    if(temp==f){
        count++;
    }
}


System.out.println(f+" Occured "+count+" Times");
















    }}
