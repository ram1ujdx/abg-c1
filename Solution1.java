import java.util.*;
class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n){
		ArrayList<Integer> list=new ArrayList<>(n);
		for(int i=0;i<n;i++){
			list.add(0);
		}
		return list;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		Collections.reverse(list);
		return list;
	}


public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
	Collections.replaceAll(list,m,n);
	return list;
}
   
}
public class Source{
	public static void main(String[] args) {
			ArrayListOps op= new ArrayListOps();
			int size=5;
			System.out.println(op.makeArrayListInt(size));
			ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,5,6,3,5));
			System.out.println(op.reverseList(list));
		System.out.println(op.changeList(list,5,4));
	}
}

