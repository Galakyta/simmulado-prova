package questao2;

public class InvoiceAlemanha implements Invoice{

    @Override 
public Etiqueta etiquetaGerada(){
    return new EtiquetaAlemanha();
}
@Override 
public Pagamento pagamentoGerado(double valor){
    return new PagamentoAlemanha(valor);
}
@Override 
public DocFiscal docFiscalGerado(){
    return new DocFiscalAlemanha();
}

}
