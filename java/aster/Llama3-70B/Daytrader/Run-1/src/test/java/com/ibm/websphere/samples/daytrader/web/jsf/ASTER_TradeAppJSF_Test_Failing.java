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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_TradeAppJSF_Test_Failing {
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
  public void testGetCpassword_OHFV0() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    assertNotNull(tradeAppJSF);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCpassword_OHFV0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    String result = tradeAppJSF.getCpassword();
    assertNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEmail_bywy0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    tradeAppJSF.setEmail("test@example.com");
    assertEquals("test@example.com", tradeAppJSF.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCcn_WHsU0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    assertEquals("expectedCCN", tradeAppJSF.getCcn());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUserID_zWmf0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    tradeAppJSF.setUserID("testUser");
    assertEquals("testUser", tradeAppJSF.getUserID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEmail_ZpZx0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    assertEquals("expectedEmail", tradeAppJSF.getEmail());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUserID_kvTk0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    String userID = tradeAppJSF.getUserID();
    assertNotNull(userID);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAddress_XlDb0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    assertEquals("expectedAddress", tradeAppJSF.getAddress());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetPassword_RZyD0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    assertEquals("", tradeAppJSF.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCpassword_fPko0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    tradeAppJSF.setCpassword("password");
    assertEquals("password", tradeAppJSF.getCpassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetMoney_XMxc0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    tradeAppJSF.setMoney("100");
    assertEquals("100", tradeAppJSF.getMoney());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetMoney_udlu0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    assertEquals("", tradeAppJSF.getMoney());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetFullname_PQvw0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    assertEquals("", tradeAppJSF.getFullname());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetResults_cNkd0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    tradeAppJSF.setResults("test results");
    assertEquals("test results", tradeAppJSF.getResults());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetFullname_qjHV0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    tradeAppJSF.setFullname("John Doe");
    assertEquals("John Doe", tradeAppJSF.getFullname());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetPassword_Evsz0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    tradeAppJSF.setPassword("newPassword");
    assertEquals("newPassword", tradeAppJSF.getPassword());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAddress_aftN0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeAppJSF tradeAppJSF = new TradeAppJSF(services);
    tradeAppJSF.setAddress("test address");
    assertEquals("test address", tradeAppJSF.getAddress());
  }
}