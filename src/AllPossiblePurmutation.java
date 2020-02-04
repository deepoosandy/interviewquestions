public class AllPossiblePurmutation {

	public static void main(String[] args) {
		char[] c = "123".toCharArray();
		new AllPossiblePurmutation().getAllPossiblePurmutation(c, 0, c.length-1);
	}

	public void getAllPossiblePurmutation(char[] ch1, int l, int r) {
	     
		if(l==r){
			for(int i=0;i< ch1.length;i++)
			System.out.print(" [ "+ch1[i]+" ] ");
			System.out.println();
		}else{

			
			for(int i=l;i<=r;i++){
				swep(ch1,i,l);
				getAllPossiblePurmutation(ch1,l+1,r);
				swep(ch1,i,l);
				
			}
		}

	}
	
	private void swep(char [] c, int i, int j){
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
	}
}
