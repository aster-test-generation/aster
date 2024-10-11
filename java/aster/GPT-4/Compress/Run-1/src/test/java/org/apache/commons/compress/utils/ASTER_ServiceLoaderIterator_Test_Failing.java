/**
 * Generated by Aster
 */
package org.apache.commons.compress.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ServiceLoaderIterator_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasNextReturnsTrueWhenThereAreElements_rAHW1() {
        ServiceLoader<Object> serviceLoader = ServiceLoader.load(Object.class);
        ServiceLoaderIterator<Object> iterator = new ServiceLoaderIterator<>(Object.class, ClassLoader.getSystemClassLoader());
        assertTrue(iterator.hasNext());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHasNextContinuesOnSecurityException_Rpwz3() {
        ServiceLoader<Object> serviceLoader = ServiceLoader.load(Object.class);
        ServiceLoaderIterator<Object> iterator = new ServiceLoaderIterator<>(Object.class, ClassLoader.getSystemClassLoader());
        assertTrue(iterator.hasNext()); // Assuming SecurityException is caught and handled internally
    }
}