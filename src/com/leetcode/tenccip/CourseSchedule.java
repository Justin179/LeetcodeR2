package com.leetcode.tenccip;

import java.util.*;

public class CourseSchedule {
    // 4 課程數量 -> 0 1 2 3
    // [[1,0],[2,1],[2,3],[3,2]]
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 當前這門課，需要幾個先修課 (開4好像會多一個)
        if(prerequisites==null || prerequisites.length==0)
            return true;

        int[] indegree = new int[numCourses];

        //
        HashMap<Integer,List<Integer>> graph = new HashMap<>();

        for(int i = 0; i<prerequisites.length; i++){ // [1,0],[2,1],[2,3],[3,2]
            indegree[prerequisites[i][0]]++;
            // [0] 課0 有 0 堂先修課
            // [1] 課1 有 1 堂先修課
            // [2] 課2 有 2 堂先修課
            // [3] 課3 有 1 堂先修課
            if(graph.containsKey(prerequisites[i][1])){
                List<Integer> list = graph.get(prerequisites[i][1]);
                list.add(prerequisites[i][0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][0]);
                graph.put(prerequisites[i][1], list);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        // 把不用上先修課的，放進queue
        // [0] 課0 有 0 堂先修課
        // [1] 課1 有 1 堂先修課
        // [2] 課2 有 2 堂先修課
        // [3] 課3 有 1 堂先修課
        for(int i = 0;  i<indegree.length; i++){
            if(indegree[i]==0)
                queue.add(i);
        }

        while(!queue.isEmpty()){
            int course = queue.poll(); // 課0
            List<Integer> subcourses = graph.get(course);
            for (int i =0; subcourses!=null&&i<subcourses.size(); i++){
                if(--indegree[subcourses.get(i)]==0)
                    queue.add(subcourses.get(i));
            }
        }

        for(int i = 0; i<numCourses; i++){
            if(indegree[i]!=0) return false;
        }

        return true;
    }
}









