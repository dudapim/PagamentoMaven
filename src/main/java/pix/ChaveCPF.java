package pix;
/**
 *
 * @author dudam
 */
public class ChaveCPF implements IMetodoPagamentoPix {
    private String cpf;
    
    public ChaveCPF(String cpf){
        if(cpf == null || cpf.isBlank()){
            throw new IllegalArgumentException("A chave cpf nao deve ser nulo");
        }
        this.cpf = cpf;
    }
    
    @Override
    public void processar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor nao deve ser negativo ou nulo");
        }
        
        System.out.println("Processando pagamento via pix por chave cpf no valor de R$"+valor);
    }
}
