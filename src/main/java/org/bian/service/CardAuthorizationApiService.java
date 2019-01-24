/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardAuthorizationApiService {

	CardAuthorizationEvaluationResponse evaluate(CardAuthorization request);
	
	RecordResponse record(String crReferenceId, RecordRequest request);
	
	CardAuthorizationWithRoot requestPut(String crReferenceId, CardAuthorization request);
	
	CardAuthorizationWithRoot requestPost(CardAuthorization request);
	
	AuthenticationWithIdAndRoot retrieveAuthentications(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveRefIds();
	
	CreditWithIdAndRoot retrieveCredits(String crReferenceId, String bqReferenceId);
	
	DeviceWithIdAndRoot retrieveDevices(String crReferenceId, String bqReferenceId);
	
	FraudWithIdAndRoot retrieveFrauds(String crReferenceId, String bqReferenceId);
	
	CardAuthorizationWithRoot retrieve(String crReferenceId);
	
	StandInAuthorizationWithIdAndRoot retrieveStandInAuthorizations(String crReferenceId, String bqReferenceId);
	
}
