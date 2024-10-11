/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DigestUtils_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testShaHex_Roxp0_lfSN1_fid2() throws IOException {
    String expected = "a5bc9f6e4c9f6e4c9f6e";
    byte[] data = "Hello, World!".getBytes();
    String result = DigestUtils.shaHex(data);
    assertEquals(expected, result);
}
}