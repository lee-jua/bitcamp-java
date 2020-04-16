package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CellPhone cellPhone);
	public void add(Iphone iphone);
	public void add(GalaxyNote galaxynote);
	public Phone phonesList();
	public CellPhone cellphonesList();
	public Iphone[] iphonesList();
	public GalaxyNote[] galaxynotesList();
	public Iphone detail(Iphone iphone);
	public GalaxyNote detail(GalaxyNote galaxynote);
	public int count();
	public void update(Phone phone);
	public void update(CellPhone cellPhone);
	public void update(Iphone iphone);
	public void update(GalaxyNote galaxynote);
	public void delete(Phone phone);
	public void delete(CellPhone cellPhone);
	public void delete(Iphone iphone);
	public void delete(GalaxyNote galaxynote);

}
