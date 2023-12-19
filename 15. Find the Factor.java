    public static long pthFactor(long n, long p) {
ArrayList<Long> factors = new ArrayList<>();
        System.out.print("square root : " + Math.sqrt(n));
 
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (n / i != i) {
                    factors.add(n / i);
                }
            }
        }
 
        Collections.sort(factors);
 
        if (p <= factors.size()) {
            return factors.get((int) p - 1);
        } else {
            return 0;
        }
    }
 
}
