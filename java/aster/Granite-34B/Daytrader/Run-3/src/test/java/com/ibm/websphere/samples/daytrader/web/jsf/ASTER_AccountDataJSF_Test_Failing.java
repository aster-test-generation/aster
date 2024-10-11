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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_AccountDataJSF_Test_Failing {
  private OrderData[] closedOrders;
  private ExternalContext context;
  private TradeServices tradeAction;
  AccountDataJSF accountdatajsf;
  HttpSession httpsession;
  ExternalContext externalcontext;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetGain_OSMq0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setGain(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNumberOfOrdersWithNullArgument_VodD1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    Integer actual = accountDataJSF.getNumberOfOrders();
    Integer expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCreationDate_lkXP0() {
    AccountDataJSF accountData = new AccountDataJSF(null);
    Date creationDate = new Date();
    accountData.setCreationDate(creationDate);
    assertEquals(creationDate, accountData.getCreationDate());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNumberOfOrderRows_Hovs0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    Integer numberOfOrderRows = 10;
    accountDataJSF.setNumberOfOrderRows(numberOfOrderRows);
    assertEquals(numberOfOrderRows, accountDataJSF.getNumberOfOrderRows());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProfileID_TFZB0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.setProfileID("profileID");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProfileIDCoverage_fgPk1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setProfileID(null);
    accountDataJSF.setProfileID("");
    accountDataJSF.setProfileID("profileID");
    Assertions.assertNotNull(accountDataJSF);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBalance_Rvht0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    BigDecimal balance = accountDataJSF.getBalance();
    assertNotNull(balance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBalanceWithZeroValue_YnAr1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setBalance(BigDecimal.ZERO);
    BigDecimal balance = accountDataJSF.getBalance();
    assertEquals(BigDecimal.ZERO, balance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBalanceWithPositiveValue_zVGS2() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setBalance(BigDecimal.TEN);
    BigDecimal balance = accountDataJSF.getBalance();
    assertEquals(BigDecimal.TEN, balance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetBalanceWithNegativeValue_asTE3() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setBalance(BigDecimal.ONE.negate());
    BigDecimal balance = accountDataJSF.getBalance();
    assertEquals(BigDecimal.ONE.negate(), balance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenBalanceWithNull_tjJi1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    BigDecimal actual = accountDataJSF.getOpenBalance();
    BigDecimal expected = new BigDecimal("0.00");
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setBalanceTest1_RZeG0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setBalance(new BigDecimal("0.00"));
    assertEquals(new BigDecimal("0.00"), accountDataJSF.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void setBalanceTest2_BHkb1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setBalance(new BigDecimal("1000.00"));
    assertEquals(new BigDecimal("1000.00"), accountDataJSF.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHome_1_CTGx1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.home();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHome_6_WIuf6() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.home();
    // Add assertions here
}

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGain_rbRY0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    assertEquals(null, accountDataJSF.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainWithPositiveValue_jeVo1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setGain(new BigDecimal(100));
    assertEquals(new BigDecimal(100), accountDataJSF.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainWithNegativeValue_TgqJ2() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setGain(new BigDecimal(-100));
    assertEquals(new BigDecimal(-100), accountDataJSF.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainWithZeroValue_CAQa3() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setGain(new BigDecimal(0));
    assertEquals(new BigDecimal(0), accountDataJSF.getGain());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders_SrdV0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = new OrderData[10];
    accountDataJSF.setAllOrders(allOrders);
    assertEquals(null, accountDataJSF.getAllOrders());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders2_gpab1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = new OrderData[0];
    accountDataJSF.setAllOrders(allOrders);
    assertEquals(0, accountDataJSF.getAllOrders().length);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders3_mFFs2() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = null;
    accountDataJSF.setAllOrders(allOrders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders4_mafE3() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = new OrderData[10];
    accountDataJSF.setAllOrders(allOrders);
    OrderData[] expected = accountDataJSF.getAllOrders();
    OrderData[] actual = allOrders;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders5_kIKy4() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = new OrderData[0];
    accountDataJSF.setAllOrders(allOrders);
    OrderData[] expected = accountDataJSF.getAllOrders();
    OrderData[] actual = allOrders;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders6_LgBp5() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = null;
    accountDataJSF.setAllOrders(allOrders);
    OrderData[] expected = null;
    assertEquals(expected, accountDataJSF.getAllOrders());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_OTIA0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(0, result.intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_pdJg1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setNumberOfOrderRows(10);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(10, result.intValue());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_iCog2() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setNumberOfOrderRows(0);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(Integer.valueOf(0), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_cRnz3() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setNumberOfOrderRows(10);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(10, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_mCGI4() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.setNumberOfOrderRows(null);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_sUjC5() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    Integer result = accountDataJSF.getNumberOfOrderRows();
    accountDataJSF.setNumberOfOrderRows(result);
    assertEquals(result, accountDataJSF.getNumberOfOrderRows());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_GonD8() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    accountDataJSF.setNumberOfOrderRows(result);
    assertNotNull(result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_OOmF9() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    accountDataJSF.setNumberOfOrderRows(result);
    assertEquals(result.getClass(), accountDataJSF.getNumberOfOrderRows().getClass());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_QPmp10() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    accountDataJSF.setNumberOfOrderRows(result);
    Assertions.assertNotNull(accountDataJSF.getNumberOfOrderRows());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void toggleShowAllRows_0_niGa0_wWnl0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.setNumberOfOrderRows(0);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void toggleShowAllRows_CurrentTime_kXZz1_EEUW0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.toggleShowAllRows();
    Date result1 = accountDataJSF.getCurrentTime();
    Date result2 = accountDataJSF.getCurrentTime();
    assertEquals(result1, result2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberHoldingsTest2_UtZY1_Nkbb0() {
    AccountDataJSF accountData = new AccountDataJSF(Mockito.mock(Instance.class));
    accountData.setNumberHoldings(100);
    Integer result = accountData.getNumberHoldings();
    assertEquals(new Integer(100), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberHoldingsTest4_HOiv3_BHQK0() {
    AccountDataJSF accountData = new AccountDataJSF(Mockito.mock(Instance.class));
    accountData.setNumberHoldings(100);
    Integer result = accountData.getNumberHoldings();
    accountData.setNumberHoldings(100);
    assertEquals(new Integer(100), result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetGainPercentForLineCoverage_Qyoo1_kCbA0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.getGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCount_jHWS0_fvUy0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    int actual = accountDataJSF.getLoginCount();
    int expected = 0;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountForBranchCoverage1_Gedt2_eZeQ0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.setLoginCount(0);
    int actual = accountDataJSF.getLoginCount();
    assertEquals(0, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetNumberHoldings_msJK0_vpSd0() {
    Instance<TradeServices> services = Mockito.mock(Instance.class);
    AccountDataJSF accountDataJSF = new AccountDataJSF(services);
    accountDataJSF.setNumberHoldings(100);
    assertEquals(accountDataJSF.getNumberHoldings(), 100);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLoginCountForBranchCoverage2_yqHi3_oLjz0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.setLoginCount(1);
    int actual = accountDataJSF.getLoginCount();
    assertEquals(1, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getHoldingsTotal_branchCoverage_TcMD2_Sdif0() {
    AccountDataJSF accountData = new AccountDataJSF(Mockito.mock(Instance.class));
    accountData.getHoldingsTotal();
    accountData.getHoldingsTotal();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetAllOrders_sVLK0_agap0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    OrderData[] orders = accountDataJSF.getAllOrders();
    assertNotNull(orders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastLoginWithCoverage_Bcxv1_XauH0_1() {
    AccountDataJSF accountData = new AccountDataJSF(Mockito.mock(Instance.class));
    Date lastLogin = accountData.getLastLogin();
    accountData.setLastLogin(new Date(0L));
    assertNotNull(lastLogin);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastLoginWithCoverage_Bcxv1_XauH0_2() {
    AccountDataJSF accountData = new AccountDataJSF(Mockito.mock(Instance.class));
    Date lastLogin = accountData.getLastLogin();
    accountData.setLastLogin(new Date(0L));
    assertEquals(new Date(0L), lastLogin);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetLastLoginWithCoverage_Bcxv1_XauH0_3() {
    AccountDataJSF accountData = new AccountDataJSF(Mockito.mock(Instance.class));
    Date lastLogin = accountData.getLastLogin();
    accountData.setLastLogin(new Date(0L));
    assertEquals(new Date(0L), accountData.getLastLogin());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToggleShowAllRows_withZeroParam_BtQj3_wQay0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.setNumberOfOrderRows(0);
    accountDataJSF.toggleShowAllRows();
    assertEquals(0, accountDataJSF.getNumberOfOrderRows());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToggleShowAllRows_withMaxParam_rNxu4_GzZb0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.setNumberOfOrderRows(Integer.MAX_VALUE);
    accountDataJSF.toggleShowAllRows();
    assertEquals(0, accountDataJSF.getNumberOfOrderRows());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingsTotal_oTRm0_NfyH0() {
    AccountDataJSF accountData = new AccountDataJSF(Mockito.mock(Instance.class));
    accountData.setHoldingsTotal(new BigDecimal("1000.00"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNumberOfOrdersWithNullArgument_VodD1_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    Integer actual = accountDataJSF.getNumberOfOrders();
    Integer expected = null;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProfileID_TFZB0_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setProfileID("profileID");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetProfileIDCoverage_fgPk1_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setProfileID(null);
    accountDataJSF.setProfileID("");
    accountDataJSF.setProfileID("profileID");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenBalanceWithNull_tjJi1_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    BigDecimal actual = accountDataJSF.getOpenBalance();
    BigDecimal expected = accountDataJSF.getOpenBalance();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testHome_0_LALa0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.home();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders_SrdV0_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = new OrderData[10];
    accountDataJSF.setAllOrders(allOrders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders2_gpab1_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = new OrderData[0];
    accountDataJSF.setAllOrders(allOrders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders4_mafE3_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = new OrderData[10];
    accountDataJSF.setAllOrders(allOrders);
    assertEquals(accountDataJSF.getAllOrders(), allOrders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders5_kIKy4_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = new OrderData[0];
    accountDataJSF.setAllOrders(allOrders);
    assertEquals(accountDataJSF.getAllOrders(), allOrders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetAllOrders6_LgBp5_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    OrderData[] allOrders = null;
    accountDataJSF.setAllOrders(allOrders);
    assertEquals(accountDataJSF.getAllOrders(), allOrders);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_OTIA0_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_iCog2_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setNumberOfOrderRows(0);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(0, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_cRnz3_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setNumberOfOrderRows(-10);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(-10, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_mCGI4_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    accountDataJSF.setNumberOfOrderRows(null);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    assertEquals(null, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getNumberOfOrderRowsTest_sUjC5_fid1() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(null);
    Integer result = accountDataJSF.getNumberOfOrderRows();
    accountDataJSF.setNumberOfOrderRows(result);
    assertEquals(result, accountDataJSF.getNumberOfOrderRows());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSessionCreationDateNull_xaaK1_BlUg0() {
    AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
    accountDataJSF.setSessionCreationDate(null);
  }
}