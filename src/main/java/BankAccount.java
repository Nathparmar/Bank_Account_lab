public class BankAccount {

private  String firstName;
private  String lastName;
private  String dateOfBirth;
private int balance;
private int accountNumber;


    public BankAccount(String firstName, String lastName, String dateOfBirth, int balance, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

//    Getters & Setters  //

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

//    public void setDateOfBirth(String dateOfBirth){
//        this.dateOfBirth;
//    }

//    public String getAccountNumber() {
//        return accountNumber;
//    }

//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }

    public int getBalance(){
        return this.balance;
    }

//    public void setBalance(int balance) {
//        this.balance = balance;
//    }


    public void deposit(int amount){
         this.balance += amount; //balance = balance + amount
    }


    public void withdrawal(int amount){
        this.balance -= amount;
    }

   public void payInterest(){
        this.balance *= 1.05;
    }







}
