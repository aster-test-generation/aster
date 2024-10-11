/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HmacAlgorithms_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_HrYy0_blYD0() {
    HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_MD5;
    String result = hmacAlgorithms.toString();
    assert result.equals("HMAC_MD5");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName1_CzCZ1_vNbb0() {
    HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_1;
    String result = hmacAlgorithms.toString();
    assert result.equals("HMAC_SHA_1");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName4_qsAm4_nShr0() {
    HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_384;
    String result = hmacAlgorithms.toString();
    assert result.equals("HMAC_SHA_384");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName3_LOZx3_dMIn0() {
    HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_256;
    String result = hmacAlgorithms.toString();
    assert result.equals("HMAC_SHA_256");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString2_IRKl2_HOSR0() {
    HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_224;
    String result = hmacAlgorithms.toString();
    assert result.equals("HMAC_SHA_224".toUpperCase());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToString5_eZiR5_SyGV0() {
    HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_512;
    String result = hmacAlgorithms.toString();
    assert result.equals("HMAC_SHA_512");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName2_Msra2_sUtK0_fid2() {
    HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_224;
    String result = hmacAlgorithms.toString();
    assert result.equals("HMAC_SHA_224");
}
}