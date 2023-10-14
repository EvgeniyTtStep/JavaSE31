package org.itstep.lesson10.stringBufferBuilder;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        String s = "Best, Java: programming - language.";

        StringTokenizer st = new StringTokenizer(s, " ,:-.");
        String[] strings = new String[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            strings[i++] = st.nextToken();
            //System.out.println(st.nextToken());
        }
        System.out.println(Arrays.toString(strings));
    }
}
