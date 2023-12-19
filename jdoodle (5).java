    public static String breakPalindrome(String palindromeStr) {
    // Write your code here
    char[] c = palindromeStr.toCharArray();
    int n= c.length;
    for (int i = 0; i < n/2; i++) {
        if (c[i]!='a') {
            c[i] = 'a';
            return new String(c);
        }
    }
      return "IMPOSSIBLE";
    }
 
}