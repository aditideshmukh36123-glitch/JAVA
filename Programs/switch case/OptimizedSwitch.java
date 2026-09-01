import java.util.Scanner;

class OptimizedSwitch {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("Enter number of day : ");
        int choice=in.nextInt();


        switch(choice){

        case 1->System.out.println("Monday....");
        case 2->System.out.println("Tuesday....");
        case 3->System.out.println("Wenesday....");
        case 4->System.out.println("Friday....");
        case 5->System.out.println("Saturday....");
        case 6->System.out.println("Sunday....");
        default-> System.out.println("Enter valid number....");
        
         

        }

    }


}
