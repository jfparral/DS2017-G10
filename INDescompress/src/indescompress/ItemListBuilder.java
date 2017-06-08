/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indescompress;

import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author usuario
 */
public class ItemListBuilder {
    private DocumentBuilder builder;
   private Document doc;

   /**
      Constructs an item list builder.
   */
   public ItemListBuilder() 
         throws ParserConfigurationException
   {
      DocumentBuilderFactory factory 
            = DocumentBuilderFactory.newInstance();
      builder = factory.newDocumentBuilder();
   }

   /**
      Builds a DOM document for an array list of items.
      @param items the items
      @return a DOM document describing the items
   */
   public Document build(ArrayList<LineItem> clientes)
   {
      doc = builder.newDocument();
      doc.appendChild(createItems(clientes));
      return doc;
   }

   /**
      Builds a DOM element for an array list of items.
      @param items the items
      @return a DOM element describing the items
   */      
   private Element createItems(ArrayList<LineItem> clientes)
   {      
      Element e = doc.createElement("registro");

      for (LineItem anItem : clientes)
      {
         e.appendChild(createItem(anItem));
      }

      return e;
   }

   /**
      Builds a DOM element for an item.
      @param anItem the item
      @return a DOM element describing the item
   */
   private Element createItem(LineItem anItem)
   {      
      Element e = doc.createElement("clientes");
      e.appendChild(createProduct(anItem.getCliente()));
      return e;
   }

   /**
      Builds a DOM element for a product.
      @param p the product
      @return a DOM element describing the product
   */
   private Element createProduct(Cliente c)
   {
      Element e = doc.createElement("cliente");

      e.appendChild(createTextElement(
            "nombre", c.getNom()));
      e.appendChild(createTextElement(
            "matricula", "" + c.getMatri()));
      e.appendChild(createTextElement(
            "fecha", "" + c.getFecha()));
      e.appendChild(createTextElement(
            "total", "" + c.getTotal()));
      return e;
   }

   private Element createTextElement(String name, String text)
   {
      Text t = doc.createTextNode(text);
      Element e = doc.createElement(name);
      e.appendChild(t);
      return e;
   }
}
