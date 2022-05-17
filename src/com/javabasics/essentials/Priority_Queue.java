package com.javabasics.essentials;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {

    static class Person{
        Integer age;
        public Person(Integer age) {
            this.age = age;
        }
    }
    static class MyCompare implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
//            return o1.age.compareTo(o2.age); // low -> high
             return -o1.age.compareTo(o2.age); // high -> low
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1,3,4,2,5};
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i : nums){
//            pq.add(i);
//        }
//        while (!pq.isEmpty()){
//            // 預設取出的排序
//            Integer curr = pq.poll(); // 1 2 3 4 5
//            System.out.println(curr);
//        }

        // 客製化排序
        Person[] people = {new Person(9),new Person(7),new Person(3),new Person(5),new Person(12)};
        PriorityQueue<Person> pq2 = new PriorityQueue<>(new MyCompare());
        for (Person person:people){
            pq2.add(person);
        }
        while (!pq2.isEmpty()){
            Person person = pq2.poll();
            System.out.println(person.age);
        }


    }
}
