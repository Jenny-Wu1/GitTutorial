public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("The average is: " +
                average(numbers));
    }

    public static double average(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += number;
        }
        return (double) sum / nums.length;
    }
}