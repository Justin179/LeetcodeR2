package com.leetcode.picp50;

import java.util.*;

public class P49_p1 {
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
    Output: 5
    Explanation: one short possible transformation sequence is: "hit" -> "hot" -> "dot" -> "dog" -> "cog"
    wordList = ["hot", "dot", "dog", "lot", "log", "cog"]
    Input: beginWord = "hit", endWord = "cog",
     */
    static int transformationSequenceLength(String beginWord, String endWord, ArrayList<String> wordList){
        Set<String> set = new HashSet<>();
        for (String str : wordList)
            set.add(str);
        if (!set.contains(endWord))
            return 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;
        while (!queue.isEmpty()){
            int size = queue.size() ;
//            System.out.println(size);
            for (int i = 0; i<size; i++){ // 同層轉 str
                String currStr = queue.poll(); // "hit"
//                System.out.println(currStr);
                char[] chars = currStr.toCharArray(); // ['h','i','t']
                for (int j = 0; j<chars.length; j++){ // h i t
                    char originalChar = chars[j]; // h
                    for (char c = 'a'; c<='z'; c++){ // a-z 轉
                        if (c==originalChar)
                            continue;
                        chars[j] = c;
                        String tryStr = String.valueOf(chars); // ait
//                        System.out.println(tryStr);
                        if (tryStr.equals(endWord))
                            return level+1;
                        if (set.contains(tryStr)){
                            set.remove(tryStr);
                            System.out.println(tryStr);
                            queue.add(tryStr);
                        }
                    }
//                    System.out.println("------------------");
                    // 進去i前，先把h還原
                    chars[j] = originalChar;
                }
            }
            level++;
        }

        return 0;
    }
}














