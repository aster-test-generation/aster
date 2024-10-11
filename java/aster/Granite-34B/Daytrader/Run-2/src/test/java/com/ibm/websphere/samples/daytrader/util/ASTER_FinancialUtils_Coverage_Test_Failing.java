/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.util;

import com.ibm.websphere.samples.daytrader.entities.HoldingDataBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_FinancialUtils_Coverage_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testPrintChangeHTML_4_OCKo3() {
        double change = -0.0;
        String htmlString = FinancialUtils.printChangeHTML(change);
        assertEquals("<FONT color=\"#ff0000\">0.0</FONT><IMG src=\"images/arrowdown.gif\" width=\"10\" height=\"10\" border=\"0\"></IMG>", htmlString);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeHoldingsTotal_03_NCNC2_Jzhh0() {
        HoldingDataBean holdingData = new HoldingDataBean();
        Collection<HoldingDataBean> holdingDataBeans = new ArrayList<HoldingDataBean>();
        holdingDataBeans.add(holdingData);
        BigDecimal holdingsTotal = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
        assertEquals(holdingsTotal, new BigDecimal(0.0).setScale(FinancialUtils.SCALE));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testComputeHoldingsTotal_05_DjSZ4_qptd0() {
        HoldingDataBean holdingData1 = new HoldingDataBean();
        HoldingDataBean holdingData2 = new HoldingDataBean();
        Collection<HoldingDataBean> holdingDataBeans = new ArrayList<HoldingDataBean>();
        holdingDataBeans.add(holdingData1);
        holdingDataBeans.add(holdingData2);
        holdingData1.setPurchasePrice(new BigDecimal(100.0));
        holdingData1.setQuantity(10);
        holdingData2.setPurchasePrice(new BigDecimal(200.0));
        holdingData2.setQuantity(20);
        BigDecimal holdingsTotal = FinancialUtils.computeHoldingsTotal(holdingDataBeans);
        assertEquals(holdingsTotal, new BigDecimal(3000.0).setScale(FinancialUtils.SCALE));
    }
}