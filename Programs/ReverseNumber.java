import java.util.Scanner;


class ReverseNumber {
    public static void main(String[] args) {

  Scanner in = new Scanner(System.in);

 System.out.print("Enter a Number to Reverse : ");
 long num=in.nextLong();

 long temp,rev=0;

 while(num>0){

temp=num%10;
num=num/10;

rev=rev*10+temp;


 }

System.out.println(rev);


    }
    
/*
Reverse a Number

To reverse a number, we extract its digits one by one from right to left
using:

temp = num % 10;

Then we remove the last digit from the original number using:

num = num / 10;

Initially, rev = 0.

Suppose the extracted digit is 4:
rev = 0 * 10 + 4
    = 4

Now suppose the next extracted digit is 9:
rev = 4 * 10 + 9
    = 49

Multiplying rev by 10 shifts the existing digits one position to the left,
creating space for the newly extracted digit.

Therefore, the reverse is built using:

rev = rev * 10 + temp;

This process continues until all digits of the original number are processed.





Extract last digit → Remove last digit → Add digit to reversed number
       ↓                    ↓                    ↓
   num % 10              num / 10          rev * 10 + temp
   
*/
    }
