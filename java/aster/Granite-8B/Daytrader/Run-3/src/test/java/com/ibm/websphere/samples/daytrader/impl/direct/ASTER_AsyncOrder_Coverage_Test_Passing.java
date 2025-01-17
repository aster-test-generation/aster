/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.impl.direct;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.transaction.UserTransaction;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_AsyncOrder_Coverage_Test_Passing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRun_rAZo0() {
        AsyncOrder asyncOrder = new AsyncOrder();
        asyncOrder.run();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRunWithBeginException_HyXz1() {
        AsyncOrder asyncOrder = new AsyncOrder();
        try {
            asyncOrder.ut.begin();
        } catch (Exception e) {
            asyncOrder.run();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRunWithCompleteOrderException_alde2() {
        AsyncOrder asyncOrder = new AsyncOrder();
        try {
            asyncOrder.ut.begin();
            asyncOrder.tradeService.completeOrder(1, true);
        } catch (Exception e) {
            asyncOrder.run();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRunWithCommitException_rRoG3() {
        AsyncOrder asyncOrder = new AsyncOrder();
        try {
            asyncOrder.ut.begin();
            asyncOrder.tradeService.completeOrder(1, true);
            asyncOrder.ut.commit();
        } catch (Exception e) {
            asyncOrder.run();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRunWithRollbackException_vkCU4() {
        AsyncOrder asyncOrder = new AsyncOrder();
        try {
            asyncOrder.ut.begin();
            asyncOrder.tradeService.completeOrder(1, true);
            asyncOrder.ut.rollback();
        } catch (Exception e) {
            asyncOrder.run();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRunWithCommitAndRollbackException_xlyU5() {
        AsyncOrder asyncOrder = new AsyncOrder();
        try {
            asyncOrder.ut.begin();
            asyncOrder.tradeService.completeOrder(1, true);
            asyncOrder.ut.commit();
            asyncOrder.ut.rollback();
        } catch (Exception e) {
            asyncOrder.run();
        }
    }
}