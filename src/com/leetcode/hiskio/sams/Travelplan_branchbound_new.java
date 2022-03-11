package com.leetcode.hiskio.sams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Travelplan_branchbound_new {
    Integer[][] hours;

    String[] c_remained = new String[]{"NP", "IS", "CA", "UK", "US"};
    private void build_hour_table() {
        // NP: 0 (North Pole)
        // IS: 1
        // CA: 2
        // UK: 3
        // US: 4

        this.hours = new Integer[5][5];

        hours[0][0] = 0;     // NP -> NP
        hours[0][1] = 14;    // NP -> IS
        hours[0][2] = 15;    // NP -> CA
        hours[0][3] = 17;    // NP -> UK
        hours[0][4] = 16;    // NP -> US

        hours[1][0] = 14;    // IS -> NP
        hours[1][1] = 0;     // IS -> IS
        hours[1][2] = 24;    // IS -> CA
        hours[1][3] = 8;     // IS -> UK
        hours[1][4] = 36;    // IS -> US

        hours[2][0] = 15;    // CA -> NP
        hours[2][1] = 24;    // CA -> IS
        hours[2][2] = 0;     // CA -> CA
        hours[2][3] = 34;    // CA -> UK
        hours[2][4] = 4;     // CA -> US

        hours[3][0] = 17;    // UK -> NP
        hours[3][1] = 8;     // UK -> IS
        hours[3][2] = 34;    // UK -> CA
        hours[3][3] = 0;     // UK -> UK
        hours[3][4] = 30;    // UK -> US

        hours[4][0] = 16;    // US -> NP
        hours[4][1] = 36;    // US -> IS
        hours[4][2] = 4;     // US -> CA
        hours[4][3] = 30;    // US -> UK
        hours[4][4] = 0;     // US -> US

    }

    public Integer get_hour(String start, String end) {
        Integer x = get_index(start);
        Integer y = get_index(end);
        return this.hours[x][y];
    }

    private Integer get_index(String str){
        if (str.equals("NP")) return 0;
        if (str.equals("IS")) return 1;
        if (str.equals("CA")) return 2;
        if (str.equals("UK")) return 3;
        if (str.equals("US")) return 4;

        return null;
    }

    /** enumeration -> backtracking -> branch & bound **/
    static class Country {
        String name;
        Integer index;
        Integer hour_to_take;

        public Country(String country, Integer index, Integer hour) {
            this.name = country;
            this.index = index;
            this.hour_to_take = hour;
        }
    }

    static class MyComp implements Comparator<Country> {
        @Override
        public int compare(Country node01, Country node02) {
            return node01.hour_to_take.compareTo(node02.hour_to_take); // low -> high
        }
    }

    List<String> route = new ArrayList<>();
    Integer hour_best = null;
    public void branchbound() {
        String start_country = "NP";
        route.add(start_country);
        c_remained[0] = null;

        branchbound_recursion();
    }

    private void branchbound_recursion() {
        if (route.size() == 5) {
            // get a complete trip plan
            int hour_total = get_hour_total();
            if (hour_best == null || hour_total < hour_best) { // 更新最佳時數
                hour_best = hour_total;
                print_result(hour_total, route);
            }else {
//                System.out.print("[X] ");
//                print_result(hour_total, route);
            }

            return;
        }else {
            /** bound check **/
            int hour_total = get_hour_total();
            if (hour_best != null && hour_total >= hour_best) {
                System.out.print("(bounded) ");
                print_result(hour_total, route);
                return;
            }
        }

        /** branch strategy **/
        PriorityQueue<Country> pq = new PriorityQueue<>(c_remained.length, new MyComp());

        /** step01: sort child node by hours **/
        String start_country = route.get(route.size()-1);
        for (int i = 0; i < c_remained.length; i++) {
            // get hour between start and end country
            if (c_remained[i] == null) continue;
            String end_country = c_remained[i];
            Integer hour = get_hour(start_country, end_country);
            Country node = new Country(end_country, i, hour);
            // sort it in the queue
            pq.add(node);
        }

        while (true) {
            if (pq.size() == 0) break;
            /** step02: pick the best child to continue each round **/
            Country c_next = pq.poll(); // 由最小的拿

            // take out
            route.add(c_next.name);
            c_remained[c_next.index] = null;

            /** next round **/
            branchbound_recursion();

            // give back
            route.remove(c_next.name);
            c_remained[c_next.index] = c_next.name;

        }
    }

    private void print_result(int hour_total, List<String> route) {
        for (int i = 0; i < route.size(); i++) {
            System.out.print(route.get(i));
            if (i + 1 == route.size()) break;
            System.out.print("->");
        }

        System.out.println(" : " + hour_total);
    }

    private int get_hour_total() {
        if (route.size() == 0) return 0;
        int hour_total = 0;
        String start = route.get(0);
        String end = null;
        for (int i = 1; i < route.size(); i++) {
            end = route.get(i);
            hour_total += get_hour(start, end);

            start = end;
        }
        return hour_total;
    }

    public static void main(String[] args) {
        Travelplan_branchbound_new tp = new Travelplan_branchbound_new();
        tp.build_hour_table();
        tp.branchbound();
    }

}