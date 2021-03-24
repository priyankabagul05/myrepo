class ccrect
//copy construtor
{
int area;
	ccrect(int height,int width)
	{
	area=height*width;
	}
	void show()
	{
	System.out.println("AREA OF RECTANGLE:"+area);
	}
	public static void main(String args[])
	{
		ccrect obj=new ccrect(10,6);
		obj.show();
		ccrect obj2=obj;
		obj2.show();
	}
}