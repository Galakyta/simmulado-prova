package questao2;

public interface Invoice {
public Etiqueta etiquetaGerada();
public Pagamento pagamentoGerado(double valor);
public DocFiscal docFiscalGerado();
}
