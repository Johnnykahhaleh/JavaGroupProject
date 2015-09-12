package GroupProject;
import javax.swing.*;/*to import all swing package to be able to display the dialogue box using JOptionPane. */
public class GroupProject/*class name identification*/
{
   public static void main(String[] args)/*main method that will run other methods*/
   {
      float principal=getPrincipal();/*to call the method getPrincipal() and store its return value in principal*/
      float rate=getRate();/*to call the method getRate() and store its return value in rate*/
      int year= getYear();/*to call the method getYear() and store its return value in year*/
      PrInterest( principal, rate, year);/*identification of the initial variable to calculate the interest*/
   }
    
   public static float getPrincipal(){/*method to input, convert to float, and return the principal value*/
      float principal = Float.parseFloat( JOptionPane.showInputDialog(null,"Please enter the prinicipal amount","Priniciapl",JOptionPane.INFORMATION_MESSAGE));
      return principal;}
         
   public static float getRate(){/*method to input, convert to float, and return the rate value*/
      float rate = Float.parseFloat( JOptionPane.showInputDialog(null,"Please enter the rate percentage","Rate",JOptionPane.INFORMATION_MESSAGE));
      return rate;}
         
   public static int getYear(){/*method to input, convert to int, and return the number of years value*/
      int year = Integer.parseInt( JOptionPane.showInputDialog(null,"Please enter the number of years","Years",JOptionPane.INFORMATION_MESSAGE));
      return year;}
         
   public static void PrInterest(float p, float r, int y){/*method that takes 3 parameters, principal, rate and number of years, will retunr the value of the interst equation using JOptionPane*/
      float A=p*(1+(r/100*y));
      JOptionPane.showMessageDialog(null,"The new Value of the first number is: "+A, "Summary", JOptionPane.PLAIN_MESSAGE); }
}
