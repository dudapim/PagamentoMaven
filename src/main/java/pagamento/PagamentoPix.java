package pagamento;
import pix.IMetodoPagamentoPix;
/**
 *
 * @author dudam
 */
public class PagamentoPix implements IMetodoPagamento{
    private IMetodoPagamentoPix metodoPagamentoPix;
    
    public PagamentoPix(IMetodoPagamentoPix metodoPagamentoPix){
        if(metodoPagamentoPix == null){
            throw new IllegalArgumentException("Deve-se ser fornecido um metodo de pagamento por pix valido");
        }
        this.metodoPagamentoPix = metodoPagamentoPix;
    }
    
    public void processar(double valor){
        metodoPagamentoPix.processar(valor);
    }
}
