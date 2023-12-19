    public static void closestNumbers(List<Integer> numbers) {
Collections.sort(numbers);
 
        // Find the minimum absolute difference
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentDifference = Math.abs(numbers.get(i) - numbers.get(i + 1));
            minDifference = Math.min(minDifference, currentDifference);
        }
 
        // Print all pairs with the minimum absolute difference
        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentDifference = Math.abs(numbers.get(i) - numbers.get(i + 1));
            if (currentDifference == minDifference) {
                System.out.println(numbers.get(i) + " " + numbers.get(i + 1));
            }
            }
    }
 
}
