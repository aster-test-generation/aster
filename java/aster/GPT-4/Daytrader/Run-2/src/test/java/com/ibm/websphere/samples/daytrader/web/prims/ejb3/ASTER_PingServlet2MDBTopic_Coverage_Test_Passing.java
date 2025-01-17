/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.ejb3;
import javax.jms.ConnectionFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_PingServlet2MDBTopic_Coverage_Test_Passing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testDoGet_ExceptionHandled_gWoI10() throws Exception {
        HttpServletRequest req = mock(HttpServletRequest.class);
        HttpServletResponse res = mock(HttpServletResponse.class);
        ConnectionFactory topicConnectionFactory = mock(ConnectionFactory.class);
        when(topicConnectionFactory.createConnection()).thenThrow(new RuntimeException("JMS error"));
        PingServlet2MDBTopic servlet = new PingServlet2MDBTopic();
        try {
            servlet.doGet(req, res);
        } catch (Exception e) {
        }
        verify(res).sendError(500, "PingServlet2MDBTopic.doGet(...): error, JMS error");
    }
}