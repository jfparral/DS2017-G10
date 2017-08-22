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
public abstract class Pago {
    private User estudiante;
    private double saldo;

    public Pago(User estudiante, double saldo) {
        this.estudiante = estudiante;
        this.saldo=saldo;
    }

    public User getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(User estudiante) {
        this.estudiante = estudiante;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract boolean Validar();
    public abstract void RealizarPago(double costo);
}
