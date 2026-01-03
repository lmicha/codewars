package rankUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeadFish {

    static int value;
    static List<Integer> deadeye;
    public static int[] parse(String data) {

        value = 0;

        String regexData = getRegexData(data);

        deadeye = new ArrayList<>();
        Map<Character, Runnable> operation = new HashMap<Character, Runnable>();

        operation.put('i', () -> increment() );
        operation.put('d', () -> decrement() );
        operation.put('s', () -> square () );
        operation.put('o', () -> output() );

        for(int i = 0; i < regexData.length();i++) {
            operation.get(regexData.charAt(i)).run();
        }

        int[] array = getArray();

        return array;


    }

    private static int[] getArray() {
        return deadeye.stream().mapToInt(i -> i).toArray();
    }

    private static String getRegexData(String data) {
        return data.replaceAll("[^idso]", "");
    }

    private static void output() {

        deadeye.add(value);
    }

    private static void square() {

        value = value * value;
    }

    private static  void decrement() {

        value--;
    }

    private static void increment() {

        value++;
    }

}
