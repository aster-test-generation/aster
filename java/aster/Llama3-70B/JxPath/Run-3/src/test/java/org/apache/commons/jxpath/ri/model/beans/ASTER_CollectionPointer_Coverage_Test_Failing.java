/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CollectionPointer_Coverage_Test_Failing {
private CollectionPointer collectionPointer;
private JXPathContext context;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_NullValue_eqMM0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
        boolean result = collectionPointer.isLeaf();
        assert(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testIsContainer_aNhI0_ieOj0() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    assertTrue(collectionPointer.isContainer());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithValue_cict1_tJyA0() {
    Object obj = new Object();
    JXPathContext context = JXPathContext.newContext(obj);
    CollectionPointer collectionPointer = new CollectionPointer(obj, Locale.US);
    NodePointer ptr = collectionPointer.createPath(context, null);
    assert ptr != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_CreatePath_NodePointer_geWK2_zBte0_1() {
    Object obj = new Object();
    JXPathContext context = JXPathContext.newContext(obj);
    QName name = new QName("test");
    int index = 1;
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    NodePointer result = collectionPointer.createChild(context, name, index);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_CreatePath_NodePointer_geWK2_zBte0_2() {
    Object obj = new Object();
    JXPathContext context = JXPathContext.newContext(obj);
    QName name = new QName("test");
    int index = 1;
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    NodePointer result = collectionPointer.createChild(context, name, index);
    assertNotNull(result.createPath(context));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithReturnValue_UZGN2_UASi0() {
    Object obj = new Object();
    JXPathContext context = JXPathContext.newContext(obj);
    CollectionPointer collectionPointer = new CollectionPointer(obj, Locale.US);
    NodePointer ptr = collectionPointer.createPath(context, "someValue");
    assert ptr != null;
    assert ptr.getValue() != null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_Clone_NodePointer_ldjW0_nqQQ0_1() {
    Object obj = new Object();
    JXPathContext context = JXPathContext.newContext(obj);
    QName name = new QName("test");
    int index = 1;
    CollectionPointer collectionPointer = new CollectionPointer(obj, Locale.US);
    NodePointer result = collectionPointer.createChild(context, name, index);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_Clone_NodePointer_ldjW0_nqQQ0_2() {
    Object obj = new Object();
    JXPathContext context = JXPathContext.newContext(obj);
    QName name = new QName("test");
    int index = 1;
    CollectionPointer collectionPointer = new CollectionPointer(obj, Locale.US);
    NodePointer result = collectionPointer.createChild(context, name, index);
    assertTrue(result instanceof NodePointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_SetIndex_JgMq1_wnkr0() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    JXPathContext context = JXPathContext.newContext(new Object());
    QName name = new QName("test");
    int index = 1;
    Object value = new Object();
    NodePointer ptr = collectionPointer.createChild(context, name, index, value);
    assertEquals(index, ptr.getIndex()); // Verify that index is set correctly
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreateChild_SetIndex_NodePointer_JzLS1_LLky0() {
    Object obj = new Object();
    JXPathContext context = JXPathContext.newContext(obj);
    QName name = new QName("test");
    int index = 1;
    CollectionPointer collectionPointer = new CollectionPointer(obj, Locale.US);
    NodePointer result = collectionPointer.createChild(context, name, index);
    assertEquals(index, result.getIndex());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetValue_SetValueToCollection_cIMf2_uRpU0() {
    Object collection = new Object();
    Locale locale = new Locale("en", "US");
    CollectionPointer collectionPointer = new CollectionPointer(collection, locale);
    Object value = new Object();
    collectionPointer.setValue(value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePathWithValue_cict1_tJyA0_fid2() {
    Object obj = new Object();
    JXPathContext context = JXPathContext.newContext(obj);
    CollectionPointer collectionPointer = new CollectionPointer(obj, Locale.US);
    NodePointer ptr = collectionPointer.createPath(context, "someProperty");
    assert ptr != null;
}
}