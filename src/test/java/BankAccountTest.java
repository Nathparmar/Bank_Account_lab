import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test

    void deposit(){
//        Given
        BankAccount bankAccount = new BankAccount("Nathan", "Parmar", "22/12/00", 0, 11111);
//        when
        bankAccount.deposit(100);
        int result = bankAccount.getBalance();
        int expected = 100;
        assertThat(result).isEqualTo(expected);

    }

    @Test

    void withdrawal(){

        BankAccount bankAccount = new BankAccount("Nathan", "Parmar", "22/12/00", 100, 11111);
        bankAccount.withdrawal(100);
        int result = bankAccount.getBalance();
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test

    void payInterest(){

        BankAccount bankAccount = new BankAccount("Nathan", "Parmar", "22/12/00", 100, 11111);
        bankAccount.payInterest();
        int result = bankAccount.getBalance();
        int expected = 105;
        assertThat(result).isEqualTo(expected);
    }




}
