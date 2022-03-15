package com.leetcode.hiskio.sams;
// BFS_Array
import com.leetcode.hiskio.mytry.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_Array {


    public BFS_Array(Integer[] nums) {
        this.nums = nums;
    }

    public static void main(String[] args) {
        Integer[] nums =
                {5,
                        2,6,
                        1,4,null,7,
                        null,null,3,null,null,null,null,null};
        BFS_Array bfs = new BFS_Array(nums);
        bfs.traverse_levelorder_bfs();
    }

    private Integer[] nums;

    public void traverse_levelorder_bfs() {
        if(nums==null)
            return;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (true){
            if (q.isEmpty())
                break;
            Integer index = q.poll();
            if(index>=nums.length)
                continue;
            if (nums[index]==null)
                continue;

            System.out.print(nums[index]+" ");

            Integer left_index = (index+1)*2 -1;
            Integer right_index = (index+1)*2 +1 -1;

            q.add(left_index);
            q.add(right_index);
        }
    }

    /** BFS **/
//    public void traverse_levelorder_bfs() {
//        if (this.nums.length < 0) return;
//
//        Queue<Integer> q = new LinkedList<>();
//
//        /** initialization **/
//        int i_root = 0;
//        q.add(i_root);
//        while (true) {
//            /** end condition **/
//            if (q.size() == 0) break; // empty queue
//
//            /** main logic **/
//            Integer i = q.poll();
//            if (i >= this.nums.length) continue; // out of bound index
//            if (this.nums[i] == null) continue;
//
//            System.out.print(this.nums[i] + " ");
//
//            /** data flow **/
//            // get left, right nodes
//            int i_plus_one = i + 1;
//            int i_left_plus_one = i_plus_one * 2;
//            int i_right_plus_one = i_plus_one * 2 + 1;
//
//            int i_left = i_left_plus_one - 1;
//            int i_right = i_right_plus_one - 1;
//
//            q.add(i_left);
//            q.add(i_right);
//
//        }
//    }

}
