// *****
// *   *
// *   *
// *   *
// *****




class SquareHollowPattern{


  public static void main(String args[]){

   int i,j,n=5;

    for(i=1;i<=n;i++){
        
         for(j=0;j<n;j++){

     if(i==1 || i==n || j==0 || j==n-1 ){
                            
       System.out.print("*");

         
     }else{
         
                             
       System.out.print(" ");

     }


         }            
                     
                     
                     
    System.out.println("");

    }


    
  }
}
