/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.pack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CPSignature_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnderlyingStringWithNullSignature_fFoV2_FnVt0() {
    CPSignature signature = new CPSignature(null, new org.apache.commons.compress.harmony.pack200.CPUTF8(""), Arrays.asList(new CPClass(null)));
    assertEquals("", signature.getUnderlyingString());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetUnderlyingStringWithNullSignature_fFoV2_FnVt0_fid1() {
    CPSignature signature = new CPSignature(null, new org.apache.commons.compress.harmony.pack200.CPUTF8(null), Arrays.asList(new CPClass(null)));
    assertEquals(null, signature.getUnderlyingString());
}
}