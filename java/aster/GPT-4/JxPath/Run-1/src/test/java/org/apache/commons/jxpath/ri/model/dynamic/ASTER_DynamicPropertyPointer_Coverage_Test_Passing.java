/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynamicPropertyPointer_Coverage_Test_Passing {
    public void setField(Object object, String fieldName, Object value) {
        try {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private DynamicPropertyHandler handler;
    private DynamicPropertyPointer dynamicPropertyPointer;
    private PageContextHandler pageContextHandler;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_WholeCollection_WvLB0() {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        PageContextHandler handler = mock(PageContextHandler.class);
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(parent, handler);
        JXPathContext context = mock(JXPathContext.class);
        Object value = new Object();
        int WHOLE_COLLECTION = DynamicPropertyPointer.WHOLE_COLLECTION;
        setField(pointer, "index", WHOLE_COLLECTION);
        when(pointer.getBean()).thenReturn(new Object());
        when(pointer.getPropertyName()).thenReturn("propertyName");
        pointer.createPath(context, value);
        verify(handler).setProperty(pointer.getBean(), pointer.getPropertyName(), value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePath_ReturnsSelf_DmUt2() {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        PageContextHandler handler = mock(PageContextHandler.class);
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(parent, handler);
        JXPathContext context = mock(JXPathContext.class);
        Object value = new Object();
        NodePointer result = pointer.createPath(context, value);
        assertSame(pointer, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithValidIndexAndNoExpansionNeeded_SGIa3() {
        JXPathContext context = mock(JXPathContext.class);
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(mock(DOMNodePointer.class), mock(PageContextHandler.class));
        Object collection = new Object();
        when(pointer.getBaseValue()).thenReturn(collection);
        when(pointer.getIndex()).thenReturn(0);
        when(pointer.getLength()).thenReturn(1);
        pointer.createPath(context);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithValidIndexAndExpansionNeeded_anRc4() {
        JXPathContext context = mock(JXPathContext.class);
        PageContextHandler handler = mock(PageContextHandler.class);
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(mock(DOMNodePointer.class), handler);
        Object collection = new Object();
        when(pointer.getBaseValue()).thenReturn(collection);
        when(pointer.getIndex()).thenReturn(1);
        when(pointer.getLength()).thenReturn(1);
        pointer.createPath(context);
        verify(handler).setProperty(pointer.getBean(), pointer.getPropertyName(), collection);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathWithWholeCollection_ALGN5() {
        JXPathContext context = mock(JXPathContext.class);
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(mock(DOMNodePointer.class), mock(PageContextHandler.class));
        when(pointer.getBaseValue()).thenReturn(new Object());
        when(pointer.getIndex()).thenReturn(DynamicPropertyPointer.WHOLE_COLLECTION);
        pointer.createPath(context);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_WholeCollection_XygQ0() {
        PageContextHandler handler = mock(PageContextHandler.class);
        DOMNodePointer parent = mock(DOMNodePointer.class);
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(parent, handler);
        Object value = new Object();
        String bean = "Bean";
        String propertyName = "Property";
        when(pointer.getBean()).thenReturn(bean);
        when(pointer.getPropertyName()).thenReturn(propertyName);
        when(pointer.getIndex()).thenReturn(DynamicPropertyPointer.WHOLE_COLLECTION);
        pointer.setValue(value);
        verify(handler).setProperty(bean, propertyName, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_NullValue_WholeCollection_ThiE2() {
        PageContextHandler handler = mock(PageContextHandler.class);
        DOMNodePointer parent = mock(DOMNodePointer.class);
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(parent, handler);
        Object value = null;
        String bean = "Bean";
        String propertyName = "Property";
        when(pointer.getBean()).thenReturn(bean);
        when(pointer.getPropertyName()).thenReturn(propertyName);
        when(pointer.getIndex()).thenReturn(DynamicPropertyPointer.WHOLE_COLLECTION);
        pointer.setValue(value);
        verify(handler).setProperty(bean, propertyName, value);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyIndex_PropertyNamesCalled_XiRJ1() {
        DOMNodePointer parentNode = mock(DOMNodePointer.class);
        PageContextHandler handler = new PageContextHandler();
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(parentNode, handler);
        when(pointer.getPropertyIndex()).thenReturn(DynamicPropertyPointer.UNSPECIFIED_PROPERTY);
        when(pointer.getPropertyNames()).thenReturn(new String[]{"prop1", "prop2"});
        pointer.getPropertyIndex();
        verify(pointer).getPropertyNames();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyIndex_LoopThroughPropertyNames_Ahpt2() {
        DOMNodePointer parentNode = mock(DOMNodePointer.class);
        PageContextHandler handler = new PageContextHandler();
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(parentNode, handler);
        when(pointer.getPropertyIndex()).thenReturn(DynamicPropertyPointer.UNSPECIFIED_PROPERTY);
        when(pointer.getPropertyNames()).thenReturn(new String[]{"prop1", "prop2"});
        pointer.getPropertyIndex();
        verify(pointer, times(2)).getPropertyNames(); // Called twice, once in loop and once before
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyIndex_ReturnSuperPropertyIndex_ALyV5() {
        DOMNodePointer parentNode = mock(DOMNodePointer.class);
        PageContextHandler handler = new PageContextHandler();
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(parentNode, handler);
        when(pointer.getPropertyIndex()).thenReturn(1);
        int index = pointer.getPropertyIndex();
        assertEquals(1, index);
    }
@Test
    public void testCreatePathWithNegativeIndex_mBXw2_hZUk0() {
        JXPathContext context = mock(JXPathContext.class);
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(mock(DOMNodePointer.class), mock(PageContextHandler.class));
        when(pointer.getBaseValue()).thenReturn(new Object());
        when(pointer.getIndex()).thenReturn(-1);
        assertThrows(JXPathInvalidAccessException.class, () -> {
            pointer.createPath(context);
        });
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue_InvalidIndex_Xcfg4_bvJY0() {
    PageContextHandler handler = mock(PageContextHandler.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    DynamicPropertyPointer pointer = new DynamicPropertyPointer(parent, handler);
    Object value = new Object();
    Object propertyValue = new Object();
    String bean = "Bean";
    String propertyName = "Property";
    int index = -1; // Invalid index
    when(pointer.getBean()).thenReturn(bean);
    when(pointer.getPropertyName()).thenReturn(propertyName);
    when(pointer.getIndex()).thenReturn(index);
    when(handler.getProperty(bean, propertyName)).thenReturn(propertyValue);
    pointer.setValue(value);
    verify(handler, never()).setProperty(any(), any(), any());
}
}