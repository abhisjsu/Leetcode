package com.interview.leetcode.november.design.lrucache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {

    class Data
    {
        public int key;
        public int value;

        public Data(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    int size;

    LinkedList<Data> list;
    Map<Integer,Data> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.list = new LinkedList<>();
        this.map = new HashMap<>();
    }

    public int get(int key) {

        //this operation only involve manipulation on list

        if(this.map.get(key) ==null)
            return -1;

        Data object = this.map.get(key);
//        System.out.println("prio :"+object.key);

        this.list.remove(object);//remove the object from the list
        //this.map.remove(key);

        this.map.put(key,object);
        this.list.addFirst(object);//add it to the start

        return object.value;

    }

    public void put(int key, int value) {

        Data data = new Data(key,value);

        if(this.map.containsKey(key))
        {
            this.list.remove(this.map.get(key));
            this.map.remove(key);
            this.size--;
        }

        if(this.size>=this.capacity)
        {
            //get the last element of the list, remove from the list and the hashmap

            Data last = this.list.removeLast();
            System.out.println("Evicts "+last.key);
            this.map.remove(last.key);
            this.size--;
        }

        this.list.addFirst(data);
        this.map.put(key,data);
        this.size++;


    }

    public static void main(String argv[])
    {

        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
        System.out.println(cache.get(4));       // returns 4

    }
}

