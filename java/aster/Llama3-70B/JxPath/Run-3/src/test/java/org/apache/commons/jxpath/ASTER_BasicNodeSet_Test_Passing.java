/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicNodeSet_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_XMLF0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        assertEquals("[]", basicNodeSet.toString());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValues_WhenPointersIsEmpty_ReturnsEmptyList_IKPJ0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List values = basicNodeSet.getValues();
        assertEquals(0, values.size());
    }
}