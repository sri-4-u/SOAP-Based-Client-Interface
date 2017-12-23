
package srinivas.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the srinivas.soap package. 
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

    private final static QName _ListResults_QNAME = new QName("http://SOAP.srinivas/", "listResults");
    private final static QName _ListResultsResponse_QNAME = new QName("http://SOAP.srinivas/", "listResultsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: srinivas.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListResults }
     * 
     */
    public ListResults createListResults() {
        return new ListResults();
    }

    /**
     * Create an instance of {@link ListResultsResponse }
     * 
     */
    public ListResultsResponse createListResultsResponse() {
        return new ListResultsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResults }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListResults }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.srinivas/", name = "listResults")
    public JAXBElement<ListResults> createListResults(ListResults value) {
        return new JAXBElement<ListResults>(_ListResults_QNAME, ListResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListResultsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListResultsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://SOAP.srinivas/", name = "listResultsResponse")
    public JAXBElement<ListResultsResponse> createListResultsResponse(ListResultsResponse value) {
        return new JAXBElement<ListResultsResponse>(_ListResultsResponse_QNAME, ListResultsResponse.class, null, value);
    }

}
