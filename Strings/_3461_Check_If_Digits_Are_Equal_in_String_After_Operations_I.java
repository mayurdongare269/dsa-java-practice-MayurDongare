import java.util.*;

public class _3461_Check_If_Digits_Are_Equal_in_String_After_Operations_I {

    public boolean hasSameDigits(String s) {
        int n = s.length();
        int arr[] = new int[s.length()];

        for(int i = 0; i < n; i++) {
            arr[i] = Character.getNumericValue(s.charAt(i));
        }


        while(arr.length > 2) {
            int[] next = new int[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++) {
                next[i] = (arr[i] + arr[i+1]) % 10;
            }
            arr = next;
        }

        return arr[0] == arr[1];
    }

    public static void main(String[] args) {
        // System.out.println(new Solution().makeEqual(new String[]{"ab","cd","dc","ba"}));

        _3461_Check_If_Digits_Are_Equal_in_String_After_Operations_I sol = new _3461_Check_If_Digits_Are_Equal_in_String_After_Operations_I();
        System.out.println(sol.hasSameDigits("3902"));
    }
}