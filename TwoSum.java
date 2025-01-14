public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 11, 7, 5}; 
        for(int i=0; i< nums.length; i++) {
            for(int j = i+1; j< nums.length; j++) {
                if(nums[i] + nums[j] == 9) {
                    System.out.print("("+ i + "," + j + ")");
                }
            }
        }
    }
}
