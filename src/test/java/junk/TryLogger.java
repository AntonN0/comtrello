package junk;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TryLogger {
    private Logger logger = LoggerFactory.getLogger(TryLogger.class);

  //  @Test
    public void trylodfsg() {
        logger.info("dsafds");

    }

    public void move(int x, int length)
    {
        x+=length;
    }

    public void move(int x, int y, int length)
    {x+=length;
        y+=length;
    }

    public void tryMove(){
        int x1=1;
        move(x1,4);
        System.out.println(x1);
    }
}

