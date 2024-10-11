/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.NodeSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPath11CompatibleTypeConverter_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertOtherType_vkPk2() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        assertFalse(converter.canConvert(object, String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvertNull_HDJu3() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        assertNull(converter.canConvert(null, String.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertNodeSetToNodeSet_ZWNJ0_WUZY0() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        Object object = new ArrayList();
        Class toType = NodeSet.class;
        Object result = converter.convert(object, toType);
        assertEquals(object, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertOtherTypeToNodeSet_DnZo2_fVeC0() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        Object object = "test";
        Class toType = NodeSet.class;
        Object result = converter.convert(object, toType);
        assertEquals(result, object);
    }
}