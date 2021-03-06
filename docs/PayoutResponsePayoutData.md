
# PayoutResponsePayoutData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | Payout amount | 
**arn** | **String** | ARN (Acquirer Reference Number), supplied by the acquiring financial institution, return only after receiving ARN from bank acquirer *(for BANKCARD payment method only)* |  [optional]
**created** | **String** | Date and time when this payout was created, [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format | 
**currency** | **String** | Payout currency ([ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) format) | 
**declineCode** | **String** | Decline code (only in decline case) |  [optional]
**declineReason** | **String** | Bank&#39;s message about payout decline reason (only in decline case) |  [optional]
**id** | **String** | CardPay&#39;s payout id | 
**note** | **String** | Payout note |  [optional]
**rrn** | **String** | RRN (Retrieval Reference Number), supplied by the acquiring financial institution |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Current payout status | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
DECLINED | &quot;DECLINED&quot;
AUTHORIZED | &quot;AUTHORIZED&quot;
COMPLETED | &quot;COMPLETED&quot;
CANCELLED | &quot;CANCELLED&quot;
REFUNDED | &quot;REFUNDED&quot;
PARTIALLY_REFUNDED | &quot;PARTIALLY_REFUNDED&quot;
VOIDED | &quot;VOIDED&quot;
CHARGED_BACK | &quot;CHARGED_BACK&quot;
CHARGEBACK_RESOLVED | &quot;CHARGEBACK_RESOLVED&quot;



