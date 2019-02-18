import java.util.ArrayList;
import java.util.Random;

public class Graph{

	private int vertex;
	public ArrayList<ArrayList<Integer>> graph;
	private Random rand = new Random();
	private int temp;

	
	public Graph(int size){
		vertex = size;
		graph = new ArrayList<ArrayList<Integer>>();
		fGraph();
		show();
	}
	
	private void fGraph(){
		
		for(int i = 0; i< vertex; ++i){
               		for(int k = 0; k< vertex; ++k){
				temp = rand.nextInt(100)%2;
				graph.get(i).set(k, temp);
				//graph.get(k).set(i, temp);
			}
		}
	}
       	public void show(){

		for(int i = 0; i< vertex; ++i){
               		for(int k = 0; k< vertex; ++k){
				System.out.print(graph.get(i).get(k));
				System.out.print(" ");
			}
		System.out.println("\n");
		}
	}
	
}
