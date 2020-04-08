package com.jse.inheritance;

public class PhoneService {
private Phone[] phones;
private CellPhone[] cellPhones;
private Iphone[] iphones;
private GalaxyNote[] galaxynotes;
private int count;
public PhoneService() {
	phones = new Phone[3];
	cellPhones = new CellPhone[3];
	iphones = new Iphone[3];
	galaxynotes = new GalaxyNote[3];
	count = 0;
}
public void add(Phone phone) { //이름은 같아도 된다 타입이 달라야 한다!! 오버로딩??
	phones[count] = phone;
	count++;
}
public void add(CellPhone cellPhone) {
	cellPhones[count] = cellPhone;
	count++;
}
public void add(Iphone iphone) {
	iphones[count] = iphone;
	count++;
}

public void add(GalaxyNote galaxynote) {
	galaxynotes[count] = galaxynote;
	count++;
}

public void setPhones(Phone[] phones) {
	this.phones = phones;
}
public Phone[] getPhones() {
	return phones;
}

public CellPhone[] getCellPhones() {
	return cellPhones;
}
public void setCellPhones(CellPhone[] cellPhones) {
	this.cellPhones = cellPhones;
}

public Iphone[] getIphones() {
	return iphones;
}
public void setIphones(Iphone[] iphones) {
	this.iphones = iphones;
}
public void setCount(int count) {
	this.count = count;
}
public int getCount() {
	return count;
}

public GalaxyNote[] getGalaxynotes() {
	return galaxynotes;
}
public void setGalaxynotes(GalaxyNote[] galaxynotes) {
	this.galaxynotes = galaxynotes;
}

}