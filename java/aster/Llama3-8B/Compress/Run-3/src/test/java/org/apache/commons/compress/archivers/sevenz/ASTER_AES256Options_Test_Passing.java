/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import javax.crypto.spec.SecretKeySpec;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AES256Options_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewSecretKeySpec_nArM0_1() {
        byte[] bytes = new byte[16];
        SecretKeySpec secretKeySpec = AES256Options.newSecretKeySpec(bytes);
        assertNotNull(secretKeySpec);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewSecretKeySpec_nArM0_2() {
        byte[] bytes = new byte[16];
        SecretKeySpec secretKeySpec = AES256Options.newSecretKeySpec(bytes);
        assertEquals("AES", secretKeySpec.getAlgorithm());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSalt_yFlq0_njMc0() {
    SecretKeySpec expected = null;
    SecretKeySpec actual = AES256Options.newSecretKeySpec(new byte[0]);
    assertSame(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewSecretKeySpec_nArM0() {
        byte[] bytes = new byte[16];
        SecretKeySpec secretKeySpec = AES256Options.newSecretKeySpec(bytes);
        assertNotNull(secretKeySpec);
        assertEquals("AES", secretKeySpec.getAlgorithm());
    }
}