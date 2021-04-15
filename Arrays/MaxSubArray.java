public class MaxSubArray {
    public static void main(String[] args) {
        int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar = a[0];
        for(int i = 1; i < a.length; i++) {
            a[i] = Math.max(a[i - 1] + a[i],
                           a[i]);
            if(a[i] > maxSoFar)
                maxSoFar = a[i];
        }
        System.out.println(maxSoFar);
    }
    
}
