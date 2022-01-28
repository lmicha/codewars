package fundementals;
//https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java
public class StringEnd {

    public  boolean solution(String str, String ending) {

        if(str == null || ending == null) {
            return false;
        }
        if(ending.length() > str.length()) {
            return false;
        }
        for(int i = 1 ; i  <= ending.length() ; i++) {

            if( str.charAt(str.length() - i)  != ending.charAt(ending.length() - i)) {
                return false;
            }
        }
        return true;
    }

}
