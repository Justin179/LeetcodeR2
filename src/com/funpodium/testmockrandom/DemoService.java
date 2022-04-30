package com.funpodium.testmockrandom;

public class DemoService {

    private RandomInterface random;

    public DemoService(RandomInterface random) {
        this.random = random;
    }

    public int addTenWithRandom(int i) {
        return i + 10 + random.nextInt();
    }

}