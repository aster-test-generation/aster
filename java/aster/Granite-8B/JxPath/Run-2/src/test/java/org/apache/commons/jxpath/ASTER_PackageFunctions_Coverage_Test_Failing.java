/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PackageFunctions_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNullNamespace_RYJh0() {
        final PackageFunctions packageFunctions = new PackageFunctions("com.example", null);
        final Function function = packageFunctions.getFunction(null, "test", new Object[0]);
        assertNull(function);
}
}