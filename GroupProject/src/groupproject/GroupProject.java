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
public String collegeId()
{
return collegeId;
}
}