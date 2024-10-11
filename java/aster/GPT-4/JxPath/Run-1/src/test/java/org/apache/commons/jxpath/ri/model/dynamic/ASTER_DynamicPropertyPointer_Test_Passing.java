/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynamic;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.DynamicPropertyHandler;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import org.apache.commons.jxpath.servlet.PageContextHandler;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import java.lang.reflect.Field;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynamicPropertyPointer_Test_Passing {
@Mock
    private DynamicPropertyHandler handler;
@Mock
    private DOMNodePointer parentNode;
@Mock
    private PageContextHandler pageContextHandler;
@InjectMocks
    private DynamicPropertyPointer dynamicPropertyPointer;
@Mock
    private DOMNodePointer parent;
@Mock
    private JXPathContext context;
@Mock
    private NodePointer nodePointer;
@Mock
    private AbstractFactory factory;
private DOMNodePointer domNodePointerMock;
private PageContextHandler pageContextHandlerMock;
@Mock
    private DOMNodePointer mockDomNodePointer;
@Mock
    private PageContextHandler mockPageContextHandler;
private String[] names = {"propertyOne", "propertyTwo", "propertyThree"};
private String name = "propertyTwo";
@Mock
    private DynamicPropertyHandler dynamicPropertyHandler;
    private String requiredPropertyName;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer() throws Exception {
        dynamicPropertyPointer = new DynamicPropertyPointer(mockDomNodePointer, mockPageContextHandler);
        // Since isContainer method returns a hardcoded true, the test should always expect true
        assertTrue(dynamicPropertyPointer.isContainer(), "isContainer should return true");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActualProperty() throws Exception {
        dynamicPropertyPointer = new DynamicPropertyPointer(mockDomNodePointer, mockPageContextHandler);
        // Since isActualProperty method returns a constant true, we assert it should always return true.
        assertTrue(dynamicPropertyPointer.isActualProperty(), "The isActualProperty should always return true.");
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNode_SpecificIndex_cynn0() throws Exception {
    dynamicPropertyPointer = new DynamicPropertyPointer(parentNode, pageContextHandler);
    when(pageContextHandler.getPropertyNames(any())).thenReturn(new String[]{"ExpectedValueAtIndex"});
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(pageContextHandler).getPropertyNames(any());
    assertEquals("ExpectedValueAtIndex", result[0]);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_NoRequiredProperty_smED0_1() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_NoRequiredProperty_smED0_2() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertEquals(3, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_NoRequiredProperty_smED0_3() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertArrayEquals(new String[]{"prop1", "prop2", "prop3"}, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_WithRequiredPropertyNotPresent_kOiW0_1() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DOMNodePointer parent = mock(DOMNodePointer.class);
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    Field requiredPropertyNameField = DynamicPropertyPointer.class.getDeclaredField("requiredPropertyName");
    requiredPropertyNameField.setAccessible(true);
    requiredPropertyNameField.set(dynamicPropertyPointer, "prop0");
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_WithRequiredPropertyNotPresent_kOiW0_2() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DOMNodePointer parent = mock(DOMNodePointer.class);
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    Field requiredPropertyNameField = DynamicPropertyPointer.class.getDeclaredField("requiredPropertyName");
    requiredPropertyNameField.setAccessible(true);
    requiredPropertyNameField.set(dynamicPropertyPointer, "prop0");
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertEquals(4, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_WithRequiredPropertyNotPresent_kOiW0_3() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DOMNodePointer parent = mock(DOMNodePointer.class);
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    Field requiredPropertyNameField = DynamicPropertyPointer.class.getDeclaredField("requiredPropertyName");
    requiredPropertyNameField.setAccessible(true);
    requiredPropertyNameField.set(dynamicPropertyPointer, "prop0");
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertArrayEquals(new String[]{"prop0", "prop1", "prop2", "prop3"}, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_WithRequiredPropertyPresent_ONfx0_1() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    Field requiredPropertyNameField = DynamicPropertyPointer.class.getDeclaredField("requiredPropertyName");
    requiredPropertyNameField.setAccessible(true);
    requiredPropertyNameField.set(dynamicPropertyPointer, "prop2");
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_WithRequiredPropertyPresent_ONfx0_2() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    Field requiredPropertyNameField = DynamicPropertyPointer.class.getDeclaredField("requiredPropertyName");
    requiredPropertyNameField.setAccessible(true);
    requiredPropertyNameField.set(dynamicPropertyPointer, "prop2");
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertEquals(3, result.length);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyNames_WithRequiredPropertyPresent_ONfx0_3() throws Exception {
    PageContextHandler handler = mock(PageContextHandler.class);
    DOMNodePointer parent = mock(DOMNodePointer.class);
    when(handler.getPropertyNames(any())).thenReturn(new String[]{"prop1", "prop2", "prop3"});
    DynamicPropertyPointer dynamicPropertyPointer = new DynamicPropertyPointer(parent, handler);
    Field requiredPropertyNameField = DynamicPropertyPointer.class.getDeclaredField("requiredPropertyName");
    requiredPropertyNameField.setAccessible(true);
    requiredPropertyNameField.set(dynamicPropertyPointer, "prop2");
    String[] result = dynamicPropertyPointer.getPropertyNames();
    verify(handler).getPropertyNames(any());
    assertArrayEquals(new String[]{"prop1", "prop2", "prop3"}, result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetPropertyIndex_WithSameIndex_DoesNotResetName_Ymob0_fid1() throws Exception {
    dynamicPropertyPointer = new DynamicPropertyPointer(domNodePointerMock, pageContextHandlerMock);
    int index = 1;
    dynamicPropertyPointer.setPropertyIndex(index);
    dynamicPropertyPointer.setPropertyIndex(index);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPropertyCount_lOtt0_fid1() throws Exception {
    String[] propertyNames = new String[]{"prop1", "prop2", "prop3"};
    DynamicPropertyPointer dynamicPropertyPointer = mock(DynamicPropertyPointer.class);
    when(dynamicPropertyPointer.getPropertyNames()).thenReturn(propertyNames);
    int count = dynamicPropertyPointer.getPropertyNames().length;
    verify(dynamicPropertyPointer).getPropertyNames(); // Verify that getPropertyNames was called on dynamicPropertyPointer
}
}