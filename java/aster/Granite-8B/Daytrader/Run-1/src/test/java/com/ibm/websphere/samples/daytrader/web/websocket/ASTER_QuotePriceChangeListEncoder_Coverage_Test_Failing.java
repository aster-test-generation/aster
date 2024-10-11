/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.websocket;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.websocket.EncodeException;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuotePriceChangeListEncoder_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void testDestroy_JNct0() {
		QuotePriceChangeListEncoder quotePriceChangeListEncoder = new QuotePriceChangeListEncoder();
		quotePriceChangeListEncoder.destroy();
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testInit_uGie0() {
	QuotePriceChangeListEncoder quotePriceChangeListEncoder = new QuotePriceChangeListEncoder();
	quotePriceChangeListEncoder.init(null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode1_nNCt0() throws javax.websocket.EncodeException {
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        list.add(new QuoteDataBean());
        String encodedString = encoder.encode(list);
        assertNotNull(encodedString);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode2_qzVp1() throws javax.websocket.EncodeException {
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        String encodedString = encoder.encode(list);
        assertNotNull(encodedString);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode3_SRWk2() throws javax.websocket.EncodeException {
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        String encodedString = encoder.encode(list);
        assertNotNull(encodedString);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode4_vuqI3() throws javax.websocket.EncodeException {
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        String encodedString = encoder.encode(list);
        assertNotNull(encodedString);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode5_ZAUj4() throws javax.websocket.EncodeException {
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        String encodedString = encoder.encode(list);
        assertNotNull(encodedString);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode6_EQbf5() throws javax.websocket.EncodeException {
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        String encodedString = encoder.encode(list);
        assertNotNull(encodedString);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode7_YnfK6() throws javax.websocket.EncodeException {
        QuotePriceChangeListEncoder encoder = new QuotePriceChangeListEncoder();
        CopyOnWriteArrayList<QuoteDataBean> list = new CopyOnWriteArrayList<>();
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        list.add(new QuoteDataBean());
        String encodedString = encoder.encode(list);
        assertNotNull(encodedString);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testEncode8_RFbO7() throws javax.websocket.EncodeException {
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
        String encodedString = encoder.encode(list);
        assertNotNull(encodedString);
    }
}