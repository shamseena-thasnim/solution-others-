 public static long getMinimumCost(List<Integer> arr) {
    // Write your code here
long minCost = Long.MAX_VALUE;
 
        for (int i = 0; i < arr.size() - 1; i++) {
            int newElement = (arr.get(i) + arr.get(i + 1)) / 2;
            List<Integer> newArr = insertElement(arr, i + 1, newElement);
            long cost = calculateCost(newArr);
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }
 
    private static List<Integer> insertElement(List<Integer> arr, int index, int element) {
        List<Integer> newArr = new ArrayList<>(arr);
        newArr.add(index, element);
        return newArr;
    }
 
    private static long calculateCost(List<Integer> arr) {
        long cost = 0;
        for (int j = 0; j < arr.size() - 1; j++) {
            cost += Math.pow(arr.get(j) - arr.get(j + 1), 2);
        }
        return cost;
    }
 
}
    
 