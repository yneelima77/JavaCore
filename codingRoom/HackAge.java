package codingRoom;

public class HackAge {
    public static void main(String[] args) {
        int[] age = {26, 32, 36, 33, 24, 31, 30, 35, 36, 21, 28};

        calculateAvgAge(age);
    }

    public static void calculateAvgAge(int[] age) {
        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }

        double avgAge = (double) sum / age.length;
        System.out.printf("Average age of the team: %.2f\n", avgAge);
    }
}
