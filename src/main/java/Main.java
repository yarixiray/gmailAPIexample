import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import service.GmailCredentials;
import service.GmailService;
import service.GmailServiceImpl;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {
    public static void main(String[] args) {
        try {
            GmailService gmailService = new GmailServiceImpl(GoogleNetHttpTransport.newTrustedTransport());
            gmailService.setGmailCredentials(GmailCredentials.builder()
                    .userEmail("GlobalLogicAutomation@gmail.com")
                    .clientId("400696791539-7egi65n73g85a2uisc42q62rn2mmppln.apps.googleusercontent.com")
                    .clientSecret("c7__VD379QLuN5uzevPIuF6f")
                    .accessToken("ya29.GlsCB-qdiB93uHsHjHNgS3WWatvp1DhjTCqYZtzbzPvYoRXAxDgnZCR7WUZABnlgwa9iec1SSMUx2dPmlss1X8z2cyguGwTEfqUxHCSai1WjcSEG3TxDdwkXV2o_")
                    .refreshToken("1/4IDnVv0F5d96eeNeHgxkhkG-qQ98yj103o_buGMko7tXzDA4y_O568UT_4_X4IpF")
                    .build());

            gmailService.sendMessage("iaroslav.liabogov@globallogic.com", "TEST AUTOMATION", "body text test test");
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }
    }
}
