package GroupProject;
public abstract class GroupProject/*class name identification*/
{
// Students abstract superclass.
private String firstName;
private String lastName;
private String collegeId;
// constructor
public void Student(String firstName, String lastName,String collegeId)
{
this.firstName = firstName;
this.lastName = lastName;
this.collegeId = collegeId;
}
public String getFirstName()
{return firstName;}

// return last name
public String getLastName()
{return lastName;}

// return student college ID
public String getCollegeId()
{return collegeId;}

public class MonthlyPay extends GroupProject
{
private double Monthlypay;
private int NbrMonth;
// constructor
public MonthlyPay(String firstName, String lastName,String collegeId, double Monthlypay, int NbrMonth)
{super(firstName, lastName,collegeId);
   if (Monthlypay < 0.0)
   throw new IllegalArgumentException("Payment must be >= 0.0");

    if (NbrMonth<=0)
    throw new IllegalArgumentException("Number of months must be >0");
this.NbrMonth = NbrMonth;
this.Monthlypay=Monthlypay;
}
// set salary

public void Monthlypay(double Monthlypay)
{
if (Monthlypay < 0.0)
throw new IllegalArgumentException("Payment must be >= 0.0");
    this.Monthlypay = Monthlypay;
}
public void NbrMonth(int NbrMonth)
{
if (NbrMonth <=0)
throw new IllegalArgumentException("Number of Months must be >0");
    this.NbrMonth = NbrMonth;
}
// return salary
public double getMonthlypay()
{return Monthlypay;}

public int getNbrmonth()
{return NbrMonth;}

public double TotalPay()
{return getMonthlypay();}

}
public class ModulePay extends GroupProject
{
private double ModuleCost;
private int NbrModule;
// constructor
public ModulePay(String firstName, String lastName,String collegeId, double ModuleCost, int NbrModule)
{super(firstName, lastName,collegeId);
   if (ModuleCost < 0.0)
   throw new IllegalArgumentException("Cost must be >= 0.0");

    if (NbrModule<=0)
    throw new IllegalArgumentException("Number of months must be >0");
this.NbrModule = NbrModule;
this.ModuleCost=ModuleCost;
}
// set salary

public void ModuleCost(double ModuleCost)
{
if (ModuleCost < 0.0)
throw new IllegalArgumentException("Cost must be >= 0.0");
    this.ModuleCost = ModuleCost;
}
public void NbrModule(int NbrModule)
{
if (NbrModule <=0)
throw new IllegalArgumentException("Number of modules must be >0");
    this.NbrModule = NbrModule;
}
// return salary
public double getMonthlypay()
{return ModuleCost;}

public int getNbrmonth()
{return NbrModule;}

public double TotalPay()
{return getMonthlypay();}
}
}
