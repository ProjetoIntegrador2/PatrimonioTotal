package Model.BO;

/*
*
ultimo teste se deu squiser vai dar certo hehe
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
