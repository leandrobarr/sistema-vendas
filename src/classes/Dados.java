
package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Dados {
    private int maxUsu = 50;
    private int maxPro = 100;
    private int maxCli = 100;
    private Usuario msUsuarios[] = new Usuario[maxUsu];
    private Produto msProdutos[] = new Produto[maxPro];
    private Cliente msClientes[] = new Cliente[maxCli];
    private int conUsu = 0;
    private int conPro = 0;
    private int conCli = 0;
    
    public Dados() {
        Usuario msUsuario;
        msUsuario = new Usuario("san1", "san1", "san2", "123", 1);
        msUsuarios[conUsu] = msUsuario;
        conUsu ++;
        
        msUsuario = new Usuario("san2", "san1", "san2", "123", 2);
        msUsuarios[conUsu] = msUsuario;
        conUsu ++;
        
        msUsuario = new Usuario("san3", "san1", "san2", "123", 1);
        msUsuarios[conUsu] = msUsuario;
        conUsu ++;
        
        Produto msProduto;
        msProduto = new Produto ("1", "Arroz", 23, 0, "Arroz branco tipo 1");
        msProdutos[conPro]= msProduto;
        conPro++;
        
        msProduto = new Produto ("2", "Feijao", 9, 0, "Feijao manteiga");
        msProdutos[conPro]= msProduto;
        conPro++;
        
        msProduto = new Produto ("3", "oleo", 11, 0, "oleo refinado de soja");
        msProdutos[conPro]= msProduto;
        conPro++;
        
        Cliente msCliente;
        msCliente = new Cliente ("1", "Leandro", "Barros", "opala990@gmail.com",
                "Estrada do Engenho Novo, 31 casa 2 Realengo", 
                "(21)98870-9057", 1, "Rio de Janeiro", 
                Utilidades.StringtoDate("1978/05/13"), 
                Utilidades.StringtoDate("2022/06/24"));
        msClientes[conCli]= msCliente;
        conCli++;
        
        msCliente = new Cliente ("2", "Monique Cristina", "Nunes dos Santos", "moniquecnsantos@hotmail.com",
                "Estrada do Engenho Novo, 31 casa 2 Realengo", 
                "(21)98892-6469", 3, "Nilópolis", 
                Utilidades.StringtoDate("1973/08/27"), 
                Utilidades.StringtoDate("2022/06/20"));
        msClientes[conCli]= msCliente;
        conCli++;
        
        msCliente = new Cliente ("3", "Gabriel", "Nunes de Barros", "gabrielbarros.judo@gmail.com",
                "Rua Elza Gomes, 44", 
                "(21)98870-9057", 2, "Rio de Janeiro", 
                Utilidades.StringtoDate("2010/07/05"), 
                Utilidades.StringtoDate("2022/06/02"));
        msClientes[conCli]= msCliente;
        conCli++;
    }
    
    public int numeroUsuarios() {
        return conUsu;
    }
    
     public int numeroProdutos() {
        return conPro;
    }
     
      public int numeroClientes() {
        return conCli;
    }
    
    public Usuario[]getUsuarios(){
        return msUsuarios;
    }
    
    public Produto[]getProdutos(){
        return msProdutos;
    }
    
     public Cliente[]getClientes(){
        return msClientes;
    }
    
    public boolean validarUsuario(String usuario,String senha) {
        boolean aux = false;
        for(int i = 0; i < conUsu; i ++) {
            if(msUsuarios[i].getIdUsuario().equals(usuario) && 
                    msUsuarios[i].getSenha().equals(senha)) {
            return true;
        }
            
        }
        return false;
    }
    
    public int posicaoUsuario(String usuario) {
        
        for(int i = 0; i < conUsu; i ++) {
            if(msUsuarios[i].getIdUsuario().equals(usuario)) {
            return i;
        }
        }
        return -1;
    }
    
     public int posicaoProduto(String produto) {
        
        for(int i = 0; i < conPro; i ++) {
            if(msProdutos[i].getIdProduto().equals(produto)) {
            return i;
        }
        }
        return -1;
    }
     
      public int posicaoCliente(String cliente) {
        
        for(int i = 0; i < conCli; i ++) {
            if(msClientes[i].getIdCliente().equals(cliente)) {
            return i;
        }
        }
        return -1;
    }
     
   public String adicionarUsuario(Usuario msUsuario) {
       if(conUsu == maxUsu) {
           return "NÃO É POSSÍVEL CADASTRAR MAIS USUÁRIOS! (MÁXIMO ATINGIDO)";
       }
       msUsuarios[conUsu]= msUsuario;
       conUsu ++;
       return "USUÁRIO CADASTRADO COM SUCESSO!";
   }
   
   public String adicionarProduto(Produto msProduto) {
       if(conPro == maxPro) {
           return "NÃO É POSSÍVEL CADASTRAR MAIS PRODUTOS! (MÁXIMO ATINGIDO)";
       }
       msProdutos[conPro]= msProduto;
       conPro ++;
       return "PRODUTO CADASTRADO COM SUCESSO!";
   }
   
   public String adicionarCliente(Cliente msCliente) {
       if(conCli == maxCli) {
           return "NÃO É POSSÍVEL CADASTRAR MAIS CLIENTES! (MÁXIMO ATINGIDO)";
       }
       msClientes[conCli]= msCliente;
       conCli ++;
       return "CLIENTE CADASTRADO COM SUCESSO!";
   }
   
   public String editarUsuario(Usuario msUsuario, int pos) {
       msUsuarios[pos].setNome(msUsuario.getNome());
       msUsuarios[pos].setSobrenome(msUsuario.getSobrenome());
       msUsuarios[pos].setSenha(msUsuario.getSenha());
       msUsuarios[pos].setPerfil(msUsuario.getPerfil());
       
       return "USUÁRIO EDITADO COM SUCESSO!";
   }
   
    public String editarProduto(Produto msProduto, int pos) {
       msProdutos[pos].setDescricao(msProduto.getDescricao());
       msProdutos[pos].setPreco(msProduto.getPreco());
       msProdutos[pos].setImposto(msProduto.getImposto());
       msProdutos[pos].setAnotacao(msProduto.getAnotacao());
       
       return "PRODUTO EDITADO COM SUCESSO!";
   }
    
    public String editarCliente(Cliente msCliente, int pos) {
       msClientes[pos].setIdCliente(msCliente.getIdCliente());
       msClientes[pos].setNome(msCliente.getNome());
       msClientes[pos].setSobrenome(msCliente.getSobrenome());
       msClientes[pos].setEmail(msCliente.getEmail());
       msClientes[pos].setEndereco(msCliente.getEndereco());
       msClientes[pos].setTelefone(msCliente.getTelefone());
       msClientes[pos].setIdIdentificacao(msCliente.getIdIdentificacao());
       msClientes[pos].setCidade(msCliente.getCidade());
       msClientes[pos].setNascimento(msCliente.getNascimento());
       msClientes[pos].setData(msCliente.getData());
       
       
       return "CLIENTE EDITADO COM SUCESSO!";
   }
   
   public String deletarUsuario(int pos) {
       for(int i = pos; i < conUsu -1; i++) {
           msUsuarios[i] = msUsuarios[i + 1];
       }
       conUsu--;
       return "USUÁRIO DELETADO COM SUCESSO!";
   }
   
   public String deletarProduto(int pos) {
       for(int i = pos; i < conPro -1; i++) {
           msProdutos[i] = msProdutos[i + 1];
       }
       conPro--;
       return "PRODUTO DELETADO COM SUCESSO!";
   }
   
    public String deletarCliente(int pos) {
       for(int i = pos; i < conCli -1; i++) {
           msClientes[i] = msClientes[i + 1];
       }
       conCli--;
       return "CLIENTE DELETADO COM SUCESSO!";
   }
    
    public void salvarTudo() {
        salvarUsuarios();
        salvarClientes();
        salvarProdutos();
    }   

    public void salvarUsuarios() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/usuarios.txt");
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < conUsu; i++) {
                pw.println(msUsuarios[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void salvarClientes() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/clientes.txt");
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < conCli; i++) {
                pw.println(msClientes[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void salvarProdutos() {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data/produtos.txt");
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < conPro; i++) {
                pw.println(msProdutos[i].toString());
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }finally{
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void preencherUsuarios() {
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
    }
}
