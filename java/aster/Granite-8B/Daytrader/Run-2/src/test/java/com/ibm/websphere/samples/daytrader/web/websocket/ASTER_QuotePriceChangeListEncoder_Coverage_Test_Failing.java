/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.websocket.EncodeException;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuotePriceChangeListEncoder_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDestroy_OJzz0() {
		QuotePriceChangeListEncoder quotePriceChangeListEncoder = new QuotePriceChangeListEncoder();
		quotePriceChangeListEncoder.destroy();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_MDWG0() {
	QuotePriceChangeListEncoder quotePriceChangeListEncoder = new QuotePriceChangeListEncoder();
	quotePriceChangeListEncoder.init(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_Esij0() throws javax.websocket.EncodeException {
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        String actual = encoder.encode(list);
        String expected = "";
        assertEquals(expected, actual);
}
}