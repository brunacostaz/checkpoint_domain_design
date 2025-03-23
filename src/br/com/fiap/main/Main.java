package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia, calcularTotalDeDespesas, calcularRendaFamiliarLiquida;
        int numeroDeMoradores;

        Scanner scan;
        DespesaFamiliar dp = new DespesaFamiliar();

        try {
            scan = new Scanner(System.in);
            System.out.print("Digite o valor da RENDA FAMILIAR:\n-> ");
            rendaFamiliar = scan.nextDouble();

            System.out.print("Digite o valor do NÚMERO DE MORADORES:\n-> ");
            numeroDeMoradores = scan.nextInt();

            System.out.print("Digite o valor do GASTO COM LUZ:\n-> ");
            gastoComLuz = scan.nextDouble();

            System.out.print("Digite o valor do GASTO COM AGUA:\n-> ");
            gastoComAgua = scan.nextDouble();

            System.out.print("Digite o valor do GASTO COM INTERNET:\n-> ");
            gastoComInternet = scan.nextDouble();

            System.out.print("Digite o valor da MENSALIDADE DA ACADEMIA:\n-> ");
            valorMensalidadeDaAcademia = scan.nextDouble();


        } catch (Exception e) {
            //Ainda a desenvolver
        }


    }
}
