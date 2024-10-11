/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.entities.AccountDataBean;
import com.ibm.websphere.samples.daytrader.entities.AccountProfileDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
  AccountDataBean accountDataBean;
  AccountProfileDataBean accountProfileDataBean;
  private String email = "test@example.com";
  private String money = "100.00";
  private String fullname = "John Doe";
  private String address = "123 Main St";
  private String ccn = "1234-5678-9012-3456";
  private String cpassword = "xxx";

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testlogin_Exception_uMDb0() throws Exception {
    httpsession = mock(HttpSession.class);
    externalcontext = mock(ExternalContext.class);
    tradeAction = mock(TradeServices.class);
    accountDataBean = mock(AccountDataBean.class);
    accountProfileDataBean = mock(AccountProfileDataBean.class);
    Instance<TradeServices> instance = mock(Instance.class);
    when(instance.get()).thenReturn(tradeAction);
    tradeappjsf = new TradeAppJSF(instance);
    tradeappjsf.context = externalcontext;
    when(tradeAction.login(userID, password)).thenThrow(new Exception("Error"));
    String result = tradeappjsf.login();
    assertEquals("welcome", result);
  }
}