import com.google.gson.Gson;

/***
 * Recuerda incorporar el api GSON a tu proyecto
 */
public class ReadJson2 {

    public static void main(String[] args) {

        String jsonAll = "[{\"dorsal\":1,\"name\":\"Courtois\",\"demarcation\":[\"Goalkeeper\"],\"team\":\"Real Madrid\"},"
                + "{\"dorsal\":15,\"name\":\"Ramos\",\"demarcation\":[\"Right back\",\"Centre-back\"],\"team\":\"Real Madrid\"},"
                + "{\"dorsal\":3,\"name\":\"Pique\",\"demarcation\":[\"Centre-back\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":5,\"name\":\"Lenglet\",\"demarcation\":[\"Centre-back\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":11,\"name\":\"Roberto\",\"demarcation\":[\"Left back\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":14,\"name\":\"Kroos\",\"demarcation\":[\"Defensive midfield\",\"Midfield\"],\"team\":\"Real Madrid\"},"
                + "{\"dorsal\":16,\"name\":\"Busquets\",\"demarcation\":[\"Defensive midfield\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":8,\"name\":\"Pedri\",\"demarcation\":[\"Midfielder\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":18,\"name\":\"Griezmann\",\"demarcation\":[\"Left winger\",\"False forward\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":6,\"name\":\"DeJong\",\"demarcation\":[\"Right winger\",\"Midfielder\"],\"team\":\"FC Barcelona\"},"
                + "{\"dorsal\":7,\"name\":\"Messi\",\"demarcation\":[\"Centre forward\"],\"team\":\"FC Barcelona\"}]";

        Gson gson = new Gson();
        FootballPlayer[] footballPlayers = gson.fromJson(jsonAll,
                FootballPlayer[].class);

        for (FootballPlayer footballPlayer : footballPlayers) {
            System.out.println(footballPlayer);
        }
    }
}
