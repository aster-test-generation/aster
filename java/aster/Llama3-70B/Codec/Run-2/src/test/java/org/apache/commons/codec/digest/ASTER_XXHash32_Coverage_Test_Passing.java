/**
 * Generated by Aster
 */
package org.apache.commons.codec.digest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_XXHash32_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_withPositiveInteger_vjtP0() {
        XXHash32 xxHash32 = new XXHash32(123); // create an object with a seed
        xxHash32.update(128); // call update with a positive integer
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_withNegativeInteger_zFKd1() {
        XXHash32 xxHash32 = new XXHash32(); // create an object without a seed
        xxHash32.update(-128); // call update with a negative integer
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdate_withZero_MHrV2() {
        XXHash32 xxHash32 = new XXHash32(0); // create an object with a seed of 0
        xxHash32.update(0); // call update with 0
    }
}