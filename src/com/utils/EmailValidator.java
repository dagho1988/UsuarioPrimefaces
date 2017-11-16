package com.utils;

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class EmailValidator implements Validator {
    private static Pattern patt = Pattern.compile("[A-Z0-9]+@[A-Z0-9]+\\.[A-Z]{3}\\.[A-Z]{2}");

	@Override
	public void validate(FacesContext fc, UIComponent comp, Object obj) throws ValidatorException {

        if (obj == null || obj.toString().trim().length() == 0) {
            return;
        }
        if (!patt.matcher(obj.toString().trim()).matches()) {
            String label = (String) comp.getAttributes().get("label");
            throw new ValidatorException(new FacesMessage(
                FacesMessage.SEVERITY_ERROR, (label == null || label.trim().length() == 0 ? "Email: " : label+": ") +
                "Invalid format", null));
        }
        
	}

}
