package com.somnath.apps.algo.backtracking;

import java.util.ArrayList;
import java.util.List;

class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private static void backtrack(List<String> ans, String cur, int open, int close, int n) {
        if (cur.length() == n * 2) {
            ans.add(cur);
            return;
        }

        if (open < n)
            backtrack(ans, cur+"(", open+1, close, n);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, n);
    }

    public static void main(String[] args) {
        System.out.println("Combinations:" + generateParenthesis(3));
    }

}