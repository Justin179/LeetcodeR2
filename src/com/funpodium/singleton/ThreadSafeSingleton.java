package com.funpodium.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {
    }

    public synchronized static ThreadSafeSingleton getInstance() {
        if(instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
    /*
    如果整個應用程式只需要一個東西，那就不用重複產生一模一樣的東西。單例常見的應用場景為：
        連線物件
        配置物件
        日誌物件
     */