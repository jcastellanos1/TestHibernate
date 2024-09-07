/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.umg.modelos.controllers;

import com.edu.umg.modelos.PersonaDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author caste
 */
public class PersonaController {

    public String createUsuario(String nombre, String apellido, int telefono, String correo, int estado) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(PersonaDAO.class).buildSessionFactory();

        Session session = sessionFactory.openSession();

        try {

            PersonaDAO persona = new PersonaDAO(nombre,apellido,telefono, correo,estado);
            session.beginTransaction();
            session.save(persona);
            session.getTransaction().commit();
            session.close();
            return "Usuario Creado";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "Error al registrar usuario";
    }

}