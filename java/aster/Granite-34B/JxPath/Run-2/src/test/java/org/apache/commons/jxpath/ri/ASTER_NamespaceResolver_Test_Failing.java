/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceResolver_Test_Failing {
    private boolean sealed;
    NamespaceResolver namespaceresolver;
    NamespaceResolver parent;
    String namespaceURI;
    String prefix;
    Map<String, String> reverseMap;
    @Mock
    Map<String, String> namespaceMap;
    Pointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testsetNamespaceContextPointer() throws Exception {
        namespaceresolver = new NamespaceResolver();
        NodePointer pointer = mock(NodePointer.class);
        namespaceresolver.setNamespaceContextPointer(pointer);
        verify(pointer, times(1)).setNamespaceResolver(namespaceresolver);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testregisterNamespace() throws Exception {
        namespaceresolver = new NamespaceResolver();
        String prefix = "prefix";
        String namespaceURI = "namespaceURI";
        namespaceresolver.registerNamespace(prefix, namespaceURI);
        Mockito.verify(namespaceresolver, Mockito.times(1)).registerNamespace(prefix, namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithParent_KEol1() {
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
    public void testgetExternallyRegisteredNamespaceURI() throws Exception {
        parent = new NamespaceResolver();
        namespaceresolver = new NamespaceResolver(parent);
        Mockito.when(namespaceMap.get(Mockito.anyString())).thenReturn("testURI");
        String prefix = "testPrefix";
        Mockito.when(namespaceMap.get(prefix)).thenReturn(null);
        String result = namespaceresolver.getExternallyRegisteredNamespaceURI(prefix);
        Mockito.verify(namespaceMap).get(prefix);
        Mockito.verify(parent).getExternallyRegisteredNamespaceURI(prefix);
        Assertions.assertEquals("testURI", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrefix_withNamespaceURI_shouldReturnPrefix_udkZ0() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = resolver.getPrefix("namespaceURI");
        assertNotNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrefix_withNamespaceURIAndParentResolver_shouldReturnPrefix_YPAf1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String prefix = resolver.getPrefix("namespaceURI");
        assertNotNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrefix_withNamespaceURIAndNullParentResolver_shouldReturnPrefix_smNv3() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        String prefix = resolver.getPrefix("namespaceURI");
        assertNotNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getPrefix_withNamespaceURIAndParentResolver_shouldReturnCorrectPrefix_Dqtw4() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String prefix = resolver.getPrefix("namespaceURI");
        assertEquals("expectedPrefix", prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI() throws Exception {
        namespaceresolver = new NamespaceResolver();
        String prefix = "prefix";
        String uri = "uri";
        when(namespaceresolver.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(uri);
        when(namespaceresolver.pointer.getNamespaceURI(prefix)).thenReturn(uri);
        assertEquals(uri, namespaceresolver.getNamespaceURI(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testisSealed() throws Exception {
        namespaceresolver = new NamespaceResolver();
        sealed = false;
        when(namespaceresolver.isSealed()).thenReturn(sealed);
        assertEquals(sealed, namespaceresolver.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix_O_ewlr0() throws Exception {
        namespaceresolver = new NamespaceResolver();
        final String namespaceURI = "namespaceURI";
        final String prefix = "prefix";
        when(namespaceresolver.getExternallyRegisteredPrefix(namespaceURI)).thenReturn(prefix);
        final String result = namespaceresolver.getPrefix(namespaceURI);
        assertEquals(prefix, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithParent_KEol1_3() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.registerNamespace("prefix", "namespaceURI");
        assertEquals("namespaceURI", parent.getNamespaceURI("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithParent_KEol1_4() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.registerNamespace("prefix", "namespaceURI");
        assertEquals("prefix", parent.getPrefix("namespaceURI"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix_ZnFS0_fid2() throws Exception {
        namespaceresolver = new NamespaceResolver();
        NodePointer pointer = mock(NodePointer.class);
        String namespaceURI = "namespaceURI";
        String prefix = namespaceresolver.getPrefix(pointer, namespaceURI);
        assertEquals("prefix", prefix);
    }
}