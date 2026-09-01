import java.util.Scanner;

class SimpleSwitch {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter number of day : ");
        int choice=in.nextInt();


        switch(choice){

        case 1:
         System.out.println("Monday....");
         break;
        case 2:
         System.out.println("Tuesday....");
         break;
         case 3:
         System.out.println("Wenesday....");
         break;
         case 4:
         System.out.println("Friday....");
         break;
         case 5:
         System.out.println("Saturday....");
         break;
         case 6:
         System.out.println("Sunday....");
         break;
         default:
         System.out.println("Enter valid number....");
         

        }

    }


}
