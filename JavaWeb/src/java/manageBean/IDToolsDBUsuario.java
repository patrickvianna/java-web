package manageBean;

import java.util.HashMap;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
@Named(value = "iDToolsDBUsuario")
@Dependent
public class IDToolsDBUsuario {

    public static Map<String, Integer>pessoasCadastradas =  new HashMap<String, Integer>();
    
    public IDToolsDBUsuario() {
        pessoasCadastradas.put()
    }
    
}
