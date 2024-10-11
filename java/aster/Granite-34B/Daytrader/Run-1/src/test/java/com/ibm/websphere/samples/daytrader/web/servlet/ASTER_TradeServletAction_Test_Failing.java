/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockServletContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeServletAction_Test_Failing {
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoMarketSummary_BPjg0() {
        TradeServletAction action = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "testUser";
        try {
            action.doMarketSummary(ctx, req, resp, userID);
            assertEquals("test", req.getAttribute("results"));
        } catch (ServletException | IOException e) {
            fail("Exception: " + e.getMessage());
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoHome_uVFs0() throws Exception {
        TradeServletAction action = new TradeServletAction();
        action.doHome(null, null, null, null, null);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoHomeWithCoverage_mHrK1() throws Exception {
        TradeServletAction action = new TradeServletAction();
        action.doHome(null, null, null, "", "");
        action.doHome(null, null, null, "testUser", "");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
        action.doHome(null, null, null, "testUser", "testResults");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccount_klGW0_1() throws Exception {
        TradeServletAction action = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String results = "some results";
        action.doAccount(ctx, req, resp, userID, results);
        AccountDataBean accountData = (AccountDataBean) req.getAttribute("accountData");
        AccountProfileDataBean accountProfileData = (AccountProfileDataBean) req.getAttribute("accountProfileData");
        Collection<?> orderDataBeans = (Collection<?>) req.getAttribute("orderDataBeans");
        String actualResults = (String) req.getAttribute("results");
        String expectedResults = results;
        assertEquals(expectedResults, actualResults);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccount_klGW0_2() throws Exception {
        TradeServletAction action = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String results = "some results";
        action.doAccount(ctx, req, resp, userID, results);
        AccountDataBean accountData = (AccountDataBean) req.getAttribute("accountData");
        AccountProfileDataBean accountProfileData = (AccountProfileDataBean) req.getAttribute("accountProfileData");
        Collection<?> orderDataBeans = (Collection<?>) req.getAttribute("orderDataBeans");
        String actualResults = (String) req.getAttribute("results");
        String expectedResults = results;
        assertNotNull(accountData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccount_klGW0_3() throws Exception {
        TradeServletAction action = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String results = "some results";
        action.doAccount(ctx, req, resp, userID, results);
        AccountDataBean accountData = (AccountDataBean) req.getAttribute("accountData");
        AccountProfileDataBean accountProfileData = (AccountProfileDataBean) req.getAttribute("accountProfileData");
        Collection<?> orderDataBeans = (Collection<?>) req.getAttribute("orderDataBeans");
        String actualResults = (String) req.getAttribute("results");
        String expectedResults = results;
        assertNotNull(accountProfileData);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccount_klGW0_4() throws Exception {
        TradeServletAction action = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String results = "some results";
        action.doAccount(ctx, req, resp, userID, results);
        AccountDataBean accountData = (AccountDataBean) req.getAttribute("accountData");
        AccountProfileDataBean accountProfileData = (AccountProfileDataBean) req.getAttribute("accountProfileData");
        Collection<?> orderDataBeans = (Collection<?>) req.getAttribute("orderDataBeans");
        String actualResults = (String) req.getAttribute("results");
        String expectedResults = results;
        assertNotNull(orderDataBeans);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccount_NullUserID_MkUs1() throws Exception {
        TradeServletAction action = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = null;
        String results = "some results";
        action.doAccount(ctx, req, resp, userID, results);
        String actualResults = (String) req.getAttribute("results");
        String expectedResults = results + " could not find account for userID = null";
        assertEquals(expectedResults, actualResults);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoBuy2_uBpG1() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid";
        String symbol = "s";
        String quantity = "1.0";
        try {
            tradeServletAction.doBuy(ctx, req, resp, userID, symbol, quantity);
        } catch (ServletException e) {
        } catch (IOException e) {
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccountUpdate_1_eBrk0() {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String password = "pass1";
        String cpassword = "pass1";
        String fullName = "fullName1";
        String address = "address1";
        String creditcard = "creditcard1";
        String email = "email1";
        try {
            tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccountUpdate_2_bIao1() {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid2";
        String password = "pass2";
        String cpassword = "pass2";
        String fullName = "fullName2";
        String address = "address2";
        String creditcard = "creditcard2";
        String email = "email2";
        try {
            tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccountUpdate_3_ZNWH2() {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid3";
        String password = "pass3";
        String cpassword = "pass3";
        String fullName = "fullName3";
        String address = "address3";
        String creditcard = "creditcard3";
        String email = "email3";
        try {
            tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccountUpdate_4_bbap3() {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid4";
        String password = "pass4";
        String cpassword = "pass4";
        String fullName = "fullName4";
        String address = "address4";
        String creditcard = "creditcard4";
        String email = "email4";
        try {
            tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccountUpdate_5_RllP4() {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid5";
        String password = "pass5";
        String cpassword = "pass5";
        String fullName = "fullName5";
        String address = "address5";
        String creditcard = "creditcard5";
        String email = "email5";
        try {
            tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoSell_nullHoldingID_Vgua4() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "userID";
        Integer holdingID = null;
        tradeServletAction.doSell(ctx, req, resp, userID, holdingID);
        verify(req, times(0)).setAttribute("orderData", null);
        verify(req, times(0)).setAttribute("results", "Order data is null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoSell_nullUserID_zqdR5() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = null;
        Integer holdingID = 1;
        tradeServletAction.doSell(ctx, req, resp, userID, holdingID);
        verify(req, times(1)).setAttribute("orderData", null);
        verify(req, times(1)).setAttribute("results", "Order data is null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoBuy_Yaew0() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid";
        String symbol = "s";
        String quantity = "1.0";
        tradeServletAction.doBuy(ctx, req, resp, userID, symbol, quantity);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testdoSell_nullUserID_zqdR5_fid1() throws Exception {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = null;
        Integer holdingID = 1;
        tradeServletAction.doSell(ctx, req, resp, userID, holdingID);
        verify(req, times(0)).setAttribute("orderData", null);
        verify(req, times(0)).setAttribute("results", "Order data is null");
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoAccount_klGW0() throws Exception {
        TradeServletAction action = new TradeServletAction();
        ServletContext ctx = new MockServletContext();
        HttpServletRequest req = new MockHttpServletRequest();
        HttpServletResponse resp = new MockHttpServletResponse();
        String userID = "uid1";
        String results = "some results";
        action.doAccount(ctx, req, resp, userID, results);
        AccountDataBean accountData = (AccountDataBean) req.getAttribute("accountData");
        AccountProfileDataBean accountProfileData = (AccountProfileDataBean) req.getAttribute("accountProfileData");
        Collection<?> orderDataBeans = (Collection<?>) req.getAttribute("orderDataBeans");
        String actualResults = (String) req.getAttribute("results");
        String expectedResults = results;
        assertEquals(expectedResults, actualResults);
        assertNotNull(accountData);
        assertNotNull(accountProfileData);
        assertNotNull(orderDataBeans);
    }
}