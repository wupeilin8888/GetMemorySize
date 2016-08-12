
public class GetMemorySize {

	public static void main(String[] args) {
		
		Runtime run = Runtime.getRuntime();
		String str = "";
		for (int x =0;x<10000;x++)
		{
			
			str += x;
		}
		System.out.println("1"+run.maxMemory()/1000000);
		System.out.println("1"+run.totalMemory()/100000);
		System.out.println("1"+run.freeMemory()/1000000);
		
		
		run.gc();
		

		
		System.out.println("2"+run.maxMemory()/1000000);
		System.out.println("2"+run.totalMemory()/1000000);
		System.out.println("2"+run.freeMemory()/1000000);
		

	}

}
