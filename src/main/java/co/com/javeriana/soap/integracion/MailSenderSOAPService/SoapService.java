package co.com.javeriana.soap.integracion.MailSenderSOAPService;

import org.apache.camel.Exchange;
import org.mailsender.demo.MailsenderResponse;
import org.springframework.stereotype.Component;

import co.com.javeriana.soap.integracion.util.Utils;

@Component
public class SoapService {

	public void mailsenderMessageResponse(final Exchange exchange) throws InterruptedException {
		 MailsenderResponse response = new MailsenderResponse();
		 response.setCodigoEstado("1");
		 response.setEstado("OK");
		 response.setFechaRespuesta(Utils.getFechaEvento());
		 response.setMotivoEstado("CORREO ENVIADO");
		 exchange.getOut().setBody(response);
	}
}
