/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;

import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.websocket.EncodeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_QuotePriceChangeListEncoder_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDestroy_GmRh0() {
        QuotePriceChangeListEncoder quotePriceChangeListEncoder = new QuotePriceChangeListEncoder();
        quotePriceChangeListEncoder.destroy();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyList_syct0_1() throws EncodeException {
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        String encodedList = encoder.encode(list);
        assertNotNull(encodedList);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyList_syct0_2() throws EncodeException {
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        String encodedList = encoder.encode(list);
        assertTrue(encodedList.isEmpty());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncodeWithEmptyList_syct0() throws EncodeException {
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        String encodedList = encoder.encode(list);
        assertNotNull(encodedList);
        assertTrue(encodedList.isEmpty());
    }
}