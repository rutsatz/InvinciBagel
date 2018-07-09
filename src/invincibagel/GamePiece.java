package invincibagel;

/**
 *
 * @author Rafael Fernando Rutsatz - rafael.rutsatz@velsis.com.br
 */
public class GamePiece {

    private static final String FLAVOR_OF_BAGEL = "Pumpernickel"; // Flavor (or type) of bagel
    private static final String SIZE_OF_BAGEL = "Mini Bagel";
    // Size (classification) of bagel
    public int invinciBagelX = 0;
    // X screen location of the InvinciBagel
    public int invinciBagelY = 0;
    // Y screen location of the InvinciBagel
    public String bagelOrientation = "side";
    // Define bagel orientation (front, side, top)
    public int lifeIndex = 1000;
    //Defines units of lifespan used
    public int hitsIndex = 0;
    //Defines units of damage (hits taken)
    public String directionFacing = "E";
    // Direction that the bagel object is facing
    public String movementType = "idle";
    //Type of movement (idle, fly, run, jump)
    public boolean currentlyMoving = false; //Flag showing if the object is in motion

    GamePiece() {
        invinciBagelX = 0;
        invinciBagelY = 0;
        bagelOrientation = "side";
        lifeIndex = 1000;
        hitsIndex = 0;
        directionFacing = "E";
        movementType = "idle";
        currentlyMoving = false;
    }

    public void moveInvinciBagel(int x, int y) {
        // Movement Behavior
        currentlyMoving = true;
        invinciBagelX = x;
        invinciBagelY = y;
    }

}
