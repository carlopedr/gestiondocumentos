/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondocumentos;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;



/**
 *
 * @author Usuario
 */
public class ConexionBD {
    /**
     * Clase para crear una conexión a MongoDB.
     * @return MongoClient conexión
     */
    public static MongoClient crearConexion() {
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient(new MongoClientURI("mongodb://admin:Usco12345@cluster0-shard-00-00.vigaa.mongodb.net:27017,cluster0-shard-00-01.vigaa.mongodb.net:27017,cluster0-shard-00-02.vigaa.mongodb.net:27017/Documents?ssl=true&replicaSet=atlas-10ow43-shard-0&authSource=admin&retryWrites=true&w=majority"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
 
        return mongoClient;
    }
}
