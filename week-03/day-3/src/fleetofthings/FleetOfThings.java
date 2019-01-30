package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing stand = new Thing("Stand Up");
        Thing eat = new Thing("Eat lunch");

        stand.complete();
        eat.complete();

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        fleet.add(new Thing("Get milk"));
        fleet.add(new Thing("Remove the obstacles"));
        fleet.add(stand);
        fleet.add(eat);

        System.out.println(fleet);
    }
}