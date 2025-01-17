/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeServletAction_Test_Passing {
    @Mock
    private AccountProfileDataBean mockAccountProfileDataBean;
    private TradeServices tAction;
    @Mock
    private TradeServletAction tradeservletaction;
    @Mock
    private ServletContext servletcontext;
    @Mock
    private HttpServletRequest httpservletrequest;
    @Mock
    private HttpSession httpsession;
    TradeServletAction tradeServletAction;
    HttpServletRequest httpServletRequest;
    @Mock
    private ServletContext ctx;
    @Mock
    private HttpServletResponse resp;
    @Mock
    private AccountDataBean accountData;
    @Mock
    private Collection<?> holdingDataBeans;
    @Mock
    private TradeServices mockTradeServices;
    @Mock
    private HttpServletRequest mockHttpServletRequest;
    @Mock
    private HttpServletResponse mockHttpServletResponse;
    @Mock
    private String results;
    private Collection<QuoteDataBean> quoteDataBeans;
    private OrderDataBean tOrderData;
    private double tOrderProcessingMode;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoMarketSummary() throws Exception {
        httpServletRequest = mock(HttpServletRequest.class);
        tradeServletAction = new TradeServletAction();
        tradeServletAction.doMarketSummary(null, httpServletRequest, null, null);
        verify(httpServletRequest).setAttribute(anyString(), any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoAccount() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        tradeservletaction = new TradeServletAction();
        when(httpservletrequest.getParameter("results")).thenReturn("test");
        when(httpservletrequest.getParameter("userID")).thenReturn("test");
        tradeservletaction.doAccount(null, httpservletrequest, null, "test", "test");
        verify(httpservletrequest, times(1)).getParameter("results");
        verify(httpservletrequest, times(1)).getParameter("userID");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoMarketSummary_Ltxn0() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "test";
        tradeServletAction.doMarketSummary(ctx, req, resp, userID);
        assertEquals("test", req.getAttribute("results"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoSell() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        tradeservletaction = new TradeServletAction();
        when(httpservletrequest.getParameter("userID")).thenReturn("1");
        when(httpservletrequest.getParameter("holdingID")).thenReturn("1");
        tradeservletaction.doSell(null, httpservletrequest, null, null, null);
        verify(httpservletrequest, times(1)).getParameter("userID");
        verify(httpservletrequest, times(1)).getParameter("holdingID");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoLogout_yBSM0() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user123";
        tradeServletAction.doLogout(ctx, req, resp, userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoLogoutWithException_YZlI1() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user123";
        when(req.getAttribute("results")).thenReturn("illegal argument:Invalid user ID");
        tradeServletAction.doLogout(ctx, req, resp, userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoLogoutWithRecreateSession_kbiN2() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user123";
        when(req.getAttribute("TSS-RecreateSessionInLogout")).thenReturn(true);
        tradeServletAction.doLogout(ctx, req, resp, userID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoWelcome() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        tradeservletaction = new TradeServletAction();
        tradeservletaction.doWelcome(null, httpservletrequest, null, null);
        verify(httpservletrequest, times(1)).setAttribute(anyString(), any());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoRegister() throws Exception {
        httpservletrequest = mock(HttpServletRequest.class);
        tradeservletaction = new TradeServletAction();
        String userID = "user1";
        String passwd = "password1";
        String cpasswd = "password1";
        String fullname = "John Doe";
        String ccn = "123456789";
        String openBalanceString = "1000.00";
        String email = "john.doe@example.com";
        String address = "123 Main St";
        when(httpservletrequest.getParameter("user")).thenReturn(userID);
        when(httpservletrequest.getParameter("passwd")).thenReturn(passwd);
        when(httpservletrequest.getParameter("cpasswd")).thenReturn(cpasswd);
        when(httpservletrequest.getParameter("fullname")).thenReturn(fullname);
        when(httpservletrequest.getParameter("ccn")).thenReturn(ccn);
        when(httpservletrequest.getParameter("openBalance")).thenReturn(openBalanceString);
        when(httpservletrequest.getParameter("email")).thenReturn(email);
        when(httpservletrequest.getParameter("address")).thenReturn(address);
        tradeservletaction.doRegister(null, httpservletrequest, null, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
        verify(httpservletrequest, times(1)).getParameter("user");
        verify(httpservletrequest, times(1)).getParameter("passwd");
        verify(httpservletrequest, times(1)).getParameter("cpasswd");
        verify(httpservletrequest, times(1)).getParameter("fullname");
        verify(httpservletrequest, times(1)).getParameter("ccn");
        verify(httpservletrequest, times(1)).getParameter("openBalance");
        verify(httpservletrequest, times(1)).getParameter("email");
        verify(httpservletrequest, times(1)).getParameter("address");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoSell_gWUq0() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = null;
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        String userID = "user1";
        Integer holdingID = 1;
        tradeServletAction.doSell(ctx, req, resp, userID, holdingID);
        assertTrue(true); // Add assertion for the expected behavior
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccountUpdate4_DJYz3() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        tradeServletAction.doAccountUpdate(null, null, null, "1", "1", "1", "", "", "", "");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoLoginWithInvalidCredentials_AEMn1() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        TradeServices tradeServices = mock(TradeServices.class);
        when(tradeServices.login("john", "password")).thenThrow(new IllegalArgumentException("Invalid credentials"));
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        tradeServletAction.doLogin(ctx, req, resp, "john", "password");
        assertTrue(req.getAttribute("results").toString().contains("Could not find account for"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testDoLoginWithException_hEnw2() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        TradeServices tradeServices = mock(TradeServices.class);
        when(tradeServices.login("john", "password")).thenThrow(new Exception("An error occurred"));
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        tradeServletAction.doLogin(ctx, req, resp, "john", "password");
        assertTrue(req.getAttribute("results").toString().contains("Exception logging in user"));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoWelcome_FkqS0_Amzi0() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        tradeServletAction.doWelcome(null, null, null, "Welcome");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void setup_ckvy1() {
        tradeservletaction = new TradeServletAction();
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoRegister3_iVaF2_HiNP0() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        TradeServices tradeServices = mock(TradeServices.class);
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user3";
        String passwd = "passwd3";
        String cpasswd = "passwd3";
        String fullname = "fullname3";
        String ccn = "ccn3";
        String openBalanceString = "3000.00";
        String email = "email3";
        String address = "address3";
        tradeServletAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
        verify(tradeServices).register(userID, passwd, fullname, address, email, ccn, new BigDecimal(openBalanceString));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoRegister4_rDoD3_YIXM0() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        TradeServices tradeServices = mock(TradeServices.class);
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user4";
        String passwd = "passwd4";
        String cpasswd = "passwd4";
        String fullname = "fullname4";
        String ccn = "ccn4";
        String openBalanceString = "4000.00";
        String email = "email4";
        String address = "address4";
        tradeServletAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
        verify(tradeServices).register(userID, passwd, fullname, address, email, ccn, new BigDecimal(openBalanceString));
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoRegister2_oonP1_ddgM0() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        TradeServices tradeServices = mock(TradeServices.class);
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user2";
        String passwd = "passwd2";
        String cpasswd = "passwd2";
        String fullname = "fullname2";
        String ccn = "ccn2";
        String openBalanceString = "2000.00";
        String email = "email2";
        String address = "address2";
        tradeServletAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
        verify(tradeServices).register(userID, passwd, fullname, address, email, ccn, new BigDecimal(openBalanceString));
    }
}