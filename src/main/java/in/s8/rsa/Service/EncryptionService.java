package in.s8.rsa.Service;

import java.security.interfaces.RSAPublicKey;

/**
 * Created by Sourabh_Sethi on 4/26/2016.
 */
public interface EncryptionService {

    public abstract byte[] encryptionByteStream(String plainText, RSAPublicKey rsaPK);

    public abstract String encryptionString(String plainText, RSAPublicKey rsaPK);
}
