package Backend.DSA.Coding.Prg;
// import java.util.Arrays;

// class Prims
// {
// public Prims(int[][] Graph,int vertex )
// {

//     int no_edges=0;
    
//     boolean[] visited=new boolean[vertex];

//     Arrays.fill(visited,false);

//     visited[0]=true;

//     int infinity=999999;
//     int x=0,y=0;
  
//     while (no_edges < vertex-1) {
//     int min=infinity;
//      for (int i = 0; i < vertex; i++) {
        
//         if (visited[i]==true) {
    
//             for (int j = 0; j < vertex; j++) {
                
//             if (!visited[j] && Graph[i][j]!=0) {
            
//                 if(min > Graph[i][j])

//                 {

//                     min=Graph[i][j];
//                     x=i;
//                     y=j;
//                 }

//             }

//             }

//         }
   
//      }
//      System.out.println( x +":"+ y + "=" +Graph[x][y]);
//      visited[y]=true;
//      no_edges++;
//     }

// }

// }


// public class day6 {

//     public static void main(String[] args) {
        


// int[][] G = { { 0, 9, 75, 0, 0 }, { 9, 0, 95, 19, 42 }, { 75, 95, 0, 51, 66 }, { 0, 19, 51, 0, 31 },
//         { 0, 42, 66, 31, 0 } };

//         int v=5;
//         Prims prims =new Prims(G, v);
        
//         System.out.println(prims);
//     }
    
// } 