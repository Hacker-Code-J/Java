package ds.btree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static class UnionFind {
		
		int[] parent;
		
		public UnionFind(int n) {
			parent = new int[n+1];
			for(int i=0; i<n+1; i++) {
				parent[i]=i;
			}
		}
		
		public void union(int u, int v) {
			int U_root = find(u);
			int V_root = find(v);
			if(U_root != V_root) {
				parent[U_root] = V_root;
			}
		}
		
		public int find(int u) {
			if(parent[u] == u) return u;
			parent[u] = find(parent[u]);
			return parent[u];
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		UnionFind uf = new UnionFind(n);
		
		for(int i=0; i<m; i++) {
			line = br.readLine();
			st = new StringTokenizer(line);
			int q = Integer.parseInt(st.nextToken());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(q==0) {
				uf.union(u, v);;
			} else { //q==1
				int U_root = uf.find(u);
				int V_root = uf.find(v);
				if(U_root == V_root) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
			
		}
		
		br.close();
	}
}
