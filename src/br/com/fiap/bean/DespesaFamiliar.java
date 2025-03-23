// Bruna da Costa Candeias  |  RM: 558939
// Lucas Derenze Simidu  |  RM: 555931
// Marcos Vinicius da Silva Costa  | RM: 555490

package br.com.fiap.bean;

public class DespesaFamiliar {

    // atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    // métodos

    public double calcularTotalDeDespesas() {
        double despesas = gastoComAgua + gastoComInternet + gastoComLuz + (valorMensalidadeDaAcademia * numeroDeMoradores);
        return despesas;
    }

    public double calcularRendaFamiliarLiquida(double despesas){
        double rendaFamiliarLiquida = rendaFamiliar - despesas;
        return rendaFamiliarLiquida;
    }
}
