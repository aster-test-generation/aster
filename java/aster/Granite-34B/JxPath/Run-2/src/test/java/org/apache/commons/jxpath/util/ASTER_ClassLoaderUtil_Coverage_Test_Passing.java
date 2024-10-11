/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ClassLoaderUtil_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_wfxS0() throws java.lang.ClassNotFoundException {
        ClassLoaderUtil util = new ClassLoaderUtil();
        Thread.currentThread().setContextClassLoader(null);
        try {
            util.getClass("class1", true);
            fail();
        } catch (ClassNotFoundException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_SQvp1() throws java.lang.ClassNotFoundException {
        ClassLoaderUtil util = new ClassLoaderUtil();
        Thread.currentThread().setContextClassLoader(new ClassLoader() {
        });
        try {
            util.getClass("class1", true);
            fail();
        } catch (ClassNotFoundException e) {
        }
    }
}