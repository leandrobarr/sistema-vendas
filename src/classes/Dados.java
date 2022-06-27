
package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

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
        preencherUsuarios();
        
        preencherProdutos();
        
        preencherClientes();
        
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
    
     public int getPerfil(String usuario) {
       for(int i = 0; i < conUsu; i ++) {
            if(msUsuarios[i].getIdUsuario().equals(usuario)) {
                return msUsuarios[i].getPerfil();
            }
        }
        return -1;
    }
     
     public void trocarSenha(String usuario, String senha) {
       for(int i = 0; i < conUsu; i ++) {
            if(msUsuarios[i].getIdUsuario().equals(usuario)) {
                msUsuarios[i].setSenha(senha);
                return;
            }
        }
        
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
        
        try {
            arquivo = new File("Data/usuarios.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String idUsuario;
            String nome;
            String sobrenome;
            String senha;
            int perfil;
            
            while((linha = br.readLine())!= null) {
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idUsuario = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                nome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                sobrenome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                senha = aux;
                linha = linha.substring(pos + 1);
                perfil = new Integer(linha);
                
                Usuario msUsuario = new Usuario(
                        idUsuario, 
                        nome, 
                        sobrenome, 
                        senha, 
                        perfil);
                msUsuarios[conUsu]= msUsuario;
                conUsu++;
            }            

        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void preencherProdutos() {
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            arquivo = new File("Data/produtos.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String idProduto;
            String descricao;
            int preco;
            int imposto;
            String anotacao;
            
            while((linha = br.readLine())!= null) {
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idProduto = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                descricao = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                preco = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                imposto = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                anotacao = linha;
                
                Produto msProduto = new Produto(
                        idProduto, 
                        descricao, 
                        preco, 
                        imposto, 
                        anotacao);
                msProdutos[conPro]= msProduto;
                conPro++;
            }            

        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public void preencherClientes() {
        File arquivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            arquivo = new File("Data/clientes.txt");
            fr = new FileReader(arquivo);
            br = new BufferedReader(fr);
            
            int pos;
            String aux;
            String linha;
            String idCliente;
            String Nome;
            String Sobrenome;
            String Email;
            String Endereco;
            String Telefone;
            int idIdentificacao;
            String Cidade;
            Date Nascimento;
            Date Data;
            
            
            while((linha = br.readLine())!= null) {
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idCliente = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Nome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Sobrenome = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Email = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Endereco = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Telefone = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                idIdentificacao = new Integer(aux);
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Cidade = aux;
                linha = linha.substring(pos + 1);
                
                pos = linha.indexOf('|');
                aux = linha.substring(0, pos);
                Nascimento = Utilidades.StringtoDate(aux);
                linha = linha.substring(pos + 1);
                
                Data = Utilidades.StringtoDate(linha);
                
                Cliente msCliente = new Cliente(
                        idCliente, 
                        Nome, 
                        Sobrenome, 
                        Email,
                        Endereco,
                        Telefone,
                        idIdentificacao,
                        Cidade,
                        Nascimento,
                        Data);
                        
                msClientes[conCli]= msCliente;
                conCli++;
            }            

        } catch (Exception e1) {
            e1.printStackTrace();
        }finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    
}
