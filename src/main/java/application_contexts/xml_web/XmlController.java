package application_contexts.xml_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlController {
    @Autowired
    private SqlService sqlService;

    @GetMapping(path = "/get")
    public void get() {
        sqlService.execute();
    }
}
