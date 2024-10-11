/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncOrderSubmitter_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrder_FqgV0() {
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> future = asyncOrderSubmitter.submitOrder(1, true);
    }
}