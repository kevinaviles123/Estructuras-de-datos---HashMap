package com.mycompany.ejemplohashmap;
import java.util.HashMap;

public class VerificarValorHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Uno");
        hashMap.put(2, "Dos");
        hashMap.put(3, "Tres");

        String valorABuscar = "Dos";
        if (hashMap.containsValue(valorABuscar)) {
            System.out.println("El valor \"" + valorABuscar + "\" existe en el HashMap.");
        } else {
            System.out.println("El valor \"" + valorABuscar + "\" no existe en el HashMap.");
        }
    }
}
