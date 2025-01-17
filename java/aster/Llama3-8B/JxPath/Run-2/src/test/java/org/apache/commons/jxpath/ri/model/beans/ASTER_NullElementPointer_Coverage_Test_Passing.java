/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NullElementPointer_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_vDdJ0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        try {
            nullElementPointer.setValue("testValue");
            assert false;
        } catch (UnsupportedOperationException e) {
            assert e.getMessage().equals("Collection element does not exist: " + nullElementPointer);
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsCollection_kOUj0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        boolean result = nullElementPointer.isCollection();
        assert(result == false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_ReturnsNull_cDmk0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        Object immediateNode = nullElementPointer.getImmediateNode();
        assertEquals(null, immediateNode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsContainer_qqGC0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        boolean result = nullElementPointer.isContainer();
        assert(result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testHashCode_HNDd0() {
        NullElementPointer nullElementPointer = new NullElementPointer(new DOMNodePointer(null, null, null), 1);
        int hashCode = nullElementPointer.hashCode();
        assertEquals(1, hashCode);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetName_ReturnsNull_CPfu0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        QName result = nullElementPointer.getName();
        assert result == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetLength_cDyP0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        int length = nullElementPointer.getLength();
        assert(length == 0);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetBaseValue_eIhW0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        Object result = nullElementPointer.getBaseValue();
        assert(result == null);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsActual_jySE0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        boolean actual = nullElementPointer.isActual();
        assert(actual == false);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsLeaf_qeUC0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        boolean result = nullElementPointer.isLeaf();
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NullParent_LFoo0() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
        String result = nullElementPointer.asPath();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NullParentWithIndex_RInW3() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, 1);
        String result = nullElementPointer.asPath();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NotNullParentNoIndex_nrSl4() {
        NullElementPointer nullElementPointer = new NullElementPointer(new DOMNodePointer(null, null, null), 0);
        String result = nullElementPointer.asPath();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_NotNullParentWithIndex_AZLN5() {
        NullElementPointer nullElementPointer = new NullElementPointer(new DOMNodePointer(null, null, null), 1);
        String result = nullElementPointer.asPath();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_IndexWholeCollection_VYse6() {
        NullElementPointer nullElementPointer = new NullElementPointer(null, NullElementPointer.WHOLE_COLLECTION);
        String result = nullElementPointer.asPath();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAsPath_ParentIndexWholeCollection_titq9() {
        NullElementPointer nullElementPointer = new NullElementPointer(new DOMNodePointer(null, null, null), NullElementPointer.WHOLE_COLLECTION);
        String result = nullElementPointer.asPath();
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_ZMKZ0_FiMj0() {
    NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
    JXPathContext context = JXPathContext.newContext(null);
    Object value = "testValue";
    NodePointer result = nullElementPointer.createPath(context, value);
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreatePath_Lhnv0_HEvN1() {
    NullElementPointer nullElementPointer = new NullElementPointer(null, 0);
    JXPathContext context = JXPathContext.newContext(null);
    NodePointer result = nullElementPointer.createPath(context);
    assertNotNull(result);
}
}