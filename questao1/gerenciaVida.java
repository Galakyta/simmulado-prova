public class gerenciaVida implements factoryGerencia {
// criar a apólice, calcular o prêmio mensal e imprimir o resumo
@Override 
public  apolice apoliceGerada(double valorDoCalculo){
    return new apoliceVida(valorDoCalculo);
}

}
