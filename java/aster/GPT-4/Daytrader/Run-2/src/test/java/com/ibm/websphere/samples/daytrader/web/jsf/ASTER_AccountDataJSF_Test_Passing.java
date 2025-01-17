/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AccountDataJSF_Test_Passing {
  private OrderData[] closedOrders;
  @Mock
  private ExternalContext context;
  @Mock
  private TradeServices tradeAction;
  @Mock
  private HttpSession session;
  @InjectMocks
  private AccountDataJSF accountDataJSF;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainHTML_iQvT0() {
    Instance<TradeServices> servicesInstance = mock(Instance.class);
    AccountDataJSF accountDataJSF = new AccountDataJSF(servicesInstance);
    String expectedHTML = "<some expected HTML format>";
    assertEquals(expectedHTML, accountDataJSF.getGainHTML());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGainPercent_zlif0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    BigDecimal inputGainPercent = new BigDecimal("3.14159");
    accountData.setGainPercent(inputGainPercent);
    assertEquals(new BigDecimal("3.14"), accountData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetLastLogin_ukoW0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    Date expectedDate = new Date();
    accountData.setLastLogin(expectedDate);
    assertEquals(expectedDate, accountData.getLastLogin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumOfCashHoldings_yyNz0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed for Instance<TradeServices>
    BigDecimal expected = new BigDecimal("1000");
    accountData.setSumOfCashHoldings(expected);
    assertEquals(expected, accountData.getSumOfCashHoldings());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNumberHoldings_cLtt0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed for Instance<TradeServices>
    Integer expected = 0; // Assuming default or initial value
    Integer actual = accountData.getNumberHoldings();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNumberOfOrders_GndL0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null is acceptable for Instance<TradeServices>
    Integer expected = 0; // Assuming default or initial value of numberOfOrders is 0
    assertEquals(expected, accountData.getNumberOfOrders());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_TlEX0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    BigDecimal expectedGain = new BigDecimal("0"); // Assuming default gain is zero if not set
    assertEquals(expectedGain, accountData.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLogoutCount_lkkS0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming services can be null for this test
    int expected = 0; // Assuming default logoutCount is 0
    assertEquals(expected, accountData.getLogoutCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNumberOfOrderRows_MFcq0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null is acceptable for the constructor
    Integer expected = 0; // Assuming default or initial value is 0
    Integer actual = accountData.getNumberOfOrderRows();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCurrentTime_ZHkp0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed if not specified otherwise
    Date expected = new Date();
    Date actual = accountData.getCurrentTime();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAccountID_UbyV0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed for Instance<TradeServices>
    Integer expectedAccountID = 12345;
    accountData.setAccountID(expectedAccountID);
    assertEquals(expectedAccountID, accountData.getAccountID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCount_PYDk0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    assertEquals(0, accountData.getLoginCount());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetClosedOrders_aHRC0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null); // Assuming services is not used in the method under test
    OrderData[] result = accountDataJSF.getClosedOrders();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAccountID_yqzs0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed for Instance<TradeServices>
    Integer expected = null; // Assuming default value for accountID is null, as it's not shown in the snippet
    Integer actual = accountData.getAccountID();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercent_ibnA0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null is acceptable for the constructor
    BigDecimal expected = BigDecimal.ZERO; // Assuming default or a known set value for testing
    assertEquals(expected, accountData.getGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentHTML_dzAd0_1() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    String result = accountData.getGainPercentHTML();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentHTML_dzAd0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    String result = accountData.getGainPercentHTML();
    assertNotNull(result);
    assertTrue(result.contains("%")); // Assuming the result should contain a percentage symbol
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetProfileID_DZBX0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    String expectedProfileID = null; // Assuming profileID is not set and should be null
    assertEquals(expectedProfileID, accountData.getProfileID());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCreationDate_VOEI0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    Date expectedDate = new Date();
    accountData.setCreationDate(expectedDate);
    assertEquals(expectedDate, accountData.getCreationDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToggleShowAllRows_ksbD0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed for Instance<TradeServices>
    accountData.toggleShowAllRows();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingsTotal_gjws0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    BigDecimal expected = new BigDecimal("1000");
    accountData.setHoldingsTotal(expected);
    assertEquals(expected, accountData.getHoldingsTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumOfCashHoldings_lytG0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed for simplicity
    BigDecimal expected = BigDecimal.ZERO; // Assuming initial sum is zero
    BigDecimal actual = accountData.getSumOfCashHoldings();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNumberHoldings_wykF0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed for Instance<TradeServices>
    Integer expectedNumberHoldings = 5;
    accountData.setNumberHoldings(expectedNumberHoldings);
    assertEquals(expectedNumberHoldings, accountData.getNumberHoldings());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBalance_QlDf0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null is acceptable for the constructor
    BigDecimal expectedBalance = new BigDecimal("100.00"); // Assuming the balance is set elsewhere in the class
    assertEquals(expectedBalance, accountData.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastLogin_iXhB0() {
    AccountDataJSF accountData = new AccountDataJSF(null); // Assuming null can be passed for Instance<TradeServices>
    Date expected = null; // Assuming lastLogin has not been set and defaults to null
    assertEquals(expected, accountData.getLastLogin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetHoldingsTotal_Jieu0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    BigDecimal expected = BigDecimal.ZERO; // Assuming default or initial value
    BigDecimal actual = accountData.getHoldingsTotal();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllOrders_yRWe0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    OrderData[] result = accountData.getAllOrders();
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenBalance_NoWa0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    BigDecimal expected = BigDecimal.ZERO; // Assuming default or initial balance is ZERO
    BigDecimal actual = accountData.getOpenBalance();
    assertEquals(expected, actual);
  }
}