class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(String word:words)
        {
            StringBuilder reverse = new StringBuilder(word).reverse();
            str.append(reverse).append(" ");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
        
    }
}
