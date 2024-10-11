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

public class Aster_JXPath11CompatibleTypeConverter_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_ilyD0_bdUL0() {
        JXPath11CompatibleTypeConverter jXPath11CompatibleTypeConverter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        Class toType = Object.class;
        boolean expected = true;
        boolean actual = jXPath11CompatibleTypeConverter.canConvert(object, toType);
        assertEquals(expected, actual);
    }
}