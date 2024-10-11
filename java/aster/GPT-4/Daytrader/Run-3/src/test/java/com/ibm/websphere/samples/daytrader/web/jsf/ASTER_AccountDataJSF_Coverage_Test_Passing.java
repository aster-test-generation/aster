/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class Aster_AccountDataJSF_Coverage_Test_Passing {
  private HttpSession session;
  private AccountDataJSF accountDataJSF;
  private Instance<TradeServices> servicesInstance;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHome_SetSessionCreationDate_QXwC13() throws Exception {
    when(session.getAttribute("uidBean")).thenReturn("user123");
    when(session.getAttribute("sessionCreationDate")).thenReturn(new Date());
    accountDataJSF.home();
    verify(session).getAttribute("sessionCreationDate");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHome_SetCurrentTime_DNrO14() throws Exception {
    when(session.getAttribute("uidBean")).thenReturn("user123");
    accountDataJSF.home();
  }
}