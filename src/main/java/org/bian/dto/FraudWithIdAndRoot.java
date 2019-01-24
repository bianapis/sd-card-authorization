package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudWithIdAndRoot
 */
public class FraudWithIdAndRoot   {
  private String cardAuthorizationFraudCheck = null;

  private String cardAuthorizationReference = null;

  private Object cardAccountFraudCheckRecord = null;

  private Object cardAuthorizationRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAuthorizationFraudCheck
  **/

  public String getCardAuthorizationFraudCheck() {
    return cardAuthorizationFraudCheck;
  }

  public void setCardAuthorizationFraudCheck(String cardAuthorizationFraudCheck) {
    this.cardAuthorizationFraudCheck = cardAuthorizationFraudCheck;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return cardAuthorizationReference
  **/

  public String getCardAuthorizationReference() {
    return cardAuthorizationReference;
  }

  public void setCardAuthorizationReference(String cardAuthorizationReference) {
    this.cardAuthorizationReference = cardAuthorizationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return cardAccountFraudCheckRecord
  **/

  public Object getCardAccountFraudCheckRecord() {
    return cardAccountFraudCheckRecord;
  }

  public void setCardAccountFraudCheckRecord(Object cardAccountFraudCheckRecord) {
    this.cardAccountFraudCheckRecord = cardAccountFraudCheckRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary   
   * @return cardAuthorizationRecord
  **/

  public Object getCardAuthorizationRecord() {
    return cardAuthorizationRecord;
  }

  public void setCardAuthorizationRecord(Object cardAuthorizationRecord) {
    this.cardAuthorizationRecord = cardAuthorizationRecord;
  }


}

