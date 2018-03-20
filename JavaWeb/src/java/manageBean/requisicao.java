package manageBean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
@ManagedBean(name = "requisicao")
@RequestScoped
public class requisicao {
    private String login;
    private String senha;
    
    private IDToolsDBUsuario idToolsDBUsuario = new IDToolsDBUsuario();
    
    @ManagedProperty(value="#{sessao}")
    private escopo sessaoLoginUsuario;
    
    public requisicao() {
    }

    public void logar(){
            
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
