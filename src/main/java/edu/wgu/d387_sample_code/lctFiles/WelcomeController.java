package edu.wgu.d387_sample_code.lctFiles;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class WelcomeController {

    @GetMapping("/welcome")

    public ResponseEntity<String> showWelcome(@RequestParam("lang") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        ShowMessage showMessage = new ShowMessage(locale);
        return new ResponseEntity<>(showMessage.getMessage(), HttpStatus.OK);
    }
}
