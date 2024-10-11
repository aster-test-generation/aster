/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ValueUtils_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueNonArrayCollection_ubQR8() {
        Object collection = new Object();
        assertNull(ValueUtils.getValue(collection, 0));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRemoveNullIndex_NcXH7() {
        try {
            ValueUtils.remove(null, 0);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("Cannot remove null[0]", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testArrayCollection_HmGn1() {
        Object[] array = new Object[]{"a", "b", "c"};
        Iterator iterator = ValueUtils.iterate(array);
        ArrayList list = new ArrayList(Arrays.asList(array));
        Iterator expected = list.iterator();
        assert iterator == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCollectionCollection_RLNb3() {
        Collection collection = new ArrayList(Arrays.asList("a", "b", "c"));
        Iterator iterator = ValueUtils.iterate(collection);
        Iterator expected = collection.iterator();
        assert iterator == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSingleElementCollection_UefW4() {
        Object element = "a";
        Iterator iterator = ValueUtils.iterate(element);
        ArrayList list = new ArrayList();
        list.add(element);
        Iterator expected = list.iterator();
        assert iterator == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNonCollectionObject_YPQX5() {
        Object object = "a";
        Iterator iterator = ValueUtils.iterate(object);
        ArrayList list = new ArrayList();
        list.add(object);
        Iterator expected = list.iterator();
        assert iterator == expected;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testInterface_JfdD3() {
        assertEquals(0, ValueUtils.getCollectionHint(List.class));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueCollection_UOQf2() {
        try {
            Collection<String> collection = new ArrayList<>();
            collection.add("1");
            collection.add("2");
            ValueUtils.setValue(collection, 1, "test");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValueNullCollection_nmAO3() {
        Object collection = null;
        try {
            ValueUtils.setValue(collection, 1, "test");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetValueWithNullPropertyDescriptor_oNFL2() {
        ValueUtils valueUtils = new ValueUtils();
        Object bean = new Object();
        try {
            valueUtils.getValue(bean, null);
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            assertEquals("No read method", e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testFinalClass_Rbqf4_MfrA0() {
        assertEquals(-1, ValueUtils.getCollectionHint(null));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_PrivateMethod_SBLP1_Xhvn0() {
        try {
            Method method = new Object().getClass().getDeclaredMethod("getClass", null);
            Method result = ValueUtils.getAccessibleMethod(method);
            Assertions.assertNull(result);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_InterfaceMethod_lvur3_fPwH0() {
        try {
            Method method = new Object().getClass().getInterfaces()[0].getMethod("toString", null);
            Method result = ValueUtils.getAccessibleMethod(method);
            Assertions.assertEquals(method, result);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccessibleMethod_PrivateInterfaceMethod_xkNK4_TSDW0() {
        try {
            Method method = new Object().getClass().getInterfaces()[0].getDeclaredMethod("toString", null);
            Method result = ValueUtils.getAccessibleMethod(method);
            Assertions.assertNull(result);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}