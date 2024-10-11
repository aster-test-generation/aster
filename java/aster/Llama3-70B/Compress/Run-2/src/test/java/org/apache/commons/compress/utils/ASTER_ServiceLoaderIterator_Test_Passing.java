/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ServiceLoaderIterator_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_eOGW0() {
    ServiceLoaderIterator iterator = new ServiceLoaderIterator(Object.class);
    try {
        iterator.remove();
        assert false;
    } catch (UnsupportedOperationException e) {
        assertEquals("service=" + Object.class.getName(), e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasNext_ServiceLoaderIterator_IHIL0_fid2() {
    ServiceLoaderIterator iterator = new ServiceLoaderIterator(Object.class);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHasNext_ServiceLoaderIterator_ClassLoader_aUao1_fid2() {
    ServiceLoaderIterator iterator = new ServiceLoaderIterator(Object.class, getClass().getClassLoader());
    assertFalse(iterator.hasNext());
}
}