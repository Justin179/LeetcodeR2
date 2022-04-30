package com.funpodium.multithread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WholeItem wholeItem = WholeItem.getInstance();

        List<String> itemNames = Arrays.asList("A", "B", "C"); // 要累加值得item名稱

        ExecutorService es = Executors.newCachedThreadPool();

        // 每個名稱跑一條thread來累加
        itemNames.forEach(name -> {
            es.execute(new Runnable() {
                @Override
                public void run() {
                    wholeItem.add(name);
                }
            });
        });

        es.shutdown();

        boolean finished = es.awaitTermination(1, TimeUnit.SECONDS); // 執行緒是否結束

        while (finished) { // 執行緒結束印出每個item的值
            wholeItem.getItems().forEach(item -> {
                System.out.println(item.getName() + ":" + item.getValue());
            });
            finished = false; // 印完值後離開while迴圈
        }
    }
}
