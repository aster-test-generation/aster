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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathContextFactoryReferenceImpl_Test_Passing {
    JXPathContextFactoryReferenceImpl jxpathcontextfactoryreferenceimpl;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnewContext() throws Exception {
        jxpathcontextfactoryreferenceimpl = new JXPathContextFactoryReferenceImpl();
        JXPathContext parentContext = mock(JXPathContext.class);
        Object contextBean = new Object();
        JXPathContext actual = jxpathcontextfactoryreferenceimpl.newContext(parentContext, contextBean);
        assertNotNull(actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewContext_YAjq0_igbu0() {
        JXPathContextFactoryReferenceImpl jXPathContextFactoryReferenceImpl = new JXPathContextFactoryReferenceImpl();
        JXPathContext parentContext = new JXPathContextReferenceImpl(null, null);
        Object contextBean = new Object();
        JXPathContext result = jXPathContextFactoryReferenceImpl.newContext(parentContext, contextBean);
        assertEquals(JXPathContextReferenceImpl.class, result.getClass());
    }
}