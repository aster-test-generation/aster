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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPointer_Test_Failing {
    DynamicPointer dynamicPointer;
    private Object bean;
    private QName name;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameNameAndBean_KYzn2_fid1() {
        DynamicPointer dynamicPointer1 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.US);
        DynamicPointer dynamicPointer2 = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.US);
        assertTrue(dynamicPointer1.equals(dynamicPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullName_mQme5_fid1() {
        DynamicPointer dynamicPointer1 = new DynamicPointer(null, new Object(), new PageContextHandler(), Locale.US);
        DynamicPointer dynamicPointer2 = new DynamicPointer(null, new Object(), new PageContextHandler(), Locale.US);
        assertTrue(dynamicPointer1.equals(dynamicPointer2));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafNullValue_BwNf0_fid1() {
        DynamicPointer dynamicPointer = new DynamicPointer(new QName("name"), new Object(), new PageContextHandler(), Locale.US);
        assertTrue(dynamicPointer.isLeaf());
    }
}