package Exercicio3.Map;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> resultados = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            int valor = random.nextInt(6) + 1;
            resultados.put(valor, resultados.getOrDefault(valor, 0) + 1);
        }
        System.out.println(resultados);
    }
}


