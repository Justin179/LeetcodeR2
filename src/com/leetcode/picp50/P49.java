package com.leetcode.picp50;

import java.util.*;

public class P49 {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
//        ArrayList<String> wordList = Arrays.asList(new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        ArrayList wordList = new ArrayList();
        Collections.addAll(wordList, new String[] {"hot", "dot", "dog", "lot", "log", "cog"});

        int res = transformationSequenceLength(beginWord,endWord,wordList);
        System.out.println(res);
    }
    /*
    wordList = ["hot", "dot", "dog", "lot", "log", "cog"]
    Input: beginWord = "hit", endWord = "cog",

    Output: 5
    Explanation: one short possible transformation sequence is: "hit" -> "hot" -> "dot" -> "dog" -> "cog"
     */
    static int transformationSequenceLength(String beginWord, String endWord, ArrayList<String> wordList){
        // to Set
        Set<String> set = new HashSet<>();
        for (String str : wordList)
            set.add(str);

        // return 0 if no such sequence exists.
        if(!set.contains(endWord))
            return 0;

        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;
//        wordList = ["hot", "dot", "dog", "lot", "log", "cog"]
//        Input: beginWord = "hit", endWord = "cog",
        // beginWord != endWord
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i<size; i++){ // current layer
                String currStr = q.poll(); // hit
                char[] currChars = currStr.toCharArray(); // ['h','i','t']
                for (int j = 0; j<currChars.length; j++){ // h -> i -> t
                    char originalChar = currChars[j]; // h
                    for (char c = 'a'; c<='z'; c++){
                        if(c==originalChar)
                            continue;
                        currChars[j] = c;
                        String newStr = String.valueOf(currChars); // ait... 25種 combo
//                        System.out.println(newStr);
                        if(newStr.equals(endWord))
                            return level+1;
                        if(set.contains(newStr)){
                            q.add(newStr);
                            set.remove(newStr);
                        }
                    }
//                    System.out.println(" -------- ");
                    currChars[j] = originalChar; // 注意這裡要先還原，才走向下一個char
                }
            }
            level++;
        }

        return 0;
    }
}














