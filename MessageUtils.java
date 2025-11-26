import org.bukkit.ChatColor;

public class ColorUtils {

    /**
     * Convierte los códigos de color '&' en colores de Minecraft.
     * @param message Mensaje a colorear.
     * @return Mensaje con colores aplicados.
     */
    public static String color(String message) {
        if (message == null) return ""; // Evita NullPointerException
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    /**
     * Convierte la primera letra de cada palabra a mayúscula.
     * @param input Texto de entrada.
     * @return Texto con la primera letra de cada palabra en mayúscula.
     */
    public static String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) return "";
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * Convierte solo la primera letra de la cadena en mayúscula.
     * @param input Texto de entrada.
     * @return Texto con la primera letra en mayúscula.
     */
    public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) return "";
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
