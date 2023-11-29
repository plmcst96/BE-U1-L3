package ShopOnline;

import java.util.Date;

public class Customer {
    private final String idClient;
    private String fullName;
    private String email;
    private final Date registrationDate;

    public Customer(String code, String fullName, String email){
        this.idClient = code;
        this.fullName = fullName;
        this.email = email;
        this.registrationDate = new Date();
    }

    public String getIdClient() {
        return idClient;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "idClient='" + idClient + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", registrationDate=" + registrationDate;
    }
}
