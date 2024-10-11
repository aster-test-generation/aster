/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynaBeanPropertyPointer_Coverage_Test_Failing {
    private DynaBeanPropertyPointer dynabeanPropertyPointer;
    private DOMNodePointer domNodePointer;
    private DynaBean dynaBean;
@BeforeEach
    @Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetImmediateNode_PropertyNameIsAsterisk_ukZT0() {
        DOMNodePointer parent = mock(DOMNodePointer.class);
        DynaBean dynaBean = mock(DynaBean.class);
        DynaBeanPropertyPointer pointer = new DynaBeanPropertyPointer(parent, dynaBean);
        when(pointer.getPropertyName()).thenReturn("*");
        assertNull(pointer.getImmediateNode());
    }
}