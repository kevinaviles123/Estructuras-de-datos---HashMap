package com.mycompany.ejemplohashmap;
import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Uno");
        hashMap.put(2, "Dos");
        hashMap.put(3, "Tres");

        System.out.println("Elementos del HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " => " + hashMap.get(key));
        }
    }
}
