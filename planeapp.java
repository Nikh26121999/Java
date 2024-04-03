
public class planeapp {
	public static void main(String args[])
	{
		plane p=new plane();
		p.takeoff();
		p.fly();
		p.land();
		cargoplane cp=new cargoplane();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carrycargo();
		passangerplane pp=new passangerplane();
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carrypassanger();
		fighterplane fp=new fighterplane();
		fp.takeoff();
		fp.land();
		fp.fly();
		fp.carryweapons();
	}

}
