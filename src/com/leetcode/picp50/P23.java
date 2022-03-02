package com.leetcode.picp50;

import java.util.*;

public class P23 {
    static Set<Integer> set;

    public static void main(String[] args) {
        P23.Graph graph = new P23.Graph(new HashMap<Integer,ArrayList<Integer>>(){{
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
        dfs(graph, 5);
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

    static void dfs(Graph graph, int root){
        // your code here
        if(set.contains(root))
            return;
        else {
            System.out.print(root+" ");
            set.add(root);
            ArrayList<Integer> neighbors = graph.adjList.get(root);
            for (Integer i : neighbors){
                dfs(graph, i);
            }
        }
    }
}
