package org.lle.biblio.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created by TheAdmin on 06.02.2019.
 */
public class EmpruntAction  extends ActionSupport implements SessionAware {

    private Map<String, Object> session;


    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    public String doRent() {

        return null;
    }



}
