/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeServletAction_Coverage_Test_Failing {
    private TradeServletAction tradeServletAction;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoWelcome1_LqxC0() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String status = "status";
        tradeServletAction.doWelcome(ctx, req, resp, status);
        assertNotNull(status);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoWelcome3_MLtU2() throws ServletException, IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String status = "status";
        tradeServletAction.doWelcome(ctx, req, resp, status);
        assertNotNull(tradeServletAction);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoQuotes1_LHAW0() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String symbols = "symbol1";
    tradeServletAction.doQuotes(ctx, req, resp, userID, symbols);
    verify(ctx).getRequestDispatcher("/jsp/quote.jsp");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoQuotes2_nbQF1() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String symbols = "symbol1";
    tradeServletAction.doQuotes(ctx, req, resp, userID, symbols);
    verify(req).setAttribute("symbol", "symbol1");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoQuotes3_qxMH2() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String symbols = "symbol1";
    tradeServletAction.doQuotes(ctx, req, resp, userID, symbols);
    verify(req).setAttribute("quotes", new ArrayList<QuoteDataBean>());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoQuotes4_DcHg3() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String symbols = "symbol1";
    tradeServletAction.doQuotes(ctx, req, resp, userID, symbols);
    verify(req).setAttribute("user", "user1");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoHome1_XwNb0() throws Exception {
	TradeServletAction tradeServletAction = new TradeServletAction();
	 tradeServletAction.doHome(null, null, null, null, null);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoAccountUpdate1_kAfk0() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String password = "password1";
    String cpassword = "password1";
    String fullName = "fullName1";
    String address = "address1";
    String creditcard = "creditcard1";
    String email = "email1";
    tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
    verify(req).setAttribute("results", "Update profile error: passwords do not match");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoAccountUpdate2_zBQd1() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String password = "password1";
    String cpassword = "password1";
    String fullName = "fullName1";
    String address = "address1";
    String creditcard = "creditcard1";
    String email = "email1";
    tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
    verify(req).setAttribute("results", "Update profile error: please fill in all profile information fields");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoAccountUpdate3_eXuc2() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String password = "password1";
    String cpassword = "password1";
    String fullName = "fullName1";
    String address = "address1";
    String creditcard = "creditcard1";
    String email = "email1";
    tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
    verify(req).setAttribute("results", "Account profile update successful");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoAccountUpdate4_GKGa3() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String password = "password1";
    String cpassword = "password1";
    String fullName = "fullName1";
    String address = "address1";
    String creditcard = "creditcard1";
    String email = "email1";
    tradeServletAction.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
    verify(req).setAttribute("results", "Update profile error: invalid argument, check userID is correct, and the database is populateduser1");
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoSell1_PhDc0() throws Exception {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    Integer holdingID = 1;
    tradeServletAction.doSell(ctx, req, resp, userID, holdingID);
    verify(req).setAttribute("results", "");
    verify(req).setAttribute("orderData", new OrderDataBean());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoRegister1_kUVN0() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = null;
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        String userID = "";
        String passwd = "";
        String cpasswd = "";
        String fullname = "";
        String ccn = "";
        String openBalanceString = "";
        String email = "";
        String address = "";
        tAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoRegister2_QdQn1() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = null;
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        String userID = "user1";
        String passwd = "";
        String cpasswd = "";
        String fullname = "";
        String ccn = "";
        String openBalanceString = "";
        String email = "";
        String address = "";
        tAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoRegister3_xCpX2() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = null;
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        String userID = "";
        String passwd = "passwd";
        String cpasswd = "";
        String fullname = "";
        String ccn = "";
        String openBalanceString = "";
        String email = "";
        String address = "";
        tAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoRegister4_SmMl3() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = null;
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        String userID = "";
        String passwd = "";
        String cpasswd = "cpasswd";
        String fullname = "";
        String ccn = "";
        String openBalanceString = "";
        String email = "";
        String address = "";
        tAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoRegister5_LwFX4() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = null;
        HttpServletRequest req = null;
        HttpServletResponse resp = null;
        String userID = "";
        String passwd = "";
        String cpasswd = "";
        String fullname = "fullname";
        String ccn = "";
        String openBalanceString = "";
        String email = "";
        String address = "";
        tAction.doRegister(ctx, req, resp, userID, passwd, cpasswd, fullname, ccn, openBalanceString, email, address);
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoLogout1_YfLT2_kVym0() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "";
        tAction.doLogout(ctx, req, resp, userID);
        verify(ctx).log("TradeAction:doLogout -- logging out user " + userID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoLogout2_hDGr3_KeFV0() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user1";
        tAction.doLogout(ctx, req, resp, userID);
        verify(ctx).log("TradeAction:doLogout -- logging out user " + userID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoLogout4_jQgW5_oNUZ0() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user3";
        tAction.doLogout(ctx, req, resp, userID);
        verify(ctx).log("TradeAction:doLogout -- logging out user " + userID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoLogout5_CUNI6_tEGt0() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user4";
        tAction.doLogout(ctx, req, resp, userID);
        verify(ctx).log("TradeAction:doLogout -- logging out user " + userID);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoLogout7_cLxN8_JRpR0() throws Exception {
        TradeServletAction tAction = new TradeServletAction();
        ServletContext ctx = mock(ServletContext.class);
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse resp = mock(HttpServletResponse.class);
        String userID = "user6";
        tAction.doLogout(ctx, req, resp, userID);
        verify(ctx).log("TradeAction:doLogout -- logging out user " + userID);
}
}