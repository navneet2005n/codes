package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
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
                                        // BIPARTITE GRAPH 

    public boolean dfs(int node, int colr, ArrayList <ArrayList<Integer>> li, int color[]){
        color[node] = colr;
        for(int it : li.get(node)){
            if(color[it] == -1){ if(dfs(it,1-colr,li,color) == false) return false;}
            else if(color[it] == colr) return false;
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        ArrayList <ArrayList<Integer>> li = new ArrayList<>();
        int v = graph.length;
        for(int i=0; i<v; i++){
            li.add(new ArrayList<>());
        }
        for(int i=0; i<v; i++){
            for(int num : graph[i]){
                li.get(i).add(num);
            }
        }
        int color[] = new int[v];
        for(int i=0; i<v; i++){
            color[i] = -1;
        }
        for(int i=0; i<v; i++){
            if(color[i] == -1){ if(dfs(i,0,li,color) == false) return false; }
        }
        return true;
    }

                        // EVENTUAL SAFE STATES :::

                                // BFS (KAHN ALGO)

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List <Integer> ans = new ArrayList<>();
        int v = graph.length;
        int indegree[] = new int[v];
        List<List<Integer>> revli = new ArrayList<>();
        for(int i=0; i<v; i++) revli.add(new ArrayList<>());
        for(int i=0; i<v; i++){
            for(int num : graph[i]){
                revli.get(num).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<v; i++){
            if(indegree[i] == 0) q.add(i);
        }
        while(!q.isEmpty()){
            int node = q.peek();
            ans.add(q.poll());
            for(int it : revli.get(node)){
                indegree[it]--;
                if(indegree[it] == 0) q.add(it);
            }
        }
        Collections.sort(ans);
        return ans;
}

                                    // Topological Sort 
    
// IT IS APPLICABLE FOR ONLY DAG(DIRECTED ACYCLIC GRAPH) AS IT STORES THE SCHEDULING ...
// IF( directed edge from vertex u to vertex v, u comes before v in the ordering.)
                                

                                    // DFS
    void dfs(int node,ArrayList<ArrayList<Integer>> li,int vis[],Stack<Integer>st){
        vis[node] = 1;
        for(int it : li.get(node)){
            if(vis[it] == 0){
                dfs(it,li,vis,st);
            }
        }
        st.push(node);
    }        

    public ArrayList<Integer> topsort(int v, ArrayList<ArrayList<Integer>> li){
        int vis[] = new int[v];
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> li1 = new ArrayList<>();
        for(int i=0; i<v; i++){
            if(vis[i] == 0){
                dfs(i,li,vis,st);
            }
        }
        while(!st.isEmpty()) li1.add(st.pop());
        return li1;
    }                     

                                        // BFS

    // Function to return list containing vertices in Topological order
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int indegree[] = new int[V];

        // Step 1: Find indegree of all vertices
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        // Step 2: Push all nodes with indegree 0 into queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        // Step 3: Do BFS (Kahn’s Algorithm)
        int topo[] = new int[V];
        int index = 0;

        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            topo[index++] = node;

            // Reduce indegree of neighbours
            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0)
                    q.add(it);
            }
        }

        return topo;
    }
    
                                    // COURSE SCHEDULE ::: (TOPOLOGICAL SORT ALGO)

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        for (int i =0; i <numCourses; i++) li.add(new ArrayList<>());
        int indegree[] = new int[numCourses];
        for(int arr[] : prerequisites){
            li.get(arr[1]).add(arr[0]);
        }
        Queue <Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            for(int it : li.get(i)){
                indegree[it]++;
            }
        }
        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0) q.add(i);
        }
        int cnt = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            cnt++;
            for(int it : li.get(node)){
                indegree[it]--;
                if(indegree[it] == 0) q.add(it);
            }
        } 
        return cnt == numCourses;
}

                                    // COURSE SCHEDULE 2 (BFS TOPO)

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        int indegree[] = new int[numCourses];
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.add(i);
        }
        int ans[] = new int[numCourses];
        int idx = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            ans[idx++] = node;
            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) q.add(it);
            }
        }
        if (idx != numCourses) return new int[0];
        return ans;
    }

                                    // ALIEN DICTIONARY :::

    public String findOrder(String[] words) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) adj.add(new ArrayList<>());
        boolean[] present = new boolean[26]; 
        for (String word : words) {
            for (char c : word.toCharArray()) present[c - 'a'] = true;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String str1 = words[i];
            String str2 = words[i + 1];
            int len = Math.min(str1.length(), str2.length());
            boolean edgeAdded = false;
            for (int j = 0; j < len; j++) {
                if (str1.charAt(j) != str2.charAt(j)) {
                    adj.get(str1.charAt(j) - 'a').add(str2.charAt(j) - 'a');
                    edgeAdded = true;
                    break;
                }
            }
            if (!edgeAdded && str1.length() > str2.length()) return "";
        }
        int[] indegree = new int[26];
        for (int i = 0; i < 26; i++) {
            for (int neigh : adj.get(i)) indegree[neigh]++;
        } 
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (present[i] && indegree[i] == 0) q.add(i);
        } 
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            int node = q.poll();
            sb.append((char) (node + 'a'));
            for (int neigh : adj.get(node)) {
                indegree[neigh]--;
                if (indegree[neigh] == 0) q.add(neigh);
            }
        }
        for (int i = 0; i < 26; i++) {
            if (present[i] && indegree[i] > 0) return "";
        }
        return sb.toString();
    }


                                        // WORD LADDER 1 :::

