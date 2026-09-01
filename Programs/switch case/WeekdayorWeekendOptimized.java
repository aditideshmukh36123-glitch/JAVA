import java.util.Scanner;

class WeekdayorWeekendOptimized {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter number of day : ");
        int choice=in.nextInt();


        switch(choice){

        case 1:
        case 2:
        case 3:
        case 4:
        case 5: 
        System.out.println("Weekday");
        break;

        case 6:
        case 7: System.out.println("Weekend");
        break;

        default:
         System.out.println("Enter valid number....");
        
         

        }

    }


}
