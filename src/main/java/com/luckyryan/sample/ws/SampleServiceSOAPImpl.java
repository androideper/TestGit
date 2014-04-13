package com.luckyryan.sample.ws;

import com.luckyryan.sample.dto.SignupForm;
import com.luckyryan.sample.exception.InvalidUserException;

import javax.jws.WebParam;

/**
 * @author m.abareghi
 *         3/12/14 - 9:08 PM
 */
public class SampleServiceSOAPImpl implements SampleServiceSOAP {
    @Override
    public SignupForm saveFrom(@WebParam(name = "signupForm") SignupForm signupForm) throws InvalidUserException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
