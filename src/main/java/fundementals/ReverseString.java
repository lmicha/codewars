package fundementals;

public class ReverseString {

    public String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = string.length() -1 ; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }

    public String reverseStringBuilder(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
