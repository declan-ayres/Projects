import java.util.Date;

import java.sql.Timestamp;
import java.util.Properties;





import com.$314e.bhrest.RestApiTest;
import com.$314e.bhrestapi.BHRestApi;
import com.$314e.bhrestapi.BHRestUtil;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Update {
	public static void main(String[] args) throws Exception {
		
		 final String CLIENT_ID = "71eb9c1a-27e1-4bb6-8c60-8f835cc51651";
		 final String CLIENT_SECRET = "lU5yFm9ypiLPctFGzidBaXYV7c53Drie";

		 Properties properties = new Properties();
		 ObjectNode token;
		 String restToken;
		 BHRestApi.Entity entityApi;

		
		BHRestApi.Auth entityApi2 = BHRestUtil.getAuthApi();
		properties.load(Update.class.getResourceAsStream("/local.properties"));
		token = BHRestUtil.getRestToken(properties.getProperty("CLIENT_ID", CLIENT_ID),
				properties.getProperty("CLIENT_SECRET", CLIENT_SECRET), properties.getProperty("BH_USER"),
				properties.getProperty("BH_PASSWORD"));
		restToken = token.get("BhRestToken").asText();
		entityApi = BHRestUtil.getEntityApi(token);
		
		
		
		
		
		/*ObjectNode candidates = entityApi.search(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE,
				restToken, "id:3636" + " " + "OR" + " " + 
						"id:3681" + " " + "OR" + " " + 
						"id:3762" + " " + "OR" + " " + 
						"id:3941" + " " + "OR" + " " + 
						"id:3997" + " " + "OR" + " " + 
						"id:4094" + " " + "OR" + " " + 
						"id:4200" + " " + "OR" + " " + 
						"id:4226" + " " + "OR" + " " + 
						"id:4426" + " " + "OR" + " " + 
						"id:4500" + " " + "OR" + " " + 
						"id:4631" + " " + "OR" + " " + 
						"id:4659" + " " + "OR" + " " + 
						"id:4670" + " " + "OR" + " " + 
						"id:4690" + " " + "OR" + " " + 
						"id:4822" + " " + "OR" + " " + 
						"id:4848" + " " + "OR" + " " + 
						"id:4866" + " " + "OR" + " " + 
						"id:4896" + " " + "OR" + " " + 
						"id:4946" + " " + "OR" + " " + 
						"id:5123" + " " + "OR" + " " + 
						"id:5206" + " " + "OR" + " " + 
						"id:5406" + " " + "OR" + " " + 
						"id:5414" + " " + "OR" + " " + 
						"id:5420" + " " + "OR" + " " + 
						"id:5488" + " " + "OR" + " " + 
						"id:5498" + " " + "OR" + " " + 
						"id:5543" + " " + "OR" + " " + 
						"id:5579" + " " + "OR" + " " + 
						"id:5607" + " " + "OR" + " " + 
						"id:5616" + " " + "OR" + " " + 
						"id:5665" + " " + "OR" + " " + 
						"id:5719" + " " + "OR" + " " + 
						"id:5779" + " " + "OR" + " " + 
						"id:5796" + " " + "OR" + " " + 
						"id:5830" + " " + "OR" + " " + 
						"id:5847" + " " + "OR" + " " + 
						"id:5886" + " " + "OR" + " " + 
						"id:12440" + " " + "OR" + " " + 
						"id:12469" + " " + "OR" + " " + 
						"id:12498" + " " + "OR" + " " + 
						"id:12553" + " " + "OR" + " " + 
						"id:12600" + " " + "OR" + " " + 
						"id:13098" + " " + "OR" + " " + 
						"id:13186" + " " + "OR" + " " + 
						"id:13248" + " " + "OR" + " " + 
						"id:13273" + " " + "OR" + " " + 
						"id:13459" + " " + "OR" + " " + 
						"id:13495" + " " + "OR" + " " + 
						"id:14353" + " " + "OR" + " " + 
						"id:14429" + " " + "OR" + " " + 
						"id:14432" + " " + "OR" + " " + 
						"id:14434" + " " + "OR" + " " + 
						"id:14521" + " " + "OR" + " " + 
						"id:14559" + " " + "OR" + " " + 
						"id:14773" + " " + "OR" + " " + 
						"id:14937" + " " + "OR" + " " + 
						"id:15014" + " " + "OR" + " " + 
						"id:15137" + " " + "OR" + " " + 
						"id:15253" + " " + "OR" + " " + 
						"id:15324" + " " + "OR" + " " + 
						"id:15597" + " " + "OR" + " " + 
						"id:16410" + " " + "OR" + " " + 
						"id:16604" + " " + "OR" + " " + 
						"id:16622" + " " + "OR" + " " + 
						"id:16882" + " " + "OR" + " " + 
						"id:17034" + " " + "OR" + " " + 
						"id:17065" + " " + "OR" + " " + 
						"id:17076" + " " + "OR" + " " + 
						"id:17208" + " " + "OR" + " " + 
						"id:17277" + " " + "OR" + " " + 
						"id:17308" + " " + "OR" + " " + 
						"id:17331" + " " + "OR" + " " + 
						"id:17513" + " " + "OR" + " " + 
						"id:17599" + " " + "OR" + " " + 
						"id:17621" + " " + "OR" + " " + 
						"id:17746" + " " + "OR" + " " + 
						"id:17758" + " " + "OR" + " " + 
						"id:17961" + " " + "OR" + " " + 
						"id:18049" + " " + "OR" + " " + 
						"id:18353" + " " + "OR" + " " + 
						"id:18461" + " " + "OR" + " " + 
						"id:19064" + " " + "OR" + " " + 
						"id:19104" + " " + "OR" + " " + 
						"id:19175" + " " + "OR" + " " + 
						"id:19829" + " " + "OR" + " " + 
						"id:20693" + " " + "OR" + " " + 
						"id:21047" + " " + "OR" + " " + 
						"id:21945" + " " + "OR" + " " + 
						"id:22416" + " " + "OR" + " " + 
						"id:22758" + " " + "OR" + " " + 
						"id:22823" + " " + "OR" + " " + 
						"id:23041" + " " + "OR" + " " + 
						"id:23133" + " " + "OR" + " " + 
						"id:23482" + " " + "OR" + " " + 
						"id:23916" + " " + "OR" + " " + 
						"id:24199" + " " + "OR" + " " + 
						"id:24804" + " " + "OR" + " " + 
						"id:25279" + " " + "OR" + " " + 
						"id:25359" + " " + "OR" + " " + 
						"id:25483" + " " + "OR" + " " + 
						"id:25949" + " " + "OR" + " " + 
						"id:29963" + " " + "OR" + " " + 
						"id:31657" + " " + "OR" + " " + 
						"id:31686" + " " + "OR" + " " + 
						"id:32232" + " " + "OR" + " " + 
						"id:32334" + " " + "OR" + " " + 
						"id:32376" + " " + "OR" + " " + 
						"id:32626" + " " + "OR" + " " + 
						"id:32913" + " " + "OR" + " " + 
						"id:34466" + " " + "OR" + " " + 
						"id:34589" + " " + "OR" + " " + 
						"id:36544" + " " + "OR" + " " + 
						"id:36781" + " " + "OR" + " " + 
						"id:36836" + " " + "OR" + " " + 
						"id:38706" + " " + "OR" + " " + 
						"id:39304" + " " + "OR" + " " + 
						"id:39794" + " " + "OR" + " " + 
						"id:39801" + " " + "OR" + " " + 
						"id:40079" + " " + "OR" + " " + 
						"id:40529" + " " + "OR" + " " + 
						"id:40890" + " " + "OR" + " " + 
						"id:41187" + " " + "OR" + " " + 
						"id:41302" + " " + "OR" + " " + 
						"id:42214" + " " + "OR" + " " + 
						"id:42310" + " " + "OR" + " " + 
						"id:42346" + " " + "OR" + " " + 
						"id:42627" + " " + "OR" + " " + 
						"id:42966" + " " + "OR" + " " + 
						"id:42990" + " " + "OR" + " " + 
						"id:43249" + " " + "OR" + " " + 
						"id:43415" + " " + "OR" + " " + 
						"id:44145" + " " + "OR" + " " + 
						"id:44208" + " " + "OR" + " " + 
						"id:44475" + " " + "OR" + " " + 
						"id:44485" + " " + "OR" + " " + 
						"id:44890" + " " + "OR" + " " + 
						"id:44891" + " " + "OR" + " " + 
						"id:44900" + " " + "OR" + " " + 
						"id:45425" + " " + "OR" + " " + 
						"id:46277" + " " + "OR" + " " + 
						"id:46309" + " " + "OR" + " " + 
						"id:47190" + " " + "OR" + " " + 
						"id:47367" + " " + "OR" + " " + 
						"id:48020" + " " + "OR" + " " + 
						"id:48173" + " " + "OR" + " " + 
						"id:49283" + " " + "OR" + " " + 
						"id:49579" + " " + "OR" + " " + 
						"id:49913" + " " + "OR" + " " + 
						"id:49983" + " " + "OR" + " " + 
						"id:53386" + " " + "OR" + " " + 
						"id:53635" + " " + "OR" + " " + 
						"id:53765" + " " + "OR" + " " + 
						"id:53777" + " " + "OR" + " " + 
						"id:53958" + " " + "OR" + " " + 
						"id:53992" + " " + "OR" + " " + 
						"id:54018" + " " + "OR" + " " + 
						"id:54127" + " " + "OR" + " " + 
						"id:54288" + " " + "OR" + " " + 
						"id:54469" + " " + "OR" + " " + 
						"id:55651" + " " + "OR" + " " + 
						"id:55660" + " " + "OR" + " " + 
						"id:55698" + " " + "OR" + " " + 
						"id:55895" + " " + "OR" + " " + 
						"id:56820" + " " + "OR" + " " + 
						"id:57300" + " " + "OR" + " " + 
						"id:57313" + " " + "OR" + " " + 
						"id:57665" + " " + "OR" + " " + 
						"id:57684" + " " + "OR" + " " + 
						"id:57724" + " " + "OR" + " " + 
						"id:57894" + " " + "OR" + " " + 
						"id:57909" + " " + "OR" + " " + 
						"id:57913" + " " + "OR" + " " + 
						"id:58326" + " " + "OR" + " " + 
						"id:58482" + " " + "OR" + " " + 
						"id:58562" + " " + "OR" + " " + 
						"id:59452" + " " + "OR" + " " + 
						"id:61110" + " " + "OR" + " " + 
						"id:61263" + " " + "OR" + " " + 
						"id:61366" + " " + "OR" + " " + 
						"id:62155" + " " + "OR" + " " + 
						"id:63754" + " " + "OR" + " " + 
						"id:64632" + " " + "OR" + " " + 
						"id:64742" + " " + "OR" + " " + 
						"id:64944" + " " + "OR" + " " + 
						"id:65741" + " " + "OR" + " " + 
						"id:67519" + " " + "OR" + " " + 
						"id:68709" + " " + "OR" + " " + 
						"id:69635", "id, customText20", "+id" , 188, 0);
		
		
		JsonNode candId = candidates.path("data").get(0).path("id");
		
		System.out.println(candidates);
		System.out.println(candidates.path("total").asInt());
		
		ObjectNode toUpdate = entityApi.get(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE,
				restToken, candidates.path("data").get(0).path("id"), "customText20");
		
		
		
		System.out.println(candidates.path("data").get(0).path("id"));
		
		
		
		 ObjectNode updates = entityApi.update(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE, restToken, candidates.path("data").get(0).path("id"), 
				 ((ObjectNode) toUpdate.path("data")).put("customText20", "RockStar"));
		
		System.out.println(toUpdate);
		
		
		System.out.println(updates);
		
		

		
		System.out.println(" ");
		
		for (int index =0; index< candidates.path("total").asInt(); index++) {
			
			candId = candidates.path("data").get(index).path("id");
			
			toUpdate = entityApi.get(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE,
					restToken, candId, "customText20");
			
			
			
			
			updates = entityApi.update(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE, restToken, candId, 
					 ((ObjectNode) toUpdate.path("data")).put("customText20", "RockStar"));
			
			
			
			System.out.println(toUpdate);
			System.out.println(updates.path("changedEntityId").asInt() + " " + (index+1));
			
			System.out.println(" ");
			
			
		}*/
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		long start = 0;
		
		
		ObjectNode candidates = entityApi.search(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE, restToken,
				"id:67282 OR id:67283 OR id:67284  OR id:67285 OR id:67286 OR id:67287 OR id:67288  OR id:67289 OR id:67290" ,
				"id, customDate2", "+id", 1, start);
		
		ObjectNode notes = entityApi.get(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE, restToken, candidates.path("data").get(0).path("id"), "notes");
		
		ObjectNode t = entityApi.get(BHRestApi.Entity.ENTITY_TYPE.NOTE, restToken,notes.path("data").path("notes").path("data").get(0).path("id"),
				"dateAdded, action");
		
		
		
		System.out.println(t);
		System.out.println(notes);
		System.out.println(notes.path("data").path("notes").path("data").get(0).path("id"));
		System.out.println(candidates);
		System.out.println(candidates.path("data").get(0).path("id"));
		
		
		Date date;
		long stamp;
		
		
		  
		  
		  for (int i = 0; i < candidates.path("total").asInt(); i++ ) {
			  
			  candidates = entityApi.search(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE, restToken,
						"isDeleted:0 AND NOT status:archive" ,
						"id, notes, customDate2", "+id", 1, start);
			  
			  System.out.println(candidates);
			  System.out.println(candidates.path("data").get(0).path("id"));
			  
			  notes = entityApi.get(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE, restToken,
					  candidates.path("data").get(0).path("id"), "notes");
			  
			  
			 
			  if (notes.path("data").path("notes").path("total").asInt() > 1) {
				
				  
				  for (int index=0; index<notes.path("data").path("notes").path("total").asInt(); index++) {
			  
					  System.out.println(notes);
					  t = entityApi.get(BHRestApi.Entity.ENTITY_TYPE.NOTE,
					  restToken,notes.path("data").path("notes").path("data").get(index).path("id"), "dateAdded, action");
			  
			  
				  
			  
			  
					  if (t.path("data").path("action").asText().equals("Outbound Call") ||
							  t.path("data").path("action").asText().equals("Inbound Call") ||
							  	t.path("data").path("action").asText().equals("Interview") || 
							  		t.path("data").path("action").asText().equals("Prescreened")) {
				  
						  stamp = t.path("data").path("dateAdded").longValue();
						  date = new Date(stamp);
						  System.out.println(date);
						  break;
					  }
					  
				  } 
			  
			  } else if (notes.path("data").path("notes").path("total").asInt() == 1) {
				  
				  t = entityApi.get(BHRestApi.Entity.ENTITY_TYPE.NOTE,
						  restToken,notes.path("data").path("notes").path("data").get(0).path("id"), "dateAdded, action");
				  
				  
				  if (t.path("data").path("action").asText().equals("Outbound Call") ||
						  t.path("data").path("action").asText().equals("Inbound Call") ||
						  	t.path("data").path("action").asText().equals("Interview") || 
						  		t.path("data").path("action").asText().equals("Prescreened")) {
			  
					  stamp = t.path("data").path("dateAdded").longValue();
					  date = new Date(stamp);
					  System.out.println(date);
					  
				  }
				  
				  
			  }
			  else {
				  
				  System.out.println("No Notes");
				  
			  
			  }
			  
			  start++;
		
		  }
		  
	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
 }
	

