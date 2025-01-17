/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CoreOperationSubtract_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetPrecedence_lgTf0_ozlJ0() {
    CoreOperationSubtract coreOperationSubtract = new CoreOperationSubtract(new Constant("a"), new Constant("b"));
    int result = coreOperationSubtract.getPrecedence();
    assertEquals(CoreOperationSubtract.ADD_PRECEDENCE, result);
}
}