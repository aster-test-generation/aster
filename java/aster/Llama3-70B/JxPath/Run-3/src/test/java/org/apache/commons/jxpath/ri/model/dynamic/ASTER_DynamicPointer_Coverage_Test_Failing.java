/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynamicPointer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_withNullValue_Bnmu0() {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.US);
        boolean result = dynamicPointer.isLeaf();
        assert(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NameIsNotNull_Qxif1_fid1() {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.US);
        DynamicPointer other = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.US);
        assertTrue(dynamicPointer.equals(other));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_NameIsNull_dZBx0_dZRJ0_fid3() {
    DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.US);
    DynamicPointer other = new DynamicPointer(new QName(null), new Object(), new PageContextHandler(), Locale.US);
    assertFalse(dynamicPointer.equals(other));
}
}