/*

Edge Existence

You have been given an undirected graph consisting of N nodes and M edges. 
This graph can consist of self-loops as well as multiple edges. 
In addition ,you have also been given Q queries. 
For each query ,you shall be given 2 integers A and B. 
You just need to find if there exists an edge between node A and node B.
If yes, print "YES" (without quotes) else , print "NO"(without quotes).

Input Format:

The first line consist of 2 integers N and M denoting the number of nodes and edges respectively. 
Each of the next M lines consist of 2 integers A and B denoting an undirected edge between node A and B.
The next line contains a single integer Q denoting the number of queries. 
The next Line contains 2 integers A and B denoting the details of the query.

Output Format

Print Q lines, the answer to each query on a new line.

Constraints:
1=N=103
1=M=103
1=A,B=N
1=Q=103

*/
import java.util.Scanner;
class EdgeExistence {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][]graph = new int[n][n];
        for(int i = 0;i<m;i++){
            int j = 0,k = 0;
            j = scanner.nextInt();
            k = scanner.nextInt();
            graph[j][k] = graph[j][k] + 1; 
        }
        int q = scanner.nextInt();
        for(int i = 0;i<q;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(graph[a][b]>0){
                System.out.println("YES");    
            }else{
                System.out.println("NO");
            }
        }
    }
}
