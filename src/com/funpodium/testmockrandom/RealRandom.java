package com.funpodium.testmockrandom;

import java.util.Random;

public class RealRandom implements RandomInterface {
    @Override
    public int nextInt() {
        return new Random().nextInt();
    }
}
