/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicTypeConverter_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanCreateCollectionForInterface_SVZt2() {
        BasicTypeConverter converter = new BasicTypeConverter();
        assertFalse(converter.canCreateCollection(List.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateCollectionForInterface_uYbf1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        try {
            converter.allocateCollection(List.class);
            Assertions.fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToCharacter_wfzt1_jXNO1() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = "a";
        Class toType = Character.class;
        Object result = converter.convertStringToPrimitive(object, toType);
        assertEquals(Character.valueOf((char) object), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToFloat_adJZ6_tfke0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = "1.0";
        Class toType = Float.class;
        Object result = converter.convertStringToPrimitive(object, toType);
        assertEquals(1.0f, Float.parseFloat((String) result), 0.0);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvertStringToInvalidType_Itnh8_LmbC0() {
        BasicTypeConverter converter = new BasicTypeConverter();
        Object object = "1";
        Class toType = String.class;
        Object result = converter.convertStringToPrimitive(object, Integer.class);
        assertEquals(null, result);
    }
}