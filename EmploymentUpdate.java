import java.net.URL;








import javax.xml.namespace.QName;






import com.bullhorn.apiservice.ApiService;
import com.bullhorn.apiservice.ApiService_Service;
import com.bullhorn.apiservice.query.DtoQuery;
import com.bullhorn.apiservice.result.ApiFindResult;
import com.bullhorn.apiservice.result.ApiFindMultipleResult;
import com.bullhorn.apiservice.result.ApiQueryResult;
import com.bullhorn.apiservice.result.ApiStartSessionResult;
import com.bullhorn.entity.ApiEntityName;
import com.bullhorn.entity.note.*;
import com.bullhorn.apiservice.result.*;
import com.bullhorn.entity.candidate.*;
import com.bullhorn.entity.template.user.*;
import com.bullhorn.entity.template.client.*;
import com.bullhorn.entity.template.job.*;


public class EmploymentUpdate {
	
	private static final QName SERVICE_NAME = new QName("http://apiservice.bullhorn.com/", "ApiService");
	private static final String WSDL_URL = "https://api.bullhornstaffing.com/webservices-2.5/?wsdl";
	private static final String API_USER = "314e.API";
	private static final String API_PASSWD = "314e.com";
	private static final String API_KEY = "F5EA5835-9A07-81A4-448468FE85A30556";

	
	

public static void main(String[] args) throws Exception {
	
	final URL serviceUrl = new URL(ApiService_Service.class.getResource("."), WSDL_URL);
	
	final ApiService apiService = new ApiService_Service(serviceUrl, SERVICE_NAME).getApiServicePort();
	
	final ApiStartSessionResult startSession = apiService.startSession(API_USER, API_PASSWD, API_KEY);
	
	
	
	String session = startSession.getSession();	
	
	
	
	DtoQuery myQuery = new DtoQuery();
	myQuery.setEntityName("Candidate");
	myQuery.setMaxResults(378);
	myQuery.setWhere("userID='3704'" + " " + "OR" + " " + 
			"userID='3815'" + " " + "OR" + " " + 
			"userID='3885'" + " " + "OR" + " " + 
			"userID='4090'" + " " + "OR" + " " + 
			"userID='4091'" + " " + "OR" + " " + 
			"userID='4289'" + " " + "OR" + " " + 
			"userID='4346'" + " " + "OR" + " " + 
			"userID='4390'" + " " + "OR" + " " + 
			"userID='4798'" + " " + "OR" + " " + 
			"userID='4845'" + " " + "OR" + " " + 
			"userID='4863'" + " " + "OR" + " " + 
			"userID='4886'" + " " + "OR" + " " + 
			"userID='4901'" + " " + "OR" + " " + 
			"userID='5017'" + " " + "OR" + " " + 
			"userID='5233'" + " " + "OR" + " " + 
			"userID='5365'" + " " + "OR" + " " + 
			"userID='5549'" + " " + "OR" + " " + 
			"userID='5582'" + " " + "OR" + " " + 
			"userID='5680'" + " " + "OR" + " " + 
			"userID='5774'" + " " + "OR" + " " + 
			"userID='12272'" + " " + "OR" + " " + 
			"userID='12376'" + " " + "OR" + " " + 
			"userID='12424'" + " " + "OR" + " " + 
			"userID='12427'" + " " + "OR" + " " + 
			"userID='12464'" + " " + "OR" + " " + 
			"userID='13406'" + " " + "OR" + " " + 
			"userID='13446'" + " " + "OR" + " " + 
			"userID='13456'" + " " + "OR" + " " + 
			"userID='13495'" + " " + "OR" + " " + 
			"userID='14147'" + " " + "OR" + " " + 
			"userID='14341'" + " " + "OR" + " " + 
			"userID='14440'" + " " + "OR" + " " + 
			"userID='14455'" + " " + "OR" + " " + 
			"userID='14456'" + " " + "OR" + " " + 
			"userID='14846'" + " " + "OR" + " " + 
			"userID='15143'" + " " + "OR" + " " + 
			"userID='15354'" + " " + "OR" + " " + 
			"userID='15468'" + " " + "OR" + " " + 
			"userID='16614'" + " " + "OR" + " " + 
			"userID='17024'" + " " + "OR" + " " + 
			"userID='17064'" + " " + "OR" + " " + 
			"userID='17208'" + " " + "OR" + " " + 
			"userID='17325'" + " " + "OR" + " " + 
			"userID='17510'" + " " + "OR" + " " + 
			"userID='17514'" + " " + "OR" + " " + 
			"userID='17818'" + " " + "OR" + " " + 
			"userID='17902'" + " " + "OR" + " " + 
			"userID='18722'" + " " + "OR" + " " + 
			"userID='18977'" + " " + "OR" + " " + 
			"userID='19354'" + " " + "OR" + " " + 
			"userID='19578'" + " " + "OR" + " " + 
			"userID='19752'" + " " + "OR" + " " + 
			"userID='19764'" + " " + "OR" + " " + 
			"userID='20072'" + " " + "OR" + " " + 
			"userID='21090'" + " " + "OR" + " " + 
			"userID='23524'" + " " + "OR" + " " + 
			"userID='23556'" + " " + "OR" + " " + 
			"userID='23753'" + " " + "OR" + " " + 
			"userID='23843'" + " " + "OR" + " " + 
			"userID='24199'" + " " + "OR" + " " + 
			"userID='24489'" + " " + "OR" + " " + 
			"userID='24526'" + " " + "OR" + " " + 
			"userID='25206'" + " " + "OR" + " " + 
			"userID='25829'" + " " + "OR" + " " + 
			"userID='26987'" + " " + "OR" + " " + 
			"userID='27347'" + " " + "OR" + " " + 
			"userID='28974'" + " " + "OR" + " " + 
			"userID='29447'" + " " + "OR" + " " + 
			"userID='30516'" + " " + "OR" + " " + 
			"userID='30711'" + " " + "OR" + " " + 
			"userID='32076'" + " " + "OR" + " " + 
			"userID='32107'" + " " + "OR" + " " + 
			"userID='32113'" + " " + "OR" + " " + 
			"userID='32343'" + " " + "OR" + " " + 
			"userID='32574'" + " " + "OR" + " " + 
			"userID='32849'" + " " + "OR" + " " + 
			"userID='32915'" + " " + "OR" + " " + 
			"userID='33044'" + " " + "OR" + " " + 
			"userID='33904'" + " " + "OR" + " " + 
			"userID='35601'" + " " + "OR" + " " + 
			"userID='36871'" + " " + "OR" + " " + 
			"userID='36911'" + " " + "OR" + " " + 
			"userID='38002'" + " " + "OR" + " " + 
			"userID='39002'" + " " + "OR" + " " + 
			"userID='40599'" + " " + "OR" + " " + 
			"userID='41040'" + " " + "OR" + " " + 
			"userID='41358'" + " " + "OR" + " " + 
			"userID='42179'" + " " + "OR" + " " + 
			"userID='42960'" + " " + "OR" + " " + 
			"userID='42966'" + " " + "OR" + " " + 
			"userID='43144'" + " " + "OR" + " " + 
			"userID='43642'" + " " + "OR" + " " + 
			"userID='44601'" + " " + "OR" + " " + 
			"userID='44806'" + " " + "OR" + " " + 
			"userID='44838'" + " " + "OR" + " " + 
			"userID='47157'" + " " + "OR" + " " + 
			"userID='47247'" + " " + "OR" + " " + 
			"userID='47801'" + " " + "OR" + " " + 
			"userID='48226'" + " " + "OR" + " " + 
			"userID='48319'" + " " + "OR" + " " + 
			"userID='48359'" + " " + "OR" + " " + 
			"userID='48569'" + " " + "OR" + " " + 
			"userID='48675'" + " " + "OR" + " " + 
			"userID='48998'" + " " + "OR" + " " + 
			"userID='49156'" + " " + "OR" + " " + 
			"userID='49181'" + " " + "OR" + " " + 
			"userID='49235'" + " " + "OR" + " " + 
			"userID='49281'" + " " + "OR" + " " + 
			"userID='49402'" + " " + "OR" + " " + 
			"userID='49403'" + " " + "OR" + " " + 
			"userID='49404'" + " " + "OR" + " " + 
			"userID='49414'" + " " + "OR" + " " + 
			"userID='49416'" + " " + "OR" + " " + 
			"userID='49449'" + " " + "OR" + " " + 
			"userID='49468'" + " " + "OR" + " " + 
			"userID='49596'" + " " + "OR" + " " + 
			"userID='49597'" + " " + "OR" + " " + 
			"userID='49598'" + " " + "OR" + " " + 
			"userID='49599'" + " " + "OR" + " " + 
			"userID='49600'" + " " + "OR" + " " + 
			"userID='49604'" + " " + "OR" + " " + 
			"userID='49608'" + " " + "OR" + " " + 
			"userID='49618'" + " " + "OR" + " " + 
			"userID='49620'" + " " + "OR" + " " + 
			"userID='49626'" + " " + "OR" + " " + 
			"userID='49627'" + " " + "OR" + " " + 
			"userID='49631'" + " " + "OR" + " " + 
			"userID='49640'" + " " + "OR" + " " + 
			"userID='49672'" + " " + "OR" + " " + 
			"userID='49685'" + " " + "OR" + " " + 
			"userID='49703'" + " " + "OR" + " " + 
			"userID='49716'" + " " + "OR" + " " + 
			"userID='49719'" + " " + "OR" + " " + 
			"userID='49729'" + " " + "OR" + " " + 
			"userID='49736'" + " " + "OR" + " " + 
			"userID='49758'" + " " + "OR" + " " + 
			"userID='49760'" + " " + "OR" + " " + 
			"userID='49764'" + " " + "OR" + " " + 
			"userID='49779'" + " " + "OR" + " " + 
			"userID='49781'" + " " + "OR" + " " + 
			"userID='49790'" + " " + "OR" + " " + 
			"userID='49801'" + " " + "OR" + " " + 
			"userID='49808'" + " " + "OR" + " " + 
			"userID='49837'" + " " + "OR" + " " + 
			"userID='49852'" + " " + "OR" + " " + 
			"userID='49856'" + " " + "OR" + " " + 
			"userID='49859'" + " " + "OR" + " " + 
			"userID='49893'" + " " + "OR" + " " + 
			"userID='49899'" + " " + "OR" + " " + 
			"userID='49900'" + " " + "OR" + " " + 
			"userID='49905'" + " " + "OR" + " " + 
			"userID='49909'" + " " + "OR" + " " + 
			"userID='49910'" + " " + "OR" + " " + 
			"userID='49974'" + " " + "OR" + " " + 
			"userID='49984'" + " " + "OR" + " " + 
			"userID='50039'" + " " + "OR" + " " + 
			"userID='50095'" + " " + "OR" + " " + 
			"userID='50111'" + " " + "OR" + " " + 
			"userID='50115'" + " " + "OR" + " " + 
			"userID='50125'" + " " + "OR" + " " + 
			"userID='50156'" + " " + "OR" + " " + 
			"userID='50157'" + " " + "OR" + " " + 
			"userID='50160'" + " " + "OR" + " " + 
			"userID='50199'" + " " + "OR" + " " + 
			"userID='50203'" + " " + "OR" + " " + 
			"userID='50210'" + " " + "OR" + " " + 
			"userID='50249'" + " " + "OR" + " " + 
			"userID='50254'" + " " + "OR" + " " + 
			"userID='50256'" + " " + "OR" + " " + 
			"userID='50276'" + " " + "OR" + " " + 
			"userID='50335'" + " " + "OR" + " " + 
			"userID='50337'" + " " + "OR" + " " + 
			"userID='50348'" + " " + "OR" + " " + 
			"userID='50350'" + " " + "OR" + " " + 
			"userID='50356'" + " " + "OR" + " " + 
			"userID='50365'" + " " + "OR" + " " + 
			"userID='50490'" + " " + "OR" + " " + 
			"userID='50505'" + " " + "OR" + " " + 
			"userID='50809'" + " " + "OR" + " " + 
			"userID='50819'" + " " + "OR" + " " + 
			"userID='50823'" + " " + "OR" + " " + 
			"userID='50882'" + " " + "OR" + " " + 
			"userID='50915'" + " " + "OR" + " " + 
			"userID='50917'" + " " + "OR" + " " + 
			"userID='50925'" + " " + "OR" + " " + 
			"userID='51040'" + " " + "OR" + " " + 
			"userID='51071'" + " " + "OR" + " " + 
			"userID='51130'" + " " + "OR" + " " + 
			"userID='51140'" + " " + "OR" + " " + 
			"userID='51164'" + " " + "OR" + " " + 
			"userID='51166'" + " " + "OR" + " " + 
			"userID='51168'" + " " + "OR" + " " + 
			"userID='51175'" + " " + "OR" + " " + 
			"userID='51183'" + " " + "OR" + " " + 
			"userID='51188'" + " " + "OR" + " " + 
			"userID='51189'" + " " + "OR" + " " + 
			"userID='51207'" + " " + "OR" + " " + 
			"userID='51216'" + " " + "OR" + " " + 
			"userID='51218'" + " " + "OR" + " " + 
			"userID='51220'" + " " + "OR" + " " + 
			"userID='51260'" + " " + "OR" + " " + 
			"userID='51262'" + " " + "OR" + " " + 
			"userID='51295'" + " " + "OR" + " " + 
			"userID='51296'" + " " + "OR" + " " + 
			"userID='51308'" + " " + "OR" + " " + 
			"userID='51311'" + " " + "OR" + " " + 
			"userID='51317'" + " " + "OR" + " " + 
			"userID='51329'" + " " + "OR" + " " + 
			"userID='51332'" + " " + "OR" + " " + 
			"userID='51337'" + " " + "OR" + " " + 
			"userID='51344'" + " " + "OR" + " " + 
			"userID='51371'" + " " + "OR" + " " + 
			"userID='51383'" + " " + "OR" + " " + 
			"userID='51420'" + " " + "OR" + " " + 
			"userID='51432'" + " " + "OR" + " " + 
			"userID='51451'" + " " + "OR" + " " + 
			"userID='51455'" + " " + "OR" + " " + 
			"userID='51460'" + " " + "OR" + " " + 
			"userID='51465'" + " " + "OR" + " " + 
			"userID='51512'" + " " + "OR" + " " + 
			"userID='51529'" + " " + "OR" + " " + 
			"userID='51553'" + " " + "OR" + " " + 
			"userID='51574'" + " " + "OR" + " " + 
			"userID='51592'" + " " + "OR" + " " + 
			"userID='51596'" + " " + "OR" + " " + 
			"userID='51628'" + " " + "OR" + " " + 
			"userID='51638'" + " " + "OR" + " " + 
			"userID='51639'" + " " + "OR" + " " + 
			"userID='51640'" + " " + "OR" + " " + 
			"userID='51645'" + " " + "OR" + " " + 
			"userID='51646'" + " " + "OR" + " " + 
			"userID='51930'" + " " + "OR" + " " + 
			"userID='51992'" + " " + "OR" + " " + 
			"userID='52052'" + " " + "OR" + " " + 
			"userID='52090'" + " " + "OR" + " " + 
			"userID='52091'" + " " + "OR" + " " + 
			"userID='52093'" + " " + "OR" + " " + 
			"userID='52094'" + " " + "OR" + " " + 
			"userID='52149'" + " " + "OR" + " " + 
			"userID='52156'" + " " + "OR" + " " + 
			"userID='52159'" + " " + "OR" + " " + 
			"userID='52162'" + " " + "OR" + " " + 
			"userID='52164'" + " " + "OR" + " " + 
			"userID='52166'" + " " + "OR" + " " + 
			"userID='52167'" + " " + "OR" + " " + 
			"userID='52169'" + " " + "OR" + " " + 
			"userID='52171'" + " " + "OR" + " " + 
			"userID='52173'" + " " + "OR" + " " + 
			"userID='52335'" + " " + "OR" + " " + 
			"userID='52353'" + " " + "OR" + " " + 
			"userID='52364'" + " " + "OR" + " " + 
			"userID='52392'" + " " + "OR" + " " + 
			"userID='52401'" + " " + "OR" + " " + 
			"userID='52404'" + " " + "OR" + " " + 
			"userID='52441'" + " " + "OR" + " " + 
			"userID='52443'" + " " + "OR" + " " + 
			"userID='52445'" + " " + "OR" + " " + 
			"userID='52449'" + " " + "OR" + " " + 
			"userID='52450'" + " " + "OR" + " " + 
			"userID='52453'" + " " + "OR" + " " + 
			"userID='52501'" + " " + "OR" + " " + 
			"userID='52519'" + " " + "OR" + " " + 
			"userID='52543'" + " " + "OR" + " " + 
			"userID='52551'" + " " + "OR" + " " + 
			"userID='52655'" + " " + "OR" + " " + 
			"userID='52656'" + " " + "OR" + " " + 
			"userID='52663'" + " " + "OR" + " " + 
			"userID='52687'" + " " + "OR" + " " + 
			"userID='52693'" + " " + "OR" + " " + 
			"userID='52700'" + " " + "OR" + " " + 
			"userID='52721'" + " " + "OR" + " " + 
			"userID='52803'" + " " + "OR" + " " + 
			"userID='52969'" + " " + "OR" + " " + 
			"userID='52972'" + " " + "OR" + " " + 
			"userID='52973'" + " " + "OR" + " " + 
			"userID='52975'" + " " + "OR" + " " + 
			"userID='53034'" + " " + "OR" + " " + 
			"userID='53036'" + " " + "OR" + " " + 
			"userID='53040'" + " " + "OR" + " " + 
			"userID='53062'" + " " + "OR" + " " + 
			"userID='53063'" + " " + "OR" + " " + 
			"userID='53092'" + " " + "OR" + " " + 
			"userID='53096'" + " " + "OR" + " " + 
			"userID='53103'" + " " + "OR" + " " + 
			"userID='53104'" + " " + "OR" + " " + 
			"userID='53106'" + " " + "OR" + " " + 
			"userID='53107'" + " " + "OR" + " " + 
			"userID='53109'" + " " + "OR" + " " + 
			"userID='53110'" + " " + "OR" + " " + 
			"userID='53164'" + " " + "OR" + " " + 
			"userID='53222'" + " " + "OR" + " " + 
			"userID='53408'" + " " + "OR" + " " + 
			"userID='53472'" + " " + "OR" + " " + 
			"userID='53490'" + " " + "OR" + " " + 
			"userID='53495'" + " " + "OR" + " " + 
			"userID='53506'" + " " + "OR" + " " + 
			"userID='53550'" + " " + "OR" + " " + 
			"userID='53555'" + " " + "OR" + " " + 
			"userID='53574'" + " " + "OR" + " " + 
			"userID='53584'" + " " + "OR" + " " + 
			"userID='53586'" + " " + "OR" + " " + 
			"userID='53587'" + " " + "OR" + " " + 
			"userID='53636'" + " " + "OR" + " " + 
			"userID='53638'" + " " + "OR" + " " + 
			"userID='53645'" + " " + "OR" + " " + 
			"userID='53646'" + " " + "OR" + " " + 
			"userID='53650'" + " " + "OR" + " " + 
			"userID='53653'" + " " + "OR" + " " + 
			"userID='53692'" + " " + "OR" + " " + 
			"userID='53693'" + " " + "OR" + " " + 
			"userID='53694'" + " " + "OR" + " " + 
			"userID='53695'" + " " + "OR" + " " + 
			"userID='53696'" + " " + "OR" + " " + 
			"userID='53698'" + " " + "OR" + " " + 
			"userID='53700'" + " " + "OR" + " " + 
			"userID='53701'" + " " + "OR" + " " + 
			"userID='53702'" + " " + "OR" + " " + 
			"userID='53704'" + " " + "OR" + " " + 
			"userID='53705'" + " " + "OR" + " " + 
			"userID='53707'" + " " + "OR" + " " + 
			"userID='53710'" + " " + "OR" + " " + 
			"userID='53711'" + " " + "OR" + " " + 
			"userID='53761'" + " " + "OR" + " " + 
			"userID='53762'" + " " + "OR" + " " + 
			"userID='53763'" + " " + "OR" + " " + 
			"userID='53774'" + " " + "OR" + " " + 
			"userID='53775'" + " " + "OR" + " " + 
			"userID='53824'" + " " + "OR" + " " + 
			"userID='53825'" + " " + "OR" + " " + 
			"userID='53826'" + " " + "OR" + " " + 
			"userID='53827'" + " " + "OR" + " " + 
			"userID='53956'" + " " + "OR" + " " + 
			"userID='53978'" + " " + "OR" + " " + 
			"userID='54106'" + " " + "OR" + " " + 
			"userID='54294'" + " " + "OR" + " " + 
			"userID='54296'" + " " + "OR" + " " + 
			"userID='55051'" + " " + "OR" + " " + 
			"userID='55442'" + " " + "OR" + " " + 
			"userID='55481'" + " " + "OR" + " " + 
			"userID='55844'" + " " + "OR" + " " + 
			"userID='55864'" + " " + "OR" + " " + 
			"userID='55879'" + " " + "OR" + " " + 
			"userID='55989'" + " " + "OR" + " " + 
			"userID='56820'" + " " + "OR" + " " + 
			"userID='57122'" + " " + "OR" + " " + 
			"userID='57632'" + " " + "OR" + " " + 
			"userID='59615'" + " " + "OR" + " " + 
			"userID='59926'" + " " + "OR" + " " + 
			"userID='61242'" + " " + "OR" + " " + 
			"userID='62044'" + " " + "OR" + " " + 
			"userID='62115'" + " " + "OR" + " " + 
			"userID='62155'" + " " + "OR" + " " + 
			"userID='62523'" + " " + "OR" + " " + 
			"userID='63754'" + " " + "OR" + " " + 
			"userID='63776'" + " " + "OR" + " " + 
			"userID='63867'" + " " + "OR" + " " + 
			"userID='64689'" + " " + "OR" + " " + 
			"userID='64690'" + " " + "OR" + " " + 
			"userID='64695'" + " " + "OR" + " " + 
			"userID='64741'" + " " + "OR" + " " + 
			"userID='64931'" + " " + "OR" + " " + 
			"userID='65279'" + " " + "OR" + " " + 
			"userID='65502'" + " " + "OR" + " " + 
			"userID='66718'" + " " + "OR" + " " + 
			"userID='66744'" + " " + "OR" + " " + 
			"userID='66810'" + " " + "OR" + " " + 
			"userID='67153'" + " " + "OR" + " " + 
			"userID='67519'" + " " + "OR" + " " + 
			"userID='67755'" + " " + "OR" + " " + 
			"userID='67789'" + " " + "OR" + " " + 
			"userID='67954'" + " " + "OR" + " " + 
			"userID='67968'" + " " + "OR" + " " + 
			"userID='68081'" + " " + "OR" + " " + 
			"userID='68247'" + " " + "OR" + " " + 
			"userID='68290'" + " " + "OR" + " " + 
			"userID='68385'" + " " + "OR" + " " + 
			"userID='68393'" + " " + "OR" + " " + 
			"userID='70353'");
	
	ApiQueryResult qResult=apiService.query(session, myQuery);
	ApiFindResult candidateResults= apiService.find(session,
			"Candidate", qResult.getIds().get(0));
	
	CandidateDto candidate=(CandidateDto) candidateResults.getDto();
	System.out.println(qResult.getIds());
	
	
	ApiSaveResult saveResult;
	
	/*DtoQuery myQuery = new DtoQuery();
	myQuery.setEntityName("Candidate");
	myQuery.setMaxResults(3);
	myQuery.setWhere("userID='67288'" + " " + "OR" + " " + "userID='67289'" + " " + "OR" + " " + "userID='67290'");
	
	ApiQueryResult qResult=apiService.query(session, myQuery);
	//ApiFindResult candidateResults= apiService.find(session,"Candidate", qResult.getIds().get(0));
	System.out.println(qResult.getIds());*/
	
	System.out.println(qResult.getIds().size());
	
	
	
	for(int index=256; index<qResult.getIds().size(); index++){
		
		candidateResults= apiService.find(session, "Candidate", qResult.getIds().get(index));
		
		candidate=(CandidateDto) candidateResults.getDto();
		
		candidate.setCustomText6("FTE@Consulting Firm");
		
		saveResult = apiService.save(session, candidate);
		
		System.out.println(candidate.getCustomText6() + " " + (index+1));
		
		
	}
	
	
	
	
	
	
	

}
}
