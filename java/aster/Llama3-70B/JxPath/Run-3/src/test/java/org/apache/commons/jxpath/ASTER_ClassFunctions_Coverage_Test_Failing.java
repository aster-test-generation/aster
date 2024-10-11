/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_ClassFunctions_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_ConstructorNull_YfVj1() {
        ClassFunctions classFunctions = new ClassFunctions(String.class, "namespace");
        Object[] parameters = new Object[] { "arg1" };
        Function function = classFunctions.getFunction("namespace", "new", parameters);
        assert function == null;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFunction_NullNamespace_muVO6() {
        ClassFunctions classFunctions = new ClassFunctions(String.class, null);
        Object[] parameters = new Object[] { "arg1" };
        Function function = classFunctions.getFunction(null, "new", parameters);
        assert function == null;
    }
}