
# ResponsePlanData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | ID of created plan | 
**name** | **String** | Name of created plan | 
**created** | [**OffsetDateTime**](OffsetDateTime.md) | Creation time, [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format | 
**status** | [**StatusEnum**](#StatusEnum) | Status of created plan: &#39;ACTIVE&#39; or &#39;INACTIVE&#39; | 
**period** | [**PeriodEnum**](#PeriodEnum) | Period of created plan | 
**interval** | **Integer** | Interval of plan | 
**currency** | **String** | [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of created plan | 
**amount** | [**BigDecimal**](BigDecimal.md) | The total amount of created plan | 
**retries** | **Integer** | Number of daily basis retry attempts in case of payment has not been captured successfully, from 1 to 15 attempts |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;


<a name="PeriodEnum"></a>
## Enum: PeriodEnum
Name | Value
---- | -----
MINUTE | &quot;minute&quot;
DAY | &quot;day&quot;
WEEK | &quot;week&quot;
MONTH | &quot;month&quot;
YEAR | &quot;year&quot;



