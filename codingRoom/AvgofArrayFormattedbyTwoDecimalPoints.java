package codingRoom;

public class AvgofArrayFormattedbyTwoDecimalPoints {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,12};
        arrayAvg(nums);

    }

    public static String arrayAvg(int[] nums) {
        int sum = 0;
        double avg;
        int leng = nums.length;
        for (int i = 0; i < leng; i++) {
            sum += nums[i];
        }
        avg = sum / leng;
        System.out.println(avg);
        String s = String.format("%.2f", avg);
        return s;
    }
}
