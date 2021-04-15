public class SqrtBinarySearch {
    public static void main(String[] args) {
        String arg = args[0];
        int x = 0;
        try {
        x = Integer.parseInt(arg);
        }
        catch(Exception e) {
            System.out.println("invalid input");
            return;
        }
        if(x == 0) System.out.println(x);
        
        int left = 1;
        int right = x;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mid <= x / mid && mid + 1 > (x / (mid + 1) )) {
                System.out.println(mid);
                return;
            }
            
            else if(mid > x / mid) 
                right = mid;
            
            else 
                left = mid + 1;
            
        }
        return;
    }
    
}
