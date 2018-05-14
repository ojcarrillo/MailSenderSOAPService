package co.com.javeriana.soap.integracion.MailSenderSOAPService;

import org.apache.camel.Exchange;
import org.example.demo.MailsenderResponse;
import org.springframework.stereotype.Component;

import co.com.javeriana.soap.integracion.util.Utils;

@Component
public class SoapService {

	public void enqueueLogMessage(final Exchange exchange) throws InterruptedException {
		// mail datos = exchange.getIn().getBody(Enqueuelog.class);
		// StringBuilder datosLog = new StringBuilder();
		// datosLog.append(datos.getFechaEvento() + "-->").append(datos.getClase() +
		// "-->")
		// .append(datos.getNivel() + "-->").append(datos.getObservacion() + "<--")
		// .append(System.getProperty("line.separator"));
		// exchange.getOut().setBody(datosLog.toString());
	}

	public void mailsenderMessageResponse(final Exchange exchange) throws InterruptedException {
		 MailsenderResponse response = new MailsenderResponse();
		 response.setCodigoEstado("1");
		 response.setEstado("OK");
		 response.setFechaRespuesta(Utils.getFechaEvento());
		 response.setMotivoEstado("CORREO ENVIADO");
		 exchange.getOut().setBody(response);
	}
}
