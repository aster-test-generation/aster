/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.NodeSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPath11CompatibleTypeConverter_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NonNodeSet_xPNO1() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        assertFalse(converter.canConvert(object, NodeSet.class));
    }
}