package com.leetcode.picp50;

import java.util.*;

public class P24 {
    static Set<Integer> set;

    public static void main(String[] args) {
        P24.Graph graph = new P24.Graph(new HashMap<Integer,ArrayList<Integer>>(){{
            put(5, new ArrayList<Integer>(Arrays.asList(8, 1, 12)));
            put(8, new ArrayList<Integer>(Arrays.asList(5, 12, 14, 4)));
            put(12, new ArrayList<Integer>(Arrays.asList(5, 8, 14)));
            put(14, new ArrayList<Integer>(Arrays.asList(8, 12, 4)));
            put(4, new ArrayList<Integer>(Arrays.asList(8, 14)));
            put(1, new ArrayList<Integer>(Arrays.asList(5, 7)));
            put(7, new ArrayList<Integer>(Arrays.asList(1, 16)));
            put(16, new ArrayList<Integer>(Arrays.asList(7)));
        }});
        set = new HashSet<>();
        bfs(graph, 5);
    }
    // HashMap<Integer,ArrayList<Integer>> adjList;
    static class Graph{
        HashMap<Integer,ArrayList<Integer>> adjList;
        Graph(){
            this.adjList = new HashMap<>();
        }
        Graph(HashMap<Integer, ArrayList<Integer>> adjList){
            this.adjList = adjList;
        }
    }

    static void bfs(Graph graph, int root){
        // your code here
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                Integer curr = queue.poll();
                System.out.print(curr+" ");
                set.add(curr);
                for(Integer neighbor : graph.adjList.get(curr)){
                    if(!set.contains(neighbor)){
                        queue.add(neighbor);
                        set.add(neighbor);
                    }
                }
            }
        }

    }
}
