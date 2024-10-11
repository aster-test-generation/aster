/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.prims.drive;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ibm.websphere.samples.daytrader.util.Log;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PingServletDrive_Test_Passing {
private static String initTime;
private static int hitCount;
PingServletDrive pingservletdrive;
ServletConfig servletConfig;
HttpServletResponse httpservletresponse;
ServletOutputStream servletoutputstream;
HttpServletRequest httpservletrequest;
HttpServlet httpservlet;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        try {
            res.setContentType("text/html");
            ServletOutputStream out = res.getOutputStream();
            hitCount++;
            out.println("<html><head><title>Ping Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: " + hitCount + "</B></body></html>");
        } catch (Exception e) {
            Log.error(e, "PingServlet.doGet(...): general exception caught");
            res.sendError(500, e.toString());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void doGet_fid2(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        try {
            res.setContentType("text/html");
            ServletOutputStream out = res.getOutputStream();
            hitCount++;
            out.println("<html><head><title>Ping Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: " + hitCount + "</B></body></html>");
        } catch (Exception e) {
            Log.error(e, "PingServlet.doGet_fid2(...): general exception caught");
            res.sendError(500, e.toString());
        }
    }
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void doGet_fid3(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        try {
            res.setContentType("text/html");
            ServletOutputStream out = res.getOutputStream();
            hitCount++;
            out.println("<html><head><title>Ping Servlet</title></head>" + "<body><HR><BR><FONT size=\"+2\" color=\"#000066\">Ping Servlet<BR></FONT><FONT size=\"+1\" color=\"#000066\">Init time : " + initTime + "<BR><BR></FONT>  <B>Hit Count: " + hitCount + "</B></body></html>");
        } catch (Exception e) {
            Log.error(e, "PingServlet.doGet_fid3(...): general exception caught");
            res.sendError(500, e.toString());
        }
    }
}