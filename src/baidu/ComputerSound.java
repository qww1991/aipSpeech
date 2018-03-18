package baidu;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer.Info;

public class ComputerSound {

	public static void main(String[] args) {
		
		Info[] mixerInfo = AudioSystem.getMixerInfo();
		
		for (Info info : mixerInfo) {
			System.out.println(info.toString());
		}
		
	}
}
