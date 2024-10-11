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
import org.mockito.Mock;
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
    @Mock
    private AccountDataJSF accountdatajsf;
    @Mock
    private HttpSession httpsession;
    @Mock
    private ExternalContext externalcontext;

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainPercent_NeWi0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal gainPercent = new BigDecimal("0.5");
        accountDataJSF.setGainPercent(gainPercent);
        assertEquals(gainPercent, accountDataJSF.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainPercentWithZeroGainPercent_LNRD1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal gainPercent = new BigDecimal("0");
        accountDataJSF.setGainPercent(gainPercent);
        assertEquals(gainPercent, accountDataJSF.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetGainPercentWithNegativeGainPercent_pMWy2() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal gainPercent = new BigDecimal("-0.5");
        accountDataJSF.setGainPercent(gainPercent);
        assertEquals(gainPercent, accountDataJSF.getGainPercent());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_HgET0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setLogoutCount(1);
        assertEquals(1, accountDataJSF.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_FxRb1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setLogoutCount(0);
        assertEquals(0, accountDataJSF.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_TQSd2() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setLogoutCount(10);
        assertEquals(10, accountDataJSF.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_Hjda4() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setLogoutCount(100);
        assertEquals(100, accountDataJSF.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_WUqF8() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setLogoutCount(1000);
        assertEquals(1000, accountDataJSF.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLastLogin_aehr0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(mock(Instance.class));
        Date lastLogin = new Date();
        accountDataJSF.setLastLogin(lastLogin);
        assertEquals(lastLogin, accountDataJSF.getLastLogin());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetSumOfCashHoldings_GVxc0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal sumOfCashHoldings = new BigDecimal(100);
        accountDataJSF.setSumOfCashHoldings(sumOfCashHoldings);
        assertEquals(sumOfCashHoldings, accountDataJSF.getSumOfCashHoldings());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    void testNumbersHoldings_GGWE0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        int expected = 0;
        int actual = accountDataJSF.getNumberHoldings();
        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testNumberOfOrders_boCt0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        Integer numberOfOrders = accountDataJSF.getNumberOfOrders();
        assertNotNull(numberOfOrders);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetCreationDate_MsaE0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        Date creationDate = accountDataJSF.getCreationDate();
        assertNotNull(creationDate);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAccountID_FyqC0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setAccountID(1);
        assertEquals(1, accountDataJSF.getAccountID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetLoginCount_ptYe0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        int loginCount = accountDataJSF.getLoginCount();
        assertEquals(0, loginCount);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetClosedOrders_boEa0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        OrderData[] closedOrders = accountDataJSF.getClosedOrders();
        assertNotNull(closedOrders);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetAccountID_WzPC0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        Integer accountID = accountDataJSF.getAccountID();
        assertNotNull(accountID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetGainPercent_rjtq0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal gainPercent = accountDataJSF.getGainPercent();
        assertNotNull(gainPercent);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetGainPercentHTML_PmBW0() {
        AccountDataJSF fixture = new AccountDataJSF(null);
        String result = fixture.getGainPercentHTML();
        assertNotNull(result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetOpenBalance_chlk0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal openBalance = new BigDecimal(100);
        accountDataJSF.setOpenBalance(openBalance);
        assertEquals(openBalance, accountDataJSF.getOpenBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetProfileID_MdaT0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        String profileID = accountDataJSF.getProfileID();
        assertNotNull(profileID);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetCreationDate_BJtz0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        Date creationDate = new Date();
        accountDataJSF.setCreationDate(creationDate);
        assertEquals(creationDate, accountDataJSF.getCreationDate());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNumberOfOrderRows_UlwS0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        Integer numberOfOrderRows = 10;
        accountDataJSF.setNumberOfOrderRows(numberOfOrderRows);
        assertEquals(numberOfOrderRows, accountDataJSF.getNumberOfOrderRows());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetProfileID_EoGV0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setProfileID("123");
        assertEquals("123", accountDataJSF.getProfileID());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testToggleShowAllRows_LAsm0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.toggleShowAllRows();
        assertEquals(0, accountDataJSF.getNumberOfOrderRows());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testGetOpenBalance_gSkC0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal openBalance = accountDataJSF.getOpenBalance();
        assertNotNull(openBalance);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetAllOrders_UEJX0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        OrderData[] allOrders = new OrderData[10]; // Assuming OrderData is the type of allOrders
        accountDataJSF.setAllOrders(allOrders);
        assertEquals(10, accountDataJSF.getAllOrders().length);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetBalance_IUSo0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal balance = new BigDecimal(100.00);
        accountDataJSF.setBalance(balance);
        assertEquals(balance, accountDataJSF.getBalance());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetHoldingsTotal_VWHe0_qzOJ0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(Mockito.mock(Instance.class));
        BigDecimal holdingsTotal = new BigDecimal(100);
        accountDataJSF.setHoldingsTotal(holdingsTotal);
        assertEquals(holdingsTotal, accountDataJSF.getHoldingsTotal());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_ZqeB3_fid1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setLogoutCount(-1);
        assertEquals(-1, accountDataJSF.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetLogoutCount_mmfA7_fid1() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setLogoutCount(-100);
        assertEquals(-100, accountDataJSF.getLogoutCount());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetGainPercentHTML_PmBW0_fid1() {
        AccountDataJSF fixture = new AccountDataJSF(null);
        String result = fixture.getGainPercentHTML();
        assertEquals("", result);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSetNumberOfOrders_kSQQ0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        accountDataJSF.setNumberOfOrders(10);
        assertEquals(10, accountDataJSF.getNumberOfOrders());
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testgetBalance_cQIO0() {
        AccountDataJSF accountDataJSF = new AccountDataJSF(null);
        BigDecimal balance = accountDataJSF.getBalance();
        assertNotNull(balance);
    }
}