// class pair{
//     String first;
//     int second;
//     pair(String first,int second){
//         this.first = first;
//         this.second= second;
//     }
// }

// class Solution {
//     public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//         HashSet <String> h1 = new HashSet<>();
//         for(String str : wordList) h1.add(str);
//         Queue<pair> q = new LinkedList<>();
//         q.add(new pair(beginWord,1));
//         while(!q.isEmpty()){
//             String str = q.peek().first;
//             int steps = q.peek().second;
//             q.poll();
//             if(str.equals(endWord)) return steps;
//             for(int i=0; i<str.length(); i++){
//                 for(char ch = 'a'; ch<='z'; ch++){
//                     char arr[] = str.toCharArray();
//                     arr[i] = ch;
//                     String st = new String(arr);
//                     if(h1.contains(st)){
//                         h1.remove(st);
//                         q.add(new pair(st,steps+1));
//                     }
//                 }
//             }
//         }
//         return 0;
//     }
// }

//                      DIJKASTRA ALGO (USING PRIORITY QUEUE)

// class pair{
//     int v;
//     int wt;
//     pair(int v,int wt){
//         this.v = v;
//         this.wt = wt;
//     }
// }

// class Solution {
//     public int[] dijkstra(int V, int[][] edges, int src) {
//         ArrayList<ArrayList<pair>> li = new ArrayList<>();
        
//         for(int i=0; i<V; i++){
//             li.add(new ArrayList<pair>());
//         }
        
//         for(int i=0; i<edges.length; i++){
//             int u = edges[i][0];
//             int v = edges[i][1];
//             int wt = edges[i][2];
//             li.get(u).add(new pair(v,wt));
//         }
        
//         PriorityQueue<pair> pq = new PriorityQueue<>((x,y)->x.wt-y.wt);
//         int dist[] = new int[V];
//         for(int i=0; i<dist.length; i++){
//             dist[i] = (int)1e9;
//         }
//         dist[src] = 0;
//         pq.add(new pair(src,0));
//         while(!pq.isEmpty()){
//             pair curr = pq.poll();
//             int u = curr.v;
//             int d = curr.wt;
//             for (pair neighbor : li.get(u)) {
//                 int v = neighbor.v;
//                 int wt = neighbor.wt;
//                 if (dist[u] + wt < dist[v]) {
//                     dist[v] = dist[u] + wt;
//                     pq.add(new pair(v, dist[v]));
//                 }
//             }
//         }
//         return dist;
//     }
// }


