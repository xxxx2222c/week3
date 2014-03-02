import java.io.*;
import java.util.*;
class threeone {
  public static void main(String[] args) throws Exception {
    HashMap<Integer,string> map = new HashMap<Integer,string>();
	FileReader fr;
	FileWriter fw;
	BufferedReader ffr;
	BufferedWriter ffw;
	int q=0;
	int ch;
	String str ;
	String[] st ;
	String str2 ;	
	int ke=1;
	string t;
	fr=new FileReader("3.1.txt");
	ffr=new BufferedReader(fr);
	while((str2=ffr.readLine())!=null)
	{
		st=str2.split("[ ,?#@$!%]+");
		t=new string(st[0]);
		t.count=Integer.parseInt(st[1]);
		map.put(ke,t);
		ke++;

		System.out.println("字串: "+t.txt+"次數: "+t.count);
	}
	fr.close();
	for(int k=0;;k++)
	{
		java.util.Scanner type = new java.util.Scanner(System.in);
		System.out.print("1)輸入2)搜索-1)結束");
        ch = type.nextInt();
	    if(ch==1)
		{
            System.out.print("請輸入字串:");
	        InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(is);
            str = in.readLine();
			str=str.toLowerCase();	
			st = str.split("[ ,?#@$!%]+");
			for(String str3:st)
			{					
					for(q=1;q<=map.size();q++)
					{
						if(map.get(q).txt.equals(str3))
						{
							map.get(q).count++;
							break;
						}
					}
					if(q>map.size())
					{						
						t=new string(str3);
						t.count++;
						map.put(ke,t);
						ke++;
					}
			}

		}
		else if(ch==2)
		{
            System.out.print("請輸入要搜尋的英文字串:");
	        InputStreamReader is2 = new InputStreamReader(System.in);
            BufferedReader in2 = new BufferedReader(is2);
            str2 = in2.readLine();
            	for(q=1;q<=map.size();q++)
				{
					if(map.get(q).txt.equals(str2))
					{
						System.out.println("字串:"+map.get(q).txt+"\n次數:"+map.get(q).count+"\n");
						break;
					}
				}
				if(q>map.size())
				{
					System.out.println("\n查無字串"+str2+"!!!\n");
				}
        }
        else if(ch==-1)
		{
				fw=new FileWriter("3.1.txt");
				ffw=new BufferedWriter(fw);
				for(q=1;q<=map.size();q++)
				{
					ffw.write(map.get(q).txt+" "+map.get(q).count);
					ffw.newLine();
				}
				ffw.flush();
				fw.close();
                break;
		}
        else 
            System.out.print("error!\n");		
	
	}
	
	
  }

}
class string
{
	String txt;
	int count=0;
	string(String txt)
	{
		this.txt=txt;		
	}
}
