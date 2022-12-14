import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    Database database;


    @BeforeEach
    public void setup() {
        database = new Database();
        database.createTestData();
    }


    @Test
    public void testCreateSuperhero() {
        //Arrange
        Database database = new Database();
        //Act
        database.createSuperHero("Superman", "Clark", false, "rig", 2001, 2);

        int actual = database.getSuperheroes().size();
        int expected = 1;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testmultipleCreateSuperhero() {
        //Arrange
        database.createSuperHero("Superman", "Clark", false, "rig", 2001, 2);
        database.createSuperHero("Spiderman", "peter", true, "stærk", 1000, 2);
        database.createSuperHero("matyhias", "ksjdkf", false, "rig", 4000, 3.4);
        database.createSuperHero("Superman", "Clark", false, "rig", 2001, 2);


        //Act

        int expected = 7;
        int actual = database.getSuperheroes().size();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void CreateTestDataTest() {
        //Arrange
        //Act
        database.createTestData();
        //Assert

    }

    @Test
    public void findSuperheroOneResult() {
        //Arrange
        Database database = new Database();

        //Act
        database.createTestData();

        ArrayList<Superhero> result = database.findSuperhero("Batman");

        int actualSize = result.size();

        int expectedSize = 1;

        //Assert
        assertEquals(actualSize, expectedSize);

    }

    @Test
    public void findSuperheroNoResult() {
        //Arrange
        Database database = new Database();

        //Act
        database.createTestData();

        ArrayList<Superhero> result = database.findSuperhero("Batman");
        int actualSize = result.size();
        int expectedSize = 1;

        //Assert
        assertEquals(actualSize, expectedSize);


    }

    @Test
    public void deleteSuperhero() {
        ArrayList<Superhero> result = database.getSuperheroes();
        Superhero superhero = result.get(0);


        boolean expectedResult = true;
        int expectedSize = result.size() - 1;

        boolean actualResult = database.deleteSuperhero(superhero);
        assertEquals(expectedResult, actualResult);


        ArrayList<Superhero> resultAfterDelete = database.getSuperheroes();
        int actualSize = resultAfterDelete.size();

        assertEquals(expectedSize, actualSize);
    }


}

