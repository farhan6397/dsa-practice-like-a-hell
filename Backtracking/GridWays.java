public class GridWays{
    public static int gridWays(int i, int j, int m, int n){
        //Base case 
        if(i==n-1 && j==m-1){  // last cell condition
            return 1;
        }
        else if (i==n || j==m){ // boundary condition
            return 0;
        }
        //
      /  int way1 = gridWays(i+1, j, n, m);
        int way2 = gridWays(i, j+1, n, m);

        return way1+way2;
    }


    public static void main (String args[])
    {
        int n=3; int m=3;
        System.out.println(gridWays(0, 0, m, n ));
    }
}