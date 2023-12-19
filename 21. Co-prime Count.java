    public static List<Integer> coprimeCount(List<Integer> A) {
List<Integer> result = new ArrayList<>();
 
        for (int num : A) {
            int count = eulerTotientFunction(num);
            result.add(count);
        }
 
        return result;
    }
 
    private static int eulerTotientFunction(int num) {
        int result = num; // Initialize result as n
 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                while (num % i == 0) {
                    num /= i;
                }
                result -= result / i;
            }
        }
 
        if (num > 1) {
            result -= result / num;
        }
 
        return result;
    }
 
}
