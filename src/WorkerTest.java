import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorkerTest {
    Worker w1, w2;
    Person p2;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        w1 = new Worker("000001", "Pratik", "Chaudhari", "Mr.", 2002, 120);

        p2 = new Person("000002", "Bilbo", "Baggins", "Esq.", 1972);

        w2 = new Worker(p2, 65);
    }

    @org.junit.jupiter.api.Test
    void setM_fHourlyPayRate() {
        w1.setM_fHourlyPayRate(120.0);
        assertEquals(120.0, w1.getM_fHourlyPayRate());
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        assertEquals(4800, w1.calculateWeeklyPay(40));
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        assertEquals("Regular Pay (40 hours): 4800.0, Total Pay (40 hours): 4800.0", w1.displayWeeklyPay(40));
        assertEquals("Regular Pay (40 hours): 4800.0, Overtime Pay (5 hours): 900.0, Total Pay (45 hours): 5700.0", w1.displayWeeklyPay(45));
    }
}