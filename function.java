
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class function {
    //*****************************************Tool: Add Prefix and/or Suffix into Each Line*******************

    public static String generate(String s , String pre , String suf )
	{
		String[] arr = s.split("\\r?\\n");
		StringBuilder[] sb = new StringBuilder[arr.length];
		StringBuilder prefix = new StringBuilder(pre); 
		StringBuilder suffix = new StringBuilder(suf); 	
		StringBuilder temp = new StringBuilder();	
		for(int i = 0 ; i < arr.length ; i++)
		{
			sb[i] = new StringBuilder(arr[i]);
		}
                
		for(int i = 0 ; i < sb.length ; i++)
		{
			if(!pre.equals(""))
			{
				temp.append(sb[i]);
				sb[i].setLength(0);
				sb[i].append(prefix);
				sb[i].append(temp);
			}
			if(!suf.equals(""))
			{
				sb[i].append(suffix);
			}
		}
		temp.setLength(0);
		for(int i = 0 ; i < sb.length ; i++ )
		{
			temp.append(sb[i]);
                        temp.append("\n");
		}		
		String result = new String(temp);
		System.out.println(result);
                return result;
	}	
    //*****************************************Tool: Add / Remove Line Breaks*******************
    public static String remove_breaks(String text)
	{
        text = text.replace("\n" ,"");
        return text ;		
	}
    
    public static String add_remove_breaks(String text, boolean removeafter , boolean removebefore , String replace)
    {
        if (removeafter==true)
        {
            text = text.replace(replace , replace+"\n" );
        }
        if (removebefore==true)
        {
            text = text.replace(replace , "\n"+replace );
        }
        return text ;
    }

    //*****************************************Tool: Remove Empty Lines*******************
    
    public static String remove_empty_lines(String text)
    {
        text = text.replaceAll("(?m)^\\s", "");
        return text ;
    }

    //*****************************************Tool: Find and Replace Text*******************
    
    public static String find_and_replace(String text , String find , String replace)
    {
        String result = "";
        result = text.replaceAll(find,replace);
        return result;
    }

    public static void showIndexes(String text , String find)
    {
        int index = text.indexOf(find);
        while (index >=0)
        {
            index = text.indexOf(find, index+find.length());
            if(index!=-1)
                System.out.println(index);
        }
    }
    
    //*****************************************Tool: Remove Lines Containing...*******************
    
    public static String remove_lines_conntaining(String text, String word)
    {
        word = word.toLowerCase();
        ArrayList <String> al = new ArrayList <String> ();
        String[] s = text.split("\n");
        int n = s.length;
        for(int i = 0 ; i < n ; i++ )
        {
            String temp = s[i].toLowerCase();
            if(temp.contains(word)==false)
                al.add(s[i]);
        }
        String res = "";
        for(int i = 0 ; i < al.size() ; i++ )
        {
            String temp = al.get(i) ;
            res += temp + "\n" ;
        }
        return res ;
    }
    
    //*****************************************Tool: Remove Extra Spaces*******************
    
    public static String remove_extra_spaces(String text)
    {
        String after = text.trim().replaceAll(" +", " ");
        return after ;
    }
    
    //*****************************************Tool: Disemvowel Tool*******************
    
    public static String disemble(String s , String remove)
    {
        int n = s.length();
        HashSet <Character> hs = new HashSet <Character> ();
        for(int i = 0 ; i < remove.length() ; i++)
        {
            hs.add(remove.charAt(i));
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i < sb.length()  ; i++)
        {
            if(hs.contains(sb.charAt(i)))
            {
                sb.deleteCharAt(i);
                i--;
            }
        }
        String res = new String(sb);
        return res ;
    }
    
    //*****************************************Tool: Reverse Text Generator*******************
    
    public static String reversetext(String s)
    {
        int n = s.length();
        char[] x = s.toCharArray();
        for(int i = 0 ; i < n/2 ; i++)
        {
            char temp = x[i] ;
            x[i] = x[n-i-1] ;
            x[n-i-1] = temp ;
        }
        String res = new  String(x);
        return res ;
    }
    
    public static String fliptext(String s)
    {
        String[] str = s.split("\n");
        int n = str.length;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < n ; i++ )
        {
            int len = str[i].length();
            for(int j = len-1; j >=0 ; j--)
                sb.append(str[i].charAt(j));
            sb.append("\n");
        }
        String res = new  String(sb);
        return res ;
    }
    
        public static String reversewords(String s)
    {
        String[] str = s.split("\n");
        int n = str.length;
        StringBuilder sb = new StringBuilder("");
        for(int i = n-1 ; i >= 0 ; i--)
        {
            String[] words = str[i].split(" ");
            int len = words.length;
            for(int j = len-1; j >=0 ; j--)
                sb.append(words[j] + " ");
            sb.append("\n");
        }
        String res = new  String(sb);
        return res ;
    }
        
        public static String flipwords(String s)
    {
        String[] str = s.split("\n");
        int n = str.length;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < n ; i++)
        {
            String[] words = str[i].split(" ");
            int len = words.length;
            for(int j = len-1; j >=0 ; j--)
                sb.append(words[j] + " ");
            sb.append("\n");
        }
        String res = new  String(sb);
        return res ;
    }
        
        public static String reverselettering(String s)
    {
        String[] str = s.split(" ");
        int n = str.length ;
        StringBuilder sb = new StringBuilder(" ");
        for(int i = 0 ; i < n ; i++)
        {
            StringBuilder sbb = new StringBuilder(str[i]);
            sbb.reverse();
            sb.append(sbb + " ");
        }
        String res = new String(sb);
        return res ;
    }
        
        //***************************Tool: ROT13 Caesar Cipher*************************
        
         public static String generaterot13(String s)
    {
        String res = "" ;
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        for(int i = 0 ; i < n ; i++)
        {
            char ch = sb.charAt(i);
            if(Character.isDigit(ch))
            {
                int k = (int) ch - 48 ;
                k = (k + 13)%10;
                k = k + 48 ;
                char c = (char) k ;
                sb.setCharAt(i,c);
            }
            else if(Character.isLowerCase(ch))
            {
                int k = (int) ch - 97 ;
                k = (k + 13)%26;
                k = k + 97 ;
                char c = (char) k ;
                sb.setCharAt(i,c);
            }
            else if(Character.isUpperCase(ch))
            {
                int k = (int) ch - 65 ;
                k = (k + 13)%26;
                k = k + 65 ;
                char c = (char) k ;
                sb.setCharAt(i,c);
            }
        }
        res = new String(sb);
        return res;
    }
  
