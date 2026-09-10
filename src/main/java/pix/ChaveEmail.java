package pix;

/**
 *
 * @author dudam
 */
public class ChaveEmail implements IMetodoPagamentoPix {
    private String email;
    
    public ChaveEmail(String email){
        if(email == null || email.isBlank()){
            throw new IllegalArgumentException("A chave email nao deve ser nulo");
        }
        this.email = email;
    }
    
    @Override
    public void processar(double valor){
         if(valor <= 0){
            throw new IllegalArgumentException("O valor nao deve ser negativo ou nulo");
        }
        
        System.out.println("Processando pagamento via pix por chave email no valor de R$"+valor);
    }
}
