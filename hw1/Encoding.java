
import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      result(m,n,"", result);
	return result;
	}
public static void result(int m, int n, String str, Set<String> result){
//when m=n=0
	if(m==0&&n==0){
		result.add(str);
		return;
	}
//When n=0
	if(n==0){
		result(m-1,n,"."+str,result);
		return;
	}
//When m=0
	if(m==0){
		result(m,n-1,"-"+str,result);
		return;
   }
//When m>=1 and n>=1
   else{
	result(m-1,n,"."+str,result);
	result(m,n-1,"-"+str,result);
   }
}
}