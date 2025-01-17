/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathContextFactoryReferenceImpl_Test_Passing {
    @Mock
    private JXPathContext parentContext;
    @Mock
    private Object contextBean;
    @Mock
    private JXPathContextReferenceImpl jxpathContextReferenceImpl;
    private JXPathContextFactoryReferenceImpl jxpathcontextfactoryreferenceimpl;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnewContext_1() throws Exception {
        jxpathcontextfactoryreferenceimpl = new JXPathContextFactoryReferenceImpl();
        // When
        JXPathContext result = jxpathcontextfactoryreferenceimpl.newContext(parentContext, contextBean);
        // Then
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnewContext_2() throws Exception {
        jxpathcontextfactoryreferenceimpl = new JXPathContextFactoryReferenceImpl();
        // When
        JXPathContext result = jxpathcontextfactoryreferenceimpl.newContext(parentContext, contextBean);
        // Then
        assertEquals(jxpathContextReferenceImpl.getClass(), result.getClass());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewContext_SnBF0_wmAH0() {
        JXPathContextFactoryReferenceImpl factory = new JXPathContextFactoryReferenceImpl();
        JXPathContextReferenceImpl parentContextReference = new JXPathContextReferenceImpl(null, new Object());
        Object contextBean = new Object();
        JXPathContext context = factory.newContext(null, contextBean);
        assertNotNull(context);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnewContext() throws Exception {
        jxpathcontextfactoryreferenceimpl = new JXPathContextFactoryReferenceImpl();
        // When
        JXPathContext result = jxpathcontextfactoryreferenceimpl.newContext(parentContext, contextBean);
        // Then
        assertNotNull(result);
        assertEquals(jxpathContextReferenceImpl.getClass(), result.getClass());
    }
}