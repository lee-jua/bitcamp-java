package com.jse.phone;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CellPhone cellPhone);
	public void add(Iphone iphone);
	public void add(GalaxyNote galaxynote);
	public void setPhones(Phone[] phones);
	public Phone[] getPhones();
	public CellPhone[] getCellPhones();
	public void setCellPhones(CellPhone[] cellPhones);
	public Iphone[] getIphones();
	public void setIphones(Iphone[] iphones);
	public void setCount(int count);
	public int getCount();
	public GalaxyNote[] getGalaxynotes();
	public void setGalaxynotes(GalaxyNote[] galaxynotes);
}
