package models;

import javax.persistence.*;
import io.ebean.*;

@Entity(name="village_info")
public class VillageInfo extends Model{
	@Id
	public int VILLAGE_NO;
	
	public String VILLAGE_NAME;
	public Double VILLAGE_AREA;
	public int TOTAL_BUILDING;
	public int TOTAL_HOUSE;
	public String CITY_NAME;
	public String THERMAL_COMPANY;
	public String PROPERTY_COMPANY;
	public String PROPERTY_COMPANY_CONTACT;
	public String PROPERTY_COMPANY_TEL;
	public String VILLAGE_ADDRESS;
	
	public static final Finder<Integer, VillageInfo> finder = new Finder<>(VillageInfo.class);
}
