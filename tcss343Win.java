
public class tcss343Win {

    
    public tcss343Win() {
    }
    
    public int BruteForce() {
        
        
        
        return 0;
        
    }
    
    public int[] DynamicProgramming(int[][] arr) {
        int[] cost = new int[arr.length];
        int[] post = new int[arr.length];
        cost[0] = 0;
        
        for(int i = 1; i < cost.length; i++) {
            cost[i] = cost[i-1] + arr[i - 1][i];		//current path to same level as last.
            post[i] = i;
            System.out.println("init");

            for(int j = i - 1; j >= 0; j--) {	
            	if (cost[j] + arr[j][i] < cost[i]) {	//check for better path
                    cost[i] = cost[j] + arr[j][i];	//if better path found set to new current path
                    post[i] = j + 1;
                    System.out.println("reset ");

                }
            }
        }
        for(int i = 0; i < cost.length; i++) {
            System.out.print(cost[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < post.length; i++) {
            System.out.print(post[i] + " ");
        }
       return cost;
    }
    
    public int recursiveSolution(int[][] arr) {
    	
    	return 0;
    }
    
    
    
    private int min(int a, int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
        
    }
    
    public static void main(String[] args) {
        tcss343Win a = new tcss343Win();
        int[][] arr = new int[][]{{0, 2, 3, 7, 9}, {10000, 0, 2, 4, 5}, {10000, 10000, 0, 2, 9}, {10000, 10000, 10000, 0, 10}, {1000, 1000, 1000, 0}};

        a.DynamicProgramming(arr);
    }
}