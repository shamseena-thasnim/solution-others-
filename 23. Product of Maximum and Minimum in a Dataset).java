    public static List<Long> maxMin(List<String> operations, List<Integer> x) {
      List<Long> productArray = new ArrayList<>();
        List<Long> elements = new ArrayList<>();
        long minElement = Long.MAX_VALUE;
        long maxElement = Long.MIN_VALUE;
 
        int opSize = operations.size();
 
        for (int i = 0; i < opSize; i++) {
            String operation = operations.get(i);
            int value = x.get(i);
 
            if (operation.equals("push")) {
                elements.add((long) value);
                if (value < minElement) {
                    minElement = value;
                }
                if (value > maxElement) {
                    maxElement = value;
                }
            } else if (operation.equals("pop")) {
                elements.remove((long) value);
                if (value == minElement || value == maxElement) {
                    minElement = Long.MAX_VALUE;
                    maxElement = Long.MIN_VALUE;
                    for (long element : elements) {
                        if (element < minElement) {
                            minElement = element;
                        }
                        if (element > maxElement) {
                            maxElement = element;
                        }
                    }
                }
            }
 
            
            if (!elements.isEmpty()) {
                productArray.add(minElement * maxElement);
            } else {
               
                productArray.add(0L);
            }
        }
 
        return productArray;
    }
}
