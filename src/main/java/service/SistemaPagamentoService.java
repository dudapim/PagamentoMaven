package service;

import pagamento.IMetodoPagamento;
/**
 *
 * @author dudam
 */
public class SistemaPagamentoService {
    public void processar(IMetodoPagamento metodo, double valor){
        metodo.processar(valor);
    }
}
