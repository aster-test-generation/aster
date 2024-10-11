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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
  private HtmlDataTable dataTable;
  private TradeServices tradeServices;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetOpenBalanceWithNullTradeServices_DQpX1() {
    PortfolioJSF portfolio = new PortfolioJSF(null);
    BigDecimal openBalance = portfolio.getOpenBalance();
    assertEquals(new BigDecimal(0.0), openBalance);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetBalanceWithNullTradeServices_Sjoq11() {
    PortfolioJSF portfolio = new PortfolioJSF(null);
    BigDecimal balance = new BigDecimal(100.0);
    portfolio.setBalance(balance);
    assertEquals(balance, portfolio.getBalance());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetDataTable_qSxy0_RSoh0() {
    TradeServices tradeServices = Mockito.mock(TradeServices.class);
    Instance<TradeServices> services = Mockito.mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    HtmlDataTable dataTable = new HtmlDataTable();
    portfolioJSF.setDataTable(dataTable);
    assertEquals(dataTable, portfolioJSF.getDataTable());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalValue_hSpJ0_OCWa0() {
    TradeServices tradeServices = Mockito.mock(TradeServices.class);
    Instance<TradeServices> services = Mockito.mock(Instance.class);
    Mockito.when(services.get()).thenReturn(tradeServices);
    PortfolioJSF portfolio = new PortfolioJSF(services);
    BigDecimal totalValue = portfolio.getTotalValue();
    assertEquals(new BigDecimal(1000), totalValue);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalGainWithDifferentTradeServices_JlnU1_cqzm0_1() {
    TradeServices tradeServices1 = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance1 = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance1.get()).thenReturn(tradeServices1);
    PortfolioJSF portfolio1 = new PortfolioJSF(tradeServicesInstance1);
    BigDecimal totalGain1 = portfolio1.getTotalGain();
    TradeServices tradeServices2 = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance2 = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance2.get()).thenReturn(tradeServices2);
    PortfolioJSF portfolio2 = new PortfolioJSF(tradeServicesInstance2);
    BigDecimal totalGain2 = portfolio2.getTotalGain();
    assertEquals(new BigDecimal(1000), totalGain1);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalGainWithDifferentTradeServices_JlnU1_cqzm0_2() {
    TradeServices tradeServices1 = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance1 = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance1.get()).thenReturn(tradeServices1);
    PortfolioJSF portfolio1 = new PortfolioJSF(tradeServicesInstance1);
    BigDecimal totalGain1 = portfolio1.getTotalGain();
    TradeServices tradeServices2 = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance2 = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance2.get()).thenReturn(tradeServices2);
    PortfolioJSF portfolio2 = new PortfolioJSF(tradeServicesInstance2);
    BigDecimal totalGain2 = portfolio2.getTotalGain();
    assertEquals(new BigDecimal(2000), totalGain2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumOfCashHoldingsWithZeroHoldings_PDjn1_pqRS0() {
    TradeServices tradeServices = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance.get()).thenReturn(tradeServices);
    PortfolioJSF portfolioJSF = new PortfolioJSF(tradeServicesInstance);
    BigDecimal sumOfCashHoldings = portfolioJSF.getSumOfCashHoldings();
    assertEquals(new BigDecimal(0), sumOfCashHoldings);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumOfCashHoldingsWithNegativeHoldings_bvvY2_LTOc0() {
    TradeServices tradeServices = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance.get()).thenReturn(tradeServices);
    PortfolioJSF portfolioJSF = new PortfolioJSF(tradeServicesInstance);
    BigDecimal sumOfCashHoldings = portfolioJSF.getSumOfCashHoldings();
    assertEquals(new BigDecimal(-100), sumOfCashHoldings);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumOfCashHoldingsWithNullHoldings_GfZt3_PpnM0() {
    TradeServices tradeServices = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance.get()).thenReturn(tradeServices);
    PortfolioJSF portfolioJSF = new PortfolioJSF(tradeServicesInstance);
    BigDecimal sumOfCashHoldings = portfolioJSF.getSumOfCashHoldings();
    assertNull(sumOfCashHoldings);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTotalGainWithDifferentTradeServices_JlnU1_cqzm0_1_fid1() {
    TradeServices tradeServices1 = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance1 = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance1.get()).thenReturn(tradeServices1);
    PortfolioJSF portfolio1 = new PortfolioJSF(tradeServicesInstance1);
    BigDecimal totalGain1 = portfolio1.getTotalGain();
    TradeServices tradeServices2 = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance2 = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance2.get()).thenReturn(tradeServices2);
    PortfolioJSF portfolio2 = new PortfolioJSF(tradeServicesInstance2);
    BigDecimal totalGain2 = portfolio2.getTotalGain();
    assertEquals(new BigDecimal(1000), totalGain2);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetSumOfCashHoldingsWithNullHoldings_GfZt3_PpnM0_fid1() {
    TradeServices tradeServices = Mockito.mock(TradeServices.class);
    Instance<TradeServices> tradeServicesInstance = Mockito.mock(Instance.class);
    Mockito.when(tradeServicesInstance.get()).thenReturn(tradeServices);
    PortfolioJSF portfolioJSF = new PortfolioJSF(tradeServicesInstance);
    BigDecimal sumOfCashHoldings = portfolioJSF.getSumOfCashHoldings();
    assertEquals(BigDecimal.ZERO, sumOfCashHoldings);
  }
}