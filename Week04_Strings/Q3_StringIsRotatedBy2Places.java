package Week04_Strings;

//TC: O(n) | SC: O(n)

public class Q3_StringIsRotatedBy2Places {
    public static boolean isRotated(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        if (str1.length() < 2)
            return str1.equals(str2);

        int len = str1.length();
        String clockWise = (str1.substring(len - 2, len) + str1.substring(0, len - 2));
        String antiClockWise = (str1.substring(2, len) + str1.substring(0, 2));

        return clockWise.equals(str2) || antiClockWise.equals(str2);
    }
}
