/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_AES256SHA256Decoder_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSha256Password_jTGg0() throws Exception {
        final char[] password = "password".toCharArray();
        final int numCyclesPower = 10;
        final byte[] salt = new byte[]{0x01, 0x02, 0x03};
        byte[] expected = new byte[]{0x0a, 0x0b, 0x0c}; // Replace with actual expected value
        byte[] actual = AES256SHA256Decoder.sha256Password(password, numCyclesPower, salt);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUtf16DecodeWithNullInput_UcMq0() throws Exception {
        byte[] result = AES256SHA256Decoder.utf16Decode(null);
        assertNull(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUtf16DecodeWithEmptyInput_UUkA1_1() throws Exception {
        char[] input = new char[0];
        byte[] result = AES256SHA256Decoder.utf16Decode(input);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUtf16DecodeWithEmptyInput_UUkA1_2() throws Exception {
        char[] input = new char[0];
        byte[] result = AES256SHA256Decoder.utf16Decode(input);
        assertEquals(0, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUtf16DecodeWithNonEmptyInput_dQrZ2_1() throws Exception {
        char[] input = "Hello, World!".toCharArray();
        byte[] result = AES256SHA256Decoder.utf16Decode(input);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUtf16DecodeWithNonEmptyInput_dQrZ2_2() throws Exception {
        char[] input = "Hello, World!".toCharArray();
        byte[] result = AES256SHA256Decoder.utf16Decode(input);
        assertNotEquals(0, result.length);}
}