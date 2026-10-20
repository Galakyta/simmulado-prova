package questao2;

public class Checkout {
    private final Invoice invoice;

    public Checkout(Invoice invoice) {
        this.invoice = invoice;
    }

 

    public void finalizarPedido(double valor){
        
        Etiqueta e = invoice.etiquetaGerada();
        Pagamento p = invoice.pagamentoGerado(valor);
        DocFiscal d = invoice.docFiscalGerado();

        System.out.println(e.imprimirEtiqueta());
        System.out.println(p.imprimirPagamento());
        System.out.println(d.imprimirDocFiscal());
         
    }

}
