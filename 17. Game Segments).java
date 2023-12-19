    public static int playSegments(List<Integer> coins) {
         int n = coins.size();
        for (int i = 0; i < n; i++) {
            int player1 = scores(0, i, coins);
            int player2 = 0;
            if (i != n - 1) {
                player2 = scores(i, n, coins);
            }
 
            if (player2 < 0) {
                return 0;
            } else if (player1 > player2) {
                return i;
            }
        }
        return 0;
    }
 
    private static int scores(int i, int j, List<Integer> coins) {
        int ones = 0;
        int zeros = 0;
        for (int k = i; k < j; k++) {
            if (coins.get(k) == 1) {
                ones++;
            } else {
                zeros++;
            }
        }
        return ones - zeros;
    
    }
 
}
