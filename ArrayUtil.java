public class ArrayUtil{

    //1.计算数组中最大值
    public static int arrayMaxElement(int [] data){
		if (data==null){
			//TODO IllegalArgumentException 参数异常
			throw new IllegalArgumentException("data must be not null");
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<data.length;i++){
			if (max<data[i]){	
			max=data[i];
			}
		}
        return max;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int [] data){
		if (data==null){
			throw new IllegalArgumentException("data must be not null");
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<data.length;i++){
			if (min>data[i]){
			min=data[i];
			}
		}
        return min;
    }
    
    
    //3.计算数组值之和
    public static int arrayElementSum(int [] data){
		if (data==null){
			throw new IllegalArgumentException("data must be not null");
		}
		int sum=0;
		for(int i=0;i<data.length;i++){
			sum=sum+data[i];
		}
        return sum;
    }
    
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
		if (a==null){
			throw new IllegalArgumentException("a must be not null");
		}
		if (b==null){
			throw new IllegalArgumentException("b must be not null");
		}
		int len=a.length+b.length;
		int[] c=new int[len];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		
		//假设 a.length=3 ; b.length=4
		//1.    i=3        i<7        i++
		//  c[3]=b[3-3]
		//2.    i=4     
		//  c[4]=b[4-3]
		for(int i=a.length;i<c.length;i++){
			c[i]=b[i-a.length];
		}
        return c;
    }
	
	
	//5.数组截取
    //[start, end]
	//                     所截取的数组  从第几个开始  从第几个结束
    public static int[] arraySub2(int[] a, int start , int end){
		//判断参数是否异常
		if (a==null){
			throw new IllegalArgumentException("a must be not null");
		}
		if(start<0||end<0){
			throw new IllegalArgumentException("start or end must be >0");
		}
		if(end<start){
			throw new IllegalArgumentException("end must be > start");
		}
		if(start>a.length){
			throw new IllegalArgumentException("start must be <a.length");
		}
		int count=(end-start)+1;
		int[] b=new int[count];
		for(int i=start;i<end+1;i++){
			b[i-start]=a[i];
		}
        return b;
    }

    //5.数组截取
    //[start, end)
	//                     所截取的数组  从第几个开始  从第几个结束
    public static int[] arraySub1(int[] a, int start , int end){
		//判断参数是否异常
		if (a==null){
			throw new IllegalArgumentException("a must be not null");
		}
		if(start<0||end<0){
			throw new IllegalArgumentException("start or end must be >0");
		}
		if(end<start){
			throw new IllegalArgumentException("end must be > start");
		}
		if(start>a.length){
			throw new IllegalArgumentException("start must be <a.length");
		}
		int count=end-start;
		int[] b=new int[count];
		for(int i=start;i<end;i++){
			b[i-start]=a[i];
		}
        return b;
    }
    
    //6.数组输出
	public static void printArray(int []a){
		if(a==null){
			return;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
    public static void main(String[] args){
		int[] a={4,5,6,7,8,9};
		int[] b={10,20,30};
		
		//测试拼接
		int[] c=arrayJoin(a,b);
		printArray(c);
		
		//测试截取
		int[] sub1=arraySub1(a,1,3);	
		printArray(sub1);
		
	    int[] sub2=arraySub2(a,1,3);	
		printArray(sub2);
		
		//测试数组求最大值，最小值，求和
        int[] data={2,5,4,6,7};
		System.out.print("初始data为：");
		printArray(data);
		int datamax=arrayMaxElement(data);
		System.out.println("data中最大值："+datamax); 
		//7
		
		int datamin=arrayMinElement(data);
		System.out.println("data中最小值："+datamin); 
		//2
		
		int datasum=arrayElementSum(data);
		System.out.println("data和为："+datasum); 
		//24
       
    }
}