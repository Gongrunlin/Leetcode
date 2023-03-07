package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations17 {
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
            return result;
        }
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        letterCombine(digits,numString,0);
        return result;
    }
    StringBuilder temp = new StringBuilder();
    public void letterCombine(String digits,String[] numString,int num){
        if (num == digits.length()){
            result.add(temp.toString());
            return;
        }
        //当前num对应的字符串
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            letterCombine(digits,numString,num+1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }


}
