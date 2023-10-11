public class BankAccount {

private  String firstName;
private  String lastname;
private  String dateOfBirth;
private int balance;
private int accountNumber;


    public BankAccount(String firstName, String lastname, String dateOfBirth, int balance, int accountNumber) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.balance = 0;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public void deposit(int amount){
         this.balance += amount; //balance = balance + amount
    }

    public int getBalance(){
        return this.balance;
    }


}
