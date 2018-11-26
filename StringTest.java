package 作业;

public class StringTest {
	
	/**
	 * 重复某个字符
	 * 
	 * 例如： 
	 * 'a' 5   => "aaaaa"  
	 * 'a' -1  => ""
	 * 
	 * @param c     被重复的字符
	 * @param count 重复的数目，如果小于等于0则返回""
	 * @return 重复字符字符串
	 */

	public static String repeat(char c, int count) {
		if(count<=0) {
			System.out.print("count can't be <= 0");
			return "";
		}else {
			char [] char1=new char[count];
			for(int i=0;i<count;i++) {
				char1 [i] = c;
			}
			String str1=new String(char1);
			return str1;
		}
    }
	
	
	 /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串
     * 字符填充于字符串前
     *
     * 例如： 
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充后的长度
     * @return 填充后的字符串
     */
	  public static String fillBefore(String str, char filledChar, int len) {
		  
		  if(str.length()>len) {
	    	   System.out.println("str.length() can't be > len");
	    	   return "";
	       }else if(str.length()==len) {
	    	   return str;
	       }else {
	    	   char [] char2 = new char[len];
	    	   char [] char3 = str.toCharArray();
	    	   for(int i=0;i<len-str.length();i++) {
	    		   char2[i]=filledChar;
	    	   }
	    	   for(int k=len-str.length(),n=0;k<len||n<str.length();k++,n++)  {
	    		   char2[k]=char3[n];
	    	   }
	    	   String str2=new String(char2);
	    	   return str2;
	    }
	  }
	    
	
	  /**
	     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串<br>
	     * 字符填充于字符串后
	     * 例如： 
	     * "abc" 'A' 5  => "abcAA"
	     * "abc" 'A' 3  => "abc"
	     *
	     * @param str        被填充的字符串
	     * @param filledChar 填充的字符
	     * @param len        填充长度
	     * @return 填充后的字符串
	     */	
    public static String fillAfter(String str, char filledChar, int len){
    	
       if(str.length()>len) {
    	   System.out.println("str.length() can't be > len");
    	   return "";
       }else if(str.length()==len) {
    	   return str;
       }else {
    	   char [] char2 = new char[len];
    	   char [] char3 = str.toCharArray();
    	   for(int i=0;i<str.length();i++) {
    		   char2[i]=char3[i];
    	   }
    	   int i=len-str.length();
    	   for(int j=0;j<i;j++) {
    		   char2 [j+str.length()] = filledChar;
    		   }
			String str2=new String(char2);
			return str2;
       }
    }
    
    /**
     * 移除字符串中所有给定字符串
     * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
     *
     * @param str         字符串
     * @param strToRemove 被移除的字符串
     * @return 移除后的字符串
     */
    public static String removeAll(CharSequence str, CharSequence strToRemove) {
    	
    	String result="";
    	for(int i=0;i<str.length();i++) {
    		if(str.charAt(i)!=strToRemove.charAt(0)) {
    			result+=str.charAt(i);
    		}
    	}
        return result;
    }
    
    /**
     * 反转字符串
     * 例如：abcd => dcba
     *
     * @param str 被反转的字符串
     * @return 反转后的字符串
     */
    public static String reverse(String str) {
    	char [] char1 = str.toCharArray();
    	char [] char2 = new char[str.length()];
    	for(int i=str.length()-1,j=0;j<char2.length;i--,j++) {
    		char2[j]=char1[i];
    	}
    	String str1=new String(char2);
		return str1;
    }
	
	public static void main(String[] args) {
		System.out.println(repeat('a',5));
		System.out.println(repeat('a',-1));
		System.out.println("*****************************");
		System.out.println(fillBefore("abc",'A',5));
		System.out.println(fillBefore("abc",'A',3));
		System.out.println("*****************************");
		System.out.println(fillAfter("abc",'A',5));
		System.out.println(fillAfter("abc",'A',3));
		System.out.println("*****************************");
		System.out.println(removeAll("aa-bb-cc-dd","-"));
		System.out.println("*****************************");
		System.out.println(reverse("abcd"));
	}
		

}








