/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import com.ibm.websphere.samples.daytrader.util.TradeConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_TradeServletAction_Coverage_Test_Passing {
  private TradeServletAction tradeServletAction;
  private ServletContext ctx;
  private HttpServletRequest req;
  private HttpServletResponse resp;

  @BeforeEach
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoQuotesWithEmptySymbols_oxUE0() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doQuotes(ctx, req, resp, "user1", "");
    verify(req).setAttribute(eq("quoteDataBeans"), any(Collection.class));
    verify(req, times(1)).setAttribute(eq("quoteDataBeans"), any(Collection.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoQuotesWithSingleSymbol_YFVo1() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doQuotes(ctx, req, resp, "user1", "AAPL");
    verify(req).setAttribute(eq("quoteDataBeans"), any(Collection.class));
    verify(req, times(1)).setAttribute(eq("quoteDataBeans"), any(Collection.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoQuotesWithMultipleSymbols_WApt2() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doQuotes(ctx, req, resp, "user1", "AAPL,GOOG,MSFT");
    verify(req).setAttribute(eq("quoteDataBeans"), any(Collection.class));
    verify(req, times(1)).setAttribute(eq("quoteDataBeans"), any(Collection.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoQuotesRequestDispatch_uukn4() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doQuotes(ctx, req, resp, "user1", "AAPL,GOOG,MSFT");
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.QUOTE_PAGE));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoLogout_RequestDispatch_Ojyd7() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(req.getSession()).thenReturn(session);
    TradeServletAction action = new TradeServletAction();
    action.doLogout(ctx, req, resp, "user123");
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.WELCOME_PAGE)).forward(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoMarketSummarySetsAttribute_Riep0() throws Exception {
    TradeServletAction action = new TradeServletAction();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    ServletContext ctx = mock(ServletContext.class);
    String userID = "user123";
    action.doMarketSummary(ctx, req, resp, userID);
    verify(req).setAttribute("results", "test");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoMarketSummaryCompletesWithoutError_Rsyh2() throws Exception {
    TradeServletAction action = new TradeServletAction();
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    ServletContext ctx = mock(ServletContext.class);
    String userID = "user123";
    action.doMarketSummary(ctx, req, resp, userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoHome_ResultsAttributeSet_golQ2() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    String userID = "user1";
    String results = "Results";
    tAction.doHome(ctx, req, resp, userID, results);
    verify(req).setAttribute("results", results);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoHome_RequestDispatchCalled_Afam8() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    String userID = "user1";
    String results = "Results";
    tAction.doHome(ctx, req, resp, userID, results);
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.HOME_PAGE));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoAccountWithLongRunTrue_ooUn0() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    TradeConfig.setLongRun(true);
    tAction.doAccount(ctx, req, resp, "userID", "results");
    verify(req).setAttribute("orderDataBeans", new ArrayList<Object>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoAccountWithLongRunFalse_DioQ1() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    TradeConfig.setLongRun(false);
    tAction.doAccount(ctx, req, resp, "userID", "results");
    verify(req).setAttribute(eq("orderDataBeans"), any(Collection.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoAccountSetAccountData_erzK2() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doAccount(ctx, req, resp, "userID", "results");
    verify(req).setAttribute(eq("accountData"), any());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoAccountSetAccountProfileData_oBIH3() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doAccount(ctx, req, resp, "userID", "results");
    verify(req).setAttribute(eq("accountProfileData"), any());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoAccountSetResults_fiig4() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doAccount(ctx, req, resp, "userID", "results");
    verify(req).setAttribute("results", "results");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoAccountRequestDispatchToAccountPage_UhNY5() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doAccount(ctx, req, resp, "userID", "results");
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.ACCOUNT_PAGE));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoBuy_NormalFlow_ypFW0() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tradeServletAction = new TradeServletAction();
    String userID = "user1";
    String symbol = "AAPL";
    String quantity = "100";
    tradeServletAction.doBuy(ctx, req, resp, userID, symbol, quantity);
    verify(req).setAttribute(eq("orderData"), any(OrderDataBean.class));
    verify(req).setAttribute("results", "");
    verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.ORDER_PAGE)).forward(req, resp);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoBuy_IllegalArgumentExceptionCaught_soJz2() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tradeServletAction = new TradeServletAction();
    String userID = "user1";
    String symbol = "AAPL";
    String quantity = "not_a_number";
    doThrow(new IllegalArgumentException()).when(req).setAttribute(eq("orderData"), any());
    try {
      tradeServletAction.doBuy(ctx, req, resp, userID, symbol, quantity);
    } catch (IllegalArgumentException e) {
      verify(req).setAttribute("results", "illegal argument:");
      verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.HOME_PAGE)).forward(req, resp);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoBuy_ExceptionCaught_bFJl4() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tradeServletAction = new TradeServletAction();
    String userID = "user1";
    String symbol = "AAPL";
    String quantity = "100";
    doThrow(new Exception("Database error")).when(req).setAttribute(eq("orderData"), any());
    try {
      tradeServletAction.doBuy(ctx, req, resp, userID, symbol, quantity);
    } catch (ServletException e) {
      verify(ctx).getRequestDispatcher(TradeConfig.getPage(TradeConfig.ORDER_PAGE)).forward(req, resp);
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testPasswordsDoNotMatch_AdoN0() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    action.doAccountUpdate(ctx, req, resp, "user1", "password1", "password2", "John Doe", "123 Street", "1234567890123456", "user1@example.com");
    verify(req).setAttribute("results", "Update profile error: passwords do not match");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEmptyPassword_FbNa1() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    action.doAccountUpdate(ctx, req, resp, "user1", "", "password2", "John Doe", "123 Street", "1234567890123456", "user1@example.com");
    verify(req).setAttribute("results", "Update profile error: please fill in all profile information fields");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEmptyFullName_gZlD2() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    action.doAccountUpdate(ctx, req, resp, "user1", "password", "password", "", "123 Street", "1234567890123456", "user1@example.com");
    verify(req).setAttribute("results", "Update profile error: please fill in all profile information fields");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEmptyAddress_IGNy3() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    action.doAccountUpdate(ctx, req, resp, "user1", "password", "password", "John Doe", "", "1234567890123456", "user1@example.com");
    verify(req).setAttribute("results", "Update profile error: please fill in all profile information fields");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEmptyCreditCard_EqSv4() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    action.doAccountUpdate(ctx, req, resp, "user1", "password", "password", "John Doe", "123 Street", "", "user1@example.com");
    verify(req).setAttribute("results", "Update profile error: please fill in all profile information fields");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testEmptyEmail_XErs5() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    action.doAccountUpdate(ctx, req, resp, "user1", "password", "password", "John Doe", "123 Street", "1234567890123456", "");
    verify(req).setAttribute("results", "Update profile error: please fill in all profile information fields");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSuccessfulUpdate_LMWP6() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    action.doAccountUpdate(ctx, req, resp, "user1", "password", "password", "John Doe", "123 Street", "1234567890123456", "user1@example.com");
    verify(req).setAttribute("results", "Account profile update successful");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIllegalArgumentException_Qiyk7() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    doThrow(new IllegalArgumentException()).when(req).setAttribute(anyString(), any());
    action.doAccountUpdate(ctx, req, resp, "user1", "password", "password", "John Doe", "123 Street", "1234567890123456", "user1@example.com");
    verify(req).setAttribute("results", "invalid argument, check userID is correct, and the database is populateduser1");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGeneralException_oWHw8() throws Exception {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction action = new TradeServletAction();
    doThrow(new Exception()).when(req).setAttribute(anyString(), any());
    try {
      action.doAccountUpdate(ctx, req, resp, "user1", "password", "password", "John Doe", "123 Street", "1234567890123456", "user1@example.com");
    } catch (Exception e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoWelcomeSetsAttribute_xzef0() throws ServletException, IOException {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext mockContext = mock(ServletContext.class);
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    HttpServletResponse mockResponse = mock(HttpServletResponse.class);
    String status = "Success";
    tradeServletAction.doWelcome(mockContext, mockRequest, mockResponse, status);
    verify(mockRequest).setAttribute("results", status);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoWelcomeCallsRequestDispatch_JIes1() throws ServletException, IOException {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext mockContext = mock(ServletContext.class);
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    HttpServletResponse mockResponse = mock(HttpServletResponse.class);
    String expectedPage = "welcomePage.jsp";
    when(TradeConfig.getPage(TradeConfig.WELCOME_PAGE)).thenReturn(expectedPage);
    tradeServletAction.doWelcome(mockContext, mockRequest, mockResponse, "Success");
    verify(mockContext).getRequestDispatcher(expectedPage);
    verify(mockContext).getRequestDispatcher(expectedPage).forward(mockRequest, mockResponse);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoWelcomeCompletesWithoutError_TiwN2() throws ServletException, IOException {
    TradeServletAction tradeServletAction = new TradeServletAction();
    ServletContext mockContext = mock(ServletContext.class);
    HttpServletRequest mockRequest = mock(HttpServletRequest.class);
    HttpServletResponse mockResponse = mock(HttpServletResponse.class);
    String status = "Success";
    tradeServletAction.doWelcome(mockContext, mockRequest, mockResponse, status);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoLogin_TActionIsNull_CEre2() throws Exception {
    tradeServletAction = new TradeServletAction(null);
    tradeServletAction.doLogin(ctx, req, resp, "user", "pass");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoQuotesWithEmptyQuotesCollection_nEyu8() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doQuotes(ctx, req, resp, "user1", "");
    verify(req).setAttribute("quoteDataBeans", new ArrayList<QuoteDataBean>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoQuotesWithNonEmptyQuotesCollection_eNBn9() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    TradeServletAction tAction = new TradeServletAction();
    tAction.doQuotes(ctx, req, resp, "user1", "AAPL,GOOG,MSFT");
    verify(req).setAttribute(eq("quoteDataBeans"), any(Collection.class));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoLogout_InitializeResults_CXJk0() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(req.getSession()).thenReturn(session);
    TradeServletAction action = new TradeServletAction();
    action.doLogout(ctx, req, resp, "user123");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoLogout_HandleIllegalArgumentException_xttl2() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(req.getSession()).thenReturn(session);
    doThrow(new IllegalArgumentException("Invalid user ID")).when(req).logout();
    TradeServletAction action = new TradeServletAction();
    try {
      action.doLogout(ctx, req, resp, "invalidUser");
    } catch (IllegalArgumentException e) {
      verify(req).setAttribute("results", "illegal argument:" + e.getMessage());
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoLogout_SessionInvalidate_HYEK4() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(req.getSession()).thenReturn(session);
    TradeServletAction action = new TradeServletAction();
    action.doLogout(ctx, req, resp, "user123");
    verify(session).invalidate();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoLogout_LogoutCalled_nxJW5() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(req.getSession()).thenReturn(session);
    TradeServletAction action = new TradeServletAction();
    action.doLogout(ctx, req, resp, "user123");
    verify(req).logout();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoLogout_RecreateSession_FJUA6() throws ServletException, IOException {
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    HttpSession session = mock(HttpSession.class);
    when(req.getSession()).thenReturn(session);
    when(req.getAttribute("TSS-RecreateSessionInLogout")).thenReturn(Boolean.TRUE);
    TradeServletAction action = new TradeServletAction();
    action.doLogout(ctx, req, resp, "user123");
    verify(req).getSession(true);
  }
}