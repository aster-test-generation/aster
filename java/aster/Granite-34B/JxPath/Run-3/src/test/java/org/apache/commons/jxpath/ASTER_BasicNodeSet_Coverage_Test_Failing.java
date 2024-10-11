/**
 * Generated by Aster
 */
package org.apache.commons.jxpath;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_BasicNodeSet_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_xbUm0() {
        BasicNodeSet nodeSet = new BasicNodeSet();
        List pointers = nodeSet.getPointers();
        Assertions.assertEquals(null, pointers);
    }
}