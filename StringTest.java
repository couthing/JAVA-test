package ��ҵ;

public class StringTest {
	
	/**
	 * �ظ�ĳ���ַ�
	 * 
	 * ���磺 
	 * 'a' 5   => "aaaaa"  
	 * 'a' -1  => ""
	 * 
	 * @param c     ���ظ����ַ�
	 * @param count �ظ�����Ŀ�����С�ڵ���0�򷵻�""
	 * @return �ظ��ַ��ַ���
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
     * �������ַ������Ϊ�涨���ȣ���������ַ���������������򷵻�����ַ���
     * �ַ�������ַ���ǰ
     *
     * ���磺 
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        �������ַ���
     * @param filledChar �����ַ�
     * @param len        ����ĳ���
     * @return ������ַ���
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
	     * �������ַ������Ϊ�涨���ȣ���������ַ���������������򷵻�����ַ���<br>
	     * �ַ�������ַ�����
	     * ���磺 
	     * "abc" 'A' 5  => "abcAA"
	     * "abc" 'A' 3  => "abc"
	     *
	     * @param str        �������ַ���
	     * @param filledChar �����ַ�
	     * @param len        ��䳤��
	     * @return ������ַ���
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
     * �Ƴ��ַ��������и����ַ���
     * ����removeAll("aa-bb-cc-dd", "-") => aabbccdd
     *
     * @param str         �ַ���
     * @param strToRemove ���Ƴ����ַ���
     * @return �Ƴ�����ַ���
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
     * ��ת�ַ���
     * ���磺abcd => dcba
     *
     * @param str ����ת���ַ���
     * @return ��ת����ַ���
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








