public class NotaFiscal implements Pagavel {
  private String numeroPeca;
  private String descricaoPeca;
  private int quantidade;
  private double precoPorItem;

  public double getPrecoPorItem() {
    return precoPorItem;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setPrecoPorItem(double precoPorItem){
    this.precoPorItem = precoPorItem;
  }

  public NotaFiscal(String numeroPeca, String descricaoPeca, int quantidade, double precoPorItem){    
    this.numeroPeca = numeroPeca; 
    this.descricaoPeca = descricaoPeca;
    setQuantidade(quantidade); 
    setPrecoPorItem(precoPorItem); 
  }
  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade > 0 ? quantidade : 0; 
  }
  public String getDescricaoPeca(){
    return descricaoPeca;
  }
  public void setDescricaoPeca(String descricaoPeca){
    this.descricaoPeca = descricaoPeca;
  }
  public String toString(){
    return String.format("\n%s \n%s: %s (%s) \n%s: %d \n%s: $%.2f", "Nota", "peca numero", getNumeroPeca(), getDescricaoPeca(), "quantidade", this.quantidade, "preco por item", this.getPrecoPorItem());
  }
  public String getNumeroPeca() {
    return numeroPeca;
  }
  public double getValorPagamento(){
    return getQuantidade() * getPrecoPorItem();
  }
}