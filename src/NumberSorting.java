import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number..:");
        int firstNumber = scanner.nextInt();

        System.out.print("Please enter second number..:");
        int secondNumber = scanner.nextInt();

        System.out.print("Please enter third number..:");
        int thirdNumber = scanner.nextInt();

        // FirstNumber = 9 SecondNumber = 5 ThirdNumber = 1
        /*
        - 9 5 1
        - 9 1 5
        - 5 9 1
        - 1 9 5
        - 1 5 9
        - 5 1 9
        */

        if (thirdNumber < secondNumber) {
            //3. sayının 2. sayıdan küçük olma durumunda yer değişimi
            int tempNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = tempNumber; // 9 - 1 - 5
            //2. sayının 1. sayıdan küçük olma durumunda yer değişimi
            if (secondNumber < firstNumber) {
                int tempNumber2 = firstNumber;
                firstNumber = secondNumber;
                secondNumber = tempNumber2; // 1 - 9 - 5
            }
            //3. sayının 2. sayıdan küçük olma durumunu kontrol etti eğerki küçükse yerdeğiştirdi.
            if (thirdNumber < secondNumber) {
                int tempNumber2 = secondNumber;
                secondNumber = thirdNumber;
                thirdNumber = tempNumber2; // 9 - 1 - 5
            }
        } else {
            //3. sayının 1. sayıdan küçük olma durumununda yer değiştirdi.
            if (firstNumber > thirdNumber) {
                int tempNumber2 = thirdNumber;
                thirdNumber = firstNumber;
                firstNumber = tempNumber2;
            }
            //2. sayının 1. sayıdan küçük olma durumununda yer değiştirdi.
            if (secondNumber < firstNumber) {
                int tempNumber2 = firstNumber;
                firstNumber = secondNumber;
                secondNumber = tempNumber2;
            }
        }
        System.out.println("Small to Bigger Sorting" + firstNumber + "<" + secondNumber + "<" + thirdNumber);
    }
}
