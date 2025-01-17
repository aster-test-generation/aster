/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200Strategy_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewStreamBridge1_ZELq0_jgXt0() {
    Pack200Strategy pack200Strategy = Pack200Strategy.IN_MEMORY;
    AbstractStreamBridge abstractStreamBridge = null;
    try {
        abstractStreamBridge = ((Pack200Strategy) pack200Strategy).newStreamBridge();
        assertNotNull(abstractStreamBridge);
    } catch (Exception e) {
        fail();
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testNewStreamBridge2_eTKK1_nmZj0() {
    Pack200Strategy pack200Strategy = Pack200Strategy.IN_MEMORY;
    try {
        AbstractStreamBridge abstractStreamBridge = pack200Strategy.newStreamBridge(); 
        assertNotNull(abstractStreamBridge);
    } catch (IOException e) {
        fail("IOException occurred");
    }
}
}