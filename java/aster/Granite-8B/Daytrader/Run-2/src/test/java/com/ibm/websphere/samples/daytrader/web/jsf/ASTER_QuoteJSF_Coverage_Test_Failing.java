/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_QuoteJSF_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_DBIf0() {
        QuoteJSF quoteJSF = new QuoteJSF(null);
        quoteJSF.getAllQuotes();
    }
}