public class Carrot extends Vegetable{

public Carrot(){
    super("Carrot", "Root Vegetable");
  }   
  
  public String feed(){
    return "No need to feed it"; 
  } 
  
   public String water(){
    return "Water it once a day"; 
  } 
  
   public String harvest(){
    return "Harvest after 2-4 months of planting"; 
  } 

}