//***************************Tool: Word Scrambler / Descrambler*************************

         public static String scramble(String s)
    {
        Random rand = new Random();

        String str[] = s.split(" ");
        int n = str.length;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < n ; i++)
        {
            ArrayList<Character> al = new ArrayList<Character>();

            for(int ii = 0; ii<str[i].length(); ii++)
                al.add(str[i].charAt(ii));

            Collections.shuffle(al);
            for(Character ch: al)
                sb.append(ch);

            sb.append(" ");

        }
        String res = new String(sb);
        return res ;
    }
    //***************************Tool: Random Number Generator*************************

    public static String generate_numbers(String nn , String minn , String maxx , String prefix , String suffix , String join_with , boolean pad)
    {
        int n = Integer.parseInt(nn);
        int max = Integer.parseInt(maxx);
        int min = Integer.parseInt(minn);        
        String[] x = new String[n];
        Random rand = new Random();

        int maxxx = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++)
        {
            int temp = min + rand.nextInt(max-min+1);
            x[i]=""+temp;
            if(temp>maxxx)
                maxxx=temp;
        }
        
        int d = (int) Math.log10(maxxx) + 1 ;

        if(pad==true)
        for(int i = 0 ; i < n ; i++)
        {
            int diff = d-x[i].length();
            for(int j = 0 ; j < diff ; j++)
                x[i] = "0"+x[i];        
        }
        
        for(int i = 0 ; i < n ; i++)
            x[i] = prefix + x[i] + suffix ;
        
        String res = "";
        
        for(int i = 0 ; i < n-1 ; i++)
            res += x[i] + join_with ;
            
        res+=x[n-1];
        return res;
    }
   //*****************************************Tool: Combination Generator******************* 
    
    public static StringBuilder sb = new StringBuilder("");

    public static void combinationUtil(String arr[], String data[], String prefix , String suffix , int start,
                                int end, int index, int r)
    {
        if (index == r)
        {
            sb.append(prefix);
            for (int j=0; j<r ; j++)
            {
                sb.append(data[j]);
                if(j!=r-1)
                    sb.append(" ");
            }
            sb.append(suffix);
            sb.append("\n");
            return;
        }

        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, prefix , suffix ,0, end, index+1, r);
        }
    }

    public static String printCombination(String s , String prefix , String suffix , String combination)
    {

        int r = Integer.parseInt(combination);
        String data[]=new String[r];
        String[] arr = s.split("\n");
        int n = arr.length;
        combinationUtil(arr, data, prefix , suffix , 0, n-1, 0, r);
        String result = new String(sb);
        return result ;
    }
   
