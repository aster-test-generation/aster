/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SimpleCharStream_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit3_ODfz2_eJlb0() {
        char[] buffer = new char[10];
        int[] bufline = new int[10];
        int[] bufcolumn = new int[10];
        int bufferSize = 10;
        int startLine = 1;
        int startColumn = 1;
        SimpleCharStream steam = new SimpleCharStream((java.io.InputStream) null, startLine, startColumn, bufferSize);
        try {
            steam.ReInit((java.io.InputStream) null, startLine, startColumn);
        } catch (Throwable e) {
            fail("Failed with:" + e.getMessage());
        }
    }
}