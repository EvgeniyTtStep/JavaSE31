package org.itstep.lesson10.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        final String regex = "^[\\+]?3?[\\s]?8?[\\s]?\\(?0\\d{2}?\\)?[\\s]?\\d{3}[\\s|-]?\\d{2}[\\s|-]?\\d{2}$";
        final String string = "+38(099)123-45-67";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        if (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
