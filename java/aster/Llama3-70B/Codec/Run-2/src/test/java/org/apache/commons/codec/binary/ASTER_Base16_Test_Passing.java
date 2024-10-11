/**
 * Generated by Aster
 */
package org.apache.commons.codec.binary;
import org.apache.commons.codec.CodecPolicy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Base16_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsInAlphabet2_VmUR1() {
    Base16 base16 = new Base16(true, CodecPolicy.STRICT);
    assertFalse(base16.isInAlphabet((byte) 123));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsInAlphabet3_tJkP2() {
    Base16 base16 = new Base16(true);
    assertTrue(base16.isInAlphabet((byte) 55));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsInAlphabet1_CMVA0_fid2() {
    Base16 base16 = new Base16();
    assertFalse(base16.isInAlphabet((byte) 10));
}
}