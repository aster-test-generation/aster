/**
 * Generated by Aster
 */
package org.apache.commons.jxpath.servlet;
import javax.servlet.jsp.PageContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import org.springframework.mock.web.MockPageContext;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;   
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class Aster_PageScopeContext_Test_Failing {
@Mock
    private PageContext pageContext;
private PageScopeContext pageScopeContext;
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
public void testSetAttribute_rmMZ0_JbVl0() {
    PageScopeContext pageScopeContext = new PageScopeContext(new MockPageContext());
    pageScopeContext.setAttribute("attribute", "value");
    assertEquals("value", pageScopeContext.getAttribute("attribute"));
}
}