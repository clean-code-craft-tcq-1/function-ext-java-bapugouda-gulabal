package vitals;
/**
 * @author BUP5KOR
 *
 */
public class LiIonBatteryValidator{
	
	boolean isBatteryOk(float temperature, float soc, float chargeRate) {
	        
		  return isTemperatureOk(temperature)&&isSOCOk(soc)&&isChargeRateOk(chargeRate);
	  }	 
	    	
	boolean isTemperatureOk(float temperature) {
			
		 if(temperature < ConstantBatteryValues.LOWER_TEMPERATURE || temperature > ConstantBatteryValues.HIGHER_TEMPERATURE) 
		 {
			 printeErrorMessage("TEMPERATURE", temperature);
			 
			 //if Temperature is out of range
	         return false;
	      } 
		 
		 	return true;
		}
	
	
	boolean isSOCOk(float soc) {
		
		if(soc < ConstantBatteryValues.LOWER_SOC || soc > ConstantBatteryValues.HIGHER_SOC)
		{
			printeErrorMessage("SOC", soc);
			
			//if SOC is out of range
			return false;
		}
		return true;
	}

	boolean isChargeRateOk(float chargeRate) {
		
		if(chargeRate > ConstantBatteryValues.HIGHER_CHARGERATE)
		{
			printeErrorMessage("CHARGE_RATE", chargeRate);
			
			//if ChargeRate is out of range
			return false;
		}
		return true;
	}
	
	
	public void printeErrorMessage(String Name, float value) {
		
		System.out.println(Name+ ":" +value + " is out of range!");
			
	}

}
