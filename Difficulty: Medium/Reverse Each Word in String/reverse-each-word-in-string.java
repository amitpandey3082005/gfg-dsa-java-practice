class Solution {
    public String reverseWords(String s) {
        if (s == null || s.trim().isEmpty()) return "";
        
        // it will split the string perfectly if we have uneven space aur even space 
        // first trim will remove starting and ending uneven space only 
        // split method will group the space and split string into spaces and make an Array of word 
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        // Adding all words in reverse order by traversing to the words array 
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        // to remove extra space at the end of the string we will use it 
        return result.toString().trim();
    }
}

