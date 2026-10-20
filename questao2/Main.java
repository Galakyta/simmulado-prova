package questao2;

public class Main {

    public static void main(String[] args) {
        
        Checkout pedidoBrasil = new Checkout(new InvoiceBrasil());
        pedidoBrasil.finalizarPedido(1000.00);
        Checkout pedidoAlemanha = new Checkout(new InvoiceAlemanha());
        pedidoAlemanha.finalizarPedido(2000.00);

    }


}
