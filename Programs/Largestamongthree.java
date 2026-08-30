import java.util.Scanner;


class Largestamongthree {
    public static void main(String[] args) {

  //Program to find largest among three

Scanner in=new Scanner(System.in);
int a,b,c;
System.out.print("Enter Num1: ");
a=in.nextInt();

System.out.print("Enter Num2: ");
b=in.nextInt();

System.out.print("Enter Num3: ");
c=in.nextInt();

int max=a;

if(b>max){
max=b;
}
if(c>max){
    max=c;
}

System.out.println(max);


        /*Using math approach

int max=Math.max(c,Math.max(a,b));



        
        */

    }
}
