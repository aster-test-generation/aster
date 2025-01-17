/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethodConfiguration_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NullMethodNonNullOptions_HySD8() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(null, new Object());
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(null, new Object());
    assertTrue(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_DifferentOptions_NlaL3_fid1() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    assertFalse(config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NonNullOptions_GzBC5_fid1() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    assertTrue(config1.equals(config2));
}
}