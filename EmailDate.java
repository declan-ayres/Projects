import com.google.api.client.auth.oauth2.Credential;




import com.google.api.client.auth.oauth2.RefreshTokenRequest;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.java6.auth.oauth2.FileCredentialStore;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.Message;
import com.google.api.services.gmail.model.MessagePartHeader;





import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;


import java.util.Collections;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.sql.Timestamp;





import com.$314e.bhrest.RestApiTest;
import com.$314e.bhrestapi.BHRestApi;
import com.$314e.bhrestapi.BHRestUtil;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.ObjectNode;





public class EmailDate {
	
	
	private static final String APP_NAME = "Gmail API Quickstart";
	private static final File DATA_STORE_DIR = new File(System.getProperty("user.home"), ".store/gmail");
	private static final String USER = "me";
	private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
	private static FileDataStoreFactory dataStoreFactory;
	private static HttpTransport httpTransport;
	private static Gmail gmail;
	
	 public static void main(String[] args) throws Exception {
		 
		 
		 
		 
		 
		 final String CLIENT_ID = "71eb9c1a-27e1-4bb6-8c60-8f835cc51651";
		 final String CLIENT_SECRET = "lU5yFm9ypiLPctFGzidBaXYV7c53Drie";

		 Properties properties = new Properties();
		 ObjectNode token;
		 String restToken;
		 BHRestApi.Entity entityApi;

		
		BHRestApi.Auth entityApi2 = BHRestUtil.getAuthApi();
		properties.load(BHRestApi.class.getResourceAsStream("/local.properties"));
		token = BHRestUtil.getRestToken(properties.getProperty("CLIENT_ID", CLIENT_ID),
				properties.getProperty("CLIENT_SECRET", CLIENT_SECRET), properties.getProperty("BH_USER"),
				properties.getProperty("BH_PASSWORD"));
		restToken = token.get("BhRestToken").asText();
		entityApi = BHRestUtil.getEntityApi(token);
		
		 
		 
		 int start = 0;
		ObjectNode candidates = entityApi.search(BHRestApi.Entity.ENTITY_TYPE.CANDIDATE, restToken, "isDeleted:0 AND NOT status:archive", "email, email2, email3", "+id", 500, start);
		 
		 
		 System.out.println(candidates);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 httpTransport = GoogleNetHttpTransport.newTrustedTransport();
			dataStoreFactory = new FileDataStoreFactory(DATA_STORE_DIR);
			
			final GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY,
					new FileReader("/Users/Declan.Ayres/Downloads/client_secret.json"));
			
			if (clientSecrets.getDetails().getClientId().startsWith("Enter")
					|| clientSecrets.getDetails().getClientSecret().startsWith("Enter ")) {
				System.out.println(
						"Enter Client ID and Secret from https://code.google.com/apis/console/?api=plus "
								+ "into plus-cmdline-sample/src/main/resources/client_secrets.json");
				System.exit(1);
			}
			
			GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
					httpTransport, JSON_FACTORY, "478879743464-ia6umd8p235lsb34kncs122kgg83pc40.apps.googleusercontent.com", "yZLT__k3hGCDu-GFchLesw4a", 
					Collections.singleton(GmailScopes.GMAIL_MODIFY)).setDataStoreFactory(
					dataStoreFactory).build();
			
			
			String random ="k";
			
			
		Credential auth =	new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize(random);
		
		if (auth.getExpiresInSeconds()<=0) {
			Random rand = new Random();
			int randNumber = rand.nextInt((10-1)+1)+1;
			Random r = new Random();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i<randNumber; i++) {
				char c = (char) (r.nextInt(Character.MAX_VALUE));
				sb.append(c);
			}
			random = sb.toString();
			System.out.println(random);
			auth =	new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize(random);
		}
		

		System.out.println(auth.getExpiresInSeconds());
		 
		final Credential credential = auth;
		 
		
		 
		 gmail = new Gmail.Builder(httpTransport, JSON_FACTORY, credential).setApplicationName(APP_NAME).build();
		
		 
		 
		 int i = 1;
			final String useremail = "declan.ayres@314ecorp.com";
			
			
			
			
			
			for (final Message msgId : gmail.users().messages().list("bullhorn@314ecorp.com")
					.setQ("in:inbox (from:" + useremail + " OR to:" + useremail + ")  after:2014/7/9")
					.execute().getMessages()) {
				System.out.println("############################    " + i++ + "    #############################");
				
				final Message message = gmail.users().messages().get("bullhorn@314ecorp.com", msgId.getId()).setFormat("full").execute();
				
				
				final MessagePartHeader to = message.getPayload().getHeaders().stream().filter(h -> (h.getName().equals
						("To") && h.getValue().toLowerCase().contains(useremail)) ||
						(h.getName().equalsIgnoreCase("Cc") && h.getValue().toLowerCase().contains(useremail)))
						.findFirst().orElse(null);
				final MessagePartHeader from = message.getPayload().getHeaders().stream().filter(h -> h.getName().equals
						("From") && h.getValue().toLowerCase().contains("mimi.curiel@314ecorp.com")).findFirst().orElse(null);
				final MessagePartHeader date = message.getPayload().getHeaders().stream().filter(h -> h.getName().equals
						("Date")).findFirst().orElse(null);
				
				if (to != null && from !=null){
					System.out.println(to.toPrettyString());
					System.out.println(from.toPrettyString());
				}
				
				
				System.out.println(date.toPrettyString());
			}
		 
		 
		 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
			
			/*
			for (final Message msgId : gmail.users().messages().list(USER)
					.setQ("in:inbox (from:" + useremail + " OR to:" + useremail + ")  after:2014/7/9")
					.execute().getMessages()) {
				System.out.println("############################    " + i++ + "    #############################");
				
				final Message message = gmail.users().messages().get(USER, msgId.getId()).setFormat("full").execute();

				final MessagePartHeader to = message.getPayload().getHeaders().stream().filter(h -> (h.getName().equals
						("To") && h.getValue().toLowerCase().contains(useremail)) ||
						(h.getName().equalsIgnoreCase("Cc") && h.getValue().toLowerCase().contains(useremail)))
						.findFirst().orElse(null);
				final MessagePartHeader from = message.getPayload().getHeaders().stream().filter(h -> h.getName().equals
						("From") && h.getValue().toLowerCase().contains("mimi.curiel@314ecorp.com")).findFirst().orElse(null);
				final MessagePartHeader date = message.getPayload().getHeaders().stream().filter(h -> h.getName().equals
						("Date")).findFirst().orElse(null);
				
				if (to != null && from !=null){
					System.out.println(to.toPrettyString());
					System.out.println(from.toPrettyString());
				}
				
				
				System.out.println(date.toPrettyString());
			}*/
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
