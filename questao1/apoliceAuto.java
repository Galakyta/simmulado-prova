public class apoliceAuto extends apolice {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo



    public apoliceAuto(double valorDoCalculo) {
        this.valorDoCalculo = valorDoCalculo;
        
    }
@Override 
public double calcularPremio(){
    valorDoCalculo = (valorDoCalculo * 0.08) / 12;
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE SEGURO: AUTO // PREMIO MENSAL: " + valorDoCalculo + "DOCUMENTOS EXIGIDOS: CNH E CRLV";
}
}
