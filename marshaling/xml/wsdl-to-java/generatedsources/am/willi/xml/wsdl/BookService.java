package am.willi.xml.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2018-10-13T16:42:40.620+01:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://www.cleverbuilder.com/BookService/", name = "BookService")
@XmlSeeAlso({ObjectFactory.class})
public interface BookService {

    @WebMethod(operationName = "GetBook", action = "http://www.cleverbuilder.com/BookService/GetBook")
    @RequestWrapper(localName = "GetBook", targetNamespace = "http://www.cleverbuilder.com/BookService/", className = "am.willi.xml.wsdl.GetBook")
    @ResponseWrapper(localName = "GetBookResponse", targetNamespace = "http://www.cleverbuilder.com/BookService/", className = "am.willi.xml.wsdl.GetBookResponse")
    public void getBook(
        @WebParam(mode = WebParam.Mode.INOUT, name = "ID", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> id,
        @WebParam(mode = WebParam.Mode.OUT, name = "Title", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> title,
        @WebParam(mode = WebParam.Mode.OUT, name = "Author", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> author
    );

    @WebMethod(operationName = "AddBook", action = "http://www.cleverbuilder.com/BookService/AddBook")
    @RequestWrapper(localName = "AddBook", targetNamespace = "http://www.cleverbuilder.com/BookService/", className = "am.willi.xml.wsdl.AddBook")
    @ResponseWrapper(localName = "AddBookResponse", targetNamespace = "http://www.cleverbuilder.com/BookService/", className = "am.willi.xml.wsdl.AddBookResponse")
    @WebResult(name = "ID", targetNamespace = "")
    public java.lang.String addBook(
        @WebParam(name = "Title", targetNamespace = "")
        java.lang.String title,
        @WebParam(name = "Author", targetNamespace = "")
        java.lang.String author
    );

    @WebMethod(operationName = "GetAllBooks", action = "http://www.cleverbuilder.com/BookService/GetAllBooks")
    @RequestWrapper(localName = "GetAllBooks", targetNamespace = "http://www.cleverbuilder.com/BookService/", className = "am.willi.xml.wsdl.GetAllBooks")
    @ResponseWrapper(localName = "GetAllBooksResponse", targetNamespace = "http://www.cleverbuilder.com/BookService/", className = "am.willi.xml.wsdl.GetAllBooksResponse")
    @WebResult(name = "Book", targetNamespace = "")
    public java.util.List<am.willi.xml.wsdl.GetAllBooksResponse.Book> getAllBooks();
}
