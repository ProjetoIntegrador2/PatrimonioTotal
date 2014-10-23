package Model.BO;

/*
*
* @Versão 0.0.1 teste
*
*/

public class Regras {
    
    public boolean validaCPF(String CPF){
        //implementar função para validar o CPF
        return true;
    }
    
    public int verificaLogin(String login, String senha){
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
