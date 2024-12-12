
public class XWing extends StarShip{
private String model;

public String getModel;

public void setModel(String model) {
	
}
public String toString() {
	
return "The light speed max is: " + LightSpeed + " & The model is:" + model;

}
public XWing(double LightSpeed, String model) {
	super(LightSpeed);
	this.model = model;
	
}
}





/*
 * XWing
- model: String
+ getModel() : String

+ setModel(model : String) : void

+ toString() : String
 */