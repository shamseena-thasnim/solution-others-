    public static String getLargestNumber(String num) {
    // Write your code here
   char[] digits = num.toCharArray();
        boolean swapped;
 
        do {
            swapped = false;
            for (int i = 0; i < digits.length - 1; i++) {
                if (((digits[i] % 2 == 0 && digits[i + 1] % 2 == 0) ||
                        (digits[i] % 2 != 0 && digits[i + 1] % 2 != 0))
                        && digits[i] < digits[i + 1]) {
                    swap(digits, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
 
        return new String(digits);
    }
    // Function to swap two elements in an array
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
 
}
