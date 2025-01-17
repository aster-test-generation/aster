/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_InfoSetUtil_Coverage_Test_Failing {
    private EvalContext evalContext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue_List_RAvb6() {
        List<Object> list = new ArrayList<>();
        list.add("test");
        String expected = "test";
        String actual = InfoSetUtil.stringValue(list);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testStringValue_Array_BeHM7() {
        Object[] array = new Object[]{"test"};
        String expected = "test";
        String actual = InfoSetUtil.stringValue(array);
        assertEquals(expected, actual);
    }
}