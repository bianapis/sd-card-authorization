package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditWithIdAndRoot
 */
public class CreditWithIdAndRoot   {
  private String cardAuthorizationCreditCheck = null;

  private String cardAuthorizationReference = null;

  private String cardTransactionProductInstanceReference = null;

  private String cardAccountAvailableBalanceCheckResult = null;

  private Object cardAuthorizationRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAuthorizationCreditCheck
  **/

  public String getCardAuthorizationCreditCheck() {
    return cardAuthorizationCreditCheck;
  }

  public void setCardAuthorizationCreditCheck(String cardAuthorizationCreditCheck) {
    this.cardAuthorizationCreditCheck = cardAuthorizationCreditCheck;
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
   * @return cardTransactionProductInstanceReference
  **/

  public String getCardTransactionProductInstanceReference() {
    return cardTransactionProductInstanceReference;
  }

  public void setCardTransactionProductInstanceReference(String cardTransactionProductInstanceReference) {
    this.cardTransactionProductInstanceReference = cardTransactionProductInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount       
   * @return cardAccountAvailableBalanceCheckResult
  **/

  public String getCardAccountAvailableBalanceCheckResult() {
    return cardAccountAvailableBalanceCheckResult;
  }

  public void setCardAccountAvailableBalanceCheckResult(String cardAccountAvailableBalanceCheckResult) {
    this.cardAccountAvailableBalanceCheckResult = cardAccountAvailableBalanceCheckResult;
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

