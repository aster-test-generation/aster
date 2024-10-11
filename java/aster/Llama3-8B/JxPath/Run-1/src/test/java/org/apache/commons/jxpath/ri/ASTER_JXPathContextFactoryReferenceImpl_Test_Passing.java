/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;

import java.util.concurrent.TimeUnit;
import org.apache.commons.jxpath.JXPathContext;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathContextFactoryReferenceImpl_Test_Passing {
    @Mock
    private JXPathContext parentContext;
    @Mock
    private Object contextBean;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testnewContext_Exmw0() throws Exception {
        JXPathContextFactoryReferenceImpl jxpathcontextfactoryreferenceimpl = new JXPathContextFactoryReferenceImpl();
        JXPathContext jxpathContext = jxpathcontextfactoryreferenceimpl.newContext(null, null);
        Assertions.assertNotNull(jxpathContext);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewContext_cJWX0_msbt0_1() {
        JXPathContextFactoryReferenceImpl factoryReference = new JXPathContextFactoryReferenceImpl();
        JXPathContext parentContext = null;
        Object contextBean = new QName("prefix", "localName");
        JXPathContext result = factoryReference.newContext(parentContext, contextBean);
        Assertions.assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewContext_cJWX0_msbt0_2() {
        JXPathContextFactoryReferenceImpl factoryReference = new JXPathContextFactoryReferenceImpl();
        JXPathContext parentContext = null;
        Object contextBean = new QName("prefix", "localName");
        JXPathContext result = factoryReference.newContext(parentContext, contextBean);
        Assertions.assertTrue(result instanceof JXPathContext);
    }
}