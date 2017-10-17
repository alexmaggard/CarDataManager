import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class CarDataManager {
	public HashMap<String,TreeSet<CarInterface>> map = new HashMap<>();
	
	public CarDataManager(){
		
	}
	
	public void add(CarInterface data){
		String brand = data.getBrand();
		TreeSet<CarInterface> set = map.get(brand);
		
		if(set == null){
			set = new TreeSet<>(new CarComparator());
			set.add(data);
			map.put(brand,  set);
		}
		else{
			set.add(data);
		}
		
	}
	
	public void remove(String brand){
		map.remove(brand);
	}
	
	public int getCount(){
		return 0;
	}
	
	public class CarComparator implements Comparator{
		
		public int compare(Object arg0, Object arg1){
			return 0;
		}
	}
}
