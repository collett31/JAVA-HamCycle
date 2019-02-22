public class SetMinus{
	//set minus operation
public void setMinus(ArrayList<Integer> vList, ArrayList<Integer> aList){
        pList = aList;
        pList.removeAll(vList);
        p2List=vList;
        p2List.removeAll(aList);
        pList.addAll(p2List);  
    }

public void adjacent(Graph ourSet, ArrayList<Integer> vList, ArrayList<Integer> aList){
        for(int k = 1; k < vertices; k++){
            if(ourSet[k][0] == lastVisitVertex){
                for(int j = 1; j < vertices; j++){
                    if(ourSet[k][j] == 1){
                        aList.add(ourSet[0][j]);
                        jk++;
                    }
                }
            }
        }
    }
private
ArrayList<Integer> pList = new ArrayList<Integer>();
ArrayList<Integer> p2List = new ArrayList<Integer>();
}