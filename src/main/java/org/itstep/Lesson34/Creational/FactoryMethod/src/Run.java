package org.itstep.Lesson34.Creational.FactoryMethod.src;

public class Run {

	public static void main(String[] args) {
		try {
			
			AbstractWeapon[] weapons = new AbstractWeapon[2];
			
			Point3D shotGunPt = new Point3D(10,10,10);
			Point3D automaticPt = new Point3D(20,20,20);
			
			Vector3D shotGunLc = new Vector3D(80,80,80);
			Vector3D automaticLc = new Vector3D(120,120,120);


			weapons[0] = new Shotgun();
			weapons[1] = new AutomaticWeapon();

			weapons[0].SetLocation(shotGunPt);
			weapons[1].SetLocation(automaticPt);

			weapons[0].SetDirection(shotGunLc);
			weapons[1].SetDirection(automaticLc);

			for (int i = 0;i < 2; i++) {
				AbstractBullet bullet = weapons[i].Shoot();
				bullet.HitTarget(null);
			}
			
		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}
	}

}
