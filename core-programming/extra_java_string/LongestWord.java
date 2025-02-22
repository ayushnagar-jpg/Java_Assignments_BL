class LongestWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String longest = "";
        for (String word : sentence.split(" ")) {
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println("Longest Word: " + longest);
    }
}
