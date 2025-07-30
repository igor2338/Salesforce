package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
    private String rating;
    private String type;
    private String industry;
    private String ownership;
    private String name;
    private String phone;
    private String fax;
    private String accountNumber;
    private String website;
    private String accountSite;
    private String tickerSymbol;
    private String employees;
    private String annualRevenue;
    private String sicCode;
    private String billingStreet;
    private String shippingStreet;
}