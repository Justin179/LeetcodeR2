package com.funpodium;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/*
考題大概如下。請問執行時Thread Pool中最多會有多少執行緒？

答案是3，也就是corePoolSize的設定值。

這題我也是答錯，直觀的回答5，也就是maxPoolSize的設定值。

上面執行時執行緒不會超過3，原因是只有在workQueue被task佔滿的時候才會增加thread的數量，
而LinkedBlockingQueue預設的大小為Integer.MAX_VALUE(231-1)，而迴圈的數量最多才10000，且非耗時的程序，
在workQueue無法被塞滿的情況下thread數量只會維持在corePoolSize的值，也就是3。
 */
public class MaxPoolSize {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3, // corePoolSize
                5, // maxPoolSize
                3L, // keepAliveTime
                TimeUnit.SECONDS, // timeUnit
                new LinkedBlockingQueue<Runnable>(), // workQueue
                new ThreadPoolExecutor.DiscardPolicy() // 拋棄策略
        );

        for (int i = 0; i < 10000; i++) {
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(executor.getPoolSize());
                }
            });
        }

        executor.shutdown();
    }
}
