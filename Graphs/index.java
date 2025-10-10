package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class index {

                               // BFS OF A GRAPH ::::

    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList <Integer> li = new ArrayList<>();
        boolean vis[] = new boolean[adj.size()+1];
        Queue <Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            li.add(node);
            for(Integer it : adj.get(node)){
                if(!vis[it]) q.add(it);
                vis[it] = true;
            }
        }
        return li;
    }


                                // DFS OF A GRAPH ::::

    public static void helper(int node,boolean arr[],ArrayList<ArrayList<Integer>> adj, ArrayList<Integer>li){
        arr[node] = true;
        li.add(node);
        for(Integer it : adj.get(node)){
            if(!arr[it]) helper(it,arr,adj,li);
        }
    }

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList <Integer> li = new ArrayList<>();
        boolean arr[] = new boolean[adj.size()+1];
        helper(0,arr,adj,li);
        return li;
    }

                                // Mother VERTEX :::

    public void helper(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, TreeSet<Integer>s1){
        vis[node] = true;
        s1.add(node);
        for(Integer it : adj.get(node)){
            if(!vis[it]) helper(it,vis,adj,s1);
        }
    }
    
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<V; i++){
            TreeSet <Integer> s1 = new TreeSet<>();
            boolean vis[] = new boolean[V];
            helper(i, vis, adj, s1);
            if (s1.size() == V) return i; 
        }
        return -1;
    }

                                    // Number of Islands :::

    public static void dfs(int row, int col, boolean vis[][], char grid[][]){
        int m = grid.length;
        int n = grid[0].length;
        vis[row][col] = true;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        for(int i = 0; i < 4; i++){
            int nrow = row + drow[i];
            int ncol = col + dcol[i];
            if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n
            && grid[nrow][ncol] == '1' && !vis[nrow][ncol]){
                dfs(nrow,ncol,vis,grid);
            }
        }
    }

    public int numIslands(char[][] grid) {
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int cnt = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    cnt++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }

                                            // FLOOD FILL ::::
     
    public void dfs(int row,int col,int ans[][],int image[][],int color,int delrow[],int delcol[],int initcolor){
    int n = image.length;
    int m = image[0].length;
    ans[row][col] = color;
    for(int i=0; i<4; i++){
        int nrow = row + delrow[i];
        int ncol = col + delcol[i];
    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==initcolor && ans[nrow][ncol]!=color){
            dfs(nrow,ncol,ans,image,color,delrow,delcol,initcolor);
        }
    }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initcolor = image[sr][sc];
        int ans[][] = image;
        int delrow[] = { -1, 0, 1, 0 };
        int delcol[] = { 0, 1, 0, -1 };
        dfs(sr, sc, ans, image, color, delrow, delcol, initcolor);
        return ans;
    }

                                // 994. Rotting Oranges

    class pair{
    int row;
    int col;
    int time;
    pair(int row, int col, int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
    }

    public int orangesRotting(int[][] grid) {
        Queue <pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int tm = 0;
        int cntfresh = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new pair(i,j,0));
                    vis[i][j] = 2;
                }
                else if(grid[i][j] == 1) cntfresh++;
                else vis[i][j] = 0;
            } 
        } 
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;
            q.poll();
            tm = Math.max(tm,t);
            int drow[] = {-1,0,1,0};
            int dcol[] = {0,1,0,-1};
            for(int i=0; i<4; i++){
                int nrow = drow[i] + r;
                int ncol = dcol[i] + c;
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1 && vis[nrow][ncol]!=2){
                    q.add(new pair(nrow,ncol,tm+1));
                    cnt++;
                    vis[nrow][ncol] = 2;
                }
            }
        }
        if(cntfresh != cnt) return -1;
        return tm;
    }

                            // DETECT CYCLE IN AN UNDIRECTED GRAPH ::

// class pair{
//     int child;
//     int parent;
//     pair(int child, int parent){
//         this.child = child;
//         this.parent = parent;
//     }
// }
    
//     public boolean helper(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean vis[]){
//         Queue<pair> q = new LinkedList<>();
//         vis[src] = true;
//         q.add(new pair(src,-1));
//         while(!q.isEmpty()){
//             int node = q.peek().child;
//             int parent = q.peek().parent;
//             q.poll();
//             for(int adjnode : adj.get(node)){
//                 if(!vis[adjnode]){
//                     vis[adjnode] = true;
//                     q.add(new pair(adjnode,node));
//                 }
//                 else if(parent != adjnode) return true;
//             }
//         }
//         return false;
//     }
    
//     public boolean isCycle(int V, int[][] edges) {
//         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//         for(int i = 0; i < V; i++) adj.add(new ArrayList<>());
//         for(int[] edge : edges){
//         int u = edge[0];
//         int v = edge[1];
//         adj.get(u).add(v);
//         adj.get(v).add(u); 
//         }
        
//         boolean vis[] = new boolean[V];
//         for(int i=0; i<V; i++){
//             if(!vis[i]){
//                 if(helper(i,V,adj,vis)) return true;
//             }
//         }
//         return false;
//     }

                                // DETECT CYCLE IN DIRECTED GRAPH :::

    // public boolean dfs(int node,ArrayList<ArrayList<Integer>> li,int vis[],int pathvis[]){
    //     vis[node] = 1;
    //     pathvis[node] = 1;
    //     for(int it  : li.get(node)){
    //         // when the node is not visited
    //         if(vis[it] == 0){
    //             if(dfs(it,li,vis,pathvis) == true) return true;
    //         }
    //         else if(pathvis[it] == 1) return true;
    //     }
    //     pathvis[node] = 0;
    //     return false;
    // }
    
    // public boolean isCyclic(int V, int[][] edges) {
    //     ArrayList<ArrayList<Integer>> li = new ArrayList<>();
    //     int vis[] = new int[V];
    //     int pathvis[] = new int[V];
    //     for(int i=0; i<V; i++){
    //         li.add(new ArrayList<>());
    //     }
    //     for(int i = 0; i < edges.length; i++){
    //     int u = edges[i][0];
    //     int v = edges[i][1];
    //     li.get(u).add(v);  
    //     }
    //     for(int i=0; i<V; i++){
    //         if(vis[i] == 0){
    //             if(dfs(i,li,vis,pathvis) == true) return true;
    //         }
    //     }
    //     return false;
    // }

                            // COUNT DISTINCT NUMBER OF ISLANDS :::

    void dfs(int row,int col,int vis[][],int grid[][],ArrayList<String> vec,int r0,int c0){
        vis[row][col] = 1;
        int m = grid.length;
        int n = grid[0].length;
        vec.add(Arrays.toString(new int[]{row-r0, col-c0}));
        int delrow[] = {-1,0,1,0};
        int delcol[] = {0,1,0,-1};
        for(int i=0; i<4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                dfs(nrow,ncol,vis,grid,vec,r0,c0);
            }
        }
    }
    
    int countDistinctIslands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int vis[][] = new int[m][n];
        HashSet <ArrayList<String>> h1 = new HashSet<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(vis[i][j] == 0 && grid[i][j] == 1){
                    ArrayList <String> vec = new ArrayList<>();
                    dfs(i,j,vis,grid,vec,i,j);
                    h1.add(vec);
                }
            }
        }
        return h1.size();
    }

    public static void main(String[] args) {
        
    }
}
