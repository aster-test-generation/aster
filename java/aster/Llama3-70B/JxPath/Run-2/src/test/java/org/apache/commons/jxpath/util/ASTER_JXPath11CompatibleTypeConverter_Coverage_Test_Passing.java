/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.util;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_JXPath11CompatibleTypeConverter_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testCanConvert_NotNodeSetInstance_Ysxd1() {
        JXPath11CompatibleTypeConverter converter = new JXPath11CompatibleTypeConverter();
        Object object = new Object();
        Class<String> toType = String.class;
        boolean result = converter.canConvert(object, toType);
    }
}