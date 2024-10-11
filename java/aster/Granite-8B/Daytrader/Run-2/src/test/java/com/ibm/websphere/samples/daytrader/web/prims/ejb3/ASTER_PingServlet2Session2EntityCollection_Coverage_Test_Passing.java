/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet2Session2EntityCollection_Coverage_Test_Passing {
private static final String EXPECTED_STRING = "PingServlet2Session2EntityCollection";
    private static final String EXPECTED_STRING_2 = "User";
    private static final String EXPECTED_STRING_3 = "is currently holding";
    private static final String EXPECTED_STRING_4 = "stock holdings:";
    private static final String EXPECTED_STRING_5 = "HR";
    private static final String EXPECTED_STRING_6 = "initTime";
    private static final String EXPECTED_STRING_7 = "Hit Count";
    private static final String EXPECTED_STRING_8 = "General Exception caught";
    private static final String EXPECTED_STRING_9 = "500";
    private static final String EXPECTED_STRING_10 = "General Exception caught,";
    private static final String EXPECTED_STRING_11 = "java.lang.Exception";
    private static final String EXPECTED_STRING_12 = "java.lang.ExceptionInInitializerError";
    private static final String EXPECTED_STRING_13 = "java.lang.LinkageError";
    private static final String EXPECTED_STRING_14 = "java.lang.NoClassDefFoundError";
    private static final String EXPECTED_STRING_15 = "java.lang.ThreadDeath";
    private static final String EXPECTED_STRING_16 = "java.lang.VirtualMachineError";
    private static final String EXPECTED_STRING_17 = "java.lang.Error";
    private static final String EXPECTED_STRING_18 = "java.lang.RuntimeException";
    private static final String EXPECTED_STRING_19 = "java.lang.Exception";
    private static final String EXPECTED_STRING_20 = "java.lang.Throwable";
    private static final String EXPECTED_STRING_21 = "java.lang.Object";
    private static final String EXPECTED_STRING_22 = "java.lang.Cloneable";
    private static final String EXPECTED_STRING_23 = "java.io.Serializable";
    private static final String EXPECTED_STRING_24 = "java.lang.Comparable";
    private static final String EXPECTED_STRING_25 = "java.lang.String";
    private static final String EXPECTED_STRING_26 = "java.lang.Integer";
    private static final String EXPECTED_STRING_27 = "java.lang.Long";
    @EJB
    private static PingServlet2Session2EntityCollection tradeSLSBLocal;    
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_0_uNBj0() throws ServletException {
		PingServlet2Session2EntityCollection instance = new PingServlet2Session2EntityCollection();
		instance.init(null);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_1_Iiyt1() throws ServletException {
		PingServlet2Session2EntityCollection instance = new PingServlet2Session2EntityCollection();
		ServletConfig mockServletConfig = mock(ServletConfig.class);
		instance.init(mockServletConfig);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_2_KPVu2() throws ServletException {
		PingServlet2Session2EntityCollection instance = new PingServlet2Session2EntityCollection();
		ServletConfig mockServletConfig = mock(ServletConfig.class);
		when(mockServletConfig.getInitParameter("name")).thenReturn("value");
		instance.init(mockServletConfig);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
	public void test_init_3_NKRN3() throws ServletException {
		PingServlet2Session2EntityCollection instance = new PingServlet2Session2EntityCollection();
		ServletConfig mockServletConfig = mock(ServletConfig.class);
		when(mockServletConfig.getInitParameter("name")).thenThrow(new ServletException());
		instance.init(mockServletConfig);
	}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void test1_sJzS0() throws Exception {
        PingServlet2Session2EntityCollection obj = new PingServlet2Session2EntityCollection();
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        obj.doGet(request, response);
}
}