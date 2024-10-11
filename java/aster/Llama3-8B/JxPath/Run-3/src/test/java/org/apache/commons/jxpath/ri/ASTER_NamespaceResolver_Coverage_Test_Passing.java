/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NamespaceResolver_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWhenSealed_TFrw0() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        resolver.seal();
        try {
            resolver.registerNamespace("prefix1", "namespaceURI1");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Cannot register namespaces on a sealed NamespaceResolver", e.getMessage());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixNullPointer_JVUW0() {
        String result = NamespaceResolver.getPrefix(null, "namespaceURI");
        assertNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_ReturnsNull_WhenBothExternallyRegisteredNamespaceURIAndPointerNamespaceURIAreNull_pBvE2() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String prefix = "prefix";
        assertNull(namespaceResolver.getNamespaceURI(prefix));
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCloneResultType_NSPO2_Pfdb1() {
    NamespaceResolver namespaceResolver = new NamespaceResolver();
    Object result = namespaceResolver.clone();
    assertEquals(NamespaceResolver.class, result.getClass());
}
}