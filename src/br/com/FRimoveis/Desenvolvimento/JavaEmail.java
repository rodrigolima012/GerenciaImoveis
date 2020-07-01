/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.Desenvolvimento;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author rodrigolima
 */
public class JavaEmail {

    private String textoemail;
    private String identificar;
    private String emailPessoa;
    private String destinatario;
    private String nomePessoa;
    private String anexarArquivo;
    private final String assinaturasemAnexo = "FR Gerenciador de Imoveis\nObrigado pela Contato!";

    public boolean enviarEmail() {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("frimoveisroo@gmail.com", "fr123123");
            }
        });

        session.setDebug(true);

        try {
            if (anexarArquivo == null) {
                Message message = new MimeMessage(session);
                
                message.setFrom(new InternetAddress("frimoveisroo@gmail.com"));

                Address[] toUser = InternetAddress.parse("rodrigo_limafernandes@hotmail.com");
                message.setRecipients(Message.RecipientType.TO, toUser);

                message.setSubject(identificar + " - Email: " + emailPessoa);
                message.setText("De: " + nomePessoa + "\n" + textoemail+"\n"+"\n"+assinaturasemAnexo);

                Transport.send(message);

            } else {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("rodrigofernandes012@gmail.com"));
                Address[] toUser = InternetAddress.parse(destinatario);
                message.setRecipients(Message.RecipientType.TO, toUser);
                message.setSubject(identificar);//Assunto

                MimeBodyPart mbp2 = new MimeBodyPart();
                FileDataSource fds = new FileDataSource(anexarArquivo);
                mbp2.setDataHandler(new DataHandler(fds));
                mbp2.setFileName(fds.getName());

                Multipart mp = new MimeMultipart();
                mp.addBodyPart(mbp2);

                message.setContent(mp);
                Transport.send(message);
            }

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public String getIdentificar() {
        return identificar;
    }

    public void setIdentificar(String identificar) {
        this.identificar = identificar;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAnexarArquivo() {
        return anexarArquivo;
    }

    public void setAnexarArquivo(String anexarArquivo) {
        this.anexarArquivo = anexarArquivo;
    }

    public String getTextoemail() {
        return textoemail;
    }

    public void setTextoemail(String textoemail) {
        this.textoemail = textoemail;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
}
