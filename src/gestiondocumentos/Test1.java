package gestiondocumentos;


import Basicos.Organizacion;
import Basicos.Persona;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.time.LocalDate;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Test1 {

    public static void main(String[] args) {
        LocalDate f = LocalDate.now();
        Persona rl=null;
        Organizacion eps = new Organizacion(101,"Sanitas",rl,"Cll 6 23 56","contacto@sanitas.com.co",f,"EPS");
        Persona p = new Persona(2, "Carlos Diaz", "carlos.diaz@mail.com", f, "Cll 12 45 00", eps);
        MongoClient mc=ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase database = mc.getDatabase("Documents").withCodecRegistry(codecRegistry);;
        MongoCollection<Persona> personaMongo = database.getCollection("Personas", Persona.class);
        long cant=personaMongo.countDocuments();
        System.out.println("Antes:"+cant);
        personaMongo.insertOne(p);
        cant=personaMongo.countDocuments();
        System.out.println("Después:"+cant);
        
    }
    
}
