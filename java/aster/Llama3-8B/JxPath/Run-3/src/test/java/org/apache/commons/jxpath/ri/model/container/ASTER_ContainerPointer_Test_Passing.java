/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.xml.DocumentContainer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointer_Test_Passing {
@Mock
    private NodePointer nodePointer1;
@Mock
    private NodePointer nodePointer2;
private ContainerPointer containerpointer;
@Mock
    private Container container;
private ContainerPointer containerPointer;
@Mock
    private NodeTest nodeTest;
@Mock
    private NodePointer nodePointer;
@Mock
    private ValueUtils valueUtils;
@Mock
    private NodeIterator nodeIterator;
@Mock
    private ContainerPointer parent;
@Mock
    private Object value;
@Mock
    private VariablePointer variablePointer;
    private NodePointer valuePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisContainer() throws Exception {
        containerpointer = Mockito.mock(ContainerPointer.class);
        // Arrange
        Mockito.when(containerpointer.isContainer()).thenReturn(true);
        // Act
        boolean result = containerpointer.isContainer();
        // Assert
        Mockito.verify(containerpointer, Mockito.times(1)).isContainer();
        Assertions.assertTrue(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnamespacePointer() throws Exception {
        containerpointer = new ContainerPointer(new DOMNodePointer(null, null, null), new DocumentContainer(null));
        when(containerpointer.getValuePointer()).thenReturn(nodePointer);
        String namespace = "testNamespace";
        NodePointer result = containerpointer.namespacePointer(namespace);
        assertEquals(nodePointer, result);
        verify(nodePointer).namespacePointer(namespace);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName() throws Exception {
        containerpointer = Mockito.mock(ContainerPointer.class);
        QName expectedName = Mockito.mock(QName.class);
        Mockito.when(containerpointer.getName()).thenReturn(expectedName);
        QName actualName = containerpointer.getName();
        Mockito.verify(containerpointer).getName();
        assertEquals(expectedName, actualName);
    }
}