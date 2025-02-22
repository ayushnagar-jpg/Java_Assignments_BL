class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";
        for (char c : str.toCharArray()) {
            result += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }
        System.out.println("Toggled String: " + result);
    }
}
