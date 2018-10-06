public class ExtraCredit {
    public static String reverse(String s) {
        if (s == null) {
            return null;
        }

        // remove extra heading and tailing spaces
        char[] chars = s.trim().toCharArray();

        int start, end = chars.length;
        String res = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                if (chars[i + 1] == ' ') {
                    end = i;
                    continue;
                }
                start = i + 1;
                while (start != end) {
                    res += chars[start++];
                }
                res += ' ';
                end = i;
            }
        }
        start = 0;
        while (start != end) {
            res += chars[start++];
        }
        return res;
    }

    public static void main(String[] args) {
        String str = new String("    the       sky       is       blue    ");
        System.out.println(reverse(str));
    }
}


