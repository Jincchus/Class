package sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTV {
	
	@Autowired
	private Speaker spk;
	
	public void powerOn() {
		System.out.println("LgTv PowerOn...");
	}
	public void powerOff() {
		System.out.println("LgTv PowerOff...");
	}
	public void SoundUp() {
		spk.soundUp();
	}
	public void SoundDown() {
		spk.soundDown();
	}
}
