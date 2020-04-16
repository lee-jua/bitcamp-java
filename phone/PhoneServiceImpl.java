package com.jse.phone;

public class PhoneServiceImpl implements PhoneService{
private Iphone[] iphones;
private GalaxyNote[] galaxynotes;
private Phone[] phones;
private CellPhone[] cellPhones;
private int count;
public PhoneServiceImpl() {
	iphones = new Iphone[3];
	galaxynotes = new GalaxyNote[3];
	phones = new Phone[3];
	cellPhones = new CellPhone[3];
	count = 0;
}


public void add(Iphone iphone) {
	iphones[count] = iphone;
	count++;
}

public void add(GalaxyNote galaxynote) {
	galaxynotes[count] = galaxynote;
	count++;
}

@Override
public Iphone[] iphonesList() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public GalaxyNote[] galaxynotesList() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public Iphone detail(Iphone iphone) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public GalaxyNote detail(GalaxyNote galaxynote) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public int count() {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public void update(Iphone iphone) {
	// TODO Auto-generated method stub
	
}
@Override
public void update(GalaxyNote galaxynote) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(Iphone iphone) {
	// TODO Auto-generated method stub
	
}
@Override
public void delete(GalaxyNote galaxynote) {
	// TODO Auto-generated method stub
	
}


@Override
public void add(Phone phone) {
	phones[count] = phone;
	count++;
}


@Override
public void add(CellPhone cellPhone) {
	cellPhones[count] = cellPhone;
	count++;
}


@Override
public Phone phonesList() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public CellPhone cellphonesList() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void update(Phone phone) {
	// TODO Auto-generated method stub
	
}


@Override
public void update(CellPhone cellPhone) {
	// TODO Auto-generated method stub
	
}


@Override
public void delete(Phone phone) {
	// TODO Auto-generated method stub
	
}


@Override
public void delete(CellPhone cellPhone) {
	// TODO Auto-generated method stub
	
}



}