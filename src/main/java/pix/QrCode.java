package pix;
/**
 *
 * @author dudam
 */
public class QrCode implements IMetodoPagamentoPix {
    
    private String qrCode;
    
    public QrCode(String qrCode){
        if(qrCode == null || qrCode.isBlank()){
            throw new IllegalArgumentException("A chave qrCode nao deve ser nulo");
        }
        this.qrCode = qrCode;
    }
    @Override 
    public void processar(double valor){
         if(valor <= 0){
            throw new IllegalArgumentException("O valor nao deve ser negativo ou nulo");
        }
        
        System.out.println("Processando pagamento via pix por chave qrCode no valor de R$"+valor);
    }
}
