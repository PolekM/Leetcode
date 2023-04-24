public class Main {

    public static void main(String[] args) {
        strStr("asdbutsad","sad");
    }
    public static int strStr(String haystack, String needle) {
        int flag = 0;
        int i = 0;
        int hLenght = haystack.length();
        int nLenght = needle.length();

        do {
            if (flag == nLenght) return i - flag;
            if (hLenght == i) break;
            if (haystack.charAt(i) == needle.charAt(flag)) flag++;
            else {
                i = i - flag;
                flag = 0;
            }
            i++;


        } while (i <= hLenght);
        return -1;
    }
}
