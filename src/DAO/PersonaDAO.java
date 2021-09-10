/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Basicos.Persona;
import IDAO.IPersonaDAO;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.result.DeleteResult;
import gestiondocumentos.ConexionBD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Usuario
 */
public class PersonaDAO implements IPersonaDAO {

    @Override
    public List<Persona> listPersona() {
        ArrayList<Persona> listaPersona = new ArrayList();
        Persona p;
        MongoClient mC = ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase docsBD = mC.getDatabase("Documents").withCodecRegistry(codecRegistry);
        MongoCollection<Persona> personaMongo = docsBD.getCollection("Personas", Persona.class);
        FindIterable<Persona> cur = personaMongo.find();
        Iterator<Persona> iter = cur.iterator();
        while (iter.hasNext()) {
            p = iter.next();
            listaPersona.add(p);
        }
        return listaPersona;
    }
        
    @Override
    public Persona obtenerPersona(double id) {
        Persona p = null;
        try {
            MongoClient mC = ConexionBD.crearConexion();
            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
            CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
            MongoDatabase docsBD = mC.getDatabase("Documents").withCodecRegistry(codecRegistry);;
            MongoCollection<Persona> personaCollection = docsBD.getCollection("Personas", Persona.class);
            p = personaCollection.find(new Document("_id", id)).first();
            return p;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return p;
    }

    @Override
    public void insertarPersona(Persona persona) {
        MongoClient mc = ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase database = mc.getDatabase("Documents").withCodecRegistry(codecRegistry);;
        MongoCollection<Persona> personaMongo = database.getCollection("Personas", Persona.class);
        personaMongo.insertOne(persona);
    }

    @Override
    public void actualizarPersona(Persona persona) {
        Persona p;
        MongoClient mc = ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase database = mc.getDatabase("Documents").withCodecRegistry(codecRegistry);;
        MongoCollection<Persona> personaMongo = database.getCollection("Personas", Persona.class);
        p = personaMongo.find(new Document("_id", persona.getId())).first();
        Document filterById = new Document("_id", p.getId());
        FindOneAndReplaceOptions returnDocAfterReplace = new FindOneAndReplaceOptions().returnDocument(ReturnDocument.AFTER);
        Persona updatedPersona = personaMongo.findOneAndReplace(filterById, persona, returnDocAfterReplace);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        MongoClient mc = ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase database = mc.getDatabase("Documents").withCodecRegistry(codecRegistry);;
        MongoCollection<Persona> personaMongo = database.getCollection("Personas", Persona.class);
        Persona p = personaMongo.find(new Document("_id", persona.getId())).first();
        Document filterById = new Document("_id", p.getId());
        DeleteResult res= personaMongo.deleteOne(filterById);
        
    }
    
}
