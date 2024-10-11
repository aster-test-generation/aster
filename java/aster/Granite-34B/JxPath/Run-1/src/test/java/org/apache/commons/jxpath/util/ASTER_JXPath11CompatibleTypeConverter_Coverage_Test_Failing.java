/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.NodeSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPath11CompatibleTypeConverter_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertWithNodeSetAndType_caAv1_oczL0() {
        JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        Class toType = NodeSet.class;
        Object result = jXPath11CompatibleTypeConverter.convert(object, toType);
        assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_xxzT0_nUBg0() {
        JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        Class toType = Object.class;
        boolean expected = false;
        boolean actual = jXPath11CompatibleTypeConverter.canConvert(object, toType);
        assertEquals(expected, actual);
    }
}