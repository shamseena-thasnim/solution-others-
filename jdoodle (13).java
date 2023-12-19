    public static String getSubstring(String input_str, int k) {
    // Write your code here
    
    // Write your code here
       List<String> subList = new ArrayList<>();
        for (int i = 0; i < input_str.length(); i++) {
            int count = 0;
            for (int j = i; j < input_str.length(); j++) {
                if (input_str.charAt(j) == '1') {
                    count++;
                }
                if(count == k){
                    subList.add(input_str.substring(i, j+1));
                     break;
                }
            }
        }
 
        String smallest = null;
        int minLength = Integer.MAX_VALUE;
 
        for (String s : subList) {
            if (s.length() < minLength || (s.length() == minLength && s.compareTo(smallest) < 0)) {
                minLength = s.length();
                smallest = s;
            }
        }
 
        return smallest;
    }
 
}