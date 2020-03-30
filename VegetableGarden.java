import java.util.Arraylist;

public class VegetableGarden{
	ArrayList<Vegetable> garden = new ArrayList<Vegetable>();
	garden.add(new Cabbage());
	garden.add(new Carrot());
	garden.add(new Lettuce());
	
	for (Vegetable v : garden){
		System.out.println(v.getType());
	}
}
