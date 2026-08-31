import java.util.Scanner;


class LeapYear {
    public static void main(String[] args) {


/*
Leap Year

A year is a leap year if:

1. The year is divisible by 4
   AND
2. The year is NOT divisible by 100
   OR
3. The year is divisible by 400

Divisible by 4
      ↓
   Check 100
   ↙       ↘
No         Yes
↓           ↓
Leap    Check 400
            ↓
       Yes → Leap
       No  → Not Leap








*/








 Scanner in = new Scanner(System.in);

 System.out.print("Enter a Year : ");
 int year=in.nextInt();


if((year%4==0)&&(year%100!=0|| year%400==0)){

    System.out.println("Leap");
}else{
        System.out.println("Not Leap");

}



  }
    }
