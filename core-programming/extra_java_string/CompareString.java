class CompareString{
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        int result = str1.compareTo(str2);
        System.out.println(result < 0 ? str1 + " comes before " + str2 : str2 + " comes before " + str1);
    }
}
