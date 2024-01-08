import java.util.Random;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class ClothesPredictor {
    public static void main(String[] args) {

        String bodyColor = "red";
        String bodyShape = "hourglass";
        String bodySize = "medium";

        String[] colorOptions = {"blue", "green", "yellow", "orange", "purple", "pink"};
        Random rand = new Random();
        String clothesColor = colorOptions[rand.nextInt(colorOptions.length)];

        if (bodyColor.equals(clothesColor)) {
            System.out.println("You should wear " + clothesColor + " clothes to match your body color.");
        } else if (bodyShape.equals("hourglass") && bodySize.equals("medium")) {
            System.out.println("You should wear " + clothesColor + " clothes to complement your hourglass figure and medium size.");
        } else if (bodyShape.equals("rectangle") && bodySize.equals("large")) {
            System.out.println("You should wear " + clothesColor + " clothes to add some shape and color to your large rectangle frame.");
        } else {
            System.out.println("You should wear " + clothesColor + " clothes today.");
        }
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.MONDAY) {
            System.out.println("You should wear " + clothesColor + " clothes today to start the week off strong! "+dayOfWeek);
        } else if (dayOfWeek == DayOfWeek.TUESDAY) {
            System.out.println("You should wear " + clothesColor + " clothes today to stay focused and productive. "+dayOfWeek);
        } else if (dayOfWeek == DayOfWeek.WEDNESDAY) {
            System.out.println("You should wear " + clothesColor + " clothes today to get over the mid-week hump. "+dayOfWeek);
        } else if (dayOfWeek == DayOfWeek.THURSDAY) {
            System.out.println("You should wear " + clothesColor + " clothes today to power through the rest of the week. "+dayOfWeek);
        } else if (dayOfWeek == DayOfWeek.FRIDAY) {
            System.out.println("You should wear " + clothesColor + " clothes today to celebrate the end of the week! "+dayOfWeek);
        } else if (dayOfWeek == DayOfWeek.SATURDAY) {
            System.out.println("You should wear " + clothesColor + " clothes today to relax and enjoy the weekend. "+dayOfWeek);
        } else if (dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println("You should wear " + clothesColor + " clothes today to recharge and prepare for the week ahead. "+dayOfWeek);
        }

        if (bodyColor.equals(clothesColor)) {
            System.out.println("Your " + clothesColor + " clothes will complement your body color.");
        } else if (bodyShape.equals("hourglass") && bodySize.equals("medium")) {
            System.out.println("Your " + clothesColor + " clothes will complement your hourglass figure and medium size.");
        } else if (bodyShape.equals("rectangle") && bodySize.equals("large")) {
            System.out.println("Your " + clothesColor + " clothes will add some shape and color to your large rectangle frame.");
        } else {
            System.out.println("Your " + clothesColor + " clothes will look great today!");
        }

    }
}

