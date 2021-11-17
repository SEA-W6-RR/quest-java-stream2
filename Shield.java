import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // DONE : map names to agents list
        List<Agent> agents = names.stream()
                .map(item -> item.split(" "))
                .map(babyAgent -> new Agent(babyAgent[0], babyAgent[1]))
                .collect(Collectors.toList());

        /* alternative
        List<Agent> agents = names.stream()
                .map(name -> new Agent(name.split(" ")[0],name.split(" ")[1]))
                .collect(Collectors.toList());
                */

        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}