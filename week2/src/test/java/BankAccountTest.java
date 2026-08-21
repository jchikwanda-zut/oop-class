import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.zut.BankAccount;


public class BankAccountTest {
    @Test
    void testBankAccount() {
        // Arrange - What do i need to test?
        BankAccount account = new BankAccount();
        
        // Act - Whats the one action i want to check?
        account.deposit(100);

        // Assert - What must be true?
        assertEquals(100, account.balance);
    }
}
