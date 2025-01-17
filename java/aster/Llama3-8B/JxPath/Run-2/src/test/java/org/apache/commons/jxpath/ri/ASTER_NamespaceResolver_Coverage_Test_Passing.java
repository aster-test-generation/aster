/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_NamespaceResolver_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWhenSealed_eWaX0() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        resolver.seal();
        try {
            resolver.registerNamespace("prefix2", "namespaceURI2");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Cannot register namespaces on a sealed NamespaceResolver", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWhenNotSealed_cGCD1_1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        resolver.registerNamespace("prefix2", "namespaceURI2");
        assertEquals("namespaceURI", resolver.getNamespaceURI("prefix"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWhenNotSealed_cGCD1_2() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        resolver.registerNamespace("prefix2", "namespaceURI2");
        assertEquals("namespaceURI2", resolver.getNamespaceURI("prefix2"));}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefix_mzov0() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String namespaceURI = "testNamespace";
        String prefix = namespaceResolver.getPrefix(namespaceURI);
        assertEquals(null, prefix);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixPrefixAndPointerNull_KlZt6() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String namespaceURI = "testNamespace";
        namespaceResolver.getExternallyRegisteredPrefix(namespaceURI);
        String result = namespaceResolver.getPrefix(namespaceURI);
        assertEquals(null, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixPrefixNullAndPointerNull_qVYc7() {
        NamespaceResolver namespaceResolver = new NamespaceResolver();
        String namespaceURI = "testNamespace";
        String result = namespaceResolver.getPrefix(namespaceURI);
        assertEquals(null, result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWhenNotSealed_cGCD1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        resolver.registerNamespace("prefix2", "namespaceURI2");
        assertEquals("namespaceURI", resolver.getNamespaceURI("prefix"));
        assertEquals("namespaceURI2", resolver.getNamespaceURI("prefix2"));
    }
}