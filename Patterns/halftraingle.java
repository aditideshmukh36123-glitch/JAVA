//  *
//  * *
//  * * *
//  * *
//  *

public class Main
{
	public static void main(String[] args) {

int i,j,n=5;

    
for(i=1;i<=((n/2)+1);i++){
    
    
    for(j=1;j<=i;j++){
        
        System.out.print(" *");
        
    }
    
            System.out.println("");

}


for(i=1;i<=(n/2);i++){
    
for(j=(n/2);j>=i;j--){
            System.out.print(" *");

}
            System.out.println("");

}



	}
}
