/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_NamespaceResolver_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithUnsealedNamespaceResolver_tmHN1_1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        assertEquals("namespaceURI", resolver.getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithUnsealedNamespaceResolver_tmHN1_2() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        assertEquals("prefix", resolver.getPrefix("namespaceURI"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrefixTest1_egyu0() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = resolver.getPrefix("namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURINullPrefix_HhMS0() {
        NamespaceResolver resolver = new NamespaceResolver();
        String uri = resolver.getNamespaceURI(null);
        Assertions.assertNull(uri);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURIExternallyRegisteredNamespaceURI_XvZQ1() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = "prefix";
        String uri = "uri";
        resolver.registerNamespace(prefix, uri);
        String result = resolver.getNamespaceURI(prefix);
        Assertions.assertEquals(uri, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getNamespaceURINonNullPrefix_hXqF2() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = "prefix";
        String uri = resolver.getNamespaceURI(prefix);
        Assertions.assertNull(uri);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithSealedNamespaceResolver_QnAb0_YIJy0_1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.seal();
        IllegalStateException e = Assertions.assertThrows(IllegalStateException.class, () -> {
            resolver.registerNamespace("prefix", "namespaceURI");
        });
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithUnsealedNamespaceResolver_tmHN1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        assertEquals("namespaceURI", resolver.getNamespaceURI("prefix"));
        assertEquals("prefix", resolver.getPrefix("namespaceURI"));
    }
}