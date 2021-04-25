public class HammingDistance {
    static int n = 7;

    private static int hammingDistanceUsingBitMask() {
        int sum = 0;
        int mask = 1;
        //assuming that n is a 32 bit int
        for(int i = 0; i < 32; i++) {
            if( (mask & n) != 0)
                sum++;
            //left shift mask
            mask <<= 1;
        }
        return sum;
    }

    private static int hammingDistanceByFlippingLSB() {
        int sum = 0;
        int duplicateN = n;
        while(duplicateN != 0) {
            sum++;
            duplicateN = duplicateN & (duplicateN - 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        /** 
         * This can be solved in two ways
         * 1) Simply use a bit mask (32-bit representation of the number '1'). If you perform '&' operation on a bit mask and any number
         * you can retrieve the LSB of that number. Keep a running total of the number of 1s while also left shifting the bit-mask
         * 2) This method makes use of the fact that n & (n - 1) will flip the LSB of 'n' to 0.
         * Keep flipping the LSB to 0 till the number becomes 0 (so you can stop counting 1s after that)
        */
        System.out.println("Hamming distance by using bit mask: " + hammingDistanceUsingBitMask());
        System.out.println("Hamming distance by flipping LSBs: " + hammingDistanceByFlippingLSB());
    }
}