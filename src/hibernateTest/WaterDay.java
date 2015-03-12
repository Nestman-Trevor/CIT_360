package hibernateTest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity							//Telling hibernate to treat this class as an entity
public class WaterDay {
	@Id							//Tells hibernate to treat the next field as the id
	@Column (name= "ID")
	private int id;
	@Column (name= "NAME")
	private String name;
	@Column (name= "TOTAL_WATER")
	private int totalWater;
	
	WaterDay(){
		id = 0;
		name = null;
		totalWater = 0;
	}
	WaterDay(int givenId, String givenName, int givenWaterDrank){
		id = givenId;
		name = givenName;
		totalWater = givenWaterDrank;
	}
	WaterDay(WaterDay & w){
		id = w.id;
		name = w.name;
		totalWater = w.totalWater;
	}
	~WaterDay(){
		//delete everything
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalWater() {
		return totalWater;
	}
	public void setTotalWater(int totalWater) {
		this.totalWater = totalWater;
	}
}
