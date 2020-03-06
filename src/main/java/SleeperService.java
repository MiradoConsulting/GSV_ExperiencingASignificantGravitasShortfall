import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * GSV - a robot by (your name here)
 */
public class SleeperService extends AdvancedRobot
{

	double lastSeenRobotBearnig = 0;

	
	/**
	 * run: GSV's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:
		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar
		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnRadarRight(360);
			
	
			

		}
	}
	


	/**
	 * onScannedRobot: What to do when you see another robot
	 */
public void onScannedRobot(ScannedRobotEvent e) {	
		setTurnRadarRight(getHeading() - e.getBearing() + getRadarHeading() );
		setTurnRight(e.getBearing());
		if (e.getDistance() > 200) {
			setAhead(200);
		} else if (e.getDistance() > 150) {
			setAhead(100);
		} else{ 
			fire(5);
		}	
	}
	

	private void circleAndKill(ScannedRobotEvent e){
		setTurnRight(e.getBearing() + 90 );
		setAhead(150);
		double lturn = (getHeading() - e.getBearing() ) + getGunHeading() ;
		if(lturn < 180){
			turnGunLeft(lturn);
		}else{
			turnGunRight(360 - lturn);
		}

		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like

	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like

	}	
}
