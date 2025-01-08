package commandlineVariables;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=0;
		
		for(String x:args)
		{
			if((x.matches("[0-9\\.]+")))
				s=s+Double.parseDouble(x);
		}
		System.out.println("Sum is "+ s);

	}

}
