/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

public class Aster_Sha2Crypt_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithValidSalt_rOvV4_DeID0() {
        byte[] keyBytes = "password".getBytes();
        String salt = "$5$rounds=535000$16bytesalt";
        String expected = "$5$rounds=535000$16bytesalt$.Qo6XGX2tEgIhg0yowBA5h6fkXEIaB3jPIqDeCmz/.B";
        String actual = Sha2Crypt.sha256Crypt(keyBytes, salt);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void tearDown_dxYQ1_OyJF0() {
        Sha2Crypt sha2Crypt = new Sha2Crypt();
        sha2Crypt.sha512Crypt(new byte[0], null);
        sha2Crypt = null;
    }
}