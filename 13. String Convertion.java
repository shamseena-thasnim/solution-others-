public static int getMinimumOperations(String binaryStr) {
    // Write your code here
     int count = 0;
        char[] chars = binaryStr.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i] == '1' & chars[i + 1] == '1') {
                chars[i] = '0';
                chars[i + 1] = '0';
                count++;
                i++;
            }
            else if (chars[i] == '1' && chars[i + 1] == '0'){
                chars[i] = '1';
                chars[i + 1] = '1';
                count++;
                i--;
            }
            if ((i == chars.length - 2) && chars[i] == '0' && chars[i + 1] == '1'){
                chars[i] = '1';
                chars[i + 1] = '1';
                count++;
                i--;
            }
        }
        return count;
    
 
    }
 
}
