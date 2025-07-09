import java.util.concurrent.TimeUnit;

class MicroWaveControl{
	
	public static void main(String[] args) {
		//Declarations
		int timer = 0;
		boolean power_level = true;
		
		//Toggle power level from 1 to 2
		power_level = TogglePower(power_level);
		
		//adds 60 seconds to the cook time
		timer = Add30Seconds(timer);
		timer = Add30Seconds(timer);
		
		//starts microwave
		timer = Start(timer, power_level);
		
		//add 30 seconds to cook time
		timer = Add30Seconds(timer);
		
		//reset cooktime to 0
		ResetTime(timer);
	}
	
	/*
	brief: adds 30 seconds to timer, prints current cooktime.
	param: integer t, current time in timer
	return: return t + 30
	*/
	static int Add30Seconds(int t){
		t = t + 30;
		System.out.println("Cooktime is " + t + " seconds");
		return t;
	}
	
	/*
	brief: Toggles Power Level of microwave. prints current power level
	param: boolean p
	return: opposite of p
	*/
	static boolean TogglePower(boolean p){
		p = !p;
		if (p == true){
			System.out.println("Power level is set to 1");
		}
		
		if (p == false){
			System.out.println("Power level is set to 2");
		}
		return p;
	}
	
	/*
	brief: Resets cook time to 0, prints timer is reset
	param: int t
	return: t = 0
	*/
	static int ResetTime(int t){
		t = 0;
		System.out.println("Time has been reset to 0");
		return t;
	}
	
	/*
	brief: Starts the cooking timer, prints current powerlevel and current time left
	param: int t, bool p
	return: t = 0
	*/
	static int Start(int t, boolean p){
		
		if (p == true){
		System.out.println("Power Level is set to 1. Lets get cooking!"  );
		}
		
		if (p == false){
		System.out.println("Power Level is set to 2. Lets get cooking!"  );
		}
		do{
		System.out.println("Cook time is " + t + " seconds");
		t = t - 1;
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			Thread.currentThread().interrupt();
			System.out.println("Error");
		}
		}while (t > 0);
		System.out.println("Finished!");
		return t;
	}
}