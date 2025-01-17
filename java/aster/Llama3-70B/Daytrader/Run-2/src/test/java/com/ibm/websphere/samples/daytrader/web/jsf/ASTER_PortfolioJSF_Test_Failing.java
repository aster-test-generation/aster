/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.enterprise.inject.Instance;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.context.ExternalContext;
import javax.servlet.http.HttpSession;
import com.ibm.websphere.samples.daytrader.entities.OrderDataBean;
import com.ibm.websphere.samples.daytrader.interfaces.TradeServices;
import com.ibm.websphere.samples.daytrader.util.FinancialUtils;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
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
TradeServices tradeServices;
private HtmlDataTable dataTable;
HoldingData holdingData;
OrderDataBean orderDataBean;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotalGainPercent_NACW0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal result = portfolioJSF.getTotalGainPercent();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDataTable_SCEN0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    HtmlDataTable dataTable = mock(HtmlDataTable.class);
    portfolioJSF.setDataTable(dataTable);
    assertSame(dataTable, portfolioJSF.getDataTable());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTotalValue_WVmc0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal totalValue = BigDecimal.valueOf(100);
    portfolioJSF.setTotalValue(totalValue);
    assertEquals(totalValue, portfolioJSF.getTotalValue());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetSumOfCashHoldings_YHSk0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal sumOfCashHoldings = new BigDecimal("100.0");
    portfolioJSF.setSumOfCashHoldings(sumOfCashHoldings);
    assertEquals(sumOfCashHoldings, portfolioJSF.getSumOfCashHoldings());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumberHoldings_wzvO0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    assertEquals(0, portfolioJSF.getNumberHoldings());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotalValue_hEkH0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal result = portfolioJSF.getTotalValue();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotalGain_KTDD0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeServices tradeServices = mock(TradeServices.class);
    when(services.get()).thenReturn(tradeServices);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal totalGain = BigDecimal.ZERO;
    portfolioJSF.setTotalGain(totalGain);
    assertEquals(totalGain, portfolioJSF.getTotalGain());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHoldingDatas_FykX0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    ArrayList<HoldingData> result = portfolioJSF.getHoldingDatas();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTotalGain_BECk0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal totalGain = new BigDecimal("10.0");
    portfolioJSF.setTotalGain(totalGain);
    assertEquals(totalGain, portfolioJSF.getTotalGain());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetOpenBalance_fdoX0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal openBalance = BigDecimal.valueOf(100.0);
    portfolioJSF.setOpenBalance(openBalance);
    assertEquals(openBalance, portfolioJSF.getOpenBalance());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotalBasis_Ltbi0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal result = portfolioJSF.getTotalBasis();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHoldingsTotal_kXVM0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal holdingsTotal = new BigDecimal("100.00");
    portfolioJSF.setHoldingsTotal(holdingsTotal);
    assertEquals(holdingsTotal, portfolioJSF.getHoldingsTotal());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetSumOfCashHoldings_nVki0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeServices tradeServices = mock(TradeServices.class);
    when(services.get()).thenReturn(tradeServices);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal result = portfolioJSF.getSumOfCashHoldings();
    assertNotNull(result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetNumberHoldings_sCEK0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setNumberHoldings(5);
    assertEquals(5, portfolioJSF.getNumberHoldings());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDataTable_oEVg0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    HtmlDataTable dataTable = portfolioJSF.getDataTable();
    assertNotNull(dataTable);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBalance_DYIF0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal balance = portfolioJSF.getBalance();
    assertNotNull(balance);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHoldingsTotal_tdHe0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal expected = BigDecimal.valueOf(100);
    portfolioJSF.setHoldingsTotal(expected);
    assertEquals(expected, portfolioJSF.getHoldingsTotal());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpenBalance_EDCe0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal openBalance = portfolioJSF.getOpenBalance();
    assertNotNull(openBalance);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHoldingDatas_ffOR0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    ArrayList<HoldingData> holdingDatas = new ArrayList<>();
    holdingDatas.add(new HoldingData());
    portfolioJSF.setHoldingDatas(holdingDatas);
    assertEquals(holdingDatas, portfolioJSF.getHoldingDatas());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetBalance_IyTD0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal balance = BigDecimal.valueOf(100.0);
    portfolioJSF.setBalance(balance);
    assertEquals(balance, portfolioJSF.getBalance());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTotalBasis_ZsAw0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal totalBasis = new BigDecimal("100.0");
    portfolioJSF.setTotalBasis(totalBasis);
    assertEquals(totalBasis, portfolioJSF.getTotalBasis());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetTotalGainPercent_MRqy0() {
    Instance<TradeServices> services = mock(Instance.class);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    BigDecimal totalGainPercent = new BigDecimal("10.0");
    portfolioJSF.setTotalGainPercent(totalGainPercent);
    assertEquals(totalGainPercent, portfolioJSF.getTotalGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotalGainPercentHTML_Yhah0_SDKX0() {
    Instance<TradeServices> services = mock(Instance.class);
    TradeServices tradeServices = mock(TradeServices.class);
    when(services.get()).thenReturn(tradeServices);
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.valueOf(10.0));
    assertEquals(FinancialUtils.printGainPercentHTML(BigDecimal.valueOf(10.0)), portfolioJSF.getTotalGainPercentHTML());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotalGainPercent_NACW0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.ZERO);
    assertEquals(BigDecimal.ZERO, portfolioJSF.getTotalGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetDataTable_SCEN0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    HtmlDataTable dataTable = mock(HtmlDataTable.class);
    portfolioJSF.setDataTable(dataTable);
    assertNotNull(portfolioJSF.getDataTable());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetNumberHoldings_wzvO0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.ZERO);
    assertNull(portfolioJSF.getTotalGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotalValue_hEkH0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.ZERO);
    BigDecimal result = portfolioJSF.getTotalGainPercent();
    assertEquals(BigDecimal.ZERO, result);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetHoldingDatas_FykX0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.ZERO);
    ArrayList<HoldingData> result = portfolioJSF.getHoldingDatas();
    assertEquals(0, result.size());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetTotalBasis_Ltbi0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.ZERO);
    assertNotNull(portfolioJSF.getTotalGainPercent());
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetDataTable_oEVg0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.ZERO);
    HtmlDataTable dataTable = portfolioJSF.getDataTable();
    assertNotNull(dataTable);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetBalance_DYIF0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.ZERO);
    BigDecimal balance = portfolioJSF.getBalance();
    assertEquals(BigDecimal.ZERO, balance);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testGetOpenBalance_EDCe0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    portfolioJSF.setTotalGainPercent(BigDecimal.ZERO);
    BigDecimal openBalance = portfolioJSF.getOpenBalance();
    assertEquals(BigDecimal.ZERO, openBalance);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetHoldingDatas_ffOR0_fid1() {
    Instance<TradeServices> services = mock(Instance.class);
    when(services.get()).thenReturn(mock(TradeServices.class));
    PortfolioJSF portfolioJSF = new PortfolioJSF(services);
    ArrayList<HoldingData> holdingDatas = new ArrayList<>();
    holdingDatas.add(new HoldingData());
    portfolioJSF.setHoldingDatas(holdingDatas);
    assertNotNull(portfolioJSF.getHoldingDatas());
}
}