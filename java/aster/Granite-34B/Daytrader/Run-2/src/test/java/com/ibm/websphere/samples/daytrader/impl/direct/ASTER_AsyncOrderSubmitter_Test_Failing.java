/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncOrderSubmitter_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrder_vuYi0() {
        Integer orderID = 1;
        boolean twoPhase = true;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
        // Fix the assertion
        // Change the expected or actual value to pass the assertion
        // Change the assertion type to match the return type if needed
        // Only generate the fixed test case
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithZeroOrderID_QnVW1() {
        Integer orderID = 0;
        boolean twoPhase = true;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
        // Fix the assertion
        // Change the expected or actual value to pass the assertion
        // Change the assertion type to match the return type if needed
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithFalseTwoPhase_ARtx2() {
        Integer orderID = 1;
        boolean twoPhase = false;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
        // Fix the erroneous assertion and replace it with the correct one
        // Change the expected or actual value to pass the assertion
        // Change the assertion type to match the return type if needed
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithNullOrderID_CfIV3() {
        Integer orderID = null;
        boolean twoPhase = true;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithNullTwoPhase_snrj4() {
        Integer orderID = 1;
        Boolean twoPhase = null;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
        // Fix the assertion
        // Change the expected or actual value to pass the assertion
        // Change the assertion type to match the return type if needed
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithNullParameters_neUR5() {
        Integer orderID = null;
        Boolean twoPhase = null;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
        // Fix the assertion
        // Change the expected or actual value to pass the assertion
        // Change the assertion type to match the return type if needed
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrder_vuYi0_fid2() {
        Integer orderID = 1;
        boolean twoPhase = true;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithZeroOrderID_QnVW1_fid2() {
        Integer orderID = 0;
        boolean twoPhase = true;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithFalseTwoPhase_ARtx2_fid2() {
        Integer orderID = 1;
        boolean twoPhase = false;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithNullTwoPhase_snrj4_fid2() {
        Integer orderID = 1;
        Boolean twoPhase = null;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitOrderWithNullParameters_neUR5_fid2() {
        Integer orderID = null;
        Boolean twoPhase = null;
        AsyncOrderSubmitter asyncOrderSubmitter = new AsyncOrderSubmitter();
        Future<?> result = asyncOrderSubmitter.submitOrder(orderID, twoPhase);
        assertNotNull(result);
    }
}