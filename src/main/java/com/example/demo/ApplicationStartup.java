package com.example.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup  implements ApplicationListener<ApplicationReadyEvent> {

  /**
   * This event is executed as late as conceivably possible to indicate that 
   * the application is ready to service requests.
   */
  @Override
  public void onApplicationEvent(final ApplicationReadyEvent event) {

    // here your code ...
	  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> Event >>>>>>>>>>>>>>>>>> "+event.getSource());
	  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> Event >>>>>>>>>>>>>>>>>> "+event.toString());

    return;
  }
}