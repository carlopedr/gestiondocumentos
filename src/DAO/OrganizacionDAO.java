/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Basicos.Organizacion;
import Basicos.Organizacion;
import IDAO.IOrganizacionDAO;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
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
public class OrganizacionDAO implements IOrganizacionDAO {

    @Override
    public List<Organizacion> listOrganizacion() {
        ArrayList<Organizacion> listaOrganizacion = new ArrayList();
        Organizacion o;
        MongoClient mC = ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase docsBD = mC.getDatabase("Documents").withCodecRegistry(codecRegistry);
        MongoCollection<Organizacion> organizacionMongo = docsBD.getCollection("Orgs", Organizacion.class);
        FindIterable<Organizacion> cur = organizacionMongo.find();
        Iterator<Organizacion> iter = cur.iterator();
        while (iter.hasNext()) {
            o = iter.next();
            listaOrganizacion.add(o);
        }
        return listaOrganizacion;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Organizacion obtenerOrganizacion(double id) {
        Organizacion o = null;
        try {
            MongoClient mC = ConexionBD.crearConexion();
            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
            CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
            MongoDatabase docsBD = mC.getDatabase("Documents").withCodecRegistry(codecRegistry);;
            MongoCollection<Organizacion> organizacionCollection = docsBD.getCollection("Orgs", Organizacion.class);
            o = organizacionCollection.find(new Document("_id", id)).first();
            return o;
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return o;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarOrganizacion(Organizacion organizacion) {
        MongoClient mc = ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase database = mc.getDatabase("Documents").withCodecRegistry(codecRegistry);;
        MongoCollection<Organizacion> organizacionMongo = database.getCollection("Orgs", Organizacion.class);
        organizacionMongo.insertOne(organizacion);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarOrganizacion(Organizacion organizacion) {
        Organizacion p;
        MongoClient mc = ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase database = mc.getDatabase("Documents").withCodecRegistry(codecRegistry);;
        MongoCollection<Organizacion> organizacionMongo = database.getCollection("Orgs", Organizacion.class);
        p = organizacionMongo.find(new Document("_id", organizacion.getId())).first();
        Document filterById = new Document("_id", p.getId());
        FindOneAndReplaceOptions returnDocAfterReplace = new FindOneAndReplaceOptions().returnDocument(ReturnDocument.AFTER);
        Organizacion updatedOrganizacion = organizacionMongo.findOneAndReplace(filterById, organizacion, returnDocAfterReplace);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarOrganizacion(Organizacion organizacion) {
        MongoClient mc = ConexionBD.crearConexion();
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoDatabase database = mc.getDatabase("Documents").withCodecRegistry(codecRegistry);;
        MongoCollection<Organizacion> organizacionMongo = database.getCollection("Orgs", Organizacion.class);
        Organizacion p = organizacionMongo.find(new Document("_id", organizacion.getId())).first();
        Document filterById = new Document("_id", p.getId());
        DeleteResult res= organizacionMongo.deleteOne(filterById);
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
