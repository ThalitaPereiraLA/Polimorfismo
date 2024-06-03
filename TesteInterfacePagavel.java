public class TesteInterfacePagavel {
  public static void main (String[] args){
    Pagavel pagavel[] = new Pagavel[4];
    pagavel [0] = new NotaFiscal("123", "Caneta", 2, 1.50);
    pagavel [1] = new NotaFiscal("456", "Lapis", 3, 0.50);
    pagavel [2] = new EmpregadoAssalariado("Joao", "Silva", "111-11-1111", 1000.00);
    pagavel [3] = new EmpregadoAssalariado("Maria", "Souza", "222-22-2222", 2200.00);

    System.out.println("Notas Fiscais e Empregados processados polimorficamente");

    for (Pagavel elem : pagavel){
      System.out.println("\n%s \n%s: $%.2f\n", elem.toString(), "Pagamento Devido", elem.getValorPagamento());
    }
    
  }
}