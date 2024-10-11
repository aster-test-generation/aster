/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynamicPointer_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEqualsWithEqualObject_ytRe2_fid2() {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale(""));
        DynamicPointer other = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), new Locale(""));
        assertTrue(dynamicPointer.equals(other));
    }
}