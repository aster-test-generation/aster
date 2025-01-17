/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_MessageDigestAlgorithms_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_1() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals(13, values.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_2() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("MD2", values[0]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_3() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("MD5", values[1]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_4() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA-1", values[2]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_5() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA-224", values[3]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_6() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA-256", values[4]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_7() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA-384", values[5]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_8() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA-512", values[6]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_9() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA-512/224", values[7]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_10() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA-512/256", values[8]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_11() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA3-224", values[9]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_12() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA3-256", values[10]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_13() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA3-384", values[11]);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testValues_NCLy0_14() throws Exception {
        String[] values = MessageDigestAlgorithms.values();
        assertEquals("SHA3-512", values[12]);}
}