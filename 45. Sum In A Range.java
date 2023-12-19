    public static long getNumPairs(List<Integer> arr, int l, int r) {
    // Write your code here
int n = arr.size();
        long count = 0;
 
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum >= l && sum <= r) {
                    count++;
                }
            }
        }
 
        return count;
    }
 
}
