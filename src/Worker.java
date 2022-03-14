public class Worker extends Person
{
    private double m_fHourlyPayRate;

    Worker()
    {
        super();

        m_fHourlyPayRate = 0.0f;
    }

    Worker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate)
    {
        super(ID, firstName, lastName, title, yearOfBirth);

        m_fHourlyPayRate = hourlyPayRate;
    }

    Worker(Person personObject, double hourlyPayRate)
    {
        super(personObject.getM_ID(), personObject.getM_firstName(),
                personObject.getM_lastName(), personObject.getM_title(), personObject.getM_yearOfBirth());

        m_fHourlyPayRate = hourlyPayRate;
    }

    public double getM_fHourlyPayRate() {
        return m_fHourlyPayRate;
    }

    public void setM_fHourlyPayRate(double m_fHourlyPayRate) {
        this.m_fHourlyPayRate = m_fHourlyPayRate;
    }

    protected double calculateWeeklyPay(double hoursWorked)
    {
        double fWeeklyPay = 0.0f;

        if (hoursWorked <= 40)
        {
            fWeeklyPay = hoursWorked * m_fHourlyPayRate;
        }

        if (hoursWorked > 40)
        {
            fWeeklyPay = (40.0f * m_fHourlyPayRate) + ((hoursWorked - 40) * (m_fHourlyPayRate * 1.5f));
        }

        return  fWeeklyPay;
    }

    protected String displayWeeklyPay(double hoursWorked)
    {
        String weeklyPayDisplay = "";
        //String weeklyPayDisplay = "Weekly Pay of Worker " + formalName() + " ";

        if(hoursWorked <= 40)
        {
            weeklyPayDisplay += "Regular Pay (" + String.valueOf((int) hoursWorked) + " hours): " + (hoursWorked * getM_fHourlyPayRate());
            weeklyPayDisplay += ", Total Pay (" + String.valueOf((int) hoursWorked) + " hours): ";
        }

        if (hoursWorked > 40)
        {
            weeklyPayDisplay += "Regular Pay (40 hours): " + (40 * getM_fHourlyPayRate());
            weeklyPayDisplay +=  ", Overtime Pay (" + String.valueOf((int) (hoursWorked - 40)) + " hours): " + ((hoursWorked - 40) * (getM_fHourlyPayRate() * 1.5));
            weeklyPayDisplay += ", Total Pay (" + String.valueOf((int) hoursWorked) + " hours): ";
        }

        weeklyPayDisplay += calculateWeeklyPay(hoursWorked);

        return weeklyPayDisplay;
    }

    public String toString()
    {
        return super.toString() + " Hourly Pay Rate=" + m_fHourlyPayRate + "}";
    }
}
