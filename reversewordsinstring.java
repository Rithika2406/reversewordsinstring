class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split by spaces
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) result.append(" "); // Add spaces between words
        }
        return result.toString();
    }
}


        
    