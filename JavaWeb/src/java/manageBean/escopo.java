package manageBean;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "sessao")
@SessionScoped
public class escopo {

    public String loginSessao;
    public Integer senhaSessao;
    public Date tempoSessao;
        
    public escopo() {
    }

    public String getLoginSessao() {
        return loginSessao;
    }

    public void setLoginSessao(String loginSessao) {
        this.loginSessao = loginSessao;
    }

    public Integer getSenhaSessao() {
        return senhaSessao;
    }

    public void setSenhaSessao(Integer senhaSessao) {
        this.senhaSessao = senhaSessao;
    }

    public Date getTempoSessao() {
        return tempoSessao;
    }

    public void setTempoSessao(Date tempoSessao) {
        this.tempoSessao = tempoSessao;
    }
    
      
    
    
}
