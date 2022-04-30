package com.funpodium.singleton;

public class ThreadSafeSingleton2 {
    private static ThreadSafeSingleton2 instance = null;

    private ThreadSafeSingleton2() {
    }

    public static ThreadSafeSingleton2 getInstance() {
        if(instance == null) {
            // 以上的好處是只有第一次產生單例時才進入同步，比起直接在getInstance()方法做同步的效能較好。
            // 或是Class loader載入時直接產生實例。但這樣就沒有懶初始化(lazy-initialization)的效果。
            synchronized (ThreadSafeSingleton2.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton2();
                }
            }
        }
        return instance;
    }
}
