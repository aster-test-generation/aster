/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import java.math.BigInteger;
import org.apache.commons.codec.CodecPolicy;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Base64_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void isInAlphabet_octet_0_and_octet_less_than_0_and_octet_more_than_decodeTable_length_JPeV0() {
	Base64 base64 = new Base64(0, new byte[0], false, CodecPolicy.STRICT);
	boolean actual_result = base64.isInAlphabet((byte) 0);
	boolean expected_result = false;
	assertEquals(expected_result, actual_result);
	actual_result = base64.isInAlphabet((byte) -1);
	expected_result = false;
	assertEquals(expected_result, actual_result);
	actual_result = base64.isInAlphabet((byte) 10);
	expected_result = false;
	assertEquals(expected_result, actual_result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBase64_001_Bxlh0() {
    Base64 base64 = new Base64(1, new byte[]{0}, true, CodecPolicy.STRICT);
    boolean actual = Base64.isBase64((byte) 2);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBase64_002_chPX1() {
    Base64 base64 = new Base64(1, new byte[]{0}, true, CodecPolicy.LENIENT);
    boolean actual = Base64.isBase64((byte) 2);
    boolean expected = false;
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBase64_001_Gkzr0() {
    byte[] arrayOctet = new byte[0];
    boolean result = Base64.isBase64(arrayOctet);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBase64_002_HqLh1() {
    byte[] arrayOctet = new byte[5];
    arrayOctet[0] = 123;
    arrayOctet[1] = 125;
    arrayOctet[2] = 56;
    arrayOctet[3] = 57;
    arrayOctet[4] = 32;
    boolean result = Base64.isBase64(arrayOctet);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsBase64_003_tqBH2() {
    byte[] arrayOctet = new byte[5];
    arrayOctet[0] = 123;
    arrayOctet[1] = 125;
    arrayOctet[2] = 56;
    arrayOctet[3] = 57;
    arrayOctet[4] = 33;
    boolean result = Base64.isBase64(arrayOctet);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes_1_oLUQ0() {
        BigInteger bigInt = new BigInteger("1234567890");
        byte[] expected = new byte[]{0, 0, 0, 12, 59};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToIntegerBytes_2_uMso1() {
        BigInteger bigInt = new BigInteger("12345678901234567890");
        byte[] expected = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 59};
        byte[] actual = Base64.toIntegerBytes(bigInt);
        assertArrayEquals(expected, actual);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisArrayByteBase64_wZWL0() {
    byte[] arrayOctet = new byte[10];
    Base64 base64 = new Base64(true);
    boolean result = Base64.isArrayByteBase64(arrayOctet);
    assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisArrayByteBase642_USEZ1() {
    byte[] arrayOctet = new byte[10];
    Base64 base64 = new Base64(true);
    boolean result = Base64.isArrayByteBase64(arrayOctet);
    assertFalse(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void isInAlphabet_octet_0_and_octet_less_than_0_and_octet_more_than_decodeTable_length_JPeV0_1() {
	Base64 base64 = new Base64(0, new byte[0], false, CodecPolicy.STRICT);
	boolean actual_result = base64.isInAlphabet((byte) 0);
	boolean expected_result = false;
	actual_result = base64.isInAlphabet((byte) -1);
	expected_result = false;
	actual_result = base64.isInAlphabet((byte) 10);
	expected_result = false;
	assertEquals(expected_result, actual_result);}
}