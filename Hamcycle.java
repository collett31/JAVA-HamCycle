import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Random; 

class Hamcycle{

	private Graph X;
	private int startVertex;
	private ArrayList<Integer> myCycle;

public Hamcycle( Graph g){
	X = g;
	startVertex = 0;
	myCycle = new ArrayList<Integer>();	
}

public static void main(String[] args){
  X.showGraph();
  findHC();
}

public void findHC(){
   ArrayList<Integer> visited = new ArrayList<Integer>();
   visited.add(startVertex); 

   if(findHam(visited) == true){
    System.out.println("HAM CYCLE FOUND");
    for(Integer a : myCycle){
        System.out.println(a);
    } 
  }
   else{
    System.out.println("No HAM CYCLE FOUND");
  }
}

public boolean findHam(ArrayList<Integer> visited){
 
  System.out.printf("Visited: ");
  for(Integer a : visited){
        System.out.printf(a+" ");
    } 
  System.out.printf("Visited done");
  System.out.println(" ");


if (X.getVertex()+1 == visited.size()){
    myCycle.clear();
    for(Integer j : visited){
        myCycle.add(j);
    }
    return true;
}
int lastVisited = visited.get(visited.size() - 1);
  ArrayList<Integer> adjacentToLastVisited = X.adjacent(lastVisited);
  ArrayList<Integer> possiblity = X.setMinus(visited, adjacentToLastVisited);
  if(possiblity.size() == 0){
    //System.out.println("possibility is null aHamCycle.size()");
      for(Integer a : adjacentToLastVisited){
      if(a == startVertex && visited.size() == X.getVertex()) {
        visited.add(a); 
        myCycle.clear();
        for(Integer v : visited){  myCycle.add(v);  }
        return true;
      }
    }
    return false;
  }
  for(Integer a : possiblity){
    ArrayList<Integer> updated = new ArrayList<Integer>();
      updated = visited;
      updated.add(a);
      findHam(updated);

       // Make a new List called updated with visited
       // and v call HAMCYCLE(X, vupdated)
  


  }
  return false;
  
}

public int getstartVertex(){ return startVertex;}
public void setstartVertex(int a){ if(a < X.getVertex()) startVertex = a;}


}