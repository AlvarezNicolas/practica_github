/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.ServicioPersona;

/**
 *
 * @author anico
 */
public class ServicioPersona {
    
    public Personas CrearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        
        System.out.println("Ingrese el nomnbre de la persona");
        String Nombre = leer.next();

        System.out.println("Ingrese el apellido de la persona");
        String Apellido = leer.next();

        System.out.println("Ingrese la edad de la persona");
        int Edad = leer.nextInt();
        return new Personas();
    }    
}
