package Week04_Strings;

//TC: O(n) | O(1)

public class Q7_ImplementAtoi {
    int atoi(String str) {
        int numeric = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '-')
                continue;

            if (ch >= '0' && ch <= '9')
                numeric = numeric * 10 + (ch - '0');
            else
                return -1;
        }

        return str.charAt(0) == '-' ? numeric * -1 : numeric;
    }
}
