/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CollectionPointerFactory_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_CxFz0() {
        CollectionPointerFactory factory = new CollectionPointerFactory();
        int expectedOrder = 100; // Assuming COLLECTION_POINTER_FACTORY_ORDER is set to 100
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithNonCollectionBean_ziNC0_KZws0() {
    CollectionPointerFactory factory = new CollectionPointerFactory();
    NodePointer parent = mock(NodePointer.class);
    QName name = new QName("test");
    Object nonCollectionBean = new Object(); // Assuming this is not a collection
    ValueUtils mockValueUtils = mock(ValueUtils.class);
    when(mockValueUtils.isCollection(nonCollectionBean)).thenReturn(false);
    NodePointer result = factory.createNodePointer(parent, name, nonCollectionBean);
    assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithCollection_yhjB0_SXpq0_1() {
    CollectionPointerFactory factory = new CollectionPointerFactory();
    QName name = new QName("test");
    List<Object> bean = new ArrayList<>();
    Locale locale = Locale.getDefault();
    NodePointer parent = new DOMNodePointer(null, locale);
    NodePointer result = factory.createNodePointer(parent, name, bean);
    assertNotNull(result, "Expected non-null NodePointer for collection input");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithCollection_yhjB0_SXpq0_2() {
    CollectionPointerFactory factory = new CollectionPointerFactory();
    QName name = new QName("test");
    List<Object> bean = new ArrayList<>();
    Locale locale = Locale.getDefault();
    NodePointer parent = new DOMNodePointer(null, locale);
    NodePointer result = factory.createNodePointer(parent, name, bean);
    assertTrue(result instanceof CollectionPointer, "Expected result to be instance of CollectionPointer");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithCollectionBean_nWwK1_USnj0_1() {
    CollectionPointerFactory factory = new CollectionPointerFactory();
    NodePointer parent = mock(NodePointer.class);
    QName name = new QName("test");
    Object collectionBean = mock(Collection.class); // Assuming this is a collection
    ValueUtils mockValueUtils = mock(ValueUtils.class);
    when(mockValueUtils.isCollection(collectionBean)).thenReturn(true);
    NodePointer result = factory.createNodePointer(parent, name, collectionBean);
    assertNotNull(result, "Expected a CollectionPointer when bean is a collection");}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateNodePointerWithCollectionBean_nWwK1_USnj0_2() {
    CollectionPointerFactory factory = new CollectionPointerFactory();
    NodePointer parent = mock(NodePointer.class);
    QName name = new QName("test");
    Object collectionBean = mock(Collection.class); // Assuming this is a collection
    ValueUtils mockValueUtils = mock(ValueUtils.class);
    when(mockValueUtils.isCollection(collectionBean)).thenReturn(true);
    NodePointer result = factory.createNodePointer(parent, name, collectionBean);
    assertTrue(result instanceof CollectionPointer, "Result should be instance of CollectionPointer");}
}