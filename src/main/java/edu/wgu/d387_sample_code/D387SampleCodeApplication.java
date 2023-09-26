package edu.wgu.d387_sample_code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



import java.util.Locale;
import edu.wgu.d387_sample_code.lctFiles.ShowMessage;


@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		// for French thread
		ShowMessage showMessageFrench = new ShowMessage(Locale.CANADA_FRENCH);
		Thread frenchWelcomeThread = new Thread(showMessageFrench);
		frenchWelcomeThread.start();

		// for English thread
		ShowMessage showMessageEnglish = new ShowMessage(Locale.US);
		Thread englishWelcomeThread = new Thread(showMessageEnglish);
		englishWelcomeThread.start();
	}

}
