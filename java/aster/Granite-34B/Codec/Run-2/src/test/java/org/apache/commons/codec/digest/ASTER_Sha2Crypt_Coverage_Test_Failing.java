/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_Sha2Crypt_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithSaltNull_ziFg0_fid2() {
        String salt = null;
        String expected = "$5$rounds=5000$usesomesillystri$D4IrlXatmP7rx3P3InaxBeoomnAihCKRVQP22JZ6EY47Wc6BkroIuUUBOov1i.S5KPgErtP/EN5mcO.ChWQW21";
        String actual = Sha2Crypt.sha256Crypt("usesomesillystri".getBytes(StandardCharsets.UTF_8), salt);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256CryptWithSaltNotNull_Bqhw1_fid2() {
        String salt = "$5$rounds=5000$usesomesillystri$";
        String expected = "$5$rounds=5000$usesomesillystri$D4IrlXatmP7rx3P3InaxBeoomnAihCKRVQP22JZ6EY47Wc6BkroIuUUBOov1i.S5KPgErtP/EN5mcO.ChWQW21";
        String actual = Sha2Crypt.sha256Crypt("usesomesillystri".getBytes(StandardCharsets.UTF_8), salt);
        assertEquals(expected, actual);
    }
}