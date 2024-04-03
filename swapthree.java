public class ThreeNumbersSwap {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        // Swapping logic
        int temp = num1;
        num1 = num3;
        num3 = num2;
        num2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }
}

