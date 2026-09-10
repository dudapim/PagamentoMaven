package com.mycompany.pagamentomaven;

import pagamento.Boleto;
import pagamento.CartaoCredito;
import pagamento.CartaoDebito;
import pagamento.PagamentoPix;
import pix.ChaveCPF;
import pix.ChaveEmail;
import pix.QrCode;
import service.SistemaPagamentoService;
/**
 *
 * @author dudam
 */
public class PagamentoMaven {

    public static void main(String[] args) {
        
        SistemaPagamentoService service = new SistemaPagamentoService();
        service.processar(new Boleto(), 20.00);
        
        service.processar(new CartaoCredito(), 40.00);
        
        service.processar(new CartaoDebito(), 60.00);
        
        service.processar(new PagamentoPix(new ChaveCPF("16372125773")), 80.00);
        
        service.processar(new PagamentoPix(new ChaveEmail("dudamepimenta@gmail.com")), 100.00);

    }
}
