package Model.BO;

/*
*
* @Versão 0.0.1 teste paulo
*
*/

public class Regras {
    
    public boolean validaCPF(String CPF){
        private String paulo;
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
