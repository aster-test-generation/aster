/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HmacAlgorithms_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName2_Msra2_sUtK0() {
    HmacAlgorithms hmacAlgorithms = HmacAlgorithms.HMAC_SHA_224;
    String result = hmacAlgorithms.toString();
}
}