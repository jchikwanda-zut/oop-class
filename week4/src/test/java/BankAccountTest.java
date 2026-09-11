import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.zut.BankAccount;


public class BankAccountTest {
    @Test
    void testDeposit() {
        // Arrange - What do i need to test?
        BankAccount account = new BankAccount();
        
        // Act - Whats the one action i want to check?
        account.deposit(1000);

        // Assert - What must be true?
        assertEquals(1000, account.balance);
    }

    @Test 
    void testWithdraw() {
        // Arrange
        BankAccount account = new BankAccount();
        account.balance = 5000;

        // Act
        account.withdraw(500);

        // Assert
        assertEquals(4500, account.balance);
    }
}
