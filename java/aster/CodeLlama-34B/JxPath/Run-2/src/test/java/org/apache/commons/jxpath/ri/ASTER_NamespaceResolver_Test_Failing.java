/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceResolver_Test_Failing {
    private boolean sealed;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithParent_WVzK1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.registerNamespace("prefix", "namespaceURI");
        assertEquals("namespaceURI", resolver.getNamespaceURI("prefix"));
        assertEquals("prefix", resolver.getPrefix("namespaceURI"));
        assertEquals("namespaceURI", parent.getNamespaceURI("prefix"));
        assertEquals("prefix", parent.getPrefix("namespaceURI"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetExternallyRegisteredNamespaceURI_ParentNotNull_EvBE1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String prefix = "prefix";
        String uri = resolver.getExternallyRegisteredNamespaceURI(prefix);
        assertNotNull(uri);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithNonNullNamespaceURI_axsj1() {
        NamespaceResolver resolver = new NamespaceResolver();
        String namespaceURI = "http://www.example.com/namespace";
        String prefix = resolver.getPrefix(namespaceURI);
        assertNotNull(prefix);
        assertEquals(namespaceURI, prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithParent_qlaU2() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String namespaceURI = "http://www.example.com/namespace";
        String prefix = resolver.getPrefix(namespaceURI);
        assertNotNull(prefix);
        assertEquals(namespaceURI, prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIsSealed_ParentNotNull_BWmD0() {
        NamespaceResolver parent = new NamespaceResolver(null);
        NamespaceResolver resolver = new NamespaceResolver(parent);
        assertTrue(resolver.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithParent_WVzK1_3_fid2() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.registerNamespace("prefix", "namespaceURI");
        assertEquals("namespaceURI", parent.getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithParent_WVzK1_4() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.registerNamespace("prefix", "namespaceURI");
        assertEquals("prefix", parent.getPrefix("namespaceURI"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithNonNullNamespaceURI_axsj1_1() {
        NamespaceResolver resolver = new NamespaceResolver();
        String namespaceURI = "http://www.example.com/namespace";
        String prefix = resolver.getPrefix(namespaceURI);
        assertNotNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithNonNullNamespaceURI_axsj1_2() {
        NamespaceResolver resolver = new NamespaceResolver();
        String namespaceURI = "http://www.example.com/namespace";
        String prefix = resolver.getPrefix(namespaceURI);
        assertEquals(namespaceURI, prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithParent_qlaU2_1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String namespaceURI = "http://www.example.com/namespace";
        String prefix = resolver.getPrefix(namespaceURI);
        assertNotNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPrefixWithParent_qlaU2_2() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String namespaceURI = "http://www.example.com/namespace";
        String prefix = resolver.getPrefix(namespaceURI);
        assertEquals(namespaceURI, prefix);
    }
}