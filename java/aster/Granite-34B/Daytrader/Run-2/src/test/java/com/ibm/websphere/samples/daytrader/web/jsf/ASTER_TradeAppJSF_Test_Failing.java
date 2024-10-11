/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeAppJSF_Test_Failing {
    private TradeServices tradeAction;
    private String userID = "uid:0";
    TradeAppJSF tradeappjsf;
    HttpSession httpsession;
    ExternalContext externalcontext;
    HttpServletRequest httpservletrequest;
    private String password = "xxx";
    private String email;
    private String money;
    private String fullname;
    private String address;
    private String ccn;
    private String cpassword;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void logoutTest2_pXtR1() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String result = tradeAppJSF.logout();
        assertEquals("welcome", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateProfile_NullTradeServices_Qeyb0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String result = tradeAppJSF.updateProfile();
        assertEquals("Go to account", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_fVPj0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        String result = tradeAppJSF.login();
        assertEquals("Ready to Trade", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullAccountData_DVLn1() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String result = tradeAppJSF.login();
        assertEquals("login failed", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegister_TVyF0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        String result = tradeAppJSF.register();
        Assertions.assertEquals("Registration operation failed", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getResults_1_OuOy0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String results = "results";
        String tempResults = results;
        results = "";
        String result = tradeAppJSF.getResults();
        assertEquals(tempResults, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getResults_2_ddgn1() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String results = "results";
        String tempResults = results;
        results = "";
        String result = tradeAppJSF.getResults();
        assertEquals(results, result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCcnTest_ieeh1_oerx0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        tradeAppJSF.setCcn("123456");
        String ccn = tradeAppJSF.getCcn();
        assertEquals("123456", ccn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCcnTest_ugos4_nCfw0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        tradeAppJSF.setCcn(null);
        String ccn = tradeAppJSF.getCcn();
        assertEquals(null, ccn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCcnTest_jRAd5_cSdC0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        tradeAppJSF.setCcn(null);
        tradeAppJSF.setCcn("123456");
        String ccn = tradeAppJSF.getCcn();
        assertEquals("123456", ccn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCcnTest_ZhpM6_ItBN0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        tradeAppJSF.setCcn(null);
        tradeAppJSF.setCcn(null);
        String ccn = tradeAppJSF.getCcn();
        Assertions.assertEquals(null, ccn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCcnTest_IgQf7_oWcy0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        tradeAppJSF.setCcn("123456");
        tradeAppJSF.setCcn("123456");
        String ccn = tradeAppJSF.getCcn();
        assertEquals("123456", ccn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void getCcnTest_aNsk8_xFWI0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        tradeAppJSF.setCcn("123456");
        tradeAppJSF.setCcn("654321");
        tradeAppJSF.setCcn("123456");
        String ccn = tradeAppJSF.getCcn();
        assertEquals("123456", ccn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetUserIDNull_TEFc1_Ygwi0() {
        TradeAppJSF tradeApp = new TradeAppJSF(null);
        tradeApp.setUserID(null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin_fVPj0_fid1() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String result = tradeAppJSF.login();
        assertEquals("Ready to Trade", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithNullAccountData_DVLn1_fid1() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String result = tradeAppJSF.login();
        assertEquals("Could not find account", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegister_TVyF0_fid1() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String result = tradeAppJSF.register();
        Assertions.assertEquals("Registration operation failed", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test_getResults_2_ddgn1_fid1() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String results = "results";
        String tempResults = results;
        results = "";
        String result = tradeAppJSF.getResults();
        assertEquals("", result);
    }
}