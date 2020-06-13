package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("arg[0] = " + args[0] + ", arg[1] = " + args[1]); 
		//No any action in console 
		//String[] params = {args[0], args[1]}; 
		String[] params = {"female", "165"};
		String sex = params[0];                      // male/female

		int height = Integer.parseInt(params[1]);    // women's height
		int lowHeel = 2;                           // if height >= 170cm
		int highHeel = 7;                          // if height < 170cm
		
		int weight = Integer.parseInt(params[1]);    // man's weight
		int lunchForHeavy = 2;                      // if weight >= 100kg
		int lunchForThin = 1;                       // if weight < 100kg
		
		if (sex == "male") {
			System.out.print("Sex : " + sex + ", Weight : " + weight + ", Weight after lunch : ");
			if(weight >= 100) {
				weight = weight + lunchForHeavy;
			}else {
				weight = weight + lunchForThin;
			}
			System.out.print(weight);
		}else {
			if (sex=="female") {
				System.out.print("Sex : " + sex + ", Height : " + height + ", Height on heels : ");
				if(height >= 170) {
					height = height + lowHeel;
				}else {
					height = height + highHeel;
				}
				System.out.print(height);
			}
		}
	}// EOF main()

}
