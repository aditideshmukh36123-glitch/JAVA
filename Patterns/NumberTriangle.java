//Output
 //    1
 //   2 2
 //  3 3 3
 // 4 4 4 4

class NumberTriangle {
    public static void main(String[] args) {
        
        int i,j;
        
        
        for(i=1;i<=4;i++){
            
            for(j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            
            for(j=1;j<=i;j++){
                System.out.print(" "+i);
            }
            System.out.println("");
        }
    }
}
