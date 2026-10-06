import java.util.Scanner;

public class Q11Average {
    double average;

    void calculate() {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double sum = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        average = sum / 10;

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average = " + average);
        System.out.println("Numbers above average = " + count);
    }

    public static void main(String[] args) {
        Q11Average obj = new Q11Average();
        obj.calculate();
    }
}
