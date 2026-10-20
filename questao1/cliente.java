public class cliente {
public static void main(String[] args) {
    
     factoryGerencia gerencia1 = new gerenciaAuto();
     factoryGerencia gerencia2 = new gerenciaVida();
     factoryGerencia gerencia3 = new gerenciaResidencial();

     apolice apolice1 = gerencia1.apoliceGerada(10000.00);
     apolice apolice2 = gerencia2.apoliceGerada(1000.00);
     apolice apolice3 = gerencia3.apoliceGerada(1000.00);

     System.out.println(apolice1.calcularPremio());
     System.out.println(apolice1.imprimirResumo());

     

}
}
