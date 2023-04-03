package Exercicio2.Set;


import java.util.*;

public class CoresArcoIris {
    public static void main(String[] args) {
        // Criando um conjunto com as cores do arco-íris
        Set<String> coresArcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        // Exibindo todas as cores uma abaixo da outra
        System.out.println("Cores do arco-íris:");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        // Quantidade de cores que o arco-íris tem
        System.out.println("\nO arco-íris tem " + coresArcoIris.size() + " cores.");

        // Exibindo as cores em ordem alfabética
        List<String> coresAlfabeticas = new ArrayList<>(coresArcoIris);
        Collections.sort(coresAlfabeticas);
        System.out.println("\nCores do arco-íris em ordem alfabética:");
        for (String cor : coresAlfabeticas) {
            System.out.println(cor);
        }

        // Exibindo as cores na ordem inversa da que foi informada
        List<String> coresInversas = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresInversas);
        System.out.println("\nCores do arco-íris na ordem inversa:");
        for (String cor : coresInversas) {
            System.out.println(cor);
        }

        // Exibindo todas as cores que começam com a letra "v"
        System.out.println("\nCores do arco-íris que começam com 'v':");
        for (String cor : coresArcoIris) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        // Removendo todas as cores que não começam com a letra "v"
        coresArcoIris.removeIf(cor -> !cor.startsWith("v"));
        System.out.println("\nCores do arco-íris após remover as que não começam com 'v':");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        // Limpando o conjunto
        coresArcoIris.clear();

        // Verificando se o conjunto está vazio
        if (coresArcoIris.isEmpty()) {
            System.out.println("\nO conjunto de cores do arco-íris está vazio.");
        }
    }
}


