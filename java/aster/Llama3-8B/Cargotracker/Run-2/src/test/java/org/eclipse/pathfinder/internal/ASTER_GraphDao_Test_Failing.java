/**
 * Generated by Aster
 */
package org.eclipse.pathfinder.internal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_GraphDao_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVoyageNumber_TlXo0() {
        GraphDao graphDao = new GraphDao();
        String result = graphDao.getVoyageNumber("from", "to");
        assertEquals("0100S", result);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetVoyageNumber_TlXo0_fid1() {
        GraphDao graphDao = new GraphDao();
        String result = graphDao.getVoyageNumber("from", "to");
        assertEquals("0300A", result);
    }
}