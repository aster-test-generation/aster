/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri;
import org.apache.commons.jxpath.JXPathContext;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.InjectMocks;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_JXPathContextFactoryReferenceImpl_Test_Passing {
@InjectMocks
    private JXPathContextFactoryReferenceImpl jxpathcontextfactoryreferenceimpl;
@Mock
    private JXPathContext parentContext;
@Mock
    private Object contextBean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewContext_ISER0() {
    JXPathContext parentContext = mock(JXPathContext.class);
    Object contextBean = new Object();
    JXPathContextFactoryReferenceImpl factory = new JXPathContextFactoryReferenceImpl();
    JXPathContext result = factory.newContext(parentContext, contextBean);
    assertNotNull(result);
    assertTrue(result instanceof JXPathContextReferenceImpl);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewContext_ISER0_1() {
    JXPathContext parentContext = mock(JXPathContext.class);
    Object contextBean = new Object();
    JXPathContextFactoryReferenceImpl factory = new JXPathContextFactoryReferenceImpl();
    JXPathContext result = factory.newContext(parentContext, contextBean);
    assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewContext_ISER0_2() {
    JXPathContext parentContext = mock(JXPathContext.class);
    Object contextBean = new Object();
    JXPathContextFactoryReferenceImpl factory = new JXPathContextFactoryReferenceImpl();
    JXPathContext result = factory.newContext(parentContext, contextBean);
    assertTrue(result instanceof JXPathContextReferenceImpl);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewContext_vELU0() throws Exception {
    JXPathContextFactoryReferenceImpl jxpathcontextfactoryreferenceimpl = new JXPathContextFactoryReferenceImpl();
    JXPathContext parentContext = mock(JXPathContext.class);
    Object contextBean = new Object();
    JXPathContext expectedContext = new JXPathContextReferenceImpl(parentContext, contextBean);
    JXPathContext resultContext = jxpathcontextfactoryreferenceimpl.newContext(parentContext, contextBean);
}
}