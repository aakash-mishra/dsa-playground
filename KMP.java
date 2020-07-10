public class KMP {
    private static void buildValueArray(int[] val, String p) {
        int j = 0;
        int i = 1;
        val[0] = 0;
        while(i < val.length) {
            char c1 = p.charAt(i);
            char c2 = p.charAt(j);
            if(c1 == c2) {
                val[i] = j + 1;
                i++;
                j++;
            }
            else {
                if(j == 0) {
                    val[i] = 0;
                    i++;
                }
                else {
                    j = val[j - 1];
                }
            }
        }
        System.out.println("Val array is:");
        for(int x : val)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        String t = "aakashmishra"; //"abxaaabcabcaby"; 
        String p = "mishra"; //"abcaby";
        int[] val = new int[p.length()];
        buildValueArray(val, p);
        int i = 0;
        int j = 0;
        while(i < t.length()) {
            char c = t.charAt(i);
            char d = p.charAt(j);
            if(c == d) {
                i++;
                j++;
            }
            else {
                if(j == 0)
                    i++;
                else 
                    j = val[j - 1];
            }
        }
        if(j == p.length())
            System.out.println("substring exists at: " + (i - j));
        else
            System.out.println("-1");

    }
}