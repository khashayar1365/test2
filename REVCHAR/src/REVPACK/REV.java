package REVPACK;
import java.util.ArrayList;
import java.util.List;

public class REV {

	public static void main(String[] args) {
		String st="I have a happy dog";
		char[] st2Ch = st. toCharArray();
		System.out.println(reverseCharacter(st2Ch));
		System.out.println(reverseWords(st2Ch));
	}
	
	public static String reverseCharacter(char[] cha) {
		int l= cha.length;
		String rev="";
		for(int i=0;i<l;i++)
		{
			rev=rev+cha[l-1-i];
		}
		return rev;
	}
	
	public static String reverseWords(char[] cha) {
		int l=cha.length;
		List<String> revWTemp=new ArrayList<>();
		String revW="";
		String temp="";
		boolean strd=false;
		for(int i=0;i<l;i++) {
			if(cha[i]!=' ' && strd==false) {
				strd =true;
				temp=Character.toString(cha[i]);
			}
			else if(cha[i]==' ' && strd==true) {
				revWTemp.add(temp);
				temp="";
				strd=false;
			}
			else if(cha[i]==' ' && strd==false) {
				//revWTemp.add(temp);
				temp="";
				//strd=false;
			}
			else if(cha[i]!=' ' && strd==true) {
				temp=temp+Character.toString(cha[i]);
			}
			if(i==l-1){
				revWTemp.add(temp);
				temp="";
				strd=false;
			}
			
		}
		int ll=revWTemp.size();
		for(int i=ll-1;i>=0;i--) {
			revW=revW+revWTemp.get(i);
			if(i>0)
				revW=revW+" ";
		}
		return revW;
	}
	
}
