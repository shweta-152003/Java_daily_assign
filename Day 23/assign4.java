class Codex {
	public static void main(String[] args){
	int k=0,inc=0;
	
	for(int i=0;i<4;i++){
	k=0;
	for(int j=0;j<4-i;j++){
	System.out.print((char)(97+k+inc)+" ");
	k++;
       }
	inc+=2;
	System.out.println();
       }
    }
}