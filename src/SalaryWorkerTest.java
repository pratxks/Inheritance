import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1, sw2;
    Worker w2;
    Person p2;

    @BeforeEach
    void setUp() {
        sw1 = new SalaryWorker("000001", "Pratik", "Chaudhari", "Mr.", 2002, 120, 249600);

        p2 = new Person("000002", "Bilbo", "Baggins", "Esq.", 1972);

        sw2 = new SalaryWorker(p2, 65, 135200);
    }

    @Test
    void setM_fAnnualSalary() {
        sw1.setM_fAnnualSalary(249600);
        assertEquals(135200, sw1.getM_fAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(2600, sw1.calculateWeeklyPay(40));
        assertEquals(2600, sw1.calculateWeeklyPay(45));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Annual Salary: 135200.0, Total Weekly Pay (Annual Salary / 52 Weeks): 2600.0", sw1.displayWeeklyPay(40));
        assertEquals("Annual Salary: 135200.0, Total Weekly Pay (Annual Salary / 52 Weeks): 2600.0", sw1.displayWeeklyPay(45));
    }
}