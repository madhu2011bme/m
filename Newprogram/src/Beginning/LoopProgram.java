package Beginning;

public class LoopProgram {

	public static void main(String[] args)
	{
      /* int a[]=new int[5];
           a[0]=10;
      a[1]=20;
      a[2]=30;
      a[3]=40;
      for(int i:a)
      {
            System.out.println(i);
      }
            System.out.print(a.length);
            */
		int a[]= {10,20,30,40,50,60,70};
		int sum=0;
		for(int i:a)
	      {
	            System.out.println(i);
	            sum=sum+i;
	      }
	            System.out.print(sum);
	}
}