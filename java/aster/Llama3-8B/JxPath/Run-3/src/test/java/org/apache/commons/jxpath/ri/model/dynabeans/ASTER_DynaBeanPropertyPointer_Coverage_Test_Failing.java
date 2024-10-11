/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynaBeanPropertyPointer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeNullPropertyName_aXPp0() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        assertNull(dynaBeanPropertyPointer.getImmediateNode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNodeNullDynaBean_oNaM11() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        Object value = dynaBeanPropertyPointer.getImmediateNode();
        assertNull(value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyIndex_DifferentIndex_xdDz1_2() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.setPropertyIndex(0);
        dynaBeanPropertyPointer.setPropertyIndex(1);
        assertNull(dynaBeanPropertyPointer.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyIndex_NullName_oVVW2_1() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.setPropertyIndex(0);
        dynaBeanPropertyPointer.setPropertyIndex(1);
        assertNotNull(dynaBeanPropertyPointer.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNodeStarPropertyName_mnGu1_WDau0() {
    DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(new DOMNodePointer(null, null, "*"), null);
    assertNull(dynaBeanPropertyPointer.getImmediateNode());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNodeCollection_IzTe7_hRjA0() {
    QName qName = new QName("name");
    VariablePointer variablePointer = new VariablePointer(qName);
    DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, null);
    DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(domNodePointer, null);
    Object value = dynaBeanPropertyPointer.getImmediateNode();
    assertNotNull(value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNodeIndexZero_wviC9_niDj0() {
    QName qName = new QName("name");
    VariablePointer variablePointer = new VariablePointer(qName);
    DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, null);
    DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(domNodePointer, null);
    dynaBeanPropertyPointer.setIndex(0);
    Object value = dynaBeanPropertyPointer.getImmediateNode();
    assertNotNull(value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNodeIndexNonZero_lOne10_wfAc0() {
    QName qName = new QName("name");
    VariablePointer variablePointer = new VariablePointer(qName);
    DOMNodePointer domNodePointer = new DOMNodePointer(variablePointer, null);
    DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(domNodePointer, null);
    dynaBeanPropertyPointer.setIndex(1);
    Object value = dynaBeanPropertyPointer.getImmediateNode();
    assertNull(value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyIndex_PropertyIndexSet_digX6_SlnD1() {
    DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
    dynaBeanPropertyPointer.setPropertyIndex(1);
    assertEquals(1, dynaBeanPropertyPointer.getPropertyCount());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyIndex_PropertyIndexSetToUnspecifiedProperty_NIjT7_oles0() {
    DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
    dynaBeanPropertyPointer.setPropertyName("testName");
    dynaBeanPropertyPointer.setPropertyIndex(DynaBeanPropertyPointer.UNSPECIFIED_PROPERTY);
    assertEquals(DynaBeanPropertyPointer.UNSPECIFIED_PROPERTY, dynaBeanPropertyPointer.getPropertyIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_NameNotUpdated_WIVj3_AkKf0_1() {
    DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
    dynaBeanPropertyPointer.setPropertyIndex(0);
    dynaBeanPropertyPointer.setPropertyIndex(1);
    assertEquals(null, dynaBeanPropertyPointer.getPropertyName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyIndex_DifferentIndex_xdDz1() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.setPropertyIndex(0);
        dynaBeanPropertyPointer.setPropertyIndex(1);
        assertEquals(1, dynaBeanPropertyPointer.getPropertyIndex());
        assertNull(dynaBeanPropertyPointer.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyIndex_NullName_oVVW2() {
        DynaBeanPropertyPointer dynaBeanPropertyPointer = new DynaBeanPropertyPointer(null, null);
        dynaBeanPropertyPointer.setPropertyIndex(0);
        assertNotNull(dynaBeanPropertyPointer.getName());
        dynaBeanPropertyPointer.setPropertyIndex(1);
        assertNull(dynaBeanPropertyPointer.getName());
}
}