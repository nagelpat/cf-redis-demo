package io.pivotal.cfredisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @Autowired
   private StringRedisTemplate template;

   @Value("${app.greeting}")
   private String value;

   @RequestMapping("/")
   // Define the Hello World controller.
   public String hello() {

      ValueOperations<String, String> ops = this.template.opsForValue();

      // Add a Hello World string to your cache.
      String key = "greeting";
      if (!this.template.hasKey(key)) {
          ops.set(key, value);
      }

      // Return the string from your cache.
      return ops.get(key);
   }
}