class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        String all = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < s.length(); i++) {
            if (all.indexOf(s.charAt(i)) != -1) {
                str += s.charAt(i);
            }
        }
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            //ex abc
            // i = 0; a c

            if (!(str.charAt(i) == str.charAt(str.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
