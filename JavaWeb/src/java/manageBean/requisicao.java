package manageBean;

import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "requisicao")
@RequestScoped
public class requisicao {
    private String login;
    private Integer senha;
    
    private IDToolsDBUsuario idToolsDBUsuario = new IDToolsDBUsuario();
    
    @ManagedProperty(value="#{sessao}")
    private escopo sessaoLoginUsuario;
    
    public requisicao() {
    }

    public String logar(){
        String navegacao = "";
        PessoaInterna p = idToolsDBUsuario.verificar(login, senha);
        
        if(p != null) {
            sessaoLoginUsuario.setLoginSessao(p.getNome());
            sessaoLoginUsuario.setSenhaSessao(p.getSenha());
            sessaoLoginUsuario.setTempoSessao(new GregorianCalendar().getTime());
            navegacao = idToolsDBUsuario.SUCESSO_LOGIN;
        } else {
            navegacao = idToolsDBUsuario.FALHA_LOGIN;
            
            FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Falha no login... ",
                    "Usuário não cadastrado... "));
        }
        return navegacao;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getSenha() {
        return senha;
    }
   

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
    
    public escopo getSessaoLoginUsuario() {
        return sessaoLoginUsuario;
    }

    public void setSessaoLoginUsuario(escopo sessaoLoginUsuario) {
        this.sessaoLoginUsuario = sessaoLoginUsuario;
    }
    
}
