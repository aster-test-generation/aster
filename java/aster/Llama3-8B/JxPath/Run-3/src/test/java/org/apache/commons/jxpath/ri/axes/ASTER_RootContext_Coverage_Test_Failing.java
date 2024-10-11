/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.axes;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_RootContext_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableContext_yaJB0_1() {
        RootContext rootContext = new RootContext(null, null);
        QName variableName = new QName("variableName");
        EvalContext result = rootContext.getVariableContext(variableName);
        assertNotNull(result);}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableContext_yaJB0_2() {
        RootContext rootContext = new RootContext(null, null);
        QName variableName = new QName("variableName");
        EvalContext result = rootContext.getVariableContext(variableName);
        assertEquals(InitialContext.class, result.getClass());}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVariableContext_yaJB0() {
        RootContext rootContext = new RootContext(null, null);
        QName variableName = new QName("variableName");
        EvalContext result = rootContext.getVariableContext(variableName);
        assertNotNull(result);
        assertEquals(InitialContext.class, result.getClass());
}
}