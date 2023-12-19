    public static int getMinimumOperationCount(String s) {
    // Write your code here
    int operations = 0;
 
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char previousChar = s.charAt(i - 1);
            char nextChar = i + 1 >= s.length() ? s.charAt(s.length() - 1) : s.charAt(i + 1);
            char alternateChar = getNextCharacter(s, currentChar, previousChar, nextChar);
            if (currentChar != alternateChar) {
                s = replaceCharacter(s, i, alternateChar);
                operations++;
            }
        }
        return operations;
    }
 
    private static char getNextCharacter(String input, char currentChar, char previousChar, char nextChar) {
        if (currentChar == previousChar || Math.abs(currentChar - previousChar) == 1) {
            return getAlternativeChar(input, currentChar, nextChar);
        }
        return currentChar;
    }
 
    private static char getAlternativeChar(String input, char currentChar, char nextChar) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int position = currentChar - 'a';
        if (position >= 25) {
            position = -1;
        }
        char newChar = alphabets.charAt(position + 1);
        char alternateChar = getNextCharacter(input, newChar, nextChar, nextChar);
        return alternateChar;
    }
 
    private static String replaceCharacter(String input, int index, char newChar) {
        return input.substring(0, index) + newChar + input.substring(index + 1);
    }
}