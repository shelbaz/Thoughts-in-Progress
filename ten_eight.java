
public class ten_eight
{

	public static void main(String[] args) 
	{

		double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

		int[][] brackets2001 = {{27050, 65550, 136750, 297350},
				{45200, 109250, 166500, 297350},
				{22600, 54625, 83250, 148675},
				{36250, 93650, 151650, 297350}};

		double[] rates2009 = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};

		int[][] brackets2009 = {{8350, 33950, 82250, 171550, 372950},
				{16700, 67900, 137050, 208850, 372950},
				{8350, 33950, 68525, 104425, 186475},
				{11950, 45500, 117450, 190200, 372950}};

		Tax taxTable2001 = new Tax(0, brackets2001, rates2001, 50000);

		System.out.print("Tax Table 2001\n\nTaxable Income | Single " + "| Married Jointly... | Married Separately | Head Of Household" + "\n--------------------------------------------------------------------------------------\n");

		for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) 
		{
			System.out.print(taxableIncome + " ");
			taxTable2001.setTaxableIncome(taxableIncome);
			
			for (int status = 0; status < 4; status++) 
			{
				taxTable2001.setFilingStatus(status);
				System.out.printf("%18.2f", taxTable2001.getTax());
			}
			System.out.println();
		}


		Tax taxTable2009 = new Tax(0, brackets2009, rates2009, 50000);

		System.out.print("\n\nTax Table 2009\n\nTaxable Income | Single " + "| Married Jointly... | Married Separately | Head Of Household" + "\n--------------------------------------------------------------------------------------\n");

		for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) 
		{
			System.out.print(taxableIncome + " ");
			taxTable2009.setTaxableIncome(taxableIncome);

			for (int status = 0; status < 4; status++) 
			{
				taxTable2009.setFilingStatus(status);
				System.out.printf("%18.2f", taxTable2009.getTax());
			}
			System.out.println();
		}
	}
}