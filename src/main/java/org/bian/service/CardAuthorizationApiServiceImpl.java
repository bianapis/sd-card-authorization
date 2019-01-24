/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardAuthorizationApiServiceImpl implements CardAuthorizationApiService {

	public CardAuthorizationEvaluationResponse evaluate(CardAuthorization request){
		return JsonReader.read("evaluate-CardAuthorizationEvaluationResponse.json",new TypeReference<CardAuthorizationEvaluationResponse>(){});
	}
	
	public RecordResponse record(String crReferenceId, RecordRequest request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public CardAuthorizationWithRoot requestPut(String crReferenceId, CardAuthorization request){
		return JsonReader.read("requestPut-CardAuthorizationWithRoot.json",new TypeReference<CardAuthorizationWithRoot>(){});
	}
	
	public CardAuthorizationWithRoot requestPost(CardAuthorization request){
		return JsonReader.read("requestPost-CardAuthorizationWithRoot.json",new TypeReference<CardAuthorizationWithRoot>(){});
	}
	
	public AuthenticationWithIdAndRoot retrieveAuthentications(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AuthenticationWithIdAndRoot.json",new TypeReference<AuthenticationWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CreditWithIdAndRoot retrieveCredits(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CreditWithIdAndRoot.json",new TypeReference<CreditWithIdAndRoot>(){});
	}
	
	public DeviceWithIdAndRoot retrieveDevices(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DeviceWithIdAndRoot.json",new TypeReference<DeviceWithIdAndRoot>(){});
	}
	
	public FraudWithIdAndRoot retrieveFrauds(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudWithIdAndRoot.json",new TypeReference<FraudWithIdAndRoot>(){});
	}
	
	public CardAuthorizationWithRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CardAuthorizationWithRoot.json",new TypeReference<CardAuthorizationWithRoot>(){});
	}
	
	public StandInAuthorizationWithIdAndRoot retrieveStandInAuthorizations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-StandInAuthorizationWithIdAndRoot.json",new TypeReference<StandInAuthorizationWithIdAndRoot>(){});
	}
	
}
