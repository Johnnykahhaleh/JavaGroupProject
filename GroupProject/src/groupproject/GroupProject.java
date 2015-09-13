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
{
return firstName;
}
// return last name
public String getLastName()
{
return lastName;
}
// return student college ID
public String getCollegeId()
{
return collegeId;
}

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

public double earnings()
{return getMonthlypay();}

}
}
