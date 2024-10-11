/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XXHash32_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_seed_HPlJ0() throws Exception {
    XXHash32 hash = new XXHash32(1234);
    long value = hash.getValue();
    assertEquals(1234, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue_noSeed_yHSE1() throws Exception {
    XXHash32 hash = new XXHash32();
    long value = hash.getValue();
    assertEquals(0, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate_InvalidArguments_mCqp4() throws Exception {
    XXHash32 hash = new XXHash32();
    byte[] buffer = new byte[10];
    try {
        hash.update(buffer, -1, 10);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
    try {
        hash.update(buffer, 10, -1);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
    try {
        hash.update(buffer, 10, 10);
        fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testUpdate_NullBuffer_XqYe5() throws Exception {
    XXHash32 hash = new XXHash32();
    try {
        hash.update(null, 0, 10);
        fail("Expected NullPointerException");
    } catch (NullPointerException e) {
    }
}
}