/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.servlet.KeywordVariables;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_NamespaceResolver_Test_Passing {
    private boolean sealed;
    NamespaceResolver namespaceresolver;
    NamespaceResolver parent;
    Map<String, String> map;
    String namespaceURI;
    String prefix;
    Pointer pointer;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testseal() throws Exception {
        namespaceresolver = new NamespaceResolver();
        NamespaceResolver parent = mock(NamespaceResolver.class);
        namespaceresolver = new NamespaceResolver(parent);
        namespaceresolver.seal();
        verify(parent, times(1)).seal();
        assertFalse(sealed);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSealWithParent_Nbwq0_1() {
        NamespaceResolver parent = new NamespaceResolver(null);
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.seal();
        assertTrue(resolver.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSealWithParent_Nbwq0_2() {
        NamespaceResolver parent = new NamespaceResolver(null);
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.seal();
        assertTrue(parent.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSealWithoutParent_KLYF1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.seal();
        assertTrue(resolver.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testKeywordVariables_GvyU0() {
        new KeywordVariables("keyword", new Object());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testVariablePointer_gZqJ1() {
        new VariablePointer(new KeywordVariables("keyword", new Object()), new QName("name"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testQName_seRb4() {
        new QName("qualifiedName");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNamespaceResolver_lVwb5() {
        new NamespaceResolver(new NamespaceResolver(new NamespaceResolver()));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredPrefix_withParentResolver_nQbb0() {
        NamespaceResolver parent = new NamespaceResolver(null);
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String namespaceURI = "someNamespaceURI";
        String expectedPrefix = "somePrefix";
        parent.reverseMap.put(namespaceURI, expectedPrefix);
        String actualPrefix = resolver.getExternallyRegisteredPrefix(namespaceURI);
        assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredPrefix_withoutParentResolver_EKyU1() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        String namespaceURI = "someNamespaceURI";
        String expectedPrefix = "somePrefix";
        resolver.reverseMap.put(namespaceURI, expectedPrefix);
        String actualPrefix = resolver.getExternallyRegisteredPrefix(namespaceURI);
        assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredPrefix_withNullNamespaceURI_WWFp2() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        String namespaceURI = null;
        String expectedPrefix = null;
        String actualPrefix = resolver.getExternallyRegisteredPrefix(namespaceURI);
        assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredPrefix_withUnregisteredNamespaceURI_XXlJ3() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        String namespaceURI = "someNamespaceURI";
        String expectedPrefix = null;
        String actualPrefix = resolver.getExternallyRegisteredPrefix(namespaceURI);
        assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredPrefix_withParentResolverAndUnregisteredNamespaceURI_YpOn4() {
        NamespaceResolver parent = new NamespaceResolver(null);
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String namespaceURI = "someNamespaceURI";
        String expectedPrefix = null;
        String actualPrefix = resolver.getExternallyRegisteredPrefix(namespaceURI);
        assertEquals(expectedPrefix, actualPrefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespace_knkV0_1() {
        NamespaceResolver resolver = new NamespaceResolver(new NamespaceResolver());
        resolver.registerNamespace("prefix", "namespaceURI");
        assertTrue(resolver.namespaceMap.containsKey("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespace_knkV0_2() {
        NamespaceResolver resolver = new NamespaceResolver(new NamespaceResolver());
        resolver.registerNamespace("prefix", "namespaceURI");
        assertTrue(resolver.reverseMap.containsKey("namespaceURI"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithNoParent_mHcN1_1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        assertTrue(resolver.namespaceMap.containsKey("prefix"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithNoParent_mHcN1_2() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        assertTrue(resolver.reverseMap.containsKey("namespaceURI"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetExternallyRegisteredNamespaceURI() throws Exception {
        parent = mock(NamespaceResolver.class);
        namespaceresolver = new NamespaceResolver(parent);
        String prefix = "prefix";
        String uri = "uri";
        when(parent.getExternallyRegisteredNamespaceURI(prefix)).thenReturn(uri);
        assertEquals(uri, namespaceresolver.getExternallyRegisteredNamespaceURI(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredNamespaceURI_withParent_zEIi0() {
        NamespaceResolver parent = new NamespaceResolver(null);
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String prefix = "prefix";
        String expected = "expected";
        parent.namespaceMap.put(prefix, expected);
        String actual = resolver.getExternallyRegisteredNamespaceURI(prefix);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredNamespaceURI_withoutParent_QIZc1() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        String prefix = "prefix";
        String expected = "expected";
        resolver.namespaceMap.put(prefix, expected);
        String actual = resolver.getExternallyRegisteredNamespaceURI(prefix);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredNamespaceURI_withNullPrefix_gpfq2() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        String prefix = null;
        String expected = null;
        String actual = resolver.getExternallyRegisteredNamespaceURI(prefix);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredNamespaceURI_withEmptyPrefix_eSqP3() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        String prefix = "";
        String expected = null;
        String actual = resolver.getExternallyRegisteredNamespaceURI(prefix);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getExternallyRegisteredNamespaceURI_withUnknownPrefix_JKaR4() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        String prefix = "prefix";
        String expected = null;
        String actual = resolver.getExternallyRegisteredNamespaceURI(prefix);
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrefix_withNamespaceURI_sRVt0() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = resolver.getPrefix("namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrefix_withNamespaceURI_andParentResolver_EVwc1() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String prefix = resolver.getPrefix("namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getPrefix_withNamespaceURI_andParentResolver_andRegisteredPrefix_VmPx2() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.getExternallyRegisteredPrefix("namespaceURI");
        String prefix = resolver.getPrefix("namespaceURI");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_withPrefix_iOQV0() {
        NamespaceResolver resolver = new NamespaceResolver(new NamespaceResolver());
        String prefix = "prefix";
        String expected = resolver.getNamespaceURI(prefix);
        assertEquals(expected, resolver.getNamespaceURI(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_withoutPrefix_cgHb1() {
        NamespaceResolver resolver = new NamespaceResolver();
        String prefix = null;
        String expected = resolver.getNamespaceURI(prefix);
        assertEquals(expected, resolver.getNamespaceURI(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceURI_withParentResolver_LhqC2() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver resolver = new NamespaceResolver(parent);
        String prefix = "prefix";
        String expected = resolver.getNamespaceURI(prefix);
        assertEquals(expected, resolver.getNamespaceURI(prefix));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceContextPointer() throws Exception {
        parent = mock(NamespaceResolver.class);
        pointer = mock(Pointer.class);
        namespaceresolver = new NamespaceResolver(parent);
        when(parent.getNamespaceContextPointer()).thenReturn(pointer);
        Pointer result = namespaceresolver.getNamespaceContextPointer();
        verify(parent, atMostOnce()).getNamespaceContextPointer();
        verifyNoMoreInteractions(parent);
        assertEquals(pointer, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WithParentAndPointerNull_kNkR0() {
        NamespaceResolver parent = new NamespaceResolver(new NamespaceResolver());
        NamespaceResolver resolver = new NamespaceResolver(parent);
        Pointer result = resolver.getNamespaceContextPointer();
        assertEquals(parent.getNamespaceContextPointer(), result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_WithoutParent_QzrK2() {
        NamespaceResolver resolver = new NamespaceResolver();
        Pointer result = resolver.getNamespaceContextPointer();
        assertEquals(null, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testIsSealed_rIRH0() {
        NamespaceResolver resolver = new NamespaceResolver();
        boolean result = resolver.isSealed();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix_fgKr0() throws Exception {
        namespaceresolver = new NamespaceResolver();
        NodePointer pointer = mock(NodePointer.class);
        String namespaceURI = "namespaceURI";
        String prefix = namespaceresolver.getPrefix(pointer, namespaceURI);
        assertNull(prefix);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSealWithParent_Nbwq0() {
        NamespaceResolver parent = new NamespaceResolver(null);
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.seal();
        assertTrue(resolver.isSealed());
        assertTrue(parent.isSealed());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespace_knkV0() {
        NamespaceResolver resolver = new NamespaceResolver(new NamespaceResolver());
        resolver.registerNamespace("prefix", "namespaceURI");
        assertTrue(resolver.namespaceMap.containsKey("prefix"));
        assertTrue(resolver.reverseMap.containsKey("namespaceURI"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceWithNoParent_mHcN1() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("prefix", "namespaceURI");
        assertTrue(resolver.namespaceMap.containsKey("prefix"));
        assertTrue(resolver.reverseMap.containsKey("namespaceURI"));
    }
}