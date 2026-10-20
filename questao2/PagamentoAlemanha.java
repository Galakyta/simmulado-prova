package questao2;

public class PagamentoAlemanha extends Pagamento {

    public PagamentoAlemanha(double valor) {
       super(valor);
    }


    @Override 
public  String imprimirPagamento(){
    double valorASerPago = (valor * 0.19);
return "Valor do pedido: " + valor + " com impostos: " + (valor + valorASerPago) + "Metodo de pagamento aceito: SEPA direct deb";
}

}
