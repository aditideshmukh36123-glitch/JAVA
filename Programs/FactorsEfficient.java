import java.util.Scanner;

class  FactorsEfficient {
    public static void main(String[] args) {


Scanner in =new Scanner(System.in);

System.out.print("Enter Number to Find Factors: ");
int num=in.nextInt();
 System.out.println("The Factors are: ");
for(int i=1;i<=(num/2);i++){

if(num%i==0){
    System.out.println(i);
}

}
System.out.println(num);
    }
}
