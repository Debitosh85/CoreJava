package multithreadingtask;

class NewPlatForm2
{
   public static void main(String args[])
   {
      {
         new Thread()
         {
            public void run()
            {
               for(int i=1;i<=15;i++) // Assuming 15 is the intended upper limit
            {
               System.out.println("Enjoy Your NewPlatForm..."+i);
               break;
            }
            }
         }.start();

         new Thread()
           {
              public void run()
               {
            	  for(int i=1;i<=(3^5);i++)
              	{
            		  if(i==(3^4))
                  System.out.println("Experience this NewPlatForm..."+i);
              	}
               }
           }.start();
      }
   } 
}


