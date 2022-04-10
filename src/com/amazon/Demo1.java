package com.amazon;

import java.io.*;
import java.util.*;

public class Demo1 {
    /*
     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER threshold
     *
     *
     * 一筆
     * sender_user_id 寄出者 9碼純數字
     * recipient_user_id 接收者 9碼純數字
     * amount_of_transaction 交易金額 9碼純數字
     * 以空格分開欄位
     *
     * 任務是找出 打到或超出(>=)指定交易次數的使用者 (使用者id上升排序)
     *
     *
     */
    public static void main(String[] args) throws IOException {
        List<String> logs = new ArrayList<>();
        logs.add("88 99 200");
        logs.add("88 99 300");
        logs.add("99 32 100");
        logs.add("12 12 15");
        int threshold = 2;
        List<String> res = processLogs(logs, threshold);
        System.out.println(res); // ["88",99"] >= 2
    }

    public static List<String> processLogs(List<String> logs, int threshold) {
        // Write your code here
        Map<String,Integer> map = new HashMap<>();
        for (String log : logs){
            String[] strArr = log.split(" ");
            String senderId = strArr[0];
            String receiverId = strArr[1];
            if (senderId.equals(receiverId)){ // 12 12
                updateMapCounter(map, senderId);
            } else {
                updateMapCounter(map, senderId);
                updateMapCounter(map, receiverId);
            }
        }

        List<String> res = new ArrayList<>();

        // Iterating HashMap through for loop
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
            if (set.getValue()<threshold)
                continue;
            res.add(set.getKey());
        }

        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });

        return res;
    }

    private static void updateMapCounter(Map<String, Integer> map, String id) {
        if (map.containsKey(id)) // 已有就加1
            map.put(id, map.get(id) + 1);
        else  // 還不存在就新加入
            map.put(id, 1);
    }
}
