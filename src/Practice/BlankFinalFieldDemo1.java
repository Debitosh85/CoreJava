package Practice;

/* class Blanks {

    final int x;

    {
        x = 100;
    }

    public Blanks(int x) {
        super();
        // this.x = x;
    }

}

public class Blank {

    public static void main(String[] args) {

        Blanks b = new Blanks(200);
        System.out.println(b.x);

    }

}
 */

class Test
{
	final int x; //blank final field
	
	{
		m1();
		x = 100;
	}
	
	public void m1()
	{
		System.out.println("Default value :"+x);
	}	
	
}

public class BlankFinalFieldDemo1 {

	public static void main(String[] args)
	{
		Test t1 = new Test();
		System.out.println("User Value :"+t1.x);

	}

}

