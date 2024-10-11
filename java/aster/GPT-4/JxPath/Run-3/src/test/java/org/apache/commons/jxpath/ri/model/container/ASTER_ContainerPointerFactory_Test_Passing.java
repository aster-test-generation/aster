/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.container;
import java.util.Locale;
import org.apache.commons.jxpath.Container;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_ContainerPointerFactory_Test_Passing {
private ContainerPointerFactory containerPointerFactory;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNonContainer_qibz1() {
    ContainerPointerFactory factory = new ContainerPointerFactory();
    QName name = new QName("test");
    Object nonContainerObject = new Object();
    Locale locale = Locale.getDefault();
    NodePointer result = factory.createNodePointer(name, nonContainerObject, locale);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOrder_eHZS0() {
    ContainerPointerFactory factory = new ContainerPointerFactory();
    int expectedOrder = ContainerPointerFactory.CONTAINER_POINTER_FACTORY_ORDER;
    assertEquals(expectedOrder, factory.getOrder());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithContainer_1() throws Exception {
        containerPointerFactory = new ContainerPointerFactory();
        // Arrange
        NodePointer mockParent = mock(NodePointer.class);
        QName mockQName = mock(QName.class);
        Container mockBean = mock(Container.class);
        ContainerPointer expectedPointer = new ContainerPointer(mockParent, mockBean);
        // Act
        NodePointer result = containerPointerFactory.createNodePointer(mockParent, mockQName, mockBean);
        // Assert
        assertNotNull(result, "Result should not be null when bean is a Container");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithContainer_2() throws Exception {
        containerPointerFactory = new ContainerPointerFactory();
        // Arrange
        NodePointer mockParent = mock(NodePointer.class);
        QName mockQName = mock(QName.class);
        Container mockBean = mock(Container.class);
        ContainerPointer expectedPointer = new ContainerPointer(mockParent, mockBean);
        // Act
        NodePointer result = containerPointerFactory.createNodePointer(mockParent, mockQName, mockBean);
        // Assert
        assertTrue(result instanceof ContainerPointer, "Result should be an instance of ContainerPointer");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithContainer_3() throws Exception {
        containerPointerFactory = new ContainerPointerFactory();
        // Arrange
        NodePointer mockParent = mock(NodePointer.class);
        QName mockQName = mock(QName.class);
        Container mockBean = mock(Container.class);
        ContainerPointer expectedPointer = new ContainerPointer(mockParent, mockBean);
        // Act
        NodePointer result = containerPointerFactory.createNodePointer(mockParent, mockQName, mockBean);
        // Assert
        assertEquals(expectedPointer.getParent(), result.getParent(), "Parent pointers should match");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithContainer_4() throws Exception {
        containerPointerFactory = new ContainerPointerFactory();
        // Arrange
        NodePointer mockParent = mock(NodePointer.class);
        QName mockQName = mock(QName.class);
        Container mockBean = mock(Container.class);
        ContainerPointer expectedPointer = new ContainerPointer(mockParent, mockBean);
        // Act
        NodePointer result = containerPointerFactory.createNodePointer(mockParent, mockQName, mockBean);
        // Assert
        assertEquals(expectedPointer.getImmediateNode(), result.getImmediateNode(), "Immediate nodes should match");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithNonContainer() throws Exception {
        containerPointerFactory = new ContainerPointerFactory();
        // Arrange
        NodePointer mockParent = mock(NodePointer.class);
        QName mockQName = mock(QName.class);
        Object nonContainerBean = new Object(); // Not a Container instance
        // Act
        NodePointer result = containerPointerFactory.createNodePointer(mockParent, mockQName, nonContainerBean);
        // Assert
        assertNull(result, "Result should be null when bean is not a Container");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCreateNodePointerWithContainer() throws Exception {
        containerPointerFactory = new ContainerPointerFactory();
        // Arrange
        NodePointer mockParent = mock(NodePointer.class);
        QName mockQName = mock(QName.class);
        Container mockBean = mock(Container.class);
        ContainerPointer expectedPointer = new ContainerPointer(mockParent, mockBean);
        // Act
        NodePointer result = containerPointerFactory.createNodePointer(mockParent, mockQName, mockBean);
        // Assert
        assertNotNull(result, "Result should not be null when bean is a Container");
        assertTrue(result instanceof ContainerPointer, "Result should be an instance of ContainerPointer");
        assertEquals(expectedPointer.getParent(), result.getParent(), "Parent pointers should match");
        assertEquals(expectedPointer.getImmediateNode(), result.getImmediateNode(), "Immediate nodes should match");
    }
}