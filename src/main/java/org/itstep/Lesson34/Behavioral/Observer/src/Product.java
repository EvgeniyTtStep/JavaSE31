package org.itstep.Lesson34.Behavioral.Observer.src;

import java.util.Vector;

class Product
{
	// ��������
	private String name;
	// ����
	private double price;
	private Vector<Buyer> buyers;

	public Product(String pName,double pPrice) {
		name = pName;
		price = pPrice;
		buyers = new Vector<Buyer>();
	}
	
	// ���������� ����������� ����������
	public void Attach(Buyer pBuyer) { 
		buyers.add(pBuyer);
	}
	// �������� ����������� ����������
	public void Detach(Buyer pBuyer) {
		int index = buyers.indexOf(pBuyer);
		if(index != -1) {
			buyers.remove(index);
		}
	}
	// ��������� ���� ����������� �� ��������� ���������
	public void Notify() {
		for(int i = 0; i < buyers.size(); i++) {
			buyers.get(i).Update(this);
		}
		System.out.print("\n");	
	}

	public String GetName(){
		return name;
	}

	double GetPrice(){
		return price;
	}
	// ��������� ����� ���� � �������������� ����������� �� ����
	void SetPrice(double pPrice){
		if(price != pPrice)
		{
			price = pPrice;
			Notify();
		}
	}
}
