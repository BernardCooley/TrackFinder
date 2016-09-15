package frameworkUtils;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

	public static ArrayList<String> GetCollectionContents(String databaseURI, String databaseName, String collectionName) {
		ArrayList<String> mongoDBContents = new ArrayList<String>(); 
		MongoClientURI connectionString = new MongoClientURI(databaseURI);
		MongoClient mongoClient = new MongoClient(connectionString);

		MongoDatabase database = mongoClient.getDatabase(databaseName);

		MongoCollection<Document> collection = database.getCollection(collectionName);
		
		MongoCursor<Document> cursor = collection.find().iterator();
		try {
		    while (cursor.hasNext()) {
		        mongoDBContents.add(cursor.next().toJson());
		    }
		} finally {
		    cursor.close();
		}
		return mongoDBContents;
	}
}
