package com.leetcode.blind75.fourty;

import java.util.*;

public class Lc133_26th {

    public Node cloneGraph(Node node) {
        if (node==null)
            return null;
        if (node.neighbors.size()==0)
            return new Node(1, new ArrayList<Node>());



        return dfs(node);
    }
    Map<Node, Node> map = new HashMap<>();
    /* this dfs(Node node)
        1 make a copy of node
        2 put the copy the map
        3 return the copy

     */
    private Node dfs(Node node) {
        if (node == null)
            return null;
        if (map.containsKey(node))
            return map.get(node); // base case (重要，否則就無窮廻圈了)
        else {
            Node newNode = new Node(node.val);
            List<Node> list = new ArrayList<>();
            newNode.neighbors = list;

            map.put(node,newNode); // 必須放在遞迴發生前

//            newNode.neighbors = list;
            for (Node n : node.neighbors){
                Node clone = dfs(n); // dfs 遞迴發生
                list.add(clone);
            }


            return newNode;
        }
    }
}

/*
            Node newNode = new Node(node.val);
            map.put(node,newNode);

            List<Node> list = new ArrayList<>();
            for (Node n : node.neighbors){
                Node clone = dfs(n);
                list.add(clone);
            }


            newNode.neighbors = list;
            return newNode;
 */











