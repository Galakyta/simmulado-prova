public class apoliceVida extends apolice {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo

    public apoliceVida(double valorDoCalculo) {
        this.valorDoCalculo = valorDoCalculo;
        
    }
@Override 
public double calcularPremio(){
    valorDoCalculo = (valorDoCalculo * 0.03) / 12;
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE SEGURO: VIDA // PREMIO MENSAL: " + valorDoCalculo + "DOCUMENTOS EXIGIDOS: DOCUMENTO COM FOTO E CPF";
}
}
