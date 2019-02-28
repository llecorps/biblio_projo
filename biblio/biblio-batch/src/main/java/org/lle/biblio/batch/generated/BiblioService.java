
package org.lle.biblio.batch.generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BiblioService", targetNamespace = "http://service.biblio.lle.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BiblioService {


    /**
     * 
     * @param arg0
     * @return
     *     returns org.lle.biblio.batch.generated.Location
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLocation", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetLocation")
    @ResponseWrapper(localName = "getLocationResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetLocationResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/getLocationRequest", output = "http://service.biblio.lle.org/BiblioService/getLocationResponse")
    public Location getLocation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns org.lle.biblio.batch.generated.Utilisateur
     */
    @WebMethod(operationName = "DoLogin")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DoLogin", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.DoLogin")
    @ResponseWrapper(localName = "DoLoginResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.DoLoginResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/DoLoginRequest", output = "http://service.biblio.lle.org/BiblioService/DoLoginResponse")
    public Utilisateur doLogin(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.lle.biblio.batch.generated.Livre
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivre", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetLivre")
    @ResponseWrapper(localName = "getLivreResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetLivreResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/getLivreRequest", output = "http://service.biblio.lle.org/BiblioService/getLivreResponse")
    public Livre getLivre(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addLocation", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.AddLocation")
    @ResponseWrapper(localName = "addLocationResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.AddLocationResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/addLocationRequest", output = "http://service.biblio.lle.org/BiblioService/addLocationResponse")
    public void addLocation(
        @WebParam(name = "arg0", targetNamespace = "")
        Location arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.lle.biblio.batch.generated.Location>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListLocation", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetListLocation")
    @ResponseWrapper(localName = "getListLocationResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetListLocationResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/getListLocationRequest", output = "http://service.biblio.lle.org/BiblioService/getListLocationResponse")
    public List<Location> getListLocation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getExemplaire", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetExemplaire")
    @ResponseWrapper(localName = "getExemplaireResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetExemplaireResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/getExemplaireRequest", output = "http://service.biblio.lle.org/BiblioService/getExemplaireResponse")
    public int getExemplaire(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.lle.biblio.batch.generated.Auteur
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAuteur", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetAuteur")
    @ResponseWrapper(localName = "getAuteurResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetAuteurResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/getAuteurRequest", output = "http://service.biblio.lle.org/BiblioService/getAuteurResponse")
    public Auteur getAuteur(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.lle.biblio.batch.generated.Utilisateur
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUtilisateur", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetUtilisateur")
    @ResponseWrapper(localName = "getUtilisateurResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetUtilisateurResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/getUtilisateurRequest", output = "http://service.biblio.lle.org/BiblioService/getUtilisateurResponse")
    public Utilisateur getUtilisateur(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.lle.biblio.batch.generated.Location
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivrelocation", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetLivrelocation")
    @ResponseWrapper(localName = "getLivrelocationResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.GetLivrelocationResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/getLivrelocationRequest", output = "http://service.biblio.lle.org/BiblioService/getLivrelocationResponse")
    public Location getLivrelocation(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.lle.biblio.batch.generated.Livre>
     * @throws NotFoundException_Exception
     */
    @WebMethod(operationName = "DoListLivre")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DoListLivre", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.DoListLivre")
    @ResponseWrapper(localName = "DoListLivreResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.DoListLivreResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/DoListLivreRequest", output = "http://service.biblio.lle.org/BiblioService/DoListLivreResponse", fault = {
        @FaultAction(className = NotFoundException_Exception.class, value = "http://service.biblio.lle.org/BiblioService/DoListLivre/Fault/NotFoundException")
    })
    public List<Livre> doListLivre()
        throws NotFoundException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<org.lle.biblio.batch.generated.Location>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listLocation", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.ListLocation")
    @ResponseWrapper(localName = "listLocationResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.ListLocationResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/listLocationRequest", output = "http://service.biblio.lle.org/BiblioService/listLocationResponse")
    public List<Location> listLocation();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.lle.biblio.batch.generated.Livre>
     * @throws NotFoundException_Exception
     */
    @WebMethod(operationName = "DoResultLivre")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DoResultLivre", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.DoResultLivre")
    @ResponseWrapper(localName = "DoResultLivreResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.DoResultLivreResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/DoResultLivreRequest", output = "http://service.biblio.lle.org/BiblioService/DoResultLivreResponse", fault = {
        @FaultAction(className = NotFoundException_Exception.class, value = "http://service.biblio.lle.org/BiblioService/DoResultLivre/Fault/NotFoundException")
    })
    public List<Livre> doResultLivre(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws NotFoundException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addProlo", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.AddProlo")
    @ResponseWrapper(localName = "addProloResponse", targetNamespace = "http://service.biblio.lle.org/", className = "org.lle.biblio.batch.generated.AddProloResponse")
    @Action(input = "http://service.biblio.lle.org/BiblioService/addProloRequest", output = "http://service.biblio.lle.org/BiblioService/addProloResponse")
    public void addProlo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
