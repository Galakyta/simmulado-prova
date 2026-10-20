public class apoliceResidencial extends apolice {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo



    public apoliceResidencial(double valorDoCalculo) {
        this.valorDoCalculo = valorDoCalculo;
        
    }
@Override 
public double calcularPremio(){
    valorDoCalculo = (valorDoCalculo * 0.015) / 12;
    return valorDoCalculo;
}
@Override 

public  String imprimirResumo(){
    return "TIPO DE SEGURO: RESIDENCIAL // PREMIO MENSAL: " + valorDoCalculo + "DOCUMENTOS EXIGIDOS: ESCRITURA OU CONTRATO DE LOCACAO";
}
}
