/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ServiceLoaderIterator_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasNextWithClassLoader_oFEo0() {
        ServiceLoaderIterator<Object> iterator = new ServiceLoaderIterator<>(Object.class, null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasNextWithoutClassLoader_dgEt1() {
        ServiceLoaderIterator<Object> iterator = new ServiceLoaderIterator<>(Object.class);
    }
}