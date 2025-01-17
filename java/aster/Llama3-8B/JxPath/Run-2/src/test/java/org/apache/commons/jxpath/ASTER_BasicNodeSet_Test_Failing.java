/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_BasicNodeSet_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPointersWhenPointersIsNull_GiXK0() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        List result = basicNodeSet.getPointers();
        assert result == null;
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToString_Moos0_fid2() {
        BasicNodeSet basicNodeSet = new BasicNodeSet();
        String expected = "expected output";
        assertEquals(expected, basicNodeSet.toString());
    }
}