/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BeanPropertyPointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyName_vkfC0() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        beanPropertyPointer.setPropertyName("testProperty");
        assertEquals("testProperty", beanPropertyPointer.getPropertyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyNameWithUnspecifiedPropertyIndex_waqF1() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        beanPropertyPointer.setPropertyIndex(BeanPropertyPointer.UNSPECIFIED_PROPERTY);
        beanPropertyPointer.setPropertyName("testProperty");
        assertEquals("testProperty", beanPropertyPointer.getPropertyName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyNameWithNullPropertyName_VNnX2() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        beanPropertyPointer.setPropertyName(null);
        assertEquals(null, beanPropertyPointer.getPropertyName());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_PDIsNull_lpoQ0() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
        assertFalse(beanPropertyPointer.isCollection());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_PDIsNotNull_rCeS1() {
        BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(new DOMNodePointer(null, null, null), new JXPathBasicBeanInfo(null, false));
        assertTrue(beanPropertyPointer.isCollection());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_COLLECTION_IndexZero_SetValue_smQY13() {
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_PDIsNull_Return1_cNrv0() {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
    assertEquals(1, beanPropertyPointer.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetLength_PDIsNotNull_Return1_qFjQ1() {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(new DOMNodePointer(null, null, null), new JXPathBasicBeanInfo(null, false));
    assertEquals(1, beanPropertyPointer.getLength());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathImmediateNodeNotNull_QvTY0_iAuI0() {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
    JXPathContext context = JXPathContext.newContext(null);
    beanPropertyPointer.createPath(context);
    assertEquals(beanPropertyPointer, beanPropertyPointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathSuperCreatePath_rkiO2_NRqm0() {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
    JXPathContext context = JXPathContext.newContext(null);
    beanPropertyPointer.createPath(context);
    beanPropertyPointer.createPath(context);
    assertEquals(beanPropertyPointer, beanPropertyPointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathBaseValueUninitialized_CQYv3_brNN0() {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(null, null);
    JXPathContext context = JXPathContext.newContext(null);
    beanPropertyPointer.createPath(context);
    assertEquals(0, beanPropertyPointer.getPropertyCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsCollection_HintIsMinusOne_cXmE3_hJdy0() {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(new DOMNodePointer(null, null, null), new JXPathBasicBeanInfo(null, false));
    assertFalse(beanPropertyPointer.isCollection());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testRemove_WHOLE_COLLECTION_IgTt0_rnxX0() {
    BeanPropertyPointer beanPropertyPointer = new BeanPropertyPointer(new DOMNodePointer(null, null, null), new JXPathBasicBeanInfo(null, false));
}
}