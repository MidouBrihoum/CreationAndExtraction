package xml_pack;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Traitement {

	
	 
        List <String> ListeFiles = new ArrayList<String>();

    public List<String> getListeFiles() {
        return ListeFiles;
    }
	
	
	
	
	void traite(float sim,String Ibcname){
            ListeFiles.clear();
		Element globalIBC = GetGlobalElementFromXmlFileName("/Users/retina/Desktop/mamp/xmls/"+Ibcname); // retrouve l'element globale de IBC 
		InterfaceIBC_ICE IBC = new GenerateInterfaceFromGElement(globalIBC).Getinterface();// retrouve l'interface depuis l'element globale

		
		Element GlobalDescription = GetGlobalElementFromXmlFileName("/Users/retina/Desktop/mamp/xmls/descriptions.XML"); // retrouve l'element globale de IBC 
		NodeList Abstracts = GlobalDescription.getElementsByTagName("Abstract"); // Liste des abstract de la partie description du registre
		
		
		
		for (int temp = 0; temp < Abstracts.getLength(); temp++) { // loop pour chaque operation

			Node tempabst = Abstracts.item(temp); 
			Element abstractelement = (Element) tempabst; // element operaiton

			System.out.println("Comparer le IBC avec la partie abstraite de l'interface ICE du registre numero  "+temp); 
			
			
			InterfaceIBC_ICE ICE = new GenerateInterfaceFromGElement(abstractelement).Getinterface();  // retrouve l'interface depuis l'element globale

			CompareInterfaces compareinterface = new  CompareInterfaces(IBC,ICE); // instancier la classe qui compare les interfaces 
			float sim_result =compareinterface.Compare();
			System.out.println("la similarité totale est: "+sim_result); 
			System.out.println("la similarité souhaité est: "+sim); 
			
			if(sim_result>=sim){
				System.out.println("la similarité est suffisante"); 
				String filename= abstractelement.getAttribute("link").toString();
			System.out.println("le fichié de l'interface ice:"+filename);
                        ListeFiles.add(filename);
			} else {			
				System.out.println("la similarité n'est pas suffisante, la ICE numero "+temp+" n'est pas prise en compte "); }

			
			
		
		}
		
		
		

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	//------------------------- Fonctions --------------------------------
	public Element GetGlobalElementFromXmlFileName (String s){

		File ibc = new File(s);
		Document	IBCdoc = getDocumentFromXmlFileName (ibc); // retourne document depuis le nom du fichier XML
		
		Element GlobalElement = IBCdoc.getDocumentElement(); // retourne element globale du docment
	return GlobalElement;
	}








	 Document getDocumentFromXmlFileName (File f)

	{

		Document doc=null;

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			factory.setXIncludeAware(true);
			
			DocumentBuilder dBuilder = factory.newDocumentBuilder();
			doc = dBuilder.parse(f);
			doc.getDocumentElement().normalize();
			
		} catch(Exception e ){
			
		}
		
		return doc;
		
		
	}
	 
	 
	 
	 
	 public static void main(String []args){
		
		 
		}

	 
}
