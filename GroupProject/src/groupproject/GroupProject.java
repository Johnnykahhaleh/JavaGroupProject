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
// constructor
public MonthlyPay(String firstName, String lastName,String collegeId, double Monthlypay)
{super(firstName, lastName,collegeId);
if (Monthlypay < 0.0)
throw new IllegalArgumentException("Weekly salary must be >= 0.0");
    this.Monthlypay = Monthlypay;
}
// set salary

public void Monthlypay(double Monthlypay)
{
if (Monthlypay < 0.0)
throw new IllegalArgumentException("Weekly salary must be >= 0.0");
    this.Monthlypay = Monthlypay;
}
// return salary
public double getMonthlypay()
{
return Monthlypay;
}
// calculate earnings; override abstract method earnings in Employee
public double earnings()
{
return getMonthlypay();
}
}
}
