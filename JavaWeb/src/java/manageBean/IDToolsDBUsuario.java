package manageBean;

import java.util.HashMap;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
@Named(value = "iDToolsDBUsuario")
@Dependent
public class IDToolsDBUsuario {

    public static Map<String, Integer>pessoasCadastradas =  new HashMap<String, Integer>();
    
    public String SUCESSO_LOGIN = "sucess";
    public String FALHA_LOGIN = "failure";
    
    
    public IDToolsDBUsuario() {
        pessoasCadastradas.put("Patrick", new Integer(123));
        pessoasCadastradas.put("João", new Integer(456));
        pessoasCadastradas.put("Manuel", new Integer(789));
    }
    
    public PessoaInterna verificar(String nome, Integer senha) {
        System.out.println("Login: " + nome);
        
        if(senha.equals(pessoasCadastradas.get(nome))) {
            PessoaInterna p = new PessoaInterna();
            p.setNome(nome);
            p.setSenha(pessoasCadastradas.get(nome));
            return p;
        }
        return null;
    }
    
}
