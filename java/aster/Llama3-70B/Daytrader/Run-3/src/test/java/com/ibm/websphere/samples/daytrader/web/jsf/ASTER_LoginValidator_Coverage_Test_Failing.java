/**
 * Generated by Aster
 */
package com.ibm.websphere.samples.daytrader.web.jsf;
import java.util.regex.Matcher;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import org.junit.jupiter.api.Test;
public class Aster_LoginValidator_Coverage_Test_Failing {
    private LoginValidator loginValidator;
    private FacesContext facesContext;
    private UIComponent uiComponent;
    private Matcher matcher;
@Test
    public void testValidate_ValidUsername_DoesNotThrowValidatorException_CyNI2() throws ValidatorException {
        loginValidator.validate(facesContext, uiComponent, "uid:123");
    }
}