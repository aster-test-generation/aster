/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.ri.QName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DynaBeanPointer_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_NonNullName_aLHF1() {
        QName name = new QName("testName");
        DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(null, name, null);
        assertEquals(name.hashCode(), dynaBeanPointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_NullName_nlQy0_tjDw0() {
        DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(null, null, Locale.US);
        assertEquals(0, dynaBeanPointer.hashCode());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NullParent_IjoH0_LnSn0() {
        DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(null, new QName("name"), null);
        assertEquals("/", dynaBeanPointer.asPath());
    }
}