import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RobotTest {

    @Test
    public void robotConstructor1Test(){
        Robot robot = new Robot();

        assertAll("Should show default settings for a robot",
                () -> assertEquals(2, robot.getArms()),
                () -> assertEquals("good", robot.getAlignment()),
                () -> assertTrue(robot.isLaserEyes())
        );
    }

    @Test
    public void robotConstructor2Test(){
        Robot robot = new Robot(4);
        int expected = 4;
        assertEquals(robot.getArms(), expected);
    }

    @Test
    public void robotConstructor3Test(){
        Robot robot = new Robot("evil");
        String expected = "evil";
        assertEquals(robot.getAlignment(), expected);
    }

    @Test
    public void robotConstructor4Test(){
        Robot robot = new Robot(false);
        assertFalse(robot.isLaserEyes());
    }

    @Test
    public void robotConstructor5Test() {
        Robot robot = new Robot(6, "good", true);
        assertAll("Should show default settings for a robot",
                () -> assertEquals(6, robot.getArms()),
                () -> assertEquals("good", robot.getAlignment()),
                () -> assertTrue(robot.isLaserEyes())
        );
    }


}
