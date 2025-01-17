/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;
import java.util.Locale;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointer_Test_Passing {
@Mock
    private NodeIterator nodeIterator;
@Mock
    private VariablePointer variablePointer;
@Mock
    private NodePointer nodePointer2;
@Mock
    private Object baseValue;
@Mock
    private NodeTest nodeTest;
@Mock
    private NodePointer valuePointer;
@Mock
    private ValueUtils valueUtils;
@Mock
    private NodePointer nodePointer1;
private ContainerPointer containerpointer;
@Mock
    private QName qName;
@Mock
    private NodePointer nodePointer;
private ContainerPointer containerPointer;
@Mock
    private DOMNodePointer domNodePointer;
@Mock
    private Object value;
@Mock
    private Locale locale;
@Mock
    private ContainerPointer parent;
@Mock
    private Container container;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer() {
        containerpointer = Mockito.mock(ContainerPointer.class);
        Mockito.when(containerpointer.isContainer()).thenReturn(true);
        boolean result = containerpointer.isContainer();
        Assertions.assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testasPath() {
        containerpointer = new ContainerPointer(parent, null);
        // Mock the parent's asPath method to return a specific value
        when(parent.asPath()).thenReturn("parent/path");
        // Call the asPath method on the containerpointer
        String result = containerpointer.asPath();
        // Assert the result
        assertEquals("parent/path", result);
    }
}