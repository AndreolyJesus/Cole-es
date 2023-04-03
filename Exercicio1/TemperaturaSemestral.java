package Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturaSemestral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite a temperatura média do mês " + i + ": ");
            double temperatura = sc.nextDouble();
            temperaturas.add(temperatura);
        }

        double mediaSemestral = calcularMediaSemestral(temperaturas);
        System.out.println("A média semestral das temperaturas é: " + mediaSemestral);

        System.out.println("Temperaturas acima da média semestral:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaSemestral) {
                String mes = obterMesPorExtenso(i + 1);
                System.out.println("Mês " + mes + ": " + temperaturas.get(i));
            }
        }
    }

    public static double calcularMediaSemestral(List<Double> temperaturas) {
        double soma = 0;
        for (Double temperatura : temperaturas) {
            soma += temperatura;
        }
        return soma / temperaturas.size();
    }

    public static String obterMesPorExtenso(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            default:
                return "";
        }
    }
}


