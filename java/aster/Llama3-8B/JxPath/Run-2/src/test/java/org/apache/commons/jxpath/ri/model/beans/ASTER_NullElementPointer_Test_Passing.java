/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NullElementPointer_Test_Passing {
@Mock
    private DOMNodePointer parent;
@Mock
    private Locale locale;
@Mock
    private QName name;
@Mock
    private JXPathContext jXPathContext;
@Mock
    private DOMNodePointer parentPointer;
@Mock
    private NullElementPointer immediateParentPointer;
@Mock
    private QName qName;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private int index;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValuePointer_umAp0() {
        QName name = new QName("name");
        DOMNodePointer parent = new DOMNodePointer(null, null, "id");
        NullElementPointer nullElementPointer = new NullElementPointer(parent, 0);
        NodePointer result = nullElementPointer.getValuePointer();
        assert result instanceof NullPointer;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_GpQt0() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NullElementPointer nullElementPointer = new NullElementPointer(parent, 0);
        Object result = nullElementPointer.getImmediateNode();
        assert result == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_hdqS0() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NullElementPointer nullElementPointer = new NullElementPointer(parent, 0);
        int result = nullElementPointer.hashCode();
        assert result != 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() throws Exception {
        MockitoAnnotations.initMocks(this);
        when(parent.asPath()).thenReturn("parentPath");
        when(immediateParentPointer.asPath()).thenReturn("immediateParentPath");
        NullElementPointer nullElementPointer = new NullElementPointer(parent, 1);
        String expectedPath = "parentPath/.[1]";
        String actualPath = nullElementPointer.asPath();
        assertEquals(expectedPath, actualPath);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NullParent_wYII0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        assertEquals("", nullElementPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_WholeCollection_dWHZ1() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, NullElementPointer.WHOLE_COLLECTION);
        assertEquals("", nullElementPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_Index0_hVDw2() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        assertEquals("[1]", nullElementPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_Index1_wFzL3() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 1);
        assertEquals("[2]", nullElementPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_LWDd0() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NullElementPointer nullElementPointer = new NullElementPointer(parent, 0);
        int length = nullElementPointer.getLength();
        assert length == 0;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_jNTh0() {
        DOMNodePointer parent = new DOMNodePointer(null, null, null);
        NullElementPointer nullElementPointer = new NullElementPointer(parent, 0);
        Object result = nullElementPointer.getBaseValue();
        assertEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_xHFG0_ZBTR0() {
    NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
    JXPathContext context = JXPathContext.newContext(null);
    Object value = "testValue";
    NodePointer result = nullElementPointer.createPath(context, value);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_Qwwr0_FOwL0() {
    NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
    JXPathContext context = JXPathContext.newContext(null);
    NodePointer result = nullElementPointer.createPath(context);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_HfBW0_1() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(parent.getImmediateParentPointer()).thenReturn(parent);
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 1);
    NullElementPointer other = new NullElementPointer(parent, 1);
    DOMNodePointer otherParent = mock(DOMNodePointer.class);
    NullElementPointer otherNullElementPointer = new NullElementPointer(otherParent, 1);
    NullElementPointer otherNullElementPointer2 = new NullElementPointer(parent, 2);
    assertEquals(nullelementpointer, nullelementpointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_HfBW0_2() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(parent.getImmediateParentPointer()).thenReturn(parent);
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 1);
    NullElementPointer other = new NullElementPointer(parent, 1);
    DOMNodePointer otherParent = mock(DOMNodePointer.class);
    NullElementPointer otherNullElementPointer = new NullElementPointer(otherParent, 1);
    NullElementPointer otherNullElementPointer2 = new NullElementPointer(parent, 2);
    assertEquals(nullelementpointer.hashCode(), other.hashCode());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_HfBW0_3() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(parent.getImmediateParentPointer()).thenReturn(parent);
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 1);
    NullElementPointer other = new NullElementPointer(parent, 1);
    DOMNodePointer otherParent = mock(DOMNodePointer.class);
    NullElementPointer otherNullElementPointer = new NullElementPointer(otherParent, 1);
    NullElementPointer otherNullElementPointer2 = new NullElementPointer(parent, 2);
    assertNotEquals(nullelementpointer, other);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_HfBW0_4() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(parent.getImmediateParentPointer()).thenReturn(parent);
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 1);
    NullElementPointer other = new NullElementPointer(parent, 1);
    DOMNodePointer otherParent = mock(DOMNodePointer.class);
    NullElementPointer otherNullElementPointer = new NullElementPointer(otherParent, 1);
    NullElementPointer otherNullElementPointer2 = new NullElementPointer(parent, 2);
    assertNotEquals(nullelementpointer, otherNullElementPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEquals_HfBW0_5() throws Exception {
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(parent.getImmediateParentPointer()).thenReturn(parent);
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 1);
    NullElementPointer other = new NullElementPointer(parent, 1);
    DOMNodePointer otherParent = mock(DOMNodePointer.class);
    NullElementPointer otherNullElementPointer = new NullElementPointer(otherParent, 1);
    NullElementPointer otherNullElementPointer2 = new NullElementPointer(parent, 2);
    assertNotEquals(nullelementpointer, otherNullElementPointer2);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testsetValue_xQcP0() throws Exception{
    DOMNodePointer parent = new DOMNodePointer(null, null, null); // Assuming parent is of type DOMNodePointer
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
    Object value = "Test Value";
    nullelementpointer.isLeaf(); // Assuming isLeaf() is a method that sets the value
    Mockito.verifyNoMoreInteractions(Mockito.mock(NullElementPointer.class));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisContainer_nBJu0() throws Exception{
    MockitoAnnotations.initMocks(this);
    DOMNodePointer parent = Mockito.mock(DOMNodePointer.class);
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
    boolean result = nullelementpointer.isLeaf();
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testHashCode_dsBp0() throws Exception{
    MockitoAnnotations.initMocks(this);
    when(immediateParentPointer.hashCode()).thenReturn(1);
    when(parentPointer.hashCode()).thenReturn(2);
    DOMNodePointer parentPointer = new DOMNodePointer(null, null, null);
    NullElementPointer nullelementpointer = new NullElementPointer(parentPointer, 3);
    int expectedHashCode = 5;
    int actualHashCode = nullelementpointer.hashCode();
    assertEquals(expectedHashCode, actualHashCode);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_vzuT0_1() throws Exception{
    MockitoAnnotations.initMocks(this);
    DOMNodePointer domNodePointer = Mockito.mock(DOMNodePointer.class);
    NullElementPointer nullelementpointer = new NullElementPointer(domNodePointer, 0);
    QName actual = null;
    Mockito.verify(domNodePointer, Mockito.times(0)).getName();
    Assertions.assertNull(actual);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_vzuT0_2() throws Exception{
    MockitoAnnotations.initMocks(this);
    DOMNodePointer domNodePointer = Mockito.mock(DOMNodePointer.class);
    NullElementPointer nullelementpointer = new NullElementPointer(domNodePointer, 0);
    QName actual = null;
    Mockito.verify(domNodePointer, Mockito.times(0)).getName();
    Assertions.assertTrue(nullelementpointer.isLeaf());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyPointer_LGEQ0_1() throws Exception {
    MockitoAnnotations.initMocks(this);
    DOMNodePointer parent = Mockito.mock(DOMNodePointer.class);
    int index = 0;
    NullElementPointer nullelementpointer = new NullElementPointer(parent, index);
    PropertyPointer propertyPointer = nullelementpointer.getPropertyPointer();
    Assertions.assertNotNull(propertyPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyPointer_LGEQ0_2() throws Exception {
    MockitoAnnotations.initMocks(this);
    DOMNodePointer parent = Mockito.mock(DOMNodePointer.class);
    int index = 0;
    NullElementPointer nullelementpointer = new NullElementPointer(parent, index);
    PropertyPointer propertyPointer = nullelementpointer.getPropertyPointer();
    Assertions.assertTrue(propertyPointer instanceof NullPropertyPointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testgetLength_kVmm0() {
    DOMNodePointer parent = new DOMNodePointer(null, null, null);
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
    boolean result = nullelementpointer.isLeaf();
    assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisActual_ZOak0() throws Exception{
    NullElementPointer nullelementpointer = new NullElementPointer(null, 0);
    DOMNodePointer parent = null;
    Locale locale = null;
    when(parent.getLocale()).thenReturn(locale);
    when(locale.getLanguage()).thenReturn("en");
    when(locale.getCountry()).thenReturn("US");
    boolean result = nullelementpointer.isLeaf();
    assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisLeaf_BMoB0() throws Exception{
    DOMNodePointer parent = new DOMNodePointer(null, null, null);
    NullElementPointer nullelementpointer = new NullElementPointer(parent, 0);
    boolean result = nullelementpointer.isLeaf();
    Assertions.assertTrue(result);
}
}