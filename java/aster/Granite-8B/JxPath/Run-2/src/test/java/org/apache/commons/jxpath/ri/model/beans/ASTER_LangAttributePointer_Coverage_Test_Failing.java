/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.model.beans;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_LangAttributePointer_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetImmediateNode_iQPk0() {
        LangAttributePointer langAttributePointer = new LangAttributePointer(null);
        Object immediateNode = langAttributePointer.getImmediateNode();
        assertNotNull(immediateNode);
    }
}