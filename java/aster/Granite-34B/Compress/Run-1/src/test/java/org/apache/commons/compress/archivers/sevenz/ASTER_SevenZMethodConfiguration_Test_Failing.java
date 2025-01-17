/**
 * Generated by Aster
 */
package org.apache.commons.compress.archivers.sevenz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SevenZMethodConfiguration_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptions_VazP0() {
        SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY);
        Object options = config.getOptions();
        assertNotNull(options);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOptionsWithMethodAndOptions_hPpW1() {
        SevenZMethodConfiguration config = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
        Object options = config.getOptions();
        assertNotNull(options);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentOptions_vFrj4() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    assertEquals(false, config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameMethodAndOptions_svXI5() {
    Object options = new Object();
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, options);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY, options);
    assertEquals(true, config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCodeWithMethodNotNull_bzta1() {
        SevenZMethod method = SevenZMethod.COPY;
        Object options = new Object();
        SevenZMethodConfiguration configuration = new SevenZMethodConfiguration(method, options);
        assertEquals(method.hashCode(), configuration.hashCode());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithDifferentOptions_vFrj4_fid1() {
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, null);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY, new Object());
    assertEquals(false, config1.equals(config2));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsWithSameMethodAndOptions_svXI5_fid1() {
    Object options = new Object();
    SevenZMethodConfiguration config1 = new SevenZMethodConfiguration(SevenZMethod.COPY, options);
    SevenZMethodConfiguration config2 = new SevenZMethodConfiguration(SevenZMethod.COPY, options);
    assertEquals(false, config1.equals(config2));
}
}