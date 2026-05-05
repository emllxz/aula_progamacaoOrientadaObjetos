import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private String status;

    //AGREGAÇÃO
    private Cliente cliente;
    private Entregador entregador;
    private Restaurante restaurante;

    //ABSTRAÇÃO
    private Pagamento pagamento;
    private Entrega entrega;

    //COMPOSIÇÃO
    private List<ItensPedido> itens = new ArrayList<>();

    public Pedido(int idPedido, Cliente cliente, String status, Entregador entregador,
                  Restaurante restaurante, Pagamento pagamento, Entrega entrega) {

        this.idPedido = idPedido;
        this.cliente = cliente;
        this.status = "EM ABERTO";
        this.entregador = entregador;
        this.restaurante = restaurante;
        this.pagamento = pagamento;
        this.entrega = entrega;
    }

    public int getId() {
        return idPedido;
    }

    public String getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void adicionarItem(int idItensPedidos, Produtos produtos, int quantidade) {

        //Equals verifica se uma String daqui é igual de lá
        if (!status.equals("EM ABERTO")) {
            System.out.println("Não é possivel incluir itens em um pedido finalizado");

        } else {

            //iniciando a contagem das id ItensProdutos a partir de 1
            int idItensPedido = 1;

            if (!itens.isEmpty()) {
                idItensPedido = itens.size() + 1;

                //adiciona o produto e quantidade instanciando um obj do itensPedido
                ItensPedido item = new ItensPedido(idItensPedidos, produtos, quantidade);
                itens.add(item);

                System.out.println("Item adicionado no pedido");

            }
        }
    }

    public void removerItem(String nomeProdutos) {
        if (!status.equals("EM ABERTO")){
        System.out.println("Não é possivel retirar itens pois o pedido não esta aberto");

        }else{
            boolean removido = itens.removeIf(itensPedido ->
                itensPedido.getProdutos().getNomeProduto().equalsIgnoreCase(nomeProdutos));

            if (removido){
                System.out.println("Item" + nomeProdutos + "removido do Pedido");
            }else{
                System.out.println("Não foi encontrado no pedido o produto" + nomeProdutos);
            }
        }
    }

    public void getDefinirPagamento(Pagamento pagamento){
        this.pagamento=pagamento;
        System.out.println("Pagamento definido: " + Pagamento.getPagamento());
    }

    public void definirEntrega(Entrega entrega){
        this.entrega = entrega;
        System.out.println("Entrega definida: " + entrega.getClass().getSimpleName());
    }

    public void definirEntregador(Entregador entregador){
        this.entregador = entregador;
        System.out.println("Entregador definido" + entregador.getNome());
    }


     public double getCalcaularTotal(){
        double total = 0;
        for(ItensPedido item : itens){
            total += item.subTotal();
        }
        return total;
    }
    public void finalizarPedido(){
        double total = getCalcaularTotal();
    }
}
