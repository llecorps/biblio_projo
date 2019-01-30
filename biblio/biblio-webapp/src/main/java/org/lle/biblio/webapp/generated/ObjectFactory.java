
package org.lle.biblio.webapp.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.lle.biblio.webapp.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetPasswordResponse_QNAME = new QName("http://service.biblio.lle.org/", "setPasswordResponse");
    private final static QName _DoLogin_QNAME = new QName("http://service.biblio.lle.org/", "DoLogin");
    private final static QName _GetPasswordResponse_QNAME = new QName("http://service.biblio.lle.org/", "getPasswordResponse");
    private final static QName _SetLoginResponse_QNAME = new QName("http://service.biblio.lle.org/", "setLoginResponse");
    private final static QName _GetLoginResponse_QNAME = new QName("http://service.biblio.lle.org/", "getLoginResponse");
    private final static QName _GetLocation_QNAME = new QName("http://service.biblio.lle.org/", "getLocation");
    private final static QName _GetPassword_QNAME = new QName("http://service.biblio.lle.org/", "getPassword");
    private final static QName _SetPassword_QNAME = new QName("http://service.biblio.lle.org/", "setPassword");
    private final static QName _GetLocationResponse_QNAME = new QName("http://service.biblio.lle.org/", "getLocationResponse");
    private final static QName _GetLogin_QNAME = new QName("http://service.biblio.lle.org/", "getLogin");
    private final static QName _SetLogin_QNAME = new QName("http://service.biblio.lle.org/", "setLogin");
    private final static QName _DoLoginResponse_QNAME = new QName("http://service.biblio.lle.org/", "DoLoginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.lle.biblio.webapp.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     * 
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link GetLogin }
     * 
     */
    public GetLogin createGetLogin() {
        return new GetLogin();
    }

    /**
     * Create an instance of {@link SetPassword }
     * 
     */
    public SetPassword createSetPassword() {
        return new SetPassword();
    }

    /**
     * Create an instance of {@link GetLocation }
     * 
     */
    public GetLocation createGetLocation() {
        return new GetLocation();
    }

    /**
     * Create an instance of {@link GetPassword }
     * 
     */
    public GetPassword createGetPassword() {
        return new GetPassword();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link SetLogin }
     * 
     */
    public SetLogin createSetLogin() {
        return new SetLogin();
    }

    /**
     * Create an instance of {@link SetLoginResponse }
     * 
     */
    public SetLoginResponse createSetLoginResponse() {
        return new SetLoginResponse();
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link GetPasswordResponse }
     * 
     */
    public GetPasswordResponse createGetPasswordResponse() {
        return new GetPasswordResponse();
    }

    /**
     * Create an instance of {@link SetPasswordResponse }
     * 
     */
    public SetPasswordResponse createSetPasswordResponse() {
        return new SetPasswordResponse();
    }

    /**
     * Create an instance of {@link GetLoginResponse }
     * 
     */
    public GetLoginResponse createGetLoginResponse() {
        return new GetLoginResponse();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "setPasswordResponse")
    public JAXBElement<SetPasswordResponse> createSetPasswordResponse(SetPasswordResponse value) {
        return new JAXBElement<SetPasswordResponse>(_SetPasswordResponse_QNAME, SetPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "DoLogin")
    public JAXBElement<DoLogin> createDoLogin(DoLogin value) {
        return new JAXBElement<DoLogin>(_DoLogin_QNAME, DoLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getPasswordResponse")
    public JAXBElement<GetPasswordResponse> createGetPasswordResponse(GetPasswordResponse value) {
        return new JAXBElement<GetPasswordResponse>(_GetPasswordResponse_QNAME, GetPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "setLoginResponse")
    public JAXBElement<SetLoginResponse> createSetLoginResponse(SetLoginResponse value) {
        return new JAXBElement<SetLoginResponse>(_SetLoginResponse_QNAME, SetLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getLoginResponse")
    public JAXBElement<GetLoginResponse> createGetLoginResponse(GetLoginResponse value) {
        return new JAXBElement<GetLoginResponse>(_GetLoginResponse_QNAME, GetLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getLocation")
    public JAXBElement<GetLocation> createGetLocation(GetLocation value) {
        return new JAXBElement<GetLocation>(_GetLocation_QNAME, GetLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getPassword")
    public JAXBElement<GetPassword> createGetPassword(GetPassword value) {
        return new JAXBElement<GetPassword>(_GetPassword_QNAME, GetPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "setPassword")
    public JAXBElement<SetPassword> createSetPassword(SetPassword value) {
        return new JAXBElement<SetPassword>(_SetPassword_QNAME, SetPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLocationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getLocationResponse")
    public JAXBElement<GetLocationResponse> createGetLocationResponse(GetLocationResponse value) {
        return new JAXBElement<GetLocationResponse>(_GetLocationResponse_QNAME, GetLocationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getLogin")
    public JAXBElement<GetLogin> createGetLogin(GetLogin value) {
        return new JAXBElement<GetLogin>(_GetLogin_QNAME, GetLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "setLogin")
    public JAXBElement<SetLogin> createSetLogin(SetLogin value) {
        return new JAXBElement<SetLogin>(_SetLogin_QNAME, SetLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "DoLoginResponse")
    public JAXBElement<DoLoginResponse> createDoLoginResponse(DoLoginResponse value) {
        return new JAXBElement<DoLoginResponse>(_DoLoginResponse_QNAME, DoLoginResponse.class, null, value);
    }

}
