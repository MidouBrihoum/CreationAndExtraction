package xml_creator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;

public class XMLCreator {
	Document doc;
	Element rootElement;
	Element keywordsElement;

	 public XMLCreator() {
		super();
		//this.doc = doc;
	}

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document doc) {
        this.doc = doc;
    }

   
         
     



    


    public Element getRootElement() {
        return rootElement;
    }

	void traitement ( List<String> KeywordList, List<Element> messageListe,List<Element> operationListe,String applicationName) 
	 {
		 try {
                     
                      DOMImplementation domImpl = doc.getImplementation();
                       DocumentType doctype = domImpl.createDocumentType("paymentService", "-//CompanyName//DTD CompanyName PaymentService v2//EN", "http://dtd.CompanyName.com/paymentService_v2.dtd");
                        doc.appendChild(doctype);
                        rootElement = doc.createElement("definition");
                          doc.appendChild(rootElement);										
				Element keywords = doc.createElement("keywords");
				List<Element> keywordList = GetKeywordListFromStringList(KeywordList);
                                putListOfElementOnRootElement(keywordList, keywords)	;	//ll
				Element operations = doc.createElement("operations");
				putListOfElementOnRootElement(operationListe, operations)	;

                               rootElement.appendChild(keywords);
                        putListOfElementOnRootElement(messageListe, rootElement)	;

                              rootElement.appendChild(operations);

				// ecrire le contenu dans un fichié xml 
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File("/Users/retina/Desktop/test/file.xml"));


				transformer.transform(source, result);
				System.out.println("Fichier enregistré!");

			  } catch (Exception pce) {
				pce.printStackTrace();
			 
			
                          }
	 }
	 
	 
	 
	//---------------------------------Les fonctions------------------------------------------------------------
	 
	 
	List<Element> GetKeywordListFromStringList (List<String> L){    // retourne l'element keywords depuis une liste de String
                    List<Element> list=  new ArrayList<Element>();
			for (int i = 0; i < L.size(); i++) {
				Element keyword = doc.createElement("keyword");
                                keyword.setTextContent(L.get(i));
                                list.add(keyword);
			}
			return list;
			}
	 
	 
	 Element PartFrom2Strings (String name, String type){
			Element part = doc.createElement("part");
			part.setAttribute("name", name);
			part.setAttribute("type", type);			
			return part;
			}
	 
	 
	 Element SetMessageFromPartList(List<Element> partlist,String MessageName ) 
	 {		
			Element message = doc.createElement("message");	 
			for (int i = 0; i < partlist.size(); i++) {
			Element tempel = partlist.get(i);
			message.appendChild(tempel);
			message.setAttribute("name", MessageName);
			 }
		return message;
	 }
	 
	 
	 Element SetinOutFromMessageName(String InOut, String MessageName  ) 
	 {		
			Element InpOut = doc.createElement(InOut);	 
					
			InpOut.setAttribute("message", MessageName);
			 
			return InpOut;
		 }

	 
	 Element ConditionfromStrings (String PrePostcondition, String name,String content){ // retourne un element pré/postCondition depuis son nom , contenue, et type ( pre/post)
			Element condition = doc.createElement(PrePostcondition);
			condition.setAttribute("name", name);
			condition.setTextContent(content);	
	return condition;
			}
	 
	 
	 Element OperationFromString ( String name,Element input, Element output, List<Element> prepost){ // retourne un element operation
		 Element operation = doc.createElement("operation");
			operation.setAttribute("name", name);
			operation.appendChild(input);
			operation.appendChild(output);
			 Element conditions = doc.createElement("conditions");
			 operation.appendChild(conditions);
				for (int i = 0; i < prepost.size(); i++) {
					conditions.appendChild(	prepost.get(i));	
				}
			return operation;
			}
	 
	 
	 
	 void putListOfElementOnRootElement(List<Element> child, Element Root)
	 {
		 for (int i = 0; i < child.size(); i++) {
				
				Element tempmessg = child.get(i);
				Root.appendChild(tempmessg);

			}
		 
	 }
	 
	 
	  Element OperationCFromString ( String name,String type,String concret,String debut,String fin){ // retourne un element operation
		 Element operation = doc.createElement("operationC");
			operation.setAttribute("name", name);
                        operation.setAttribute("type", type);
		 Element concretElement = doc.createElement("titre");
                 concretElement.setTextContent(concret);
                 operation.appendChild(concretElement);
                 
                 Element nlignes = doc.createElement("nligne");
                Element debutElement = doc.createElement("debut");
                debutElement.setTextContent(debut);
              Element finElement = doc.createElement("fin");
              finElement.setTextContent(fin);
                nlignes.appendChild(debutElement);
                nlignes.appendChild(finElement);
                operation.appendChild(nlignes);
			return operation; }
	 
	 
	 
         
         
	 
	
	
	
}