public class User {
    private String firstName;
    private String lastName;
    private int tcNo;
    private int birthDate;
    public MernisService mernisService;

    public User(String firstName, String lastName, int tcNo, int birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tcNo = tcNo;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTcNo() {
        return tcNo;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public boolean isInfoValid() {
        // MernisService kullanarak üye bilgilerinin doğruluğunu kontrol ediyoruz.
       return mernisService.verifyMember(firstName,lastName,tcNo,birthDate);
    }
}

