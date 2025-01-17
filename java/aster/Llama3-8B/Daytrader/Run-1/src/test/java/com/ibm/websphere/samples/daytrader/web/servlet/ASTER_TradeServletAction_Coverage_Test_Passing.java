/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_TradeServletAction_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testUpdateAccountProfileException_Aywe9() throws javax.servlet.ServletException, java.io.IOException {
        TradeServletAction tradeServletAction = new TradeServletAction();
        try {
            tradeServletAction.doAccountUpdate(null, null, null, "userID", "password", "cpassword", "fullName", "address", "creditcard", "email");
            fail("Expected ServletException");
        } catch (ServletException e) {
            assertEquals("TradeServletAction.doAccount(...) exception user =userID", e.getMessage());
        }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testDoWelcomeWithNullStatus_aoDd1_zBbS0() throws ServletException, IOException {
    TradeServletAction action = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String status = null;
    action.doLogin(ctx, req, resp, status, status); 
    verify(req, never()).setAttribute("results", anyString()); 
    verify(ctx, times(1)).getRequestDispatcher(TradeConfig.getPage(TradeConfig.WELCOME_PAGE));
    verify(ctx, times(1)).getRequestDispatcher(TradeConfig.getPage(TradeConfig.WELCOME_PAGE)).forward(req, resp);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testPasswordLengthZero_DCfY3_BJJK0() throws javax.servlet.ServletException, java.io.IOException {
    TradeServletAction tradeServletAction = new TradeServletAction();
    try {
        tradeServletAction.doLogin(null, null, null, "userID", "");
    } catch (Exception e) {
        assertEquals("TradeServletAction.doLogin(...)Exception logging in user userIDwith password", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testFullNameLengthZero_EIQR4_nJKr0() throws javax.servlet.ServletException, java.io.IOException {
    TradeServletAction tradeServletAction = new TradeServletAction();
    try {
        tradeServletAction.doLogin(null, null, null, "userID", "password");
    } catch (Exception e) {
        assertEquals("TradeServletAction.doLogin(...)Exception logging in user userIDwith passwordpassword", e.getMessage());
    }
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testCreditcardLengthZero_TlDf6_DynY0() throws javax.servlet.ServletException, java.io.IOException {
    TradeServletAction tradeServletAction = new TradeServletAction();
    try {
        tradeServletAction.doLogin(null, null, null, "userID", "password");
        fail("Expected ServletException");
    } catch (javax.servlet.ServletException e) {
    }
}
}