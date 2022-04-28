package dataStruct;

public class Truat {

	public static void main(String[] args) {
		String gas="eabcbkiubaabgdaaddaad";
	    System.out.println(palindrom(gas));
	}public static String palindrom(String s) {
		int y=s.length(),x=0,z=0,p=0,max=0,min=0, num=0;
		String k="";
		boolean square [][]=new boolean[y][y];
		for(x=0;x<y;x++) {
			square[x][x]=true;                             //Sets every letter true
			  p=x;
			if((x+1)<y&&s.charAt(x)==s.charAt(x+1)) {
				square[x][x+1]=true;
				max=x+1;
				min=x;
			}
		}for(x=2;x<y;x++) {
			 p=x;			
			for(z=0;z<=(y-x);z++) {
		         
				if(p<y&&s.charAt(z)==s.charAt(p)&&square[z+1][p-1]==true) {
					square[z][p]=true;
					
					if((p-z)>num) {                                      //needs work
						num=p-z;
						max=p;
						min=z;
					}
				}p++;
			   
			}
			
		}
		for(x=min;x<=max;x++) {
		k+=s.charAt(x);
		}
		return k;
	}

}
