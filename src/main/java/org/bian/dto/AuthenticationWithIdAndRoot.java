package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AuthenticationWithIdAndRoot
 */
public class AuthenticationWithIdAndRoot   {
  private String cardAuthorizationAuthenticationCheck = null;

  private String cardAuthorizationReference = null;

  private String cardHolderReference = null;

  private String cardTransactionProductInstanceReference = null;

  private String cardHolderAccountPassword = null;

  private String issuedDevicePIN = null;

  private String authenticationSecretQuestionReference = null;

  private String authenticationSecretQuestionTemplate = null;

  private String authenticationSecretQuestionValue = null;

  private Object cardAuthorizationRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAuthorizationAuthenticationCheck
  **/

  public String getCardAuthorizationAuthenticationCheck() {
    return cardAuthorizationAuthenticationCheck;
  }

  public void setCardAuthorizationAuthenticationCheck(String cardAuthorizationAuthenticationCheck) {
    this.cardAuthorizationAuthenticationCheck = cardAuthorizationAuthenticationCheck;
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
   * @return cardHolderReference
  **/

  public String getCardHolderReference() {
    return cardHolderReference;
  }

  public void setCardHolderReference(String cardHolderReference) {
    this.cardHolderReference = cardHolderReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return cardTransactionProductInstanceReference
  **/

  public String getCardTransactionProductInstanceReference() {
    return cardTransactionProductInstanceReference;
  }

  public void setCardTransactionProductInstanceReference(String cardTransactionProductInstanceReference) {
    this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return cardHolderAccountPassword
  **/

  public String getCardHolderAccountPassword() {
    return cardHolderAccountPassword;
  }

  public void setCardHolderAccountPassword(String cardHolderAccountPassword) {
    this.cardHolderAccountPassword = cardHolderAccountPassword;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Value 
   * @return issuedDevicePIN
  **/

  public String getIssuedDevicePIN() {
    return issuedDevicePIN;
  }

  public void setIssuedDevicePIN(String issuedDevicePIN) {
    this.issuedDevicePIN = issuedDevicePIN;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return authenticationSecretQuestionReference
  **/

  public String getAuthenticationSecretQuestionReference() {
    return authenticationSecretQuestionReference;
  }

  public void setAuthenticationSecretQuestionReference(String authenticationSecretQuestionReference) {
    this.authenticationSecretQuestionReference = authenticationSecretQuestionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return authenticationSecretQuestionTemplate
  **/

  public String getAuthenticationSecretQuestionTemplate() {
    return authenticationSecretQuestionTemplate;
  }

  public void setAuthenticationSecretQuestionTemplate(String authenticationSecretQuestionTemplate) {
    this.authenticationSecretQuestionTemplate = authenticationSecretQuestionTemplate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Value       
   * @return authenticationSecretQuestionValue
  **/

  public String getAuthenticationSecretQuestionValue() {
    return authenticationSecretQuestionValue;
  }

  public void setAuthenticationSecretQuestionValue(String authenticationSecretQuestionValue) {
    this.authenticationSecretQuestionValue = authenticationSecretQuestionValue;
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

