package Logics;

// multiplication
// summation
// Count
// Division
// Modulus

public class ThumbRule {

    public static void main(String[] args) {
        methods(15, 21);
    }

    static void methods(int num1, int num2) {
        int sum = 0;
        int mul = 1;
        int count = 1;
        int rem = 0;

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                rem += i;
                sum += i;
                mul *= i;
                count++;
            }
        }
        System.out.println("Sum of all even digits : " + sum);
        System.out.println("Multiplication of all even digits : " + mul);
        System.out.println("Reminder will be : " + rem);
        System.out.println("Even numbers are : " + count);
    }
}
