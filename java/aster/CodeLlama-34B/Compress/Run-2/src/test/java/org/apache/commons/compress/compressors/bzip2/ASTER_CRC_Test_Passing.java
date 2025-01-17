/**
 * Generated by Aster
 */
package org.apache.commons.compress.compressors.bzip2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_CRC_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue1_sgWC0() {
    CRC crc = new CRC();
    int value = crc.getValue();
    assertEquals(0, value);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValue2_MtAo1() {
    CRC crc = new CRC();
    int value = crc.getValue();
}
@Test
@Timeout(value =-1254728196, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetValueCalledWithDifferentValue_jEek13_cnIU0() {
    CRC crc = new CRC();
    crc.update(1,-1254728196);
    int value = crc.getValue();
    assertEquals(1, value);
}
}