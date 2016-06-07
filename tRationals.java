import javax.swing.*;

public class tRationals 
{
	public static void main(String[] args)
	{
		String[] token = args[0].split(" ");
		
		String[] num1 = token[0].split("/");
		Long nom1 = Long.parseLong(num1[0]);
		Long denom1 = Long.parseLong(num1[1]);
		
		Rational R1 = new Rational(nom1, denom1);
		
		String[] num2 = token[2].split("/");
		Long nom2 = Long.parseLong(num2[0]);
		Long denom2 = Long.parseLong(num2[1]);
		
		Rational R2 = new Rational(nom2, denom2);
		
		String op = token[1];
		
		switch (op)
		{
			case "+":
				long n1 = R1.add(R2)[0];
				long d1 = R1.add(R2)[1];
				System.out.println(R1.toString() + " + " + R2.toString() + " = " + n1 + "/" + d1);
				break;
				
			case "-":
				long n2 = R1.subtract(R2)[0];
				long d2 = R1.subtract(R2)[1];
				System.out.println(R1.toString() + " + " + R2.toString() + " = " + n2 + "/" + d2);
				break;
				
			case "*":
				long n3 = R1.multiply(R2)[0];
				long d3 = R1.multiply(R2)[1];
				System.out.println(R1.toString() + " + " + R2.toString() + " = " + n3 + "/" + d3);
				break;
				
			case "/":
				long n4 = R1.divide(R2)[0];
				long d4 = R1.divide(R2)[1];
				System.out.println(R1.toString() + " + " + R2.toString() + " = " + n4 + "/" + d4);
				
		}
	}
}
