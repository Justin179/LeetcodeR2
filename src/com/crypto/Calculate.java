package com.crypto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculate {
    public static void main(String[] args) {

        double h1 = 0.4851;
        double l1 = 0.47512;
        double c1 = 0.48324;
        double typicalPrice = (h1+l1+c1) / 3;
        double volume = 10409899.563;
        BigDecimal tp = new BigDecimal(typicalPrice).setScale(4, RoundingMode.HALF_UP);
        BigDecimal vol = new BigDecimal(volume).setScale(4, RoundingMode.HALF_UP);
        BigDecimal tpv = tp.multiply(vol).setScale(4, RoundingMode.HALF_UP);
        // double tpv = typicalPrice*volume;
        BigDecimal vwap1 = tpv.divide(vol, 6, RoundingMode.HALF_UP);
        System.out.println("GMT: 2022年4月3日Sunday 00:00:00");
        System.out.println("tp1: " + tp);
        System.out.println("vol1: " + vol);
        System.out.println("tpv1: " + tpv);
        System.out.println("vwap1: "+vwap1);

        System.out.println("-------------");

        double h2 = 0.49;
        double l2 = 0.47432;
        double c2 = 0.47848;
        double typicalPrice2 = (h2+l2+c2) / 3;
        double volume2 = 31060360.703;
        BigDecimal tp2 = new BigDecimal(typicalPrice2).setScale(4, RoundingMode.HALF_UP);
        BigDecimal vol2 = new BigDecimal(volume2).setScale(4, RoundingMode.HALF_UP);
        BigDecimal tpv2 = tp2.multiply(vol2).setScale(4, RoundingMode.HALF_UP);
        // double tpv = typicalPrice*volume;
        BigDecimal vwap2 = tpv2.divide(vol2, 6, RoundingMode.HALF_UP);
        System.out.println("GMT: 2022年4月2日Saturday 00:00:00");
        System.out.println("tp2: " + tp2);
        System.out.println("vol2: " + vol2);
        System.out.println("tpv2: " + tpv2);
        System.out.println("vwap2: "+vwap2);


        BigDecimal cumulativeTPV = tpv.add(tpv2);
        BigDecimal cumulativeVOL = vol.add(vol2);
        BigDecimal vwap = cumulativeTPV.divide(cumulativeVOL, 6, RoundingMode.HALF_UP);


        System.out.println("cumulativeTPV: " + cumulativeTPV);
        System.out.println("cumulativeVOL: " + cumulativeVOL);
        System.out.println("vwap: "+vwap);


//        double tpvSum = tpv+tpv2;
//        double volumeSum = volume+volume2;
//        double VWAP = tpvSum / volumeSum;
//        System.out.println("--------------");
//        System.out.println("VWAP: " + VWAP);
//
//        double avg_vwap = (vwap1+vwap2) / 2;
//        System.out.println("avg_vwap: " + avg_vwap);




    }
}
