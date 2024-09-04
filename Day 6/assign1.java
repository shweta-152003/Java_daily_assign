class Codex{
	public static void main(String[] args){
	int a=10;
	int b=20;
	int c=30;
	if(b<a && a<c){
	  System.out.print( a + " is the second largest" );
       }else if(a<b && b<c){
	  System.out.print( b + " is the second largest" );	
       }else{
	  System.out.print( c + " is the second largest" );
       }
    }
}