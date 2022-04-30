package com.funpodium.testmockrandom;

public class DemoServiceTests {

    public static void main(String[] args) {
        new DemoServiceTests().testAddTenWithRandomIgnoreRandomValue();
    }

    public void testAddTenWithRandomIgnoreRandomValue() {
        DemoService demoService = new DemoService(new MockRandom());
        assert demoService.addTenWithRandom(10) == 20;
    }

}