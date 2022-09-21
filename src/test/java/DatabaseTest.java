import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database database;

    @BeforeEach

    public void setup(){
        database = new Database();
    }


    @Test
    public void testCreateSuperhero() {
        //Arrange


        database.createSuperHero("Superman", "Clark", false, "rig", 2001, 2);

        int expected = 1;


        //Act
        int actual = database.getSuperheroes().size();

        //Assert
        assertEquals(expected, actual);
    }

}