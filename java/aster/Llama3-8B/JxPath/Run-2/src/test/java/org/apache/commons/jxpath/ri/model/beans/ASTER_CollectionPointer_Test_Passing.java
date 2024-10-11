/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collection;
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
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_CollectionPointer_Test_Passing {
private NodePointer valuePointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_QJOm0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en", "US"));
        boolean result = collectionPointer.isCollection();
        assert result;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNamespaceIterator_gkrS0() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    NodeIterator result = collectionPointer.namespaceIterator();
    Assertions.assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsSameObject_feEt0() {
    CollectionPointer obj1 = new CollectionPointer(new Object(), Locale.US);
    boolean result = obj1.equals(obj1);
    assert(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentObject_tzeP1() {
    CollectionPointer obj1 = new CollectionPointer(new Object(), Locale.US);
    CollectionPointer obj2 = new CollectionPointer(new Object(), Locale.US);
    boolean result = obj1.equals(obj2);
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsNull_HAbQ2() {
    CollectionPointer obj1 = new CollectionPointer(new Object(), Locale.US);
    boolean result = obj1.equals(null);
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentClass_XJOW3() {
    CollectionPointer obj1 = new CollectionPointer(new Object(), Locale.US);
    QName obj2 = new QName("test", "test");
    boolean result = obj1.equals(obj2);
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValuePointerWholeCollection_gOIB0() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    NodePointer nodePointer = collectionPointer.getValuePointer();
    Assertions.assertEquals(collectionPointer, nodePointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValuePointerNullValuePointer_IwOF2() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    NodePointer nodePointer = collectionPointer.getValuePointer();
    Assertions.assertNotNull(nodePointer);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsContainerTrue_huZz0() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    collectionPointer.setIndex(1);
    boolean result = collectionPointer.isContainer();
    assert (result == true);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsContainerFalse_FmVT1() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    collectionPointer.setIndex(CollectionPointer.WHOLE_COLLECTION);
    boolean result = collectionPointer.isContainer();
    assert (result == false);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPathWithoutParentAndWholeCollection_WiYw3() {
        CollectionPointer collectionPointer = new CollectionPointer(null, CollectionPointer.WHOLE_COLLECTION);
        assertEquals("/", collectionPointer.asPath());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_LOVx0() {
        Locale locale = new Locale("en", "US");
        Object collection = new Object();
        CollectionPointer pointer = new CollectionPointer(collection, locale);
        Object result = pointer.getBaseValue();
        assert result == collection;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testEqualsDifferentCollection_dOzc4_BGiw0() {
    CollectionPointer obj1 = new CollectionPointer(new Object(), Locale.US);
    CollectionPointer obj2 = new CollectionPointer(new Object(), Locale.US);
    obj2 = new CollectionPointer(new Object(), Locale.US);
    boolean result = obj1.equals(obj2);
    assert(!result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetName_pHGy1() {
    QName qName = new QName("testName");
    MockitoAnnotations.initMocks(this);
    CollectionPointer collectionpointer = new CollectionPointer(qName, Locale.US);
    QName expected = qName;
    QName actual = (QName) collectionpointer.getBaseValue();
    assertEquals(expected, actual);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBaseValue_aIPV0() {
    Collection collection = new ArrayList();
    CollectionPointer collectionPointer = new CollectionPointer(collection, Locale.US);
    Object baseValue = collectionPointer.getBaseValue();
    assertEquals(collection, baseValue);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_gRWQ1() {
        Locale locale = new Locale("en", "US");
        Object collection = new Object();
        CollectionPointer pointer = new CollectionPointer(collection, locale);
        int length = pointer.getLength();
        assertEquals(1, length);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testisCollection_RmQV0_fid2() throws Exception{
    CollectionPointer collectionpointer = new CollectionPointer(new Object(), Locale.US);
    boolean result = collectionpointer instanceof Collection;
}
}