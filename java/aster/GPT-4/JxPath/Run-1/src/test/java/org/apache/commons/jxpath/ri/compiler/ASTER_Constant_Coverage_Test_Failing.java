/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.compiler;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Constant_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithNumber_ZmiM0() {
        Constant constant = new Constant(123);
        assertEquals("Expected output from InfoSetUtil.stringValue", InfoSetUtil.stringValue(123), constant.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToStringWithString_UCVC1() {
        Constant constant = new Constant("test");
        assertEquals("Expected output for string value", "'test'", constant.toString());
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testToStringWithNull_Fwij2_KnxI0() {
    Constant constant = new Constant((String) null);
    assertEquals("Expected output for null value", "'null'", constant.toString());
}
}