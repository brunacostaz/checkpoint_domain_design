// Bruna da Costa Candeias  |  RM: 558939
// Lucas Derenze Simidu  |  RM: 555931
// Marcos Vinicius da Silva Costa  | RM: 555490

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia, calcularTotalDeDespesas, calcularRendaFamiliarLiquida;
        //int numeroDeMoradores;

        Scanner scan;
        DespesaFamiliar despesa = new DespesaFamiliar();

        try {
            scan = new Scanner(System.in);
            System.out.print("Digite o valor da RENDA FAMILIAR:\n-> ");
            despesa.rendaFamiliar = scan.nextDouble();

            System.out.print("Digite o valor do NÚMERO DE MORADORES:\n-> ");
            despesa.numeroDeMoradores = scan.nextInt();

            System.out.print("Digite o valor do GASTO COM LUZ:\n-> ");
            despesa.gastoComLuz = scan.nextDouble();

            System.out.print("Digite o valor do GASTO COM AGUA:\n-> ");
            despesa.gastoComAgua = scan.nextDouble();

            System.out.print("Digite o valor do GASTO COM INTERNET:\n-> ");
            despesa.gastoComInternet = scan.nextDouble();

            System.out.print("Digite o valor da MENSALIDADE DA ACADEMIA:\n-> ");
            despesa.valorMensalidadeDaAcademia = scan.nextDouble();

            double totalDespesas = despesa.calcularTotalDeDespesas();
            double rendaFamiliarLiquida = despesa.calcularRendaFamiliarLiquida(totalDespesas);

            System.out.printf("A despesa total da família é de: R$ %.2f%n\nA renda familiar liquida da família é: R$ %.2f%n", totalDespesas, rendaFamiliarLiquida);

            //System.out.printf("A renda familiar liquida da família é: R$ %.2f%n", rendaFamiliarLiquida);

        } catch (Exception e) {
            System.out.printf("Ocorreu um erro: %s%n", e.getMessage());
        }

    }
}
