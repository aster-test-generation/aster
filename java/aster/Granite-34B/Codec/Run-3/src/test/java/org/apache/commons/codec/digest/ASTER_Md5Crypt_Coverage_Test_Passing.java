/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Md5Crypt_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithSaltThatNotStartWithPrefix_Gikf1() {
        byte[] keyBytes = new byte[1];
        String salt = "salt";
        String result = Md5Crypt.apr1Crypt(keyBytes, salt);
    }
}