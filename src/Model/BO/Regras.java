package Model.BO;

/*
*
<<<<<<< HEAD
* @Versão 0.0.1 teste deu certoo kk
=======
* @Versão 0.0.1 teste paulo
>>>>>>> origin/master
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
