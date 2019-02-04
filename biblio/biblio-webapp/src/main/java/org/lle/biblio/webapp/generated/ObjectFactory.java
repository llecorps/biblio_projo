
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

    private final static QName _DoLogin_QNAME = new QName("http://service.biblio.lle.org/", "DoLogin");
    private final static QName _NotFoundException_QNAME = new QName("http://service.biblio.lle.org/", "NotFoundException");
    private final static QName _DoResultLivreResponse_QNAME = new QName("http://service.biblio.lle.org/", "DoResultLivreResponse");
    private final static QName _DoResultLivre_QNAME = new QName("http://service.biblio.lle.org/", "DoResultLivre");
    private final static QName _DoListLivreResponse_QNAME = new QName("http://service.biblio.lle.org/", "DoListLivreResponse");
    private final static QName _GetLocation_QNAME = new QName("http://service.biblio.lle.org/", "getLocation");
    private final static QName _GetAuteurResponse_QNAME = new QName("http://service.biblio.lle.org/", "getAuteurResponse");
    private final static QName _DoListLivre_QNAME = new QName("http://service.biblio.lle.org/", "DoListLivre");
    private final static QName _GetLocationResponse_QNAME = new QName("http://service.biblio.lle.org/", "getLocationResponse");
    private final static QName _DoLoginResponse_QNAME = new QName("http://service.biblio.lle.org/", "DoLoginResponse");
    private final static QName _GetLivreResponse_QNAME = new QName("http://service.biblio.lle.org/", "getLivreResponse");
    private final static QName _GetAuteur_QNAME = new QName("http://service.biblio.lle.org/", "getAuteur");
    private final static QName _GetLivre_QNAME = new QName("http://service.biblio.lle.org/", "getLivre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.lle.biblio.webapp.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoListLivre }
     * 
     */
    public DoListLivre createDoListLivre() {
        return new DoListLivre();
    }

    /**
     * Create an instance of {@link GetLocationResponse }
     * 
     */
    public GetLocationResponse createGetLocationResponse() {
        return new GetLocationResponse();
    }

    /**
     * Create an instance of {@link GetAuteurResponse }
     * 
     */
    public GetAuteurResponse createGetAuteurResponse() {
        return new GetAuteurResponse();
    }

    /**
     * Create an instance of {@link GetLocation }
     * 
     */
    public GetLocation createGetLocation() {
        return new GetLocation();
    }

    /**
     * Create an instance of {@link DoListLivreResponse }
     * 
     */
    public DoListLivreResponse createDoListLivreResponse() {
        return new DoListLivreResponse();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link GetLivreResponse }
     * 
     */
    public GetLivreResponse createGetLivreResponse() {
        return new GetLivreResponse();
    }

    /**
     * Create an instance of {@link NotFoundException }
     * 
     */
    public NotFoundException createNotFoundException() {
        return new NotFoundException();
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link DoResultLivre }
     * 
     */
    public DoResultLivre createDoResultLivre() {
        return new DoResultLivre();
    }

    /**
     * Create an instance of {@link DoResultLivreResponse }
     * 
     */
    public DoResultLivreResponse createDoResultLivreResponse() {
        return new DoResultLivreResponse();
    }

    /**
     * Create an instance of {@link GetLivre }
     * 
     */
    public GetLivre createGetLivre() {
        return new GetLivre();
    }

    /**
     * Create an instance of {@link GetAuteur }
     * 
     */
    public GetAuteur createGetAuteur() {
        return new GetAuteur();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "DoLogin")
    public JAXBElement<DoLogin> createDoLogin(DoLogin value) {
        return new JAXBElement<DoLogin>(_DoLogin_QNAME, DoLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "NotFoundException")
    public JAXBElement<NotFoundException> createNotFoundException(NotFoundException value) {
        return new JAXBElement<NotFoundException>(_NotFoundException_QNAME, NotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoResultLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "DoResultLivreResponse")
    public JAXBElement<DoResultLivreResponse> createDoResultLivreResponse(DoResultLivreResponse value) {
        return new JAXBElement<DoResultLivreResponse>(_DoResultLivreResponse_QNAME, DoResultLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoResultLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "DoResultLivre")
    public JAXBElement<DoResultLivre> createDoResultLivre(DoResultLivre value) {
        return new JAXBElement<DoResultLivre>(_DoResultLivre_QNAME, DoResultLivre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "DoListLivreResponse")
    public JAXBElement<DoListLivreResponse> createDoListLivreResponse(DoListLivreResponse value) {
        return new JAXBElement<DoListLivreResponse>(_DoListLivreResponse_QNAME, DoListLivreResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getAuteurResponse")
    public JAXBElement<GetAuteurResponse> createGetAuteurResponse(GetAuteurResponse value) {
        return new JAXBElement<GetAuteurResponse>(_GetAuteurResponse_QNAME, GetAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoListLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "DoListLivre")
    public JAXBElement<DoListLivre> createDoListLivre(DoListLivre value) {
        return new JAXBElement<DoListLivre>(_DoListLivre_QNAME, DoListLivre.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "DoLoginResponse")
    public JAXBElement<DoLoginResponse> createDoLoginResponse(DoLoginResponse value) {
        return new JAXBElement<DoLoginResponse>(_DoLoginResponse_QNAME, DoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getLivreResponse")
    public JAXBElement<GetLivreResponse> createGetLivreResponse(GetLivreResponse value) {
        return new JAXBElement<GetLivreResponse>(_GetLivreResponse_QNAME, GetLivreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getAuteur")
    public JAXBElement<GetAuteur> createGetAuteur(GetAuteur value) {
        return new JAXBElement<GetAuteur>(_GetAuteur_QNAME, GetAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.biblio.lle.org/", name = "getLivre")
    public JAXBElement<GetLivre> createGetLivre(GetLivre value) {
        return new JAXBElement<GetLivre>(_GetLivre_QNAME, GetLivre.class, null, value);
    }

}
