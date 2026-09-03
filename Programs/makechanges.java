import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int temp = n;
        

        while (temp > 0) {

            int digit = temp % 10;
            int temp2 = temp / 10;

            while (temp2 > 0) {

                int digit2 = temp2 % 10;

                if (digit == digit2) {
                    System.out.println(digit + " is duplicate");
                    break;
                }

                temp2 = temp2 / 10;
            }

            temp = temp / 10;
        }
    }
}
