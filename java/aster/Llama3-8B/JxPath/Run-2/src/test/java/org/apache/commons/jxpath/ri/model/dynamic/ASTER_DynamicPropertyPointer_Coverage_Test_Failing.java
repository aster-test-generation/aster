/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import java.util.Arrays;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynamicPropertyPointer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyname_NullName_FVio0() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, new PageContextHandler());
        String propertyName = dynamicPropertyPointer.getPropertyName();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyname_PropertyNames_twMd1() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(new DOMNodePointer(null, null, null), new PageContextHandler());
        String[] propertyNames = dynamicPropertyPointer.getPropertyNames();
        String propertyName = dynamicPropertyPointer.getPropertyName();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyname_PropertyIndex_PWmY2() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(new DOMNodePointer(null, null, null), new PageContextHandler());
        dynamicPropertyPointer.setPropertyIndex(0);
        String propertyName = dynamicPropertyPointer.getPropertyName();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyname_PropertyIndexOutOfRange_oPAX3() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(new DOMNodePointer(null, null, null), new PageContextHandler());
        dynamicPropertyPointer.setPropertyIndex(1);
        String propertyName = dynamicPropertyPointer.getPropertyName();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyName_SetPropertyIndex_GcPx0() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
        dynamicPropertyPointer.setPropertyIndex(DynamicPropertyPointer.UNSPECIFIED_PROPERTY);
        assertEquals(DynamicPropertyPointer.UNSPECIFIED_PROPERTY, dynamicPropertyPointer.getPropertyIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetPropertyName_SetName_BzjN1() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
        String propertyName = "testProperty";
        dynamicPropertyPointer.setPropertyName(propertyName);
        assertEquals(propertyName, dynamicPropertyPointer.getName());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyIndex_UnspecifiedProperty_TXSU0() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
        assertEquals(0, dynamicPropertyPointer.getPropertyIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNamesNullNames_TGQe0() {
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
    String[] result = dynamicPropertyPointer.getPropertyNames();
    Assertions.assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWholeCollection_LVuD0_VdJh0() {
    DynamicPropertyPointer pointer = new DynamicPropertyPointer(null, null);
    Object value = "testValue";
    JXPathContext context = JXPathContext.newContext(value);
    NodePointer result = pointer.createPath(context, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathNonWholeCollection_XaUT1_Rzso0() {
    DynamicPropertyPointer pointer = new DynamicPropertyPointer(null, null);
    pointer.setIndex(1); 
    Object value = "testValue";
    JXPathContext context = JXPathContext.newContext(value); 
    NodePointer result = pointer.createPath(context, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithHandler_mQAx2_VgtA0() {
    DynamicPropertyPointer pointer = new DynamicPropertyPointer(null, new PageContextHandler());
    pointer.setIndex(DynamicPropertyPointer.WHOLE_COLLECTION);
    Object value = "testValue";
    JXPathContext context = JXPathContext.newContext(value);
    NodePointer result = pointer.createPath(context, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyName_ArraysBinarySearch_Found_FdPH4_mCGa0() {
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
    String[] names = {"testProperty1", "testProperty2", "testProperty3"};
    String propertyName = "testProperty2";
    dynamicPropertyPointer.setPropertyName(propertyName);
    if (names != null && Arrays.binarySearch(names, propertyName) >= 0) {
        int propertyCount = dynamicPropertyPointer.getPropertyCount();
        assertNotNull(propertyCount);
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_IndexEqualToWholeCollection_DoesNotThrowJXPathInvalidAccessException_WzdF8_TbRp0() {
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
    JXPathContext context = JXPathContext.newContext(null);
    dynamicPropertyPointer.setIndex(DynamicPropertyPointer.WHOLE_COLLECTION);
    dynamicPropertyPointer.createPath(context);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyIndex_PropertyNamesEmpty_GDTD2_irjZ1() {
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, null);
    assertEquals(0, dynamicPropertyPointer.getPropertyCount());
}
}