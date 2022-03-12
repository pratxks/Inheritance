public class SalaryWorker extends Worker
{
    private double m_fAnnualSalary;

    SalaryWorker()
    {
        super();

        m_fAnnualSalary = 0.0f;
    }

    SalaryWorker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate, double annualSalary)
    {
        super(ID, firstName, lastName, title, yearOfBirth, hourlyPayRate);

        m_fAnnualSalary = annualSalary;
    }

    public double getM_fAnnualSalary() {
        return m_fAnnualSalary;
    }

    public void setM_fAnnualSalary(double m_fAnnualSalary) {
        this.m_fAnnualSalary = m_fAnnualSalary;
    }

    @Override
    protected double calculateWeeklyPay(double hoursWorked) {
        return m_fAnnualSalary / 52.0f;
    }

    @Override
    protected String displayWeeklyPay(double hoursWorked) {
        String weeklyPayDisplay = "";

        weeklyPayDisplay += "Annual Salary: " + m_fAnnualSalary + ", Total Weekly Pay (Annual Salary / 52 Weeks): ";
        weeklyPayDisplay += calculateWeeklyPay(hoursWorked);

        return weeklyPayDisplay;
    }
}
