/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.pack200;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_Pack200Strategy_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStreamBridgeInMemory_TKwn0() throws IOException {
        Pack200Strategy strategy = Pack200Strategy.IN_MEMORY;
        AbstractStreamBridge bridge = strategy.newStreamBridge();
        assertNotNull(bridge);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStreamBridgeTempFile_YGcs1() throws IOException {
        Pack200Strategy strategy = Pack200Strategy.TEMP_FILE;
        AbstractStreamBridge bridge = strategy.newStreamBridge();
        assertNotNull(bridge);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStreamBridgeInMemoryInstanceType_LsPw4() throws IOException {
        Pack200Strategy strategy = Pack200Strategy.IN_MEMORY;
        AbstractStreamBridge bridge = strategy.newStreamBridge();
        assertTrue(bridge instanceof AbstractStreamBridge);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStreamBridgeTempFileInstanceType_aZIH5() throws IOException {
        Pack200Strategy strategy = Pack200Strategy.TEMP_FILE;
        AbstractStreamBridge bridge = strategy.newStreamBridge();
        assertTrue(bridge instanceof AbstractStreamBridge);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStreamBridgeInMemoryHandlesException_nNNz8() throws Exception {
        Pack200Strategy strategy = Pack200Strategy.IN_MEMORY;
        try {
            AbstractStreamBridge bridge = strategy.newStreamBridge();
            assertNotNull(bridge);
        } catch (IOException e) {
            fail("Should not throw IOException");
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNewStreamBridgeTempFileHandlesException_DAcO9() throws Exception {
        Pack200Strategy strategy = Pack200Strategy.TEMP_FILE;
        try {
            AbstractStreamBridge bridge = strategy.newStreamBridge();
            assertNotNull(bridge);
        } catch (IOException e) {
            fail("Should not throw IOException");
        }
    }
}