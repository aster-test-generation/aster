/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import org.apache.commons.jxpath.Pointer;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NamespaceResolver_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_NullPointerAndNotNullParent_kzeX0_1() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        Pointer pointer = namespaceResolver.getNamespaceContextPointer();
        assertNotNull(pointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_NullPointerAndNotNullParent_kzeX0_2() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        Pointer pointer = namespaceResolver.getNamespaceContextPointer();
    assertNull(namespaceResolver);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_NullPointerAndNotNullParent_kzeX0_2_fid1() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        Pointer pointer = namespaceResolver.getNamespaceContextPointer();
        assertEquals(namespaceResolver, pointer);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixPrefixNotNull_SzMf1() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String namespaceURI = "testNamespace";
        String prefix = "testPrefix";
        namespaceResolver.getExternallyRegisteredPrefix(namespaceURI);
        assertEquals(prefix, namespaceResolver.getPrefix(namespaceURI));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixPrefixNotNullAndPointerNull_pMzS5() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String namespaceURI = "testNamespace";
        String prefix = "testPrefix";
        namespaceResolver.getExternallyRegisteredPrefix(namespaceURI);
        String result = namespaceResolver.getPrefix(namespaceURI);
        assertEquals(prefix, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_NullPointerAndNotNullParent_kzeX0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver(null);
        Pointer pointer = namespaceResolver.getNamespaceContextPointer();
        assertNotNull(pointer);
        assertEquals(namespaceResolver, pointer);
}
}