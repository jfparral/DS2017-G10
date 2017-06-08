/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indescompress;

/**
 *
 * @author usuario
 */
public class LineItem {
   private Cliente cliente;

   public LineItem(Cliente aProduct)
   {  
      cliente = aProduct;
   }


   public Cliente getCliente()
   {  
      return cliente;
   }

   public String format()
   {  
      return String.format("%-30s%8.2f%5d%8.2f", 
            cliente.getNom(),cliente.getMatri(),cliente.getFecha(),cliente.getTotal());
   }
}
