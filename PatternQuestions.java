public class PatternQuestions {
    //print following pattern
    /* *****
       ****
       ***
       **
       *          */
    public static void printuppertriangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            printuppertriangle(r,c+1);
        }
        else {
            c=0;
            System.out.println();
            printuppertriangle(r - 1, c);
        }
    }
    /*
        *
        * *
        * * *
        * * * *
        * * * * *
     */
    public static void printLowertriangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            printLowertriangle(r,c+1);
            System.out.print("* ");
        }
        else{
             printLowertriangle(r-1,0);
            System.out.println();
        }
    }
    public static void main(String args[]){
        printuppertriangle(5,0);
        printLowertriangle(5,0);
    }

}
