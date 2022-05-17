package start;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {

  private static Logger logger = LogManager.getLogger("sortManager");


  public static void main( String[] args ) {
    logger.info("Start sort manager");
    SortLoader.start();
  }
}
