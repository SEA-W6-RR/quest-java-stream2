import java.util.ArrayList;
import java.util.List;

public class Shield_step2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // DONE : map names to agents list
        // Create a method "map"
        List<Agent> agents = map(names);

        showAgents(agents);
    }

    private static List<Agent> map(List<String> names) {
        List<Agent> agents = new ArrayList<>();

        for (String item: names) {
            String[] temp = item.split(" ");
            Agent agent = new Agent(temp[0], temp[1]);
            agents.add(agent);
        }
        return agents;
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}