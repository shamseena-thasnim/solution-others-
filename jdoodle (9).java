    public static List<Integer> getFinalData(List<Integer> data, List<List<Integer>> updates) {
    // Write your code here
        int n = data.size();
        List<Integer> result = new ArrayList<>(n);
        int[] updateCount = new int[n];
 
        // Initialize the result list with the values from the input data
        for (int i = 0; i < n; i++) {
            result.add(data.get(i));
        }
 
        // Track the number of updates for each index
        for (List<Integer> update : updates) {
            int l = update.get(0) - 1;
            int r = update.get(1) - 1;
 
            updateCount[l]++;
            if (r + 1 < n) {
                updateCount[r + 1]--;
            }
        }
 
        // Calculate the final values based on the update counts
        int currentUpdateCount = 0;
        for (int i = 0; i < n; i++) {
            currentUpdateCount += updateCount[i];
            if (currentUpdateCount % 2 != 0) {
                result.set(i, -result.get(i));
            }
        }
 
        return result;
    }
 
}