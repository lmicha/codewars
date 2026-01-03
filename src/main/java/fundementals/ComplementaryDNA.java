package fundementals;

import java.util.HashMap;

public class ComplementaryDNA {

    public static String makeComplement(String dna) {
        //Your code

        HashMap<Character, Character> complementaryHashMap = new HashMap<Character,Character>();
        complementaryHashMap.put('A' , 'T');
        complementaryHashMap.put('T' , 'A');
        complementaryHashMap.put('C' , 'G');
        complementaryHashMap.put('G' , 'C');

        StringBuilder dnaBuilder = new StringBuilder();

        for(int i = 0 ; i < dna.length(); i++) {
            dnaBuilder.append(complementaryHashMap.get(dna.charAt(i)));
        }
        return dnaBuilder.toString();
    }
}
