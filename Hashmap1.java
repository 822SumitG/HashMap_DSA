import java.util.HashMap;

class Hashmap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Pllvi", 90);
        studentScores.put("Ambu", 85);
        studentScores.put("Komu", 92);
        studentScores.put("Somu", 88);

        // Retrieve a value by key
        int pllviScore = studentScores.get("Pllvi");
        System.out.println("Pllvi's score : " + pllviScore);

        // Update a value
        studentScores.put("Pllvi", 99);
        System.out.println("Pllvi's new score :" + studentScores.get("Pllvi"));

        // Remove a key-value pair
        studentScores.remove("Komu");
        System.out.println("Removing students :" + studentScores.keySet());

        // Iterate over the HashMap
        for (String name : studentScores.keySet()) {
            int score = studentScores.get(name);
            System.out.println(name + ": " + score);
        }
    }
}