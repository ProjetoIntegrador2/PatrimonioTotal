package Model.BO;

/*
*
* @Versão 0.0.1 teste paulo 00:03
*
*/

public class Regras {
    
    public boolean validaCPF(String CPF){
        
        //implementar função para validar o CPF
        return true;
    }
    
    public int verificaLogin(String login, String senha){
        String paulo;
        if(login.equalsIgnoreCase("a")){
            if (senha.equals("a")){
                return 0;
            }else
            return 1;
        }else{
                return 2;
        }
    }
}
