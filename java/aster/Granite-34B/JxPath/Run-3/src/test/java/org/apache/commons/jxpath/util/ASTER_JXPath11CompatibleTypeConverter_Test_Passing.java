/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPath11CompatibleTypeConverter_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNonNodeSetToType_vQeB1() throws Exception {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        Class toType = Object.class;
        Object result = converter.convert(object, toType);
        assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NotNodeSet_true_wvCE2() throws Exception {
        JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        Class toType = Object.class;
        boolean actual = jXPath11CompatibleTypeConverter.canConvert(object, toType);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NotNodeSet_false_oNql3() throws Exception {
        JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        Class toType = String.class;
        boolean actual = jXPath11CompatibleTypeConverter.canConvert(object, toType);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}