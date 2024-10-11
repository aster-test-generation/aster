/**
 * Generated by Aster
 */
package org.apache.commons.compress.harmony.unpack200;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_SegmentConstantPool_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testMatchSpecificPoolEntryIndexNotMatched_fDOb1() {
        Segment segment = new Segment();
        CpBands bands = new CpBands(segment);
        SegmentConstantPool segmentConstantPool = new SegmentConstantPool(bands);
        String[] nameArray = new String[]{"test1", "test2", "test3"};
        String compareString = "test4";
        int desiredIndex = 1;
        int result = segmentConstantPool.matchSpecificPoolEntryIndex(nameArray, compareString, desiredIndex);
        assert result == -1;
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testMatchSpecificPoolEntryIndex5_sfap4() {
    Segment segment = new Segment();
    CpBands bands = new CpBands(segment);
    SegmentConstantPool pool = new SegmentConstantPool(bands);
    String[] primaryArray = new String[]{"a", "b", "c"};
    String[] secondaryArray = new String[]{"d", "e", "f"};
    String primaryCompareString = "x";
    String secondaryCompareRegex = "y";
    int desiredIndex = 0;
    int result = pool.matchSpecificPoolEntryIndex(primaryArray, secondaryArray, primaryCompareString, secondaryCompareRegex, desiredIndex);
    Assertions.assertEquals(-1, result);
}
}