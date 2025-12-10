package com.dam.programacion.io.files.xml.basic_xml_reading;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//VAMOS A LEER LA AGENDA DESDE UN ARCHIVO XML

public class XmlContactReader {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File("agenda1.xml"));

            // Normalizamos el documento 
            doc.getDocumentElement().normalize();

            // Obtenemos el elemento raíz
            System.out.println("Elemento raíz: " + doc.getDocumentElement().getNodeName());

            // Obtenemos todos los nodos "Contacto"
            NodeList listaContactos = doc.getElementsByTagName("Contacto");

            System.out.println("Número de contactos: " + listaContactos.getLength());

            // Recorremos la lista de nodos de tipo Contacto
            for (int i = 0; i < listaContactos.getLength(); i++) {
                Node nodo = listaContactos.item(i);

                // Comprobamos si es un elemento (por seguridad)
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    NamedNodeMap atributos = nodo.getAttributes();

                    // Mostramos los atributos del contacto
                    String nombre = atributos.getNamedItem("Nombre").getTextContent();
                    String telefono = atributos.getNamedItem("Teléfono").getTextContent();
                    String email = atributos.getNamedItem("email").getTextContent();

                    System.out.println("\nContacto " + (i + 1));
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Teléfono: " + telefono);
                    System.out.println("Email: " + email);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}