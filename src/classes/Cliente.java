
package classes;

import java.util.Date;


public class Cliente {
    private String idCliente;
    private String Nome;
    private String Sobrenome;
    private String Email;
    private String Endereco;
    private String Telefone;
    private int idIdentificacao;
    private String Cidade;
    private Date Nascimento;
    private Date Data;

    public Cliente(String idCliente, String Nome, String Sobrenome, String Email, String Endereco, String Telefone, int idIdentificacao, String Cidade, Date Nascimento, Date Data) {
        this.idCliente = idCliente;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.Email = Email;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.idIdentificacao = idIdentificacao;
        this.Cidade = Cidade;
        this.Nascimento = Nascimento;
        this.Data = Data;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getIdIdentificacao() {
        return idIdentificacao;
    }

    public void setIdIdentificacao(int idIdentificacao) {
        this.idIdentificacao = idIdentificacao;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
    
    @Override
    public String toString() {
       return idCliente +"|"
            + Nome +"|"
            + Sobrenome +"|"
            + Email +"|"
            + Endereco +"|"
            + Telefone +"|"
            + idIdentificacao +"|"
            + Cidade +"|"
            + Nascimento +"|"   
            + Data;
        
    }
    
}
