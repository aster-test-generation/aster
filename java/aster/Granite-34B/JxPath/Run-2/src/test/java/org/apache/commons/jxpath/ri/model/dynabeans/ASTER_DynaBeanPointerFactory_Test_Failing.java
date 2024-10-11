/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_DynaBeanPointerFactory_Test_Failing {
    private static final int DYNA_BEAN_POINTER_FACTORY_ORDER = 0;
    DynaBeanPointerFactory dynabeanpointerfactory;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrder_MZAK0() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        int order = factory.getOrder();
        assert order == DYNA_BEAN_POINTER_FACTORY_ORDER;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithDYNA_BEAN_POINTER_FACTORY_ORDER_PlusOne_ofGQ3() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        int order = factory.getOrder();
        assert order == DYNA_BEAN_POINTER_FACTORY_ORDER + 1;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithDYNA_BEAN_POINTER_FACTORY_ORDER_MinusOne_kNVV4() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        int order = factory.getOrder();
        assert order == DYNA_BEAN_POINTER_FACTORY_ORDER - 1;
    }

    @Test
    public void testGetOrder_MZAK700_dKwk700() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        int order = factory.getOrder();
        assertEquals(DYNA_BEAN_POINTER_FACTORY_ORDER, order);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithDYNA_BEAN_POINTER_FACTORY_ORDER_MinusOne_kNVV4_ykWL0() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        int order = factory.getOrder();
        assertEquals(DYNA_BEAN_POINTER_FACTORY_ORDER - 1, order);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOrderWithDYNA_BEAN_POINTER_FACTORY_ORDER_PlusOne_ofGQ3_tQpg0_fid2() {
        DynaBeanPointerFactory factory = new DynaBeanPointerFactory();
        int order = factory.getOrder();
        assertEquals(DYNA_BEAN_POINTER_FACTORY_ORDER + 1, order);
    }
}