package Exercicio1.List;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificacaoCriminosa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();
        System.out.print("Telefonou para a vítima? (sim/não) ");
        String resposta = sc.nextLine().toLowerCase();
        respostas.add(resposta);

        System.out.print("Esteve no local do crime? (sim/não) ");
        resposta = sc.nextLine().toLowerCase();
        respostas.add(resposta);

        System.out.print("Mora perto da vítima? (sim/não) ");
        resposta = sc.nextLine().toLowerCase();
        respostas.add(resposta);

        System.out.print("Devia para a vítima? (sim/não) ");
        resposta = sc.nextLine().toLowerCase();
        respostas.add(resposta);

        System.out.print("Já trabalhou com a vítima? (sim/não) ");
        resposta = sc.nextLine().toLowerCase();
        respostas.add(resposta);

        int respostasPositivas = contarRespostasPositivas(respostas);
        switch (respostasPositivas) {
            case 2:
                System.out.println("Classificação: Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Classificação: Cúmplice");
                break;
            case 5:
                System.out.println("Classificação: Assassina");
                break;
            default:
                System.out.println("Classificação: Inocente");
                break;
        }
    }

    public static int contarRespostasPositivas(List<String> respostas) {
        int contador = 0;
        for (String resposta : respostas) {
            if (resposta.equals("sim")) {
                contador++;
            }
        }
        return contador;
    }
}


