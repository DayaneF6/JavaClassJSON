
package webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;



/**
 *
 * @author aluno
 */


public class login {
    @POST 
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/login")
    public String login(String dados){
        JSONObject obj = new JSONObject(dados);
        
        String email = obj.getString("email");
        String senha = obj.getString("senha");
        
        System.out.println("Email: " + email + "Senha: " + senha);
        
        return null;
    }
}
