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
    public double despesasFamiliar;

    // métodos

    public double calcularTotalDeDespesas() {
        double despesas = gastoComAgua + gastoComInternet + gastoComLuz + (valorMensalidadeDaAcademia * numeroDeMoradores);
        despesasFamiliar = despesas;
        return despesas;
    }

    public double calcularRendaFamiliarLiquida(){
        double rendaFamiliarLiquida = rendaFamiliar - despesasFamiliar;
        return rendaFamiliarLiquida;
    }
}
