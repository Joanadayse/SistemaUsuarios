public class Vendedor extends  Usuario{
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String password , int quantidadeVendas) {
        super(nome, email,password, false );
        this.quantidadeVendas = 0;
    }

    public void realizarVenda(){
        this.quantidadeVendas++;
        System.out.println("Venda realizada com sucesso!" + this.quantidadeVendas);
    }

    public void consultarVendas(){
        System.out.println("Vendas realizadas com sucesso!");
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
}
