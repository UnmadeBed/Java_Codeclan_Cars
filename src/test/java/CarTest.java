import Components.*;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Doors doors;
    Engine engine;
    Seats seats;
    Wheels wheels;
    WindscreenWipers windscreenWipers;



    @Before
    public void before() {
        car = new Car("Jeep", 60000.00, "Pink", doors, engine, seats, wheels, windscreenWipers );
    }

    @Test
    public void canGetModel(){
        assertEquals("Jeep", car.getModel());
    }

    @Test
    public void canGetPrice(){
        assertEquals(60000.00, car.getPrice(), 000.000);
    }

    @Test
    public void canGetColour(){
        assertEquals("Pink", car.getColour());
    }

    @Test
    public void canGetDoors() {
        assertEquals(doors, car.getDoors());
    }

    @Test
    public void canGetEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void canGetSeats(){
        assertEquals(seats, car.getSeats());
    }

    @Test
    public void canGetWheels(){
        assertEquals(wheels, car.getWheels());
    }

    @Test
    public void canGetWindscreenwipers(){
        assertEquals(windscreenWipers, car.getWindscreenWipers());
    }



}
