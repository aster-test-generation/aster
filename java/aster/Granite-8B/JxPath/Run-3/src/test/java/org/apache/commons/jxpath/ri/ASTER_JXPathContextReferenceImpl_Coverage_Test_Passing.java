/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.Pointer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_JXPathContextReferenceImpl_Coverage_Test_Passing {
    {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testcreatePath_OIpa1() throws Exception {
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIteratePointers_JUsi0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jxpathContextReferenceImpl.iteratePointers("xpath");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testIterate_CGgt0() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        context.iterate("xpath");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateConditionally1_laEb0() {
        try {
            throw new ClassNotFoundException();
        } catch (final ClassNotFoundException ex) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testAllocateConditionally3_jRRX2() {
        try {
            throw new Exception();
        } catch (final Exception ex) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetPrefix_yWTU0() {
        JXPathContextReferenceImpl context = new JXPathContextReferenceImpl(null, null);
        String namespaceURI = "namespaceURI";
        String prefix = context.getPrefix(namespaceURI);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetNamespaceContextPointer_lYjf0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        Pointer pointer = jxpathContextReferenceImpl.getNamespaceContextPointer();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCompilePath_eVOw0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jxpathContextReferenceImpl.compilePath("xpath");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegisterNamespaceNotSealed_SkTf0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jxpathContextReferenceImpl.registerNamespace(null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetNamespaceURI_Nork0() {
        JXPathContextReferenceImpl jxpathContextReferenceImpl = new JXPathContextReferenceImpl(null, null);
        jxpathContextReferenceImpl.getNamespaceURI(null);
    }
}