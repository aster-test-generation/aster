/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.ri.parser;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_SimpleCharStream_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testReInit_Asir0() {
        SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.InputStreamReader(System.in), 1, 1, 4096);
        simpleCharStream.ReInit(new java.io.InputStreamReader(System.in), 1, 1, 4096);
    }
}