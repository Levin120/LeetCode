public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null && s == "")
            return 0;
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++)
            c[i] = s.charAt(i);
        int len = 0;
        for(int j = s.length() - 1; j >= 0; j--)
        {
            if(c[j] == ' ' && j == s.length() - 1)
                continue;
            else if(c[j] == ' ' && c[j + 1] == ' ')
                continue;
            else if(c[j] != ' ')
                len++;
            else
                break;
        }
        return len;
    }
}
