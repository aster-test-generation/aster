/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import org.apache.commons.jxpath.util.ValueUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPropertyPointer_Test_Failing {
    @Mock
    private DynamicPropertyHandler handler;
    @Mock
    private ValueUtils valueUtils;
    @Mock
    private PageContextHandler pageContextHandler;
    @Mock
    private DOMNodePointer domNodePointer;
    @Mock
    private VariablePointer variablePointer;
    @Mock
    private QName qName;
    private DynamicPropertyPointer dynamicPropertyPointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyNamesNullHandler_EfxI0() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(null, new PageContextHandler());
        String[] result = dynamicPropertyPointer.getPropertyNames();
        assert result == null;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPropertyIndex_xlNH0() throws Exception {
        String[] names = new String[]{"name1", "name2", "name3"};
        String name = "name2";
        DynamicPropertyPointer dynamicpropertypointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        String[] getPropertyNames = names;
        int result = dynamicpropertypointer.getPropertyCount();
        Mockito.verify(dynamicpropertypointer, Mockito.never()).setPropertyIndex(Mockito.anyInt());
        Assertions.assertEquals(names.length, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_pGZa0() throws Exception {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        String bean = "bean";
        String propertyName = "property";
        Object expectedValue = new Object();
        when(handler.getProperty(bean, propertyName)).thenReturn(expectedValue);
        Object actualValue = dynamicPropertyPointer.getBaseValue();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetValue_ngGw0() throws Exception {
        dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        Object value = "testValue";
        dynamicPropertyPointer.setIndex(DynamicPropertyPointer.WHOLE_COLLECTION);
        dynamicPropertyPointer.setValue(value);
        verify(pageContextHandler).setProperty(any(), any(), eq(value));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathIndexLessThanOne_SPWR4_hCDo0() {
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(null, null);
        JXPathContext context = JXPathContext.newContext(null);
        pointer.setIndex(-1);
        try {
            pointer.createPath(context);
            Assertions.fail("Expected JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreatePathIndexGreaterThanLength_onFh5_gErU0() {
        DynamicPropertyPointer pointer = new DynamicPropertyPointer(null, null);
        JXPathContext context = JXPathContext.newContext(new Object());
        pointer.setIndex(2);
        Object[] collection = new Object[]{new Object(), new Object()};
        NodePointer nodePointer = pointer.createPath(context);
        Assertions.assertArrayEquals(collection, ((Object[]) nodePointer.getBaseValue()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemove_INDEX_0_XQYM0() throws Exception {
        dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        dynamicPropertyPointer.setIndex(0);
        dynamicPropertyPointer.remove();
        verify(pageContextHandler, times(1)).setProperty(any(), any(), any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_G_dGfn0() {
        DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointer, pageContextHandler);
        boolean result = dynamicPropertyPointer.getPropertyCount() > 0;
        Assertions.assertTrue(result);
    }
}