package Exercicio3.Map;


import java.util.*;

public class Random {
    public static void main(String[] args) {
        Map<String, Integer> populacao = new HashMap<>();
        populacao.put("PE", 9616621);
        populacao.put("AL", 3351543);
        populacao.put("CE", 9187103);
        populacao.put("RN", 3534265);
        populacao.put("PB", 4039277);

        populacao.put("RN", 3534165);

        if (!populacao.containsKey("PB")) {
            populacao.put("PB", 4039277);
        }

        System.out.println("População de PE: " + populacao.get("PE"));
        System.out.println("Estados e populações:");
        for (String estado : populacao.keySet()) {
            System.out.println(estado + ": " + populacao.get(estado));
        }
        System.out.println("Estados e populações em ordem alfabética:");
        List<String> estadosOrdenados = new ArrayList<>(populacao.keySet());
        Collections.sort(estadosOrdenados);
        for (String estado : estadosOrdenados) {
            System.out.println(estado + ": " + populacao.get(estado));
        }
        int menorPopulacao = Integer.MAX_VALUE;
        String estadoMenorPopulacao = null;
        int maiorPopulacao = Integer.MIN_VALUE;
        String estadoMaiorPopulacao = null;
        int somaPopulacao = 0;
        for (String estado : populacao.keySet()) {
            int populacaoEstado = populacao.get(estado);
            if (populacaoEstado < menorPopulacao) {
                menorPopulacao = populacaoEstado;
                estadoMenorPopulacao = estado;
            }
            if (populacaoEstado > maiorPopulacao) {
                maiorPopulacao = populacaoEstado;
                estadoMaiorPopulacao = estado;
            }
            somaPopulacao += populacaoEstado;
        }
        double mediaPopulacao = (double) somaPopulacao / populacao.size();
        System.out.println("Estado com a menor população: " + estadoMenorPopulacao + " (" + menorPopulacao + ")");
        System.out.println("Estado com a maior população: " + estadoMaiorPopulacao + " (" + maiorPopulacao + ")");
        System.out.println("Soma da população dos estados: " + somaPopulacao);
        System.out.println("Média da população dos estados: " + mediaPopulacao);
        populacao.entrySet().removeIf(entry -> entry.getValue() < 4000000);


    }

    public int nextInt(double i) {
        return 0;
    }
}
