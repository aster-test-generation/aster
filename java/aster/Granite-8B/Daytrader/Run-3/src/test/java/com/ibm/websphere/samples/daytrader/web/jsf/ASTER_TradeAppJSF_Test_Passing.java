/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeAppJSF_Test_Passing {
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
    private TradeServices tradeServices;
    @InjectMocks
    private TradeAppJSF tradeAppJSF;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testGetCpassword_bAVv0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String actualCpassword = tradeAppJSF.getCpassword();
        assertEquals("correctCpassword", actualCpassword);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetEmail_vUpP0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String email = tradeAppJSF.getEmail();
        assertNotNull(email);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserID_quUC0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String expectedUserID = "expectedUserID"; // Replace with expected value
        String actualUserID = tradeAppJSF.getUserID();
        assertEquals(expectedUserID, actualUserID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFullname_Aisd0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String fullname = tradeAppJSF.getFullname();
        assertNotNull(fullname);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetResults_Slyv0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String tempResults = tradeAppJSF.getResults();
        assertEquals("", tempResults);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setPassword(String password)
    {
        this.password = password;
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setAddress(String address)
    {
        this.address = address;
    }
}