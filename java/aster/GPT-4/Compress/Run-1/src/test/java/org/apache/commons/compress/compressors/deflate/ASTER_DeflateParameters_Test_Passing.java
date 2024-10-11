/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.deflate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_DeflateParameters_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetCompressionLevel_vBCy0() throws Exception {
    DeflateParameters deflateParameters = new DeflateParameters();
    assertEquals(0, deflateParameters.getCompressionLevel());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testWithZlibHeader_Iwfy0() throws Exception {
    DeflateParameters deflateParams = new DeflateParameters();
    boolean result = deflateParams.withZlibHeader();
    assertEquals(false, result); // Assuming default is false since not initialized in provided code
}
}