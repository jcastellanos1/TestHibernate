/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;
import com.edu.umg.modelos.controllers.PersonaController;


/**
 *
 * @author caste
 */
public class VistaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String persona = new PersonaController().createUsuario("Victoria", "Sandoval", 12345678, "victoriasan@example.com", 1 );

        System.out.println(persona);
        System.out.println("Usuario Creado");



    }

}
