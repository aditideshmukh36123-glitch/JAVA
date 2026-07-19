

import java.util.Scanner;

class Sumofnaturalnumbers {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
System.out.print("Enter The Number: ");
int n=scan.nextInt();
int sum=0;

for(int i=1;i<=n;i++){
    sum=sum+i;

}
System.out.println("Sum is: "+sum);
    }
}
