public class ItensPedido {
    private int idItensPedido;
    protected Produtos produtos;
    protected int quantidade;
    protected double precoUnitario;

    public ItensPedido(int idItensPedido, Produtos produtos, int quantidade){
        this.idItensPedido = idItensPedido;
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.precoUnitario = produtos.getPreco();
    }
    public double subTotal(){
        return precoUnitario * quantidade;
    }

    public int getIdItensPedido(){return idItensPedido;}
    public void setIdItensPedido(int idItensPedido){this.idItensPedido = idItensPedido;}

    public Produtos getProdutos(){return produtos;}
    public void setProdutos(Produtos produtos){this.produtos = produtos;}

    public int getQuantidade(){return quantidade;}
    public void setQuantidade(int quantidade){this.quantidade = quantidade;}

    public double getPrecoUnitario(){return precoUnitario;}
    public void setPrecoUnitario(double precoUnitario){this.precoUnitario = precoUnitario;}
}
