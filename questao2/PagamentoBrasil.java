package questao2;

public class PagamentoBrasil extends Pagamento {

    public PagamentoBrasil(double valor) {
       super(valor);
    }


    @Override 
public  String imprimirPagamento(){
    double valorASerPago = (valor * 0.18);
    return "Valor do pedido: " + valor + " com impostos: " + (valor + valorASerPago) + "Metodo de pagamento aceito: PIX";
}

}
