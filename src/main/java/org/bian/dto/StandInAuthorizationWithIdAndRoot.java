package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * StandInAuthorizationWithIdAndRoot
 */
public class StandInAuthorizationWithIdAndRoot   {
  private String cardAuthorizationStandInAuthorizationCheck = null;

  private String cardAuthorizationReference = null;

  private String cardTransactionIssuedDeviceReference = null;

  private String negativeFileReference = null;

  private Object cardAccountStandInAuthorizationRecord = null;

  private Object cardAuthorizationRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAuthorizationStandInAuthorizationCheck
  **/

  public String getCardAuthorizationStandInAuthorizationCheck() {
    return cardAuthorizationStandInAuthorizationCheck;
  }

  public void setCardAuthorizationStandInAuthorizationCheck(String cardAuthorizationStandInAuthorizationCheck) {
    this.cardAuthorizationStandInAuthorizationCheck = cardAuthorizationStandInAuthorizationCheck;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardTransactionIssuedDeviceReference
  **/

  public String getCardTransactionIssuedDeviceReference() {
    return cardTransactionIssuedDeviceReference;
  }

  public void setCardTransactionIssuedDeviceReference(String cardTransactionIssuedDeviceReference) {
    this.cardTransactionIssuedDeviceReference = cardTransactionIssuedDeviceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return negativeFileReference
  **/

  public String getNegativeFileReference() {
    return negativeFileReference;
  }

  public void setNegativeFileReference(String negativeFileReference) {
    this.negativeFileReference = negativeFileReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return cardAccountStandInAuthorizationRecord
  **/

  public Object getCardAccountStandInAuthorizationRecord() {
    return cardAccountStandInAuthorizationRecord;
  }

  public void setCardAccountStandInAuthorizationRecord(Object cardAccountStandInAuthorizationRecord) {
    this.cardAccountStandInAuthorizationRecord = cardAccountStandInAuthorizationRecord;
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

