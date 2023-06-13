import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static List<Boolean> isPalindrome(List<String> strList) {
        List<Boolean> result = new ArrayList<Boolean>();
        for (String str : strList) {
            int left = 0;
            int right = str.length() - 1;
            boolean flag = true;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    flag = false;
                    break;
                }
                left++;
                right--;
            }
            result.add(flag);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("aba");
        strList.add("abc");
        strList.add("abba");
        List<Boolean> result = isPalindrome(strList);
        for (Boolean b : result) {
            System.out.println(b);
        }
    }
}
