import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> devs = new ArrayList();

        // adding data to the list
        devs.add("Johny");
        devs.add("Valerya");
        devs.add("Tatyana");
        devs.add("Peter");
        devs.add("Marry");

        // showing the initials
        for (int i = 0; i < devs.size(); i++) {
            System.out.printf("%d.   \"%c.\"%n",i + 1 , devs.get(i).charAt(0));
        }

        // the longest name
        int maxLength = 0;

        for (String dev: devs) {
            if (dev.length() > maxLength) maxLength = dev.length();
        }

        // swap values
        String temp;
        temp = devs.get(devs.size() - 1);
        devs.set(devs.size() - 1, devs.get(0));
        devs.set(0, temp);
    }
}
