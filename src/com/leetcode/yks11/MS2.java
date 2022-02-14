package com.leetcode.yks11;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MS2 {
    /*
            int[][] field2 = {  {-1, 1, 0, 0},
                                {1, 1, 0, 0},
                                {0, 0, 1, 1},
                                {0, 0, 1, -1}};
           感染擴散遊戲:
           一開始點下去的位置，若為0，才會觸發掃視一圈，若一開始點下去的位置非0，那就直接return收工
     */


    public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
        Queue<int[]> q = new LinkedList<>();
        if(field[givenI][givenJ] == 0){
            field[givenI][givenJ] = -2;
            q.add(new int[]{givenI,givenJ});
        } else
            return field;

        while (!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                int[] curr = q.poll();
                int rowI = curr[0];
                int colI = curr[1];
                for(int j = rowI-1; j<=rowI+1; j++){
                    for(int k = colI-1; k<=colI+1; k++){
                        if(j>=0&&k>=0&&j<numRows&&k<numCols&&field[j][k]==0){
                            field[j][k] = -2;
                            q.add(new int[]{j,k});
                        }

                    }
                }
            }
        }

        return field;
    }

    // Implement your solution below.
//    public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {
//        ArrayDeque<int[]> toCheck = new ArrayDeque<int[]>();
//        if (field[givenI][givenJ] == 0) {
//            field[givenI][givenJ] = -2;
//            int[] coordinates = {givenI, givenJ};
//            toCheck.add(coordinates);
//        }
//        else {
//            return field;
//        }
//        while(!toCheck.isEmpty()) {
//            int[] currentCoordinates = toCheck.remove();
//            int currentI = currentCoordinates[0];
//            int currentJ = currentCoordinates[1];
//            for (int i = currentI - 1; i < currentI + 2; i++) {
//                for (int j = currentJ - 1; j < currentJ + 2; j++) {
//                    if (0 <= i && i < numRows && 0 <= j && j < numCols
//                            && field[i][j] == 0) {
//                        field[i][j] = -2;
//                        int[] coordinates = {i, j};
//                        toCheck.add(coordinates);
//                    }
//                }
//            }
//        }
//        return field;
//    }
}
