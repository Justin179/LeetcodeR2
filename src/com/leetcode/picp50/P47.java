package com.leetcode.picp50;

public class P47 {
    public static void main(String[] args) {
//        char[][] intervals = new char[][]{{'K','I','N','T'}, {'B','I','N','S'}, {'G','N','Y','I'}, {'U','O','E','D'}, {'D','I','B','V'}, {'H','I','R','T'}};
//        String word = "CODE";

        char[][] intervals = new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        String word = "ABCCED";

        boolean res = exist(intervals, word);
        System.out.println(res);
    }

    static boolean exist(char[][] intervals, String word){

        for (int i = 0; i<intervals.length; i++){
            for (int j = 0; j<intervals[0].length; j++){
                boolean res = dfs(intervals, i, j, word, 0);
                if(res)
                    return true;
            }
        }

        return false;
    }

    private static boolean dfs(char[][] intervals, int i, int j, String word, int index) {
        if(index == word.length())
            return true;
        if(i<0 || j<0 || i>=intervals.length || j>=intervals[0].length)
            return false;
        if(intervals[i][j] != word.charAt(index))
            return false;
        // -------------------------- 過以上，即表示 this char matching
        char temp = intervals[i][j];
        intervals[i][j] = '*'; // 這是為了下一層而註記的
        // 上下左右的 走進下一層 (只要有一個為true，就不會再往下看下去)
        boolean rtn = dfs(intervals,i-1,j,word,index+1) || dfs(intervals,i+1,j,word,index+1)
                || dfs(intervals,i,j-1,word,index+1) || dfs(intervals,i,j+1,word,index+1);
        intervals[i][j] = temp;
        return rtn;
    }

    // 返回
    // 走至長度 即找到 return true
    // 出界、return false
    // 此格不合 or 此格已用過 return false

    // this -----
    // 用過的註記一下
    // this -----




}
