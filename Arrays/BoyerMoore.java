// Bayer Moore algorithm to find majority element in an array 
// Majority element is the one that appears more than n/2 times, where n is the length of the array
public class BoyerMoore {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int candidate = nums[0];
        int cnt = 1;
        for(int i = 1; i < nums.length; i++) {
            if(cnt == 0) {
                candidate = nums[i];
                cnt = 1;
            }
            else {
                if(nums[i] == candidate)
                    cnt++;
                else 
                    cnt--;
            }
        }
        System.out.println("Majority element: " + candidate);
    }
}
