public class Solution {
    public static String repeatStr(final int repeat, final String string) {
    StringBuilder str = new StringBuilder();
     for(int i = 1; i <= repeat; i++)
    {
      str.append(string);
    }
        return str.toString();
    }
}
