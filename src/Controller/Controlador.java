package Controller;

/**
 *
 * @author Paulo
 */
public class Controlador {
    
    public int verificarLogin(String usuario, String Senha){
        if(usuario.equalsIgnoreCase("a")){
            if (Senha.equals("a")){
                return 0;
            }else
            return 1;
        }else{
                return 2;
        }
        
    }
    
}
