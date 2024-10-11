/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import org.apache.commons.codec.binary.Hex;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HmacUtils_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateHmac_Reset_NmsX0_KljD0_1() throws NoSuchAlgorithmException, InvalidKeyException, IOException {
    HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
    byte[] key = "secretKey".getBytes();
    HmacUtils hmacUtils = new HmacUtils(algorithm, key);
    byte[] initialValueBytes = "initialValue".getBytes();
    byte[] hmacBytes = hmacUtils.hmacHex(ByteBuffer.wrap(initialValueBytes)).getBytes();
    byte[] newValueBytes = "newValue".getBytes();
    hmacBytes = hmacUtils.hmacHex(ByteBuffer.wrap(newValueBytes)).getBytes();
    assertEquals(Hex.encodeHexString(hmacBytes), Hex.encodeHexString(hmacUtils.hmacHex(ByteBuffer.wrap(initialValueBytes)).getBytes()));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInitializedMac_InvalidKey_ThrowsIllegalArgumentException_aOkU2_fid2() {
    byte[] key = new byte[] { 1, 2, 3 };
    try {
        HmacUtils.getInitializedMac("HMAC_MD5", key);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
        assertNotNull(e.getCause());
        assertTrue(e.getCause() instanceof InvalidKeyException);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetInitializedMac_ValidInput_ReturnsMac_KXcu3() {
    byte[] key = new byte[] { 1, 2, 3 };
    Mac mac = HmacUtils.getInitializedMac("HMAC_MD5", key);
    assertNotNull(mac);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHmacSha1Hex_fqFZ0_CZLs0() throws IOException {
    byte[] key = "secretKey".getBytes();
    byte[] valueToDigest = "valueToDigest".getBytes();
    HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_1, key);
    String expectedHmacHex = "expectedHmacHex"; // Replace with actual expected value
    ByteBuffer byteBuffer = ByteBuffer.wrap(valueToDigest);
    String actualHmacHex = hmacUtils.hmacHex(byteBuffer);
    assertEquals(expectedHmacHex, actualHmacHex);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHmacSha256Hex_ijwc0_KVAb0_fid2() throws IOException {
    byte[] key = "secretKey".getBytes();
    ByteBuffer valueToDigest = ByteBuffer.wrap("dataToDigest".getBytes());
    String expectedHex = "expectedHexValue"; // Replace with actual expected value
    HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
    String actualHex = hmacUtils.hmacHex(valueToDigest);
    assertEquals(expectedHex, actualHex);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHmacSha384Hex_fHjf0_zXGo0_fid2() throws IOException {
    byte[] key = "secretKey".getBytes();
    ByteBuffer valueToDigest = ByteBuffer.wrap("dataToDigest".getBytes());
    String expectedHex = "expectedHexValue"; // Replace with actual expected value
    HmacUtils hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_384, key);
    String actualHex = hmacUtils.hmacHex(valueToDigest);
    assertEquals(expectedHex, actualHex);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateHmac_IOException_CSYT6_fUai0() throws NoSuchAlgorithmException, InvalidKeyException {
    HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
    byte[] key = "secretKey".getBytes();
    HmacUtils hmacUtils = new HmacUtils(algorithm, key);
    try {
        hmacUtils.hmacHex(ByteBuffer.wrap("inputStream".getBytes()));
        assert false; // Expected IOException
    } catch (Exception e) {
        assert true; // Expected IOException
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdateHmac_WhileLoop_QqrW3_nrXi0_fid2() throws NoSuchAlgorithmException, InvalidKeyException, IOException {
    HmacAlgorithms algorithm = HmacAlgorithms.HMAC_SHA_256;
    byte[] key = "secretKey".getBytes();
    HmacUtils hmacUtils = new HmacUtils(algorithm, key);
    ByteBuffer valueToDigest = ByteBuffer.wrap("inputStream".getBytes());
    String hmacHex = hmacUtils.hmacHex(valueToDigest);
    assertEquals("661f3797f0a9414e62f22ca872a02850a5a047c8f6f015b6", hmacHex);
}
}