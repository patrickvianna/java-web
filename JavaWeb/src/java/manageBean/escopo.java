package manageBean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "sessao")
@SessionScoped
public class escopo {

    public escopo() {
    }
    
}
