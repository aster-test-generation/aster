/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPath11CompatibleTypeConverter_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertWithOtherObject_orda1() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        boolean result = converter.canConvert(object, Integer.class);
        assertTrue(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertWithNotNodeSetAndInstance_qlQR2() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        Object result = converter.convert(object, object.getClass());
        assertEquals(object, result);
    }
}