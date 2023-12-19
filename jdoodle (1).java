    public static List<String> twins(List<String> a, List<String> b) {
List<String> result = new ArrayList<>();
 
        for (int i = 0; i < a.size(); i++) {
            result.add(areTwins(a.get(i), b.get(i)) ? "Yes" : "No");
        }
 
        return result;
    
    }
private static boolean areTwins(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
 
        int n = s1.length();
 
        // Create two maps to store the characters at even and odd positions
        Map<Character, Integer> evenChars1 = new HashMap<>();
        Map<Character, Integer> evenChars2 = new HashMap<>();
        Map<Character, Integer> oddChars1 = new HashMap<>();
        Map<Character, Integer> oddChars2 = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenChars1.put(s1.charAt(i), evenChars1.getOrDefault(s1.charAt(i), 0) + 1);
                evenChars2.put(s2.charAt(i), evenChars2.getOrDefault(s2.charAt(i), 0) + 1);
            } else {
                oddChars1.put(s1.charAt(i), oddChars1.getOrDefault(s1.charAt(i), 0) + 1);
                oddChars2.put(s2.charAt(i), oddChars2.getOrDefault(s2.charAt(i), 0) + 1);
            }
        }