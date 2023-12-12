package org.itstep.Lesson34.Behavioral.Observer.src;

class UkrainianBuyer implements Buyer
{
	private Product ptr;
	private String name;
	
	public UkrainianBuyer(String pName)
	{
		name = pName;
	}
	public Product GetProduct()
	{
		return ptr;
	}
	public void SetProduct(Product pProduct)
	{
		ptr = pProduct;
	}
	public String GetName(){
		return name;
	}
	public void SetName(String pName)
	{
		name = pName;
	}
	
	public void Update(Product pProduct)
	{
		System.out.printf("\nChanges for in product %s %.2f",pProduct.GetName(),pProduct.GetPrice());
	}
};