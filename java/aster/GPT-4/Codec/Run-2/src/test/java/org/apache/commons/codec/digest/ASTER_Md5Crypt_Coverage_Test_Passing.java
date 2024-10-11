/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Md5Crypt_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testApr1CryptWithSaltNotStartingWithApr1Prefix_IYcW0() {
        final String APR1_PREFIX = "$apr1$";
        String salt = "someSalt";
        byte[] keyBytes = "password".getBytes();
        String result = Md5Crypt.apr1Crypt(keyBytes, salt);
    }
}