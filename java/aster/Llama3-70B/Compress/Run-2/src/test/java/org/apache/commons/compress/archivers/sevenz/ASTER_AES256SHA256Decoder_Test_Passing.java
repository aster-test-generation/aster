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
public void testSha256Password_KzDi0() throws Exception {
    AES256SHA256Decoder decoder = new AES256SHA256Decoder();
    byte[] password = "password".getBytes();
    int numCyclesPower = 2;
    byte[] salt = "salt".getBytes();
    byte[] result = decoder.sha256Password(password, numCyclesPower, salt);
    assertArrayEquals(new byte[32], result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSha256PasswordNullPassword_aaCM1() throws Exception {
    AES256SHA256Decoder decoder = new AES256SHA256Decoder();
    byte[] password = null;
    int numCyclesPower = 2;
    byte[] salt = "salt".getBytes();
    try {
        decoder.sha256Password(password, numCyclesPower, salt);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSha256PasswordNullSalt_tEsd2() throws Exception {
    AES256SHA256Decoder decoder = new AES256SHA256Decoder();
    byte[] password = "password".getBytes();
    int numCyclesPower = 2;
    byte[] salt = null;
    try {
        decoder.sha256Password(password, numCyclesPower, salt);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSha256PasswordNegativeNumCyclesPower_nwGV3() throws Exception {
    AES256SHA256Decoder decoder = new AES256SHA256Decoder();
    byte[] password = "password".getBytes();
    int numCyclesPower = -1;
    byte[] salt = "salt".getBytes();
    try {
        decoder.sha256Password(password, numCyclesPower, salt);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSha256Password_UaFh0() throws Exception {
    AES256SHA256Decoder decoder = new AES256SHA256Decoder();
    char[] password = "password".toCharArray();
    int numCyclesPower = 10;
    byte[] salt = "salt".getBytes();
    byte[] result = AES256SHA256Decoder.sha256Password(password, numCyclesPower, salt);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUtf16DecodeNullInput_GygA0() throws Exception {
    char[] chars = null;
    byte[] result = AES256SHA256Decoder.utf16Decode(chars);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUtf16DecodeEmptyInput_ajUx1_1() throws Exception {
    char[] chars = new char[0];
    byte[] result = AES256SHA256Decoder.utf16Decode(chars);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUtf16DecodeEmptyInput_ajUx1_2() throws Exception {
    char[] chars = new char[0];
    byte[] result = AES256SHA256Decoder.utf16Decode(chars);
    assertEquals(0, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUtf16DecodeValidInput_RLzg2_1() throws Exception {
    char[] chars = "Hello, World!".toCharArray();
    byte[] result = AES256SHA256Decoder.utf16Decode(chars);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUtf16DecodeValidInput_RLzg2_2() throws Exception {
    char[] chars = "Hello, World!".toCharArray();
    byte[] result = AES256SHA256Decoder.utf16Decode(chars);
    assertEquals("Hello, World!".getBytes("UTF-16LE").length, result.length);}
}