/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoparcial.Pagos;

import segundoparcial.Personas.User;

/**
 *
 * @author usuario
 */
public class CreditCard extends Pago{

    public CreditCard(User estudiante, double saldo) {
        super(estudiante, saldo);
    }

    @Override
    public boolean Validar() {
        //System.out.println("Validacion con el banco");
        return true;
    }

    @Override
    public void RealizarPago(double costo) {
        System.out.println("Su saldo es: " + getSaldo());
        setSaldo(getSaldo()-costo);
        System.out.println("Se realizo el pago correctamente, su nuevo saldo es: " + getSaldo());
    }
    
}
