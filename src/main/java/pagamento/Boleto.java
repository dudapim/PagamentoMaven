package pagamento;

/**
 *
 * @author dudam
 */
public class Boleto implements IMetodoPagamento {
    @Override 
    public void processar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor nao pode ser nulo");
        }
        System.out.println("Processando pagamento via boleto no valor de R$"+valor);
    }
}
