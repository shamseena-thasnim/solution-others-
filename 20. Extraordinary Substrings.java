    public static int countSubstrings(String input_str) {
    // Write your code here
int count = 0;
        int n = input_str.length();
        int[] prefixSum = new int[n + 1];
 
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + getMappedValue(input_str.charAt(i - 1));
        }
 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int substringSum = prefixSum[j] - prefixSum[i];
                int substringLength = j - i;
 
                if (substringLength > 0 && substringSum % substringLength == 0) {
                    count++;
                }
            }
        }
 
        return count;
    }
 
    static int getMappedValue(char c) {
        switch (c) {
            case 'a': case 'b': return 1;
            case 'c': case 'd': case 'e': return 2;
            case 'f': case 'g': case 'h': return 3;
            case 'i': case 'j': case 'k': return 4;
            case 'l': case 'm': case 'n': return 5;
            case 'o': case 'p': case 'q': return 6;
            case 'r': case 's': case 't': return 7;
            case 'u': case 'v': case 'w': return 8;
            case 'x': case 'y': case 'z': return 9;
            default: return 0;
        }
 
    }
 
}
