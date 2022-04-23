package com.leetcode.blind75.fourty;

import java.util.*;

public class Lc207_27th {

    public static void main(String[] args) {
        int[][] prerequisities = new int[][]{{4,1},{4,2},{5,2},{5,3},{6,4},{6,5}};
        int numCourses = 6;
        boolean res = canFinish(numCourses,prerequisities);
        System.out.println(res);
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        // 共有6門課: 1 2 3 4 5 6
        // HashMap<Integer, List<Integer>> map 記錄每一堂課，後續要上的課有那些
        // int[] indegree 記錄每一堂課的indegree
        int[] indegree = new int[numCourses+1]; // 0 1 2 3 4 5 6 (7個格子)
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] intArr : prerequisites){
            int course_pre = intArr[1]; // 先修課 key
            int course = intArr[0]; // 後續可以上的課
            if (map.containsKey(course_pre)){
                map.get(course_pre).add(course);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(course);
                map.put(course_pre,list);
            }
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i<indegree.length; i++){
            if (indegree[i] == 0){
                q.add(i);
            }
        }

        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i<size; i++){ // 1 2 3
                Integer course = q.poll();
                List<Integer> list = map.get(course);
                if (list==null)
                    continue;
                for (Integer pos : list){
                    indegree[pos]--;
                    if (indegree[pos]==0)
                        q.add(pos);
                }
            }
        }

        for (int res : indegree){
            if (res!=0)
                return false;
        }

        return true;
    }
}
