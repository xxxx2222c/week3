import java.io.*;
class oneone {
  public static void main(String[] args) throws Exception {
    int sum=0;
    System.out.print("½Ð¿é¤J¦r¦ê:");
	InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(is);
    String str = in.readLine();
	String[] st = str.split("[ ,?#@$!%]+");
    for (int i = 0; i < st.length; i++)
	{
	try {
	sum+=Integer.parseInt(st[i]);
}
 catch(Exception e) {
        st[i]=st[i].toLowerCase();
        	
}		
        System.out.println(st[i]);
	}
	System.out.println("sum="+sum+"\n");
	
  }

}
