package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DeviceWithIdAndRoot
 */
public class DeviceWithIdAndRoot   {
  private String cardAuthorizationIssuedDeviceCheck = null;

  private String cardAuthorizationReference = null;

  private String cardTransactionIssuedDeviceReference = null;

  private String issuedDeviceSecurityCode = null;

  private String issuedDeviceCryptogram = null;

  private String issuedDeviceCVV = null;

  private String issuedDeviceBIN = null;

  private String issuedDeviceCheckDigit = null;

  private String issuedDeviceValidThrough = null;

  private Object cardAuthorizationRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAuthorizationIssuedDeviceCheck
  **/

  public String getCardAuthorizationIssuedDeviceCheck() {
    return cardAuthorizationIssuedDeviceCheck;
  }

  public void setCardAuthorizationIssuedDeviceCheck(String cardAuthorizationIssuedDeviceCheck) {
    this.cardAuthorizationIssuedDeviceCheck = cardAuthorizationIssuedDeviceCheck;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code   
   * @return issuedDeviceSecurityCode
  **/

  public String getIssuedDeviceSecurityCode() {
    return issuedDeviceSecurityCode;
  }

  public void setIssuedDeviceSecurityCode(String issuedDeviceSecurityCode) {
    this.issuedDeviceSecurityCode = issuedDeviceSecurityCode;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return issuedDeviceCryptogram
  **/

  public String getIssuedDeviceCryptogram() {
    return issuedDeviceCryptogram;
  }

  public void setIssuedDeviceCryptogram(String issuedDeviceCryptogram) {
    this.issuedDeviceCryptogram = issuedDeviceCryptogram;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Value 
   * @return issuedDeviceCVV
  **/

  public String getIssuedDeviceCVV() {
    return issuedDeviceCVV;
  }

  public void setIssuedDeviceCVV(String issuedDeviceCVV) {
    this.issuedDeviceCVV = issuedDeviceCVV;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return issuedDeviceBIN
  **/

  public String getIssuedDeviceBIN() {
    return issuedDeviceBIN;
  }

  public void setIssuedDeviceBIN(String issuedDeviceBIN) {
    this.issuedDeviceBIN = issuedDeviceBIN;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return issuedDeviceCheckDigit
  **/

  public String getIssuedDeviceCheckDigit() {
    return issuedDeviceCheckDigit;
  }

  public void setIssuedDeviceCheckDigit(String issuedDeviceCheckDigit) {
    this.issuedDeviceCheckDigit = issuedDeviceCheckDigit;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date 
   * @return issuedDeviceValidThrough
  **/

  public String getIssuedDeviceValidThrough() {
    return issuedDeviceValidThrough;
  }

  public void setIssuedDeviceValidThrough(String issuedDeviceValidThrough) {
    this.issuedDeviceValidThrough = issuedDeviceValidThrough;
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

