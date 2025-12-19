public class Usuario {
    private String name;
    private String email;
    private String password;
    private Boolean admin;
    private boolean logado;

    public Usuario(String name, String email, String password, Boolean admin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.admin = admin;
        this.logado = false;
    }

    public void realizarLogin(String emailDigitado , String senhaDigitado){
        if (this.email.equals(emailDigitado) && this.password.equals(senhaDigitado)){
            this.logado = true;
            System.out.println("Logado com sucesso");
        }else{
            System.out.println("Erro ao logar");
        }

    }

    public void realizarLogoff(){
        if (this.logado){
            this.logado = false;
            System.out.println("Usuario deslogado!");
        }else{
            System.out.println("Usuaário já esta deslogado!");
        }
    }

    public void alterarSenha(String senhaAntiga, String senhaNova){
       if (this.password.equals(senhaAntiga)){
           this.password = senhaNova;
           System.out.println("Senha alterada com sucesso!");
       }else {
           System.out.println("Erro ao alterar senha!");
       }
    }

    public void alterarDados(String nomeNovo, String novoEmail){
        this.name = nomeNovo;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso!");

    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }



}
