package valencia.java;

import java.util.ArrayList;

public class Username {
    private ArrayList<String> possibleNames;

    public ArrayList<String> getPossibleNames() {
        return possibleNames;
    }

    public Username(String firstName, String lastName) {
        int n = firstName.length();
        possibleNames = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            possibleNames.add(lastName + firstName.substring(0,i));
        }
    }

    public void setAvailableUsernames(String[] usedNames) {
        for (int i = 0; i < possibleNames.size(); i++) {
            for (String usedName : usedNames) {
                if (possibleNames.get(i).equals(usedName)) {
                    possibleNames.remove(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        //Part a
        Username user = new Username("john", "smith");
        System.out.println(user.getPossibleNames());
        //Part b
        String[] used = {"f"};
        user.setAvailableUsernames(used);
        System.out.println(user.getPossibleNames());
    }
}
