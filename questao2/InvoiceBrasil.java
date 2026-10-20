package questao2;

public class InvoiceBrasil implements Invoice{

    @Override 
public Etiqueta etiquetaGerada(){
    return new EtiquetaBrasil();
}
@Override 
public Pagamento pagamentoGerado(double valor){
    return new PagamentoBrasil(valor);
}
@Override 
public DocFiscal docFiscalGerado(){
    return new DocFiscalBrasil();
}

}
