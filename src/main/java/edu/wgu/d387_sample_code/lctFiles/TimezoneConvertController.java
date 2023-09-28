package edu.wgu.d387_sample_code.lctFiles;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/link")

public class TimezoneConvertController {

    @GetMapping("/convertTimes")
    public String convertTimeZone() {

        return TimezoneConvert.getTimeZone();
    }
}