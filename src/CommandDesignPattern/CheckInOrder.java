package CommandDesignPattern;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CheckInOrder {
    public static boolean isInOrder(String str1, String str2) {

        int i = 0; // Pointer for str1
        int j = 0; // Pointer for str2

        // Iterate through str1 using a while loop
        while (i < str1.length() && j < str2.length()) {
            // Check if the current characters match
            if (str1.charAt(i) == str2.charAt(j)) {
                j++; // Move to the next character in str2
            }
            i++; // Move to the next character in str1
        }

        // If we matched all characters in str2, return true
        return j == str2.length();
    }
    private static Map<String, Boolean> checkInOrder(String str1, List<String> list) {
        Map<String, Boolean> resultMap = new LinkedHashMap<>();

        for (String str2 : list) {
            resultMap.put(str2, false);
        }
        char[] mainStr = str1.toCharArray();
        for (String str2 : list) {
            int j = 0;
            char[] charArray = str2.toCharArray();
            for (int i = 0; i < mainStr.length; i++) {
                if (j < charArray.length && mainStr[i] == charArray[j]) {
                    j++;
                }

                if (j == charArray.length) {
                    resultMap.put(str2, true);
                    break;
                }
            }
        }

        return resultMap;
    }

    public static void main(String[] args) {
        String main = "abcdefghijklmnopqrstuvwxyz";
        String str1 = "agijmn";
        String str2 = "fgbdf";
        String str3 = "kjajvk";
        String str4 = "asds";
        String str5 = "dsf";
        String str6 = "dfn";



        ArrayList list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        list.add(str6);

        System.out.println(checkInOrder(main, list));

//        System.out.println("Is \"" + str2_1 + "\" in order in \"" + str1 + "\": " + isInOrder(str1, str2_1));
//        System.out.println("Is \"" + str2_2 + "\" in order in \"" + str1 + "\": " + isInOrder(str1, str2_2));
    }
}
