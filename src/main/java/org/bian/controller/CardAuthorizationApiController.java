/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class CardAuthorizationApiController {

	@Autowired
	CardAuthorizationApiService service;
	
	@Assess.Evaluate
	public BianResponse<CardAuthorizationEvaluationResponse> evaluate(@RequestBody BianRequest<CardAuthorization> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@Assess.Record
	public BianResponse<RecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.RequestPut
	public BianResponse<CardAuthorizationWithRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardAuthorization> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.RequestPost
	public BianResponse<CardAuthorizationWithRoot> requestPost(@RequestBody BianRequest<CardAuthorization> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@BQ("authentications")
	@Assess.Retrieve
	public BianResponse<AuthenticationWithIdAndRoot> retrieveAuthentications(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthentications(crReferenceId, bqReferenceId));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("credits")
	@Assess.Retrieve
	public BianResponse<CreditWithIdAndRoot> retrieveCredits(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCredits(crReferenceId, bqReferenceId));
	}
	
	@BQ("devices")
	@Assess.Retrieve
	public BianResponse<DeviceWithIdAndRoot> retrieveDevices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevices(crReferenceId, bqReferenceId));
	}
	
	@BQ("frauds")
	@Assess.Retrieve
	public BianResponse<FraudWithIdAndRoot> retrieveFrauds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFrauds(crReferenceId, bqReferenceId));
	}
	
	@Assess.Retrieve
	public BianResponse<CardAuthorizationWithRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("stand-in-authorizations")
	@Assess.Retrieve
	public BianResponse<StandInAuthorizationWithIdAndRoot> retrieveStandInAuthorizations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStandInAuthorizations(crReferenceId, bqReferenceId));
	}
	
}