//*****************************************Tool: Random Line Picker******************* 
    
    public static String pick_random_line(String text , int no  , boolean numbered)
    {
        String[] s = text.split("\n");
        Random r = new Random();
        int n = s.length;
        if(no>n)
        {
            return "Not possible";
        }
        String res = "";
        HashSet <Integer> hs = new HashSet <Integer> () ;
        int rr = r.nextInt(n);
        for(int i = 1 ; i <= rr ; i++)
        {
            int x = r.nextInt(n-1);
            while(hs.contains(x))
                x = r.nextInt(n-1);
            hs.add(x);
            if(numbered==false)
                res += s[x] +"\n";
            else
                res += i + " " + s[x] + "\n";
        }
        return res ;
    }
    
//*****************************************Tool: Random String Generator******************* 

    public static String randomize_strings(String text)
    {
        Random r = new Random();
        int n = text.length();
        char[] temp = text.toCharArray();
        for(int i = n-1 ; i > 0 ; i--)
        {
            int j = r.nextInt(i) ;
            char temp1 = temp[i];
            temp[i] = temp[j];
            temp[j] = temp1 ;
        }
        String result = new String(temp);
        return result ;
    }
    //*****************************************Tool: Generate List of Sequential Numbers******************* 
    
    public static String sequential_numbers(String minn , String maxx , String prefix , String suffix , String join , boolean pad )
    {
        StringBuilder sb = new StringBuilder("");
        int min = Integer.parseInt(minn);
        int max = Integer.parseInt(maxx);

        int d = (int) Math.log10(max) + 1 ;

        for(int i = min ; i <= max ; i++)
        {
            int tempd = (int) Math.log10(i) + 1 ;
            tempd = d - tempd ;
            if(i==0)
                tempd=tempd+3;
            String temp = "";
            for(int j = 1 ; j <=tempd ; j++ )
                temp+="0";
            sb.append(prefix + temp + i + suffix + join);
        }
        String res = new String(sb);
        return res ;
    }
   //*****************************************Tool: Remove Letter Accents******************* 
    public static String remove_letter_accents(String text)
    {
        int n = text.length();
        char[] s =text.toCharArray();
        for(int i = 0 ; i < n ; i++)
        {
            if((s[i]=='À')||(s[i]=='Á')||(s[i]=='Â')||(s[i]=='Ã')||(s[i]=='Ä'))
                s[i]='A';
            if((s[i]=='à')||(s[i]=='á')||(s[i]=='â')||(s[i]=='ã')||(s[i]=='ä'))
                s[i]='a';
            if(s[i]=='Ç')
                s[i]='C';
            if(s[i]=='ç')
                s[i]='c';
            if((s[i]=='È')||(s[i]=='É')||(s[i]=='Ê')||(s[i]=='Ë'))
                s[i]='E';
            if((s[i]=='è')||(s[i]=='é')||(s[i]=='é')||(s[i]=='ë'))
                s[i]='e';
            if((s[i]=='Ì')||(s[i]=='Í')||(s[i]=='Î')||(s[i]=='Ï'))
                s[i]='I';
            if((s[i]=='ì')||(s[i]=='í')||(s[i]=='î')||(s[i]=='ï'))
                s[i]='i';
            if(s[i]=='Ñ')
                s[i]='N';
            if(s[i]=='ñ')
                s[i]='n';
            if((s[i]=='Ò')||(s[i]=='Ó')||(s[i]=='Ô')||(s[i]=='Õ')||(s[i]=='Ö'))
                s[i]='O';
            if((s[i]=='ò')||(s[i]=='ó')||(s[i]=='ô')||(s[i]=='õ')||(s[i]=='ö'))
                s[i]='o';
            if(s[i]=='Š')
                s[i]='S';
            if(s[i]=='š')
                s[i]='s';
            if((s[i]=='Ú')||(s[i]=='Û')||(s[i]=='Ü')||(s[i]=='Ù'))
                s[i]='U';
            if((s[i]=='ù')||(s[i]=='ú')||(s[i]=='û')||(s[i]=='ü'))
                s[i]='u';
            if((s[i]=='Ý')||(s[i]=='Ÿ'))
                s[i]='Y';
            if((s[i]=='ý')||(s[i]=='ÿ'))
                s[i]='y';
            if(s[i]=='Ž')
                s[i]='Z';
            if(s[i]=='ž')
                s[i]='z';
        }
        String result = new String(s);
        return result ;
    }
    
    //***************************Tool: Remove Duplicate Lines*************************
    public static String remove_duplicate_lines(String text , boolean remove_empty_lines )
    {
        if(remove_empty_lines==true)
            text = text.replaceAll("(?m)^\\s", "");
        LinkedHashSet<String> lhs = new LinkedHashSet<String>() ;
        String[] s = text.split("\n");
        int n = s.length;
        for(int i = 0 ; i < n ; i++)
            lhs.add(s[i]);
        Iterator it = lhs.iterator();
        StringBuilder sb = new StringBuilder("");
        while(it.hasNext())
            sb.append((String)it.next());
        String res = new String(sb);
        return res;
    }
    
    //***************************Tool: Letter Case Converter*************************
    public static String change_case( String text , boolean upper , boolean lower , boolean rand , boolean first_of_each_word )
    {
        Random r = new Random();

        if(upper==true)
            text = text.toUpperCase();
        if(lower==true)
            text = text.toLowerCase();
        if(rand==true)
        {
            int n = text.length();
            for( int i = 0 ; i < n ; i++ )
            {
                int x  = r.nextInt(10);
                System.out.print(x);
                if(x%2==0)
                    Character.toUpperCase(text.charAt(i));
                else
                    Character.toLowerCase(text.charAt(i));
            }
        }
        if(first_of_each_word==true)
        {
            String[] s = text.split(".");
            int n = s.length;
            for(int i = 0 ; i < n ; i++ )
            {
                int c = 0 ;
                for(int j = 0 ; j < s[i].length() ; j++ )
                {
//                    while(Character.isLowerCase())
  //                  {
//
    //                }
                }
            }
        }
      return text;
    }
    
    //***************************Tool: Delimited Column Extractor*************************
    public static String delimited_column_extractor(String text , int columnno)
    {
        String s = "";
        String[] res = text.split("\n");
        int n = res.length;
        for(int i = 0 ; i < n ; i++)
        {
            try
            {
                char ch=res[i].charAt(columnno-1);
                s += ch + "\n" ;
            }
            catch(Exception e)
            {
                s += " \n" ;
            }
        }
        return s ;
    }
    //***************************Tool: Binary Code Translator*************************
    public static String tobinary(String s , boolean space)
    {
        String[] str = s.split("\n");
        int len = str.length;
        StringBuilder binary = new StringBuilder();
        for(int j = 0 ; j < len ; j++ )
        {
            byte[] bytes = str[j].getBytes();
            for (byte b : bytes)
            {
                int val = b;
                for (int i = 0; i < 8; i++)
                {
                    binary.append((val & 128) == 0 ? 0 : 1);
                    val <<= 1;
                }
                if(space==true)
                    binary.append(' ');
            }
            binary.append("\n");
        }
        String res = new String(binary);
        return res;
    }
}
