public class Usuarios {
    private int idUsuario;
    public String nome;
    protected String CPF;
    public String email;
    private String senha;
    public String telefone;
    public String tipoUsuario;

    public Usuarios(int idUsuario, String nome, String CPF, String email, String senha, String telefone,String tipoUsuario){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString(){
        return "Id: " + idUsuario +
                ", Nome:" + nome +
                ", CPF:" + CPF +
                ",email:" + email +
                ",Telefone:" + telefone +
                ",Tipo Usuario:" + tipoUsuario ;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF(){
        return CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(){
        this.telefone = telefone;
    }
}

