import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private int idRestaurante;
    public String nomeRestaurante;
    protected String enderecoRestaurante;

    private List<Produtos> cardapio = new ArrayList<>();

    public Restaurante(String nomeRestaurante, String enderecoRestaurante) {
        this.idRestaurante = idRestaurante;
        this.nomeRestaurante = nomeRestaurante;
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public void adicionarProduto (Produtos produtos){
        cardapio.add(produtos);
    }
//Criado um mod de dados (<lista>) do tipo produto
    public List<Produtos> getCardapio(){
        return cardapio;
    }
    public void listarCardapio(){
        //metodo Empty verifica SE array estiver vazio
        if(cardapio.isEmpty()){
            System.out.println("O cardápio está vazio!");
        }else{//Se cadápio não estiver vazio                                            toUpperCase deixa em maiúsculo
            System.out.println("\n********** CARDÁPIO DO RESTAURANTE"
            + nomeRestaurante.toUpperCase() + "**********");
            //toUpperCase deixa em maiúsculo
            //de 0 até o ultimo item do cardápio (tamanho) consulte todos os itens
            for(int i = 0;  i < cardapio.size(); i++){
                Produtos produtos = cardapio.get(i);
                System.out.println((i + 1) + " - " + produtos);
            }
        }
    }
}
