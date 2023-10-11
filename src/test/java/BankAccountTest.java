import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test

    void bankAccount(){
//        Given
        BankAccount bankAccount = new BankAccount("Nathan", "Parmar", "22/12/00", 0, 11111);
//        when
        bankAccount.deposit(100);
        int result = bankAccount.getBalance();
        int expected = 100;
        assertThat(result).isEqualTo(expected);


    }
}
