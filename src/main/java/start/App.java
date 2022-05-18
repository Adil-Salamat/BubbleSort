package start;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {

  private static Logger logger = LogManager.getLogger("sortManager");


  public static void main( String[] args ) {

    logger.debug( "u suck" );
    logger.error("bro");
    SortLoader.start();
  }
}
