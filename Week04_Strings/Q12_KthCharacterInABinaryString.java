package Week04_Strings;

//TC: O(2 ^ n) | SC: O(2 ^ n)

public class Q12_KthCharacterInABinaryString {
    char kthCharacter(int m, int n, int k) {
        String binary = Integer.toBinaryString(m);
        while (n-- > 0) {
            StringBuilder sb = new StringBuilder();
            for (char dig : binary.toCharArray()) {
                if (dig == '1')
                    sb.append("10");
                else
                    sb.append("01");
            }
            binary = sb.toString();
        }

        return binary.charAt(k - 1);
    }
}
