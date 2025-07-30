package dto;

import com.github.javafaker.Faker;

public class AccountFactory {

    public static Account getAccount(String rating, String type, String industry, String ownership,
                                     String tickerSymbol, String employees, String annualRevenue){
        Faker faker = new Faker();
        return new Account(
                rating,
                type,
                industry,
                ownership,
                faker.company().name(),
                faker.phoneNumber().phoneNumber(),
                faker.phoneNumber().phoneNumber(),
                faker.number().digit(),
                faker.internet().domainName(),
                faker.internet().domainName(),
                tickerSymbol,
                employees,
                annualRevenue,
                faker.number().digit(),
                faker.address().streetAddress(),
                faker.address().fullAddress());
    }
}