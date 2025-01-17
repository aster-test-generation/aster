/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Locale;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CollectionPointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNonWholeCollectionNodeType_bNCK6() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), null);
    NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
    boolean result = collectionPointer.testNode(test);
    Assertions.assertTrue(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceIterator_EsIu0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en", "US"));
        NodeIterator result = collectionPointer.namespaceIterator();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameObject_ReturnsTrue_YTsN0() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en", "US"));
        boolean result = collectionPointer.equals(collectionPointer);
        assertEquals(true, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_NullObject_ReturnsFalse_qUWj1() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en", "US"));
        boolean result = collectionPointer.equals(null);
        assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentClassObject_ReturnsFalse_kild2() {
        CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en", "US"));
        boolean result = collectionPointer.equals(new Object());
        assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_SameCollectionAndIndex_ReturnsTrue_DWKm3() {
        CollectionPointer collectionPointer1 = new CollectionPointer(new Object(), new Locale("en", "US"));
        CollectionPointer collectionPointer2 = new CollectionPointer(new Object(), new Locale("en", "US"));
        boolean result = collectionPointer1.equals(collectionPointer2);
        assertEquals(false, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEquals_DifferentCollection_ReturnsFalse_bUwJ4() {
        CollectionPointer collectionPointer1 = new CollectionPointer(new Object(), new Locale("en", "US"));
        CollectionPointer collectionPointer2 = new CollectionPointer(new Object(), new Locale("fr", "FR"));
        boolean result = collectionPointer1.equals(collectionPointer2);
        assertEquals(false, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetImmediateNodeWholeCollection_LeHM0_PMNC0() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), new Locale("en"));
    collectionPointer.setIndex(CollectionPointer.WHOLE_COLLECTION);
    Object result = collectionPointer.getImmediateNode();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_WhenLengthIsLessThanOrEqualToIndex_CollectionsAreExpanded_LtOd2_METk1() {
    CollectionPointer collectionPointer = new CollectionPointer(new Object(), Locale.US);
    JXPathContext context = JXPathContext.newContext(collectionPointer);
    NodePointer nodePointer = collectionPointer.createPath(context);
}
}