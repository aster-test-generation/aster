/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import java.util.Locale;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynaBeanPointer_Coverage_Test_Passing {
    private QName name;
    private DynaBean dynaBean;
    private DynaBeanPointer dynabeanpointer;
    private DynaBeanPointer anotherDynabeanpointer;
    private Locale locale;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_pqto0() {
        QName expectedName = new QName("testName");
        DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(expectedName, dynaBean, Locale.getDefault());
        QName actualName = dynaBeanPointer.getName();
        assertEquals(expectedName, actualName);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullObject_LEMa2() throws Exception {
        assertFalse(dynabeanpointer.equals(null));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClass_AXaL3() throws Exception {
        Object differentClassObject = new Object();
        assertFalse(dynabeanpointer.equals(differentClassObject));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentName_OhRL4() throws Exception {
        QName differentName = new QName("differentName");
        anotherDynabeanpointer = new DynaBeanPointer(differentName, dynaBean, locale);
        assertFalse(dynabeanpointer.equals(anotherDynabeanpointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameFields_oVcF6() throws Exception {
        anotherDynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        assertTrue(dynabeanpointer.equals(anotherDynabeanpointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentLocale_LggI7() throws Exception {
        Locale differentLocale = new Locale("fr", "FR");
        anotherDynabeanpointer = new DynaBeanPointer(name, dynaBean, differentLocale);
        assertFalse(dynabeanpointer.equals(anotherDynabeanpointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_BothNullDynaBean_Qrtz8() throws Exception {
        dynabeanpointer = new DynaBeanPointer(name, null, locale);
        anotherDynabeanpointer = new DynaBeanPointer(name, null, locale);
        assertTrue(dynabeanpointer.equals(anotherDynabeanpointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_OneNullDynaBean_mOHP9() throws Exception {
        anotherDynabeanpointer = new DynaBeanPointer(name, null, locale);
        assertFalse(dynabeanpointer.equals(anotherDynabeanpointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentIndex_SKjf10() throws Exception {
        anotherDynabeanpointer = new DynaBeanPointer(name, dynaBean, locale);
        dynabeanpointer.setIndex(1); // Hypothetical method to set index
        anotherDynabeanpointer.setIndex(2); // Hypothetical method to set index
        assertFalse(dynabeanpointer.equals(anotherDynabeanpointer));
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_QYLZ0() {
        QName name = new QName("testName");
        Locale locale = new Locale("en", "US");
        DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        Object result = dynaBeanPointer.getBaseValue();
        assertEquals(dynaBean, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLengthReturnsOne_TVSG0() {
        QName qName = new QName("testName");
        Locale locale = new Locale("en", "US");
        DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(qName, dynaBean, locale);
        int length = dynaBeanPointer.getLength();
        assertEquals(1, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeafReturnsFalse_XUbH0() {
        QName name = new QName("testName");
        Locale locale = new Locale("en", "US");
        DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
        assertFalse(dynaBeanPointer.isLeaf());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_zuDF0_iQuN0() {
    QName name = new QName("testName");
    Locale locale = new Locale("en", "US");
    DynaBean mockDynaBean = mock(DynaBean.class);
    DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(name, mockDynaBean, locale);
    Object result = dynaBeanPointer.getImmediateNode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollectionReturnsFalse_hVPZ0_HFPv0() {
    QName name = new QName("testName");
    Locale locale = Locale.getDefault();
    DynaBean dynaBean = null; // Assuming dynaBean is initialized appropriately
    DynaBeanPointer dynaBeanPointer = new DynaBeanPointer(name, dynaBean, locale);
    assertFalse(dynaBeanPointer.isCollection());
}
}