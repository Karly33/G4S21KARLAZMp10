/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

/**
 *
 * @author KJS
 */
public class Datos {
  String Nombre;
  int edad;
  String correo;

    public Datos(String Nombre, int edad, String correo) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public Datos() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
  
}
