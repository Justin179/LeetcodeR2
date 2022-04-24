package com.paypay;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = new String[]{"hot", "dot", "dog", "lot", "log", "cog"};
        int res = solution(beginWord,endWord,wordList);
        System.out.println(res);
    }

    static int solution(String beginWord, String endWord, String[] wordList) {
        Set<String> set = new HashSet<>();
        for (String str: wordList)
            set.add(str);

        if (!set.contains(endWord))
            return 0;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;
        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i<size; i++){ // level order traversal
                String currWord = q.poll();
                char[] chars = currWord.toCharArray();
                for (int j=0; j< chars.length; j++){ // h i t
                    char charBeforeChange = chars[j]; // h
                    for (char c = 'a'; c<='z'; c++){
                       if (c==charBeforeChange)
                           continue;
                       chars[j] = c;
                       String newWord = String.valueOf(chars); // change one character

                        if (newWord.equals(endWord))
                           return level+1;
                       if (set.contains(newWord)){
                           q.add(newWord);
                           set.remove(newWord); // strs in wordList can only be used once
                       }
                    }
                    chars[j] = charBeforeChange; // restore state
                }
            }
                level++;
        }

        return 0;
    }
}

/*
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
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
 */