/**
 * Generated by Aster
 */
package org.apache.commons.codec.language;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_DoubleMetaphone_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testContains2_JCXQ1_fid2() {
        String[] criteria = {"abc", "def", "ghi"};
        String value = "abcdefghi";
        int start = 3;
        int length = 3;
        boolean expected = false;
        boolean actual = DoubleMetaphone.contains(value, start, length, criteria);
        assertEquals(expected, actual);
    }
}