//                                      Path With Minimum Effort

// class pair{
//     int row;
//     int col;
//     int dis;
//     pair(int row,int col,int dis){
//         this.row = row;
//         this.col = col;
//         this.dis = dis;
//     }
// }

//     public int minimumEffortPath(int[][] heights) {
//         int n = heights.length;
//         int m = heights[0].length;
//         int dist[][] = new int[n][m];
//         for(int i=0; i<dist.length; i++){
//             for(int j=0; j<m; j++){
//                 dist[i][j] = (int)1e9;
//             }
//         }
//         int drow[] = {-1,0,1,0};
//         int dcol[] = {0,1,0,-1};
//         PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->a.dis - b.dis);
//         pq.add(new pair(0,0,0));
//         while(!pq.isEmpty()){
//             pair it = pq.poll();
//             int row = it.row;
//             int col = it.col;
//             int dis = it.dis;
//             if(row == n-1 && col == m-1) return dis;
//             for(int i=0; i<4; i++){
//                 int nrow = row + drow[i];
//                 int ncol = col + dcol[i];
//                 if(nrow >= 0 && ncol >= 0 && nrow < n && ncol < m){
//                     int neweff = Math.max(Math.abs(heights[row][col] - heights[nrow][ncol]),dis);
//                     if(neweff < dist[nrow][ncol]){
//                         dist[nrow][ncol] = neweff;
//                         pq.add(new pair(nrow,ncol,neweff));
//                     }
//                 }
//             }
//         }
//         return 0;
//     }

                                // BELLMAN FORD ALGO

    public int[] bellmanFord(int V, int[][] edges, int src) {
        int dist[] = new int[V];
        for (int i = 0; i < V; i++)
            dist[i] = (int) 1e8;
            dist[src] = 0;
        for (int i = 0; i < V - 1; i++) {
            for (int[] it : edges) {  
                int u = it[0];
                int v = it[1];
                int wt = it[2];
                if (dist[u] != (int) 1e8 && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        } 
        for (int[] it : edges) {
            int u = it[0];
            int v = it[1];
            int wt = it[2];
            if (dist[u] != (int) 1e8 && dist[u] + wt < dist[v]) {
                return new int[]{-1};
            }
        }
        return dist;
    }

//                                  MINIMUMM SPANNING TREE 

// class pair{
//     int node;
//     int distance;
//     pair(int node,int distance){
//         this.node = node;
//         this.distance= distance;
//     }
// }

// class Solution {
//     public int spanningTree(int V, int[][] edges) {
//         ArrayList<ArrayList<pair>> adj = new ArrayList<>();
//         for(int i=0; i<V; i++){
//             adj.add(new ArrayList<pair>());
//         }
//         for(int i=0; i<edges.length; i++){
//             int u = edges[i][0];
//             int v = edges[i][1];
//             int wt = edges[i][2];
//             adj.get(u).add(new pair(v,wt));
//             adj.get(v).add(new pair(u,wt));
//         } 
//         int sum = 0;
//         int vis[] = new int[V];
//         PriorityQueue <pair> q = new PriorityQueue<>((x,y)->x.distance-y.distance);
//         q.add(new pair(0,0));
//         while(!q.isEmpty()){
//             pair it = q.poll();
//             int wt = it.distance;
//             int node = it.node;
//             if(vis[node] == 1) continue;
//             vis[node] = 1;
//             sum += wt;
            
//         for(pair edge : adj.get(node)){
//             int adjnode = edge.node;
//             int wt1 = edge.distance;
//             if(vis[adjnode] == 0)  q.add(new pair(adjnode,wt1));
//         }
//         }
//         return sum;
//     }
// }



    public static void main(String[] args) {
        
    }
}
