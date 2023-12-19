public static int findTotalCost(List<Integer> arr) {
    // Write your code here
            int totalCost = 0;
 
        while (arr.size() > 1) {
            // Sort the array to get the minimum and maximum elements
            Collections.sort(arr);
 
            // Calculate the cost using the formula provided
            int min = arr.get(0);
            int max = arr.get(arr.size() - 1);
            int cost = (int) Math.ceil((double) (min + max) / (max - min + 1));
 
            // Remove the minimum and maximum elements
            arr.remove(Integer.valueOf(min));
            arr.remove(Integer.valueOf(max));
 
            // Add the sum back to the array
            arr.add(min + max);
 
            // Update the total cost
            totalCost += cost;
        }
 
        return totalCost;
 
    }
 
}