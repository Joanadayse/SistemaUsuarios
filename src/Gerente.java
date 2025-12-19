public class Gerente  extends Usuario {
    public Gerente(String name , String email, String password) {
        super(name,email,password, true);

    }

    public void gerarRelatorioFinanceiro(){
        System.out.println("Relatorio financeiro gerado pelo gerente!");
    }

    public void consultarVendas(){
        System.out.println("Consultando Vendas...!");
    }
}
