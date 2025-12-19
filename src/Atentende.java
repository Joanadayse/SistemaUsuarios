public class Atentende extends Usuario{
    public double valorCaixa;

    public Atentende(String name, String email, String password) {
        super(name, email, password , false);
        this.valorCaixa = 0;
    }

    public void receberPagamento(double valor){
        this.valorCaixa += valor;
        System.out.println("Pagamento recebido: R$" + valor + ". Total em caixa: R$" + this.valorCaixa);
    }

    public void fecharCaixa(){
        System.out.println("Fechando caixa. Total em caixa: R$" + this.valorCaixa);
    }

    public double getValorCaixa(){
        return valorCaixa;
    }

}
