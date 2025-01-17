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

public class Aster_JXPath11CompatibleTypeConverter_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_OtherTypeToNodeSet_NonNodeSetClass_LZcW5() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        String string = "hello";
        Integer convertedInteger = (Integer) converter.convert(string, Integer.class);
        assertEquals(Integer.valueOf(string), convertedInteger);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testConvert_OtherTypeToNodeSet_NonNodeSetClass_LZcW5_fid1() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        String string = "hello";
        NodeSet convertedNodeSet = (NodeSet) converter.convert(string, Integer.class);
        assertEquals(string, convertedNodeSet.toString());
    }
}