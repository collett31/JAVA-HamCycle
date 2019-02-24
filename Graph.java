import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Random; 


public class Graph{

	private int vertex;
	public ArrayList<ArrayList<Integer>> graph;
	Random rand = new Random();


	//fixed
	public Graph(int size){
		vertex = size;
		graph = new ArrayList<ArrayList<Integer>>();
		fGraph();
		//show();
	}
	//fixed
	private void fGraph(){
		// filling the array with zero. Every single element in the array is 0
		for(int i = 0; i < vertex; ++i){
	     graph.add(new ArrayList<Integer>());
	     	for(int j = 0; j < vertex; ++j){
                graph.get(i).add(0);
	     	}	
		}

		for(int i = 0; i< vertex; ++i){
            for(int k = i + 1; k< vertex; ++k){
				int temp = rand.nextInt(100)%2;
				if(temp == 1){
					graph.get(i).set(k, temp);
					graph.get(k).set(i, temp);
				}
			}
		}
	}
//fixed
       	public void showGraph(){
		System.out.println("The graph has "+ vertex +" vertices");
		for(int i = 0; i< vertex; ++i){
               	for(int k = 0; k< vertex; ++k){
				System.out.printf(graph.get(i).get(k)+" ");
			}
		System.out.println(" ");
		}
	}
//fixed
	public int getVertex(){return vertex;}
//fixed
	public ArrayList<Integer> setMinus(ArrayList<Integer> vList, ArrayList<Integer> aList){
        ArrayList<Integer> pList = new ArrayList<Integer>();
        pList = aList;
        pList.removeAll(vList);
       // p2List=vList;
       // p2List.removeAll(aList);
       // pList.addAll(p2List);  
        return pList;
    }
//fixed
public ArrayList<Integer> adjacent(int row){
	ArrayList<Integer> adjList = new ArrayList<Integer>();
        for(int k = 0; k < vertex; ++k){
            if(graph.get(row).get(k) == 1){
            	adjList.add(k);
            } 
        } 
    return adjList;
	}
}
