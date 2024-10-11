/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.JXPathContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointerFactory_Test_Failing {
@Mock
    private NodePointer parent;
@Mock
    private QName name;
@Mock
    private Object bean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_1() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Arrange
        ContainerPointerFactory containerpointerfactory = new ContainerPointerFactory();
        when(bean instanceof Container).thenReturn(true);
        // Act
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        // Assert
        verify(parent, times(1)).createChild(any(JXPathContext.class), name, anyInt());
        assertEquals(parent, result.getParent());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_2() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Arrange
        ContainerPointerFactory containerpointerfactory = new ContainerPointerFactory();
        when(bean instanceof Container).thenReturn(true);
        // Act
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        // Assert
        verify(parent, times(1)).createChild(any(JXPathContext.class), name, anyInt());
        assertEquals(name, result.getName());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer_3() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Arrange
        ContainerPointerFactory containerpointerfactory = new ContainerPointerFactory();
        when(bean instanceof Container).thenReturn(true);
        // Act
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        // Assert
        verify(parent, times(1)).createChild(any(JXPathContext.class), name, anyInt());
        assertEquals(bean, result.getBaseValue());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointer() throws Exception {
        MockitoAnnotations.initMocks(this);
        // Arrange
        ContainerPointerFactory containerpointerfactory = new ContainerPointerFactory();
        when(bean instanceof Container).thenReturn(true);
        // Act
        NodePointer result = containerpointerfactory.createNodePointer(parent, name, bean);
        // Assert
        verify(parent, times(1)).createChild(any(JXPathContext.class), name, anyInt());
        assertEquals(parent, result.getParent());
        assertEquals(name, result.getName());
        assertEquals(bean, result.getBaseValue());
    }
}