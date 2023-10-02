import java.util.Arrays;

class MinMaxCalculation {
    public static int[] numbers;

    public MinMaxCalculation(int[] numbers){
        this.numbers = numbers;
        Arrays.sort(numbers);
    }

    public static int findMin(){
        return numbers[0];
    }

    public static int findMax(){
        return numbers[numbers.length-1];
    }

    public static void main(String[] args)
    {
        int[] numbers = {8,6,3,5,6,7,11};
        MinMaxCalculation mmc = new MinMaxCalculation(numbers);
        int min = mmc.findMin();
        int max = mmc.findMax();
        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);
    }
}