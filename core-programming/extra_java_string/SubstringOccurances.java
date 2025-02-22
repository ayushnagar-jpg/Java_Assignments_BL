class SubstringOccurances {
    public static void main(String[] args) {
        String str = "abababab";
        String sub = "ab";
        int count = str.split(sub, -1).length - 1;
        System.out.println("Occurrences: " + count);
    }
}
