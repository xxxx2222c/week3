import java.io.*;
import java.util.*;
class twoone {
  public static void main(String[] args) throws Exception {
           int count=0;
           int[] grade=new int[10];
		   Map<String,Integer> map = new HashMap<String,Integer>();
           for(int j=0;;j++)
           {   
               java.util.Scanner type = new java.util.Scanner(System.in);
               System.out.print("請輸入分數:-1離開");
               grade[count] = type.nextInt();
			   if(grade[count]==-1)
			       break;
               else if(grade[count]>100||grade[count]<-1)
               {
                    System.out.print("error!\n");
                    j--;
               }
			   else 
			   {
			       System.out.print("請輸入姓名:");
	               InputStreamReader is = new InputStreamReader(System.in);
                   BufferedReader in = new BufferedReader(is);
                   String str = in.readLine();
				   map.put(str,grade[count]);
                   count++;   
			   }
           }
               System.out.print("請輸入想找的姓名:");
               InputStreamReader is = new InputStreamReader(System.in);
               BufferedReader in = new BufferedReader(is);
               String st = in.readLine();
			   System.out.println("grade="+map.get(st));	
			   
  }
}
