/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Crypt_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidInputs_HRrp0_1() {
        String key = "testKey";
        String salt = "testSalt";
        String result = Crypt.crypt(key, salt);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidInputs_HRrp0_2() {
        String key = "testKey";
        String salt = "testSalt";
        String result = Crypt.crypt(key, salt);
        assertNotEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCryptWithValidInputs_HRrp0() {
        String key = "testKey";
        String salt = "testSalt";
        String result = Crypt.crypt(key, salt);
        assertNotNull(result);
        assertNotEquals("", result);
    }
}