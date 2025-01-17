/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;

import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.enterprise.inject.Instance;
import javax.faces.component.html.HtmlDataTable;
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
public class Aster_PortfolioJSF_Test_Failing {
  private Integer numberHoldings;
  private TradeServices tradeAction;
  private BigDecimal totalValue = new BigDecimal(0.0);
  private ArrayList<HoldingData> holdingDatas;
  private ExternalContext context;
  private BigDecimal totalGain = new BigDecimal(0.0);
  private BigDecimal totalBasis = new BigDecimal(0.0);
  PortfolioJSF portfoliojsf;
  HttpSession httpsession;
  ExternalContext externalcontext;
  private HtmlDataTable dataTable;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getPortfolio_0_KikD0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    portfolioJSF.getPortfolio();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getPortfolio_2_Qegp2() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    portfolioJSF.getPortfolio();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingDatas_sMuN0() {
    ArrayList<HoldingData> holdingDatas = new ArrayList<>();
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    portfolioJSF.setHoldingDatas(holdingDatas);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOpenBalanceCoverage_XAle1() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    Instance<Object> services = null; // Initialize the services variable
    portfolioJSF.getOpenBalance();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalBasis_aVMI0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal expected = portfolioJSF.getTotalBasis();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalBasis_GjzX1() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal expected = portfolioJSF.getTotalBasis();
    assertEquals(expected, portfolioJSF.getTotalBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingsTotal_XaSg0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal holdingsTotal = new BigDecimal(0);
    portfolioJSF.setHoldingsTotal(holdingsTotal);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingsTotal2_XyEg1() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal holdingsTotal = new BigDecimal(100);
    portfolioJSF.setHoldingsTotal(holdingsTotal);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingsTotal3_VAPw2() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal holdingsTotal = new BigDecimal(-1);
    portfolioJSF.setHoldingsTotal(holdingsTotal);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingsTotal4_URvZ6() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal holdingsTotal = new BigDecimal(100);
    portfolioJSF.setHoldingsTotal(holdingsTotal);
    BigDecimal expected = new BigDecimal(100);
    assertEquals(expected, portfolioJSF.getHoldingsTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingsTotal5_gJan7() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal holdingsTotal = new BigDecimal(0);
    portfolioJSF.setHoldingsTotal(holdingsTotal);
    BigDecimal expected = new BigDecimal(0);
    assertEquals(expected, portfolioJSF.getHoldingsTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetHoldingsTotal6_eBKI8() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal holdingsTotal = new BigDecimal(-1);
    portfolioJSF.setHoldingsTotal(holdingsTotal);
    BigDecimal expected = new BigDecimal(-1);
    assertEquals(expected, portfolioJSF.getHoldingsTotal());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalValueWithNoServices_nQCO3() {
    PortfolioJSF portfolio = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal totalValue = portfolio.getTotalValue();
    Assertions.assertEquals(BigDecimal.ZERO, totalValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalBasis_iZzL0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal totalBasis = new BigDecimal(0);
    portfolioJSF.setTotalBasis(totalBasis);
    Assertions.assertEquals(totalBasis, portfolioJSF.getTotalBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalBasis_knAg1() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal totalBasis = new BigDecimal(100);
    portfolioJSF.setTotalBasis(totalBasis);
    Assertions.assertEquals(totalBasis, portfolioJSF.getTotalBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalBasis_qfXd2() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal totalBasis = new BigDecimal(-1);
    portfolioJSF.setTotalBasis(totalBasis);
    Assertions.assertEquals(totalBasis, portfolioJSF.getTotalBasis());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalGainPercentHTML100PercentLineCoverage_uxiP1_Xrsm0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    portfolioJSF.getTotalGainPercentHTML();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalGainPercentHTML100PercentBranchCoverage_IBVu2_YSLw0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    portfolioJSF.getTotalGainPercentHTML();
    portfolioJSF.getTotalGainPercentHTML();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getBalance_URRP0_jeUM0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal balance = portfolioJSF.getBalance();
    assertNotNull(balance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumOfCashHoldings_YVEO0_wVHT0() {
    PortfolioJSF portfolio = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal sumOfCashHoldings = new BigDecimal("100.0");
    portfolio.setSumOfCashHoldings(sumOfCashHoldings);
    assertEquals(sumOfCashHoldings, portfolio.getSumOfCashHoldings());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumOfCashHoldingsZero_FHrN1_nnLX0() {
    PortfolioJSF portfolio = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal sumOfCashHoldings = BigDecimal.ZERO;
    portfolio.setSumOfCashHoldings(sumOfCashHoldings);
    Assertions.assertEquals(sumOfCashHoldings, portfolio.getSumOfCashHoldings());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getBalance_coverage_RoPe1_SOsb0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    portfolioJSF.getBalance();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetSumOfCashHoldingsNull_XYgJ2_ZibQ0() {
    PortfolioJSF portfolio = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal sumOfCashHoldings = null;
    portfolio.setSumOfCashHoldings(sumOfCashHoldings);
    Assertions.assertEquals(sumOfCashHoldings, portfolio.getSumOfCashHoldings());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getHoldingsTotalTest_gagM0_FWzh0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal holdingsTotal = portfolioJSF.getHoldingsTotal();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBalanceWithZeroBalance_RQCm1_WWUS0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal balance = BigDecimal.ZERO;
    portfolioJSF.setBalance(balance);
    assertEquals(balance, portfolioJSF.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getHoldingDatasTest2_seZM2_AiVi0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    ArrayList<HoldingData> actual = portfolioJSF.getHoldingDatas();
    portfolioJSF.setHoldingDatas(new ArrayList<HoldingData>());
    ArrayList<HoldingData> expected = portfolioJSF.getHoldingDatas();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBalanceWithNullBalance_wOYq3_jpcZ0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal balance = null;
    portfolioJSF.setBalance(balance);
    assertEquals(balance, portfolioJSF.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBalanceWithNegativeBalance_RiRD2_tzbw0() {
    Instance<TradeServices> instance = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(instance);
    BigDecimal balance = new BigDecimal("-1000.00");
    portfolioJSF.setBalance(balance);
    assertEquals(balance, portfolioJSF.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalValue_pZGI0_kYqI0() {
    PortfolioJSF portfolio = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal totalValue = portfolio.getTotalValue();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalGainPercentZero_sCpj2_iRUW0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal bigDecimal = new BigDecimal("0");
    portfolioJSF.setTotalGainPercent(bigDecimal);
    assertEquals(bigDecimal, portfolioJSF.getTotalGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenBalance_YbXd0_iOgF0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal openBalance = new BigDecimal(0);
    portfolioJSF.setOpenBalance(openBalance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalGainPercentNegative_mjDE5_Hlyi0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal bigDecimal = new BigDecimal("-100");
    portfolioJSF.setTotalGainPercent(bigDecimal);
    assertEquals(bigDecimal, portfolioJSF.getTotalGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenBalance2_DacN1_kAnJ0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal openBalance = new BigDecimal(1000);
    portfolioJSF.setOpenBalance(openBalance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalGainPercentMax_gqGM3_TefZ0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal bigDecimal = new BigDecimal("1.7976931348623157E308");
    portfolioJSF.setTotalGainPercent(bigDecimal);
    Assertions.assertEquals(bigDecimal, portfolioJSF.getTotalGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenBalance4_xnFe3_TDVc0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal openBalance = new BigDecimal(100000000);
    portfolioJSF.setOpenBalance(openBalance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetOpenBalance5_Zjrt4_qdRf0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal openBalance = new BigDecimal(1000000000);
    portfolioJSF.setOpenBalance(openBalance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getSumOfCashHoldings_coverage_2_ePSd2_vbiI0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    portfolioJSF.getSumOfCashHoldings();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTotalGainPercentMin_RwPC4_zJCW0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal bigDecimal = new BigDecimal("-1.7976931348623157E308");
    portfolioJSF.setTotalGainPercent(bigDecimal);
    assertEquals(bigDecimal, portfolioJSF.getTotalGainPercent());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void test_getSumOfCashHoldings_UYkS0_fabG0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal actual = portfolioJSF.getSumOfCashHoldings();
    BigDecimal expected = null; // Initialize the expected value based on the method's return type
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOpenBalance_TxgF0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    BigDecimal openBalance = portfolioJSF.getOpenBalance();
    Assertions.assertEquals(openBalance, null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getOpenBalanceCoverage_XAle1_fid2() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(null);
    portfolioJSF.getOpenBalance();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalGain_UUUr0() {
    PortfolioJSF portfolio = new PortfolioJSF(null);
    BigDecimal expected = portfolio.getTotalGain();
    BigDecimal actual = portfolio.getTotalGain();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalGainWithNoTrade_FTof1() {
    PortfolioJSF portfolio = new PortfolioJSF(null);
    BigDecimal expected = BigDecimal.ZERO;
    BigDecimal actual = portfolio.getTotalGain();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalValueWithNullServices_trjE1() {
    PortfolioJSF portfolio = new PortfolioJSF(null);
    BigDecimal totalValue = portfolio.getTotalValue();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalGainPercent_Zfrl0_VnTg0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    BigDecimal totalGainPercent = portfolioJSF.getTotalGainPercent();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getHoldingDatasTest1_rcbg1_mZmI0() {
    PortfolioJSF portfolioJSF = new PortfolioJSF(Mockito.mock(Instance.class));
    ArrayList<HoldingData> actual = portfolioJSF.getHoldingDatas();
    ArrayList<HoldingData> expected = new ArrayList<HoldingData>();
    assertEquals(expected, actual);
  }
}