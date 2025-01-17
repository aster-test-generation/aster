/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.dynabeans;
import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DynaBeanPropertyPointer_Coverage_Test_Passing {
DynaBean dynaBean;
DOMNodePointer parent;
DynaBeanPropertyPointer dynabeanpropertypointer;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetValue_WithNullValue_xGlj2() throws Exception {
        dynabeanpropertypointer.setValue(null);
        assertNull(dynabeanpropertypointer.getValue()); // assuming getValue() method exists
    }
}