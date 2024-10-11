/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeAppJSF_Test_Failing {
    private TradeServices tradeAction;
    private String userID = "uid:0";
    @Mock
    TradeAppJSF tradeappjsf;
    @Mock
    HttpSession httpsession;
    @Mock
    ExternalContext externalcontext;
    @Mock
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
    public void testGetCcn_aQGc0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        String ccn = tradeAppJSF.getCcn();
        assertNotNull(ccn);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLogin() throws Exception {
        httpsession = mock(HttpSession.class);
        externalcontext = mock(ExternalContext.class);
        tradeappjsf = new TradeAppJSF(Mockito.mock(Instance.class));
        when(externalcontext.getSession(any())).thenReturn(httpsession);
        when(httpsession.getAttribute("uidBean")).thenReturn(userID);
        when(httpsession.getAttribute("sessionCreationDate")).thenReturn(new java.util.Date());
        String result = tradeappjsf.login();
        verify(httpsession, times(1)).setAttribute("uidBean", userID);
        verify(httpsession, times(1)).setAttribute("sessionCreationDate", new java.util.Date());
        assertEquals("Ready to Trade", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testLoginWithException() throws Exception {
        httpsession = mock(HttpSession.class);
        externalcontext = mock(ExternalContext.class);
        tradeappjsf = new TradeAppJSF(Mockito.mock(Instance.class));
        when(externalcontext.getSession(any())).thenReturn(httpsession);
        when(httpsession.getAttribute("uidBean")).thenReturn(null);
        when(httpsession.getAttribute("sessionCreationDate")).thenReturn(null);
        String result = tradeappjsf.login();
        verify(httpsession, never()).setAttribute("uidBean", userID);
        verify(httpsession, never()).setAttribute("sessionCreationDate", new java.util.Date());
        assertEquals("welcome", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testRegister() throws Exception {
        httpsession = mock(HttpSession.class);
        externalcontext = mock(ExternalContext.class);
        tradeappjsf = new TradeAppJSF(Mockito.mock(Instance.class));
        when(externalcontext.getSession(any())).thenReturn(httpsession);
        when(httpsession.getAttribute("TradeAppJSF")).thenReturn(tradeappjsf);
        String result = tradeappjsf.register();
        verify(tradeappjsf, times(1)).register();
        assertEquals("Registration operation succeeded", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetUserID_AdZe0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(Mockito.mock(Instance.class));
        String userID = tradeAppJSF.getUserID();
        assertNotNull(userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAddress_ntIo0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String address = tradeAppJSF.getAddress();
        assertNotNull(address);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetPassword_dQEn0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String password = tradeAppJSF.getPassword();
        assertNotNull(password);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetFullname_ZnRM0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        String fullname = tradeAppJSF.getFullname();
        assertNotNull(fullname);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCcn_HBQG0_LQqp0() {
        TradeAppJSF tradeAppJSF = new TradeAppJSF(null);
        tradeAppJSF.setCcn("123456789");
        assertEquals("123456789", tradeAppJSF.getCcn());
    }
}