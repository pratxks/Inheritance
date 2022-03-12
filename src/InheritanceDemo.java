import java.util.ArrayList;

public class InheritanceDemo
{
    public static void DisplayWeeklyPayOfWorkers(ArrayList<Worker> workerArray)
    {
        DisplayTableHeader();

        for(Worker DisplayWorker : workerArray)
        {
            TabularWeeklyPayDisplay(DisplayWorker, 35);
            TabularWeeklyPayDisplay(DisplayWorker, 50);
            TabularWeeklyPayDisplay(DisplayWorker, 40);

            String strUnderLine = String.format("%141s", " ").replace(' ', '-');

            System.out.println(strUnderLine);
        }
    }

    public static void DisplayTableHeader()
    {
        //ID#    Firstname     Lastname   Title    YOB   Weekly Hours Worked   Weekly Pay
        String strHeader = String.format("%-11s","ID#");
        strHeader += String.format("%-30s", "Worker Name");
        strHeader += String.format("%-100s", "Weekly Pay");

        System.out.println(strHeader);

        String strUnderLine = String.format("%141s", " ").replace(' ', '=');

        System.out.println(strUnderLine);
    }

    public static void TabularWeeklyPayDisplay(Worker DisplayWorker, double HoursWorked)
    {
        String strDisplayRow = String.format("%-6s", DisplayWorker.getM_ID()).replace(' ', '0');
        strDisplayRow += String.format("%4s", " ");

        strDisplayRow += String.format("%-30s", DisplayWorker.formalName());

        strDisplayRow += String.format("%-100s", DisplayWorker.displayWeeklyPay(HoursWorked));

        System.out.println(strDisplayRow);
    }

    public static void main(String[] args)
    {
        Worker w1 = new Worker("000001", "Biblo", "Baggins", "Esq.", 1960, 100.0);
        System.out.println(w1);
        Person p2 = new Person("000002", "Frodo", "Baggins", "Esq.", 2000);
        Worker w2 = new Worker(p2, 60.0);
        System.out.println(w2);
        Worker w3 = new Worker("000003", "Samwise", "Gamgee", "Esq.", 1985, 130.0);
        System.out.println(w3);

        Worker w4 = new SalaryWorker("000004", "Peregrin", "Took", "Esq.", 1965, 300.0, 624000.0 );
        System.out.println(w4);
        Person p5 = new Person("000005", "Meridoc", "Brandybuck", "Esq.", 1970);
        Worker w5 = new SalaryWorker(p5, 220.0, 457600.0);
        System.out.println(w5);
        Worker w6 = new SalaryWorker("000006", "Frodo", "Gamgee", "Esq.", 1998, 120.0, 249600.0);
        System.out.println(w6);

        System.out.println("\n\n");
        ArrayList<Worker> arrayOfWorkers = new ArrayList<Worker>();

        arrayOfWorkers.add(w1);
        arrayOfWorkers.add(w2);
        arrayOfWorkers.add(w3);
        arrayOfWorkers.add(w4);
        arrayOfWorkers.add(w5);
        arrayOfWorkers.add(w6);

        DisplayWeeklyPayOfWorkers(arrayOfWorkers);
    }
}