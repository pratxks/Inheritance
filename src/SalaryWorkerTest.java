import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1;
    Worker w1;

    @BeforeEach
    void setUp() {
        sw1 = new SalaryWorker("000001", "Pratik", "Chaudhari", "Mr.", 2002, 120, 249600);

        w1 = new Worker("000002", "Rajesh", "Chaudhari", "Mr.", 1972, 200);
    }

    @Test
    void setM_fAnnualSalary() {
        sw1.setM_fAnnualSalary(249600);
        assertEquals(249600, sw1.getM_fAnnualSalary());
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(4800, sw1.calculateWeeklyPay(40));
        assertEquals(4800, sw1.calculateWeeklyPay(45));

        assertEquals(8000, w1.calculateWeeklyPay(40));
        assertEquals(9500, w1.calculateWeeklyPay(45));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Annual Salary: 249600.0, Total Weekly Pay (Annual Salary / 52 Weeks): 4800.0", sw1.displayWeeklyPay(40));
        assertEquals("Annual Salary: 249600.0, Total Weekly Pay (Annual Salary / 52 Weeks): 4800.0", sw1.displayWeeklyPay(45));

        assertEquals("Regular Pay (40 hours): 8000.0, Total Pay (40 hours): 8000.0", w1.displayWeeklyPay(40));
        assertEquals("Regular Pay (40 hours): 8000.0, Overtime Pay (5 hours): 1500.0, Total Pay (45 hours): 9500.0", w1.displayWeeklyPay(45));
    }
}