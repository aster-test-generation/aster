/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.servlet;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.QuoteDataBean;
import java.io.IOException;
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
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeServletAction_Test_Passing {
  private QuoteDataBean[] expected;
  HttpSession httpsession;
  ServletContext servletContext;
  HttpServletResponse httpServletResponse;
  String userID = "testUser";
  String results = "testResults";
  AccountDataBean accountDataBean;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testdoLogin_TAwj0() throws Exception {
    HttpServletRequest httpservletrequest = mock(HttpServletRequest.class);
    ServletContext servletContext = mock(ServletContext.class);
    HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
    TradeServletAction tradeservletaction = new TradeServletAction();
    tradeservletaction.doLogin(servletContext, httpservletrequest, httpServletResponse, "userID", "passwd");
    verify(httpservletrequest).setAttribute("results", anyString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoAccountUpdate_emptyFields_NVrr1_mEob0() throws ServletException, IOException {
    TradeServletAction action = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String password = "pass1";
    String cpassword = "pass1";
    String fullName = "";
    String address = "";
    String creditcard = "";
    String email = "";
    try {
      action.doAccountUpdate(ctx, req, resp, userID, password, cpassword, fullName, address, creditcard, email);
      verify(req).setAttribute("results", "Update profile error: please fill in all profile information fields");
    } catch (ServletException e) {
    }
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testDoAccountUpdate_RuntimeException_DoXM4_TNyM0() {
    TradeServletAction action = new TradeServletAction();
    ServletContext ctx = mock(ServletContext.class);
    HttpServletRequest req = mock(HttpServletRequest.class);
    HttpServletResponse resp = mock(HttpServletResponse.class);
    String userID = "user1";
    String password = "pass1";
    try {
      action.doLogin(ctx, req, resp, userID, password);
      fail("Expected ServletException");
    } catch (ServletException e) {
    } catch (IOException e) {
    }
  }
}