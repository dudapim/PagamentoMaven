package pagamento;
/**
 *
 * @author dudam
 */
public class CartaoCredito implements IMetodoPagamento{
    @Override
    public void processar(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("O valor nao pode ser nulo, burro");
        }
        System.out.println("Processando pagamento via cartao de credito no valor de R$"+ valor);
    }
        
    
}
