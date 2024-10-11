/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_FunctionLibrary_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUsedNamespaces_QGam0() {
        FunctionLibrary functionLibrary = new FunctionLibrary();
        Set<String> expected = new HashSet<>();
        Set<String> actual = functionLibrary.getUsedNamespaces();
        assertEquals(expected, actual);
    }
}