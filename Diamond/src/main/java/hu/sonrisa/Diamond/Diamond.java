package hu.sonrisa.Diamond;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;
import static org.apache.commons.lang3.StringUtils.repeat;

public class Diamond {

    public static final char START_LETTER = 'A';

    public static String[] upTo(char stopLetter) {
        int size = (2 * (stopLetter - START_LETTER)) - 1;
        String[] result = new String[size];
        for (int i = START_LETTER; i <= stopLetter; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < size; j++) {
                    sb.append("-");
                }
                sb.setCharAt(stopLetter - i, (char)i);
                sb.setCharAt(Math.abs((START_LETTER - i) + (stopLetter - START_LETTER)), (char)i);
                result[i-START_LETTER] = sb.toString();
                
        }
        return result;
        
    }

    public static void draw(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }


}
