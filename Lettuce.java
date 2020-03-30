public class Lettuce extends Vegetable{

  public Lettuce(){
    super("Lettuce", "Leafy Greens");
  }   
  
  public String feed(){
    return "No need to feed it"; 
  } 
  
   public String water(){
    return "Water it everyday"; 
  } 
  
   public String harvest(){
    return "Harvest after 8 weeks of planting"; 
  } 

}
