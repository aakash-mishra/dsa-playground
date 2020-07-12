public class RabinKarp {
    public static void main(String[] args) {
        String text = "abcabcx";
        String pattern = "abcx";
        int prime = 101;
        int pHash = 0;
        int tHash = 0;
        for(int i = 0; i < pattern.length(); i++) {
            pHash += Math.pow(prime, i) * pattern.charAt(i);
            tHash += Math.pow(prime, i) * text.charAt(i);
        }
        if(pHash == tHash && pattern.equals(text.substring(0, pattern.length()))) {
            System.out.println("Match found at index 0");
            return;
        }
    
        for(int i = 1; i <= text.length() - pattern.length(); i++) {
            tHash -= text.charAt(i - 1);
            tHash /= prime;
            tHash += Math.pow(prime, pattern.length() - 1) * text.charAt(i + pattern.length() - 1);
            if(pHash == tHash && pattern.equals(text.substring(i, i + pattern.length()))) {
                System.out.println("Match found at index: " + i);
                return;
            }
        }
        System.out.println("No match found");
        }
    }
