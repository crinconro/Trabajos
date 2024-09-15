public class esPrimo{
    public boolean primo(int numero){
        boolean primo = true;
        for(int I = 2; I < numero; I++){
        if (numero % I == 0){
            primo=false;
            break;
            }
          
        }
        return primo; 
    }
}
