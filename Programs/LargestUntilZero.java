import java.util.Scanner;

class  Factors {
    public static void main(String[] args) {

//Take integer inputs till the user enters 0 and print the largest number from all.

Scanner in =new Scanner(System.in);


System.out.print("Enter number: ");
int num=in.nextInt();
int max=0;

while(num!=0){

    if(num>max){
        max=num;
    }
System.out.print("Enter number: ");
num=in.nextInt();

}
System.out.println("Largest: "+max);







    }
    }
