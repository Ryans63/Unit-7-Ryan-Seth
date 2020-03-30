public class Cabbage extends Vegetable{
  
  public Cabbage(){
    super("Cabbage", "Cruciferous");
  }   
  
  public String feed(){
    return "No need to feed it"; 
  } 
  
   public String water(){
    return "Water it once a week"; 
  } 
  
   public String harvest(){
    return "Harvest after 3 months of planting"; 
  } 
  
}
