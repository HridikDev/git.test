class vechicle{
String color;
int speed;
vechicle(String color,int speed){
	this.color=color;
	this.speed=speed;
}
void disp(){
	System.out.println("color "+color+" speed "+speed);
}
}
class car extends vechicle{
	int modelno;
	car(String color,int speed,int modelno){
		super(color,speed);
		this.modelno=modelno;
	}
	void disp(){
		System.out.println("\n Car\nmodelno "+modelno);
		super.disp();
	}
}
class motorcycle extends vechicle{
	int modelno;
	motorcycle(String color,int speed,int modelno){
		super(color,speed);
		this.modelno=modelno;
	}
	void disp(){
		System.out.println("\n motorcycle\nmodelno "+modelno);
		super.disp();
	}
}

public class vechicles{
	public static void main(String args[]){
		motorcycle m=new motorcycle("red",100,101);
		car c=new car("blue",100,102);
		m.disp();
		c.disp();
		
	}
}