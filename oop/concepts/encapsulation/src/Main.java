public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // Not encapsulating things opens up our class to be
        // manipulated in ways not meant to be changed
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // Also, if we change the variable names of Player, we'll
        // also have to change the name in files that directly
        // access it rather than just Player alone

        // Encapsulation helps protect the members of the from from
        // unauthorized access
        EnhancedPlayer playerTim = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + playerTim.getHealth());
    }
}
