import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        long num = in.nextLong();

        int count = 0;
        long temp = num;
        long digit;
        long arm = 0;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = num;

        while (temp > 0) {

            digit = temp % 10;
            temp = temp / 10;

            long power = 1;

            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            arm = arm + power;
        }

        System.out.println("Armstrong value: " + arm);

        if (arm == num) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
