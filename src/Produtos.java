public class Produtos {
    private int idProduto;
    public String nomeProduto;
    public String descricao;
    protected double preco;
    private Categoria categoria;
    private int estoque;

    public Produtos(int idProduto, String nomeProduto, String descricao, double preco, Categoria categoria, int estoque){
       this.idProduto = idProduto;
       this.nomeProduto = nomeProduto;
       this.descricao = descricao;
       this.preco = preco;
       this.categoria = categoria;
       this.estoque = estoque;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNome(String nome) {
        this.nomeProduto = nomeProduto;
    }

    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }


    public void reduzirEstoque(int quantidade){
        if(quantidade <= estoque){
            estoque -= quantidade;
        }
        else{
            System.out.println("Estoque indisponível!");
        }
    }
    public void adicionarEstoque(int adicionar){
        if (adicionar > 0){
            estoque =+ adicionar;
        }
    }
}