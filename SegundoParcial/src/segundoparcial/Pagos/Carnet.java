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
public class Carnet extends Pago{

    public Carnet(User estudiante, double saldo) {
        super(estudiante, saldo);
    }

    @Override
    public boolean Validar() {
        return true;
    }

    @Override
    public void RealizarPago(double costo) {
        System.out.println("Su saldo es: " + getSaldo());
        if (costo > getSaldo()) {
            System.out.println("Saldo insuficiente para realizar la compra");
            return;
        }        
        setSaldo(getSaldo()-costo);
        System.out.println("Se realizo el pago correctamente, su nuevo saldo es: " + getSaldo());
    }
    
}
