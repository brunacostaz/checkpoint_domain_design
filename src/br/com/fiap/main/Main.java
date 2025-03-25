// Bruna da Costa Candeias  |  RM: 558939
// Lucas Derenze Simidu  |  RM: 555931
// Marcos Vinicius da Silva Costa  | RM: 555490

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia, calcularTotalDeDespesas, calcularRendaFamiliarLiquida, totalDespesas, rendaFamiliarLiquida;
        int numeroDeMoradores;

        Scanner scan;
        DespesaFamiliar despesa = new DespesaFamiliar();

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

            despesa.rendaFamiliar = rendaFamiliar;
            despesa.numeroDeMoradores = numeroDeMoradores;
            despesa.gastoComLuz = gastoComLuz;
            despesa.gastoComAgua = gastoComAgua;
            despesa.gastoComInternet = gastoComInternet ;
            despesa.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            totalDespesas = despesa.calcularTotalDeDespesas();
            rendaFamiliarLiquida = despesa.calcularRendaFamiliarLiquida(totalDespesas);

            System.out.printf("A despesa total da família é de: R$ %.2f%n\nA renda familiar liquida da família é: R$ %.2f%n", totalDespesas, rendaFamiliarLiquida);

            //System.out.printf("A renda familiar liquida da família é: R$ %.2f%n", rendaFamiliarLiquida);

        } catch (Exception e) {
            System.out.printf("Ocorreu um erro: %s%n", e.getMessage());
        }

    }
}
