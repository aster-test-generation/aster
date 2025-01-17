/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NamespaceResolver_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithUnsealedNamespaceResolver_qmyu1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURI_withPrefix_returnsNamespaceURI_CXGH0() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = "somePrefix";
        String namespaceURI = resolver.getNamespaceURI(prefix);
        assertNull(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURI_withNullPrefix_returnsNull_Ehpo1() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = null;
        String namespaceURI = resolver.getNamespaceURI(prefix);
        assertEquals(null, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURI_withUnknownPrefix_returnsNull_hLcm2() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = "unknownPrefix";
        String namespaceURI = resolver.getNamespaceURI(prefix);
        assertEquals(null, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_KSmJ0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        Pointer pointer = namespaceResolver.getNamespaceContextPointer();
        assertEquals(null, pointer);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test2_ZVWh1() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(new NamespaceResolver());
        Pointer pointer = namespaceResolver.getNamespaceContextPointer();
        assertEquals(null, pointer);
    }
}