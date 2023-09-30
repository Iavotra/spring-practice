package fr.iavotra.springpractice.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok().body("Message");
    }

}
