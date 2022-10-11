public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание к уроку 9");
        // Задание 1
        System.out.println("Задание 1");
        int[] numbers = new int[]{ 1, 2, 3};
        double[] fractions = {1.57, 7.654, 9.986};
        int[] speeds = {60 , 90, 110};

        // Задание 2
        System.out.println("Задание 2");
        String numbersText = "";
        String fractionsText = "";
        String speedsText = "";
        for (int i = 0; i < numbers.length; i++) {
            numbersText = numbersText + numbers[i];
            fractionsText = fractionsText + fractions[i];
           speedsText = speedsText + speeds[i];
            if (i < numbers.length-1){
                numbersText = numbersText + ", ";
                fractionsText = fractionsText + ", ";
                speedsText = speedsText + ", ";
            }
        }
        System.out.println(numbersText + "\n" + fractionsText
                + "\n" + speedsText);

        // Задание 3
        System.out.println("Задание 3");
        numbersText = "";
        fractionsText = "";
        speedsText = "";
        for (int i = 2; i >= 0; i=i-1) {
            numbersText = numbersText + numbers[i];
            fractionsText = fractionsText + fractions[i];
            speedsText = speedsText + speeds[i];
            if (i > 0){
                numbersText = numbersText + ", ";
                fractionsText = fractionsText + ", ";
                speedsText = speedsText + ", ";
            }
        }
        System.out.println(numbersText + "\n" + fractionsText
                + "\n" + speedsText);

        // Задание 4
        numbersText = "";
        System.out.println("Задание 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 != 0){
                numbers[i] = numbers[i] + 1;
            }
            numbersText = numbersText + numbers[i];
            if (i < numbers.length-1) {
                numbersText = numbersText + ", ";
            }
        }
        System.out.println(numbersText);
    }
}