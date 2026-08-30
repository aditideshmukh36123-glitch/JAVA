import java.util.Scanner;


class Fibonacci {
    public static void main(String[] args) {
/*
Fibonacci Series Logic

0 , 1 , 0+1=1, 1+1=2, 1+2=3 , 2+3=5,.........

means new term = addition of previous two terms

a=0
b=1

temp=a+b
a=b
b=temp
 
 this happens till the nth term means,
loop extecutes nth -2 times beacuse first two terms are already there
*/




Scanner in=new Scanner(System.in);
System.out.print("Enter nth term: ");
int n=in.nextInt();


int a=0;
int b=1;
int temp;
System.out.print(a+" "+b);
for(int i=2;i<n;i++){

temp=a+b;
System.out.print(" "+temp);
a=b;
b=temp;



}


 }    
    }




 /*
Fibonacci Series

0, 1, 0+1=1, 1+1=2, 1+2=3, 2+3=5, ...

The new term is calculated by adding the previous two terms.

a = 0
b = 1

temp = a + b
a = b
b = temp

The first two terms (0 and 1) are already initialized.
Therefore, the loop starts from the 3rd term and executes
(n - 2) times to generate the remaining terms.
*/   
