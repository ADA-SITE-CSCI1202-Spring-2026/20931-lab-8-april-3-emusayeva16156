public static void main(String[] args) {

    // a) Create a map which stores names of students associated with their GPA
    HashMap<String, Double> students = new HashMap<>();
    students.put("Ali", 3.2);
    students.put("Leyla", 3.8);
    students.put("Murad", 2.9);
    students.put("Aysel", 3.6);
    students.put("Kamal", 3.8);
    students.put("Nigar", 2.7);

    // b) Add some more students to the map
    students.put("Elvin", 3.4);
    students.put("Sabina", 3.9);
    students.put("Rashad", 2.5);

    // Print all students
    System.out.println("All Students and GPAs:");
    for (Map.Entry<String, Double> entry : students.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    // c) Find student(s) with the highest GPA
    double maxGpa = Collections.max(students.values());
    List<String> topStudents = new ArrayList<>();

    for (Map.Entry<String, Double> entry : students.entrySet()) {
        if (entry.getValue() == maxGpa) {
            topStudents.add(entry.getKey());
        }
    }

    System.out.println("\nHighest GPA: " + maxGpa);
    System.out.println("Top Student(s): " + String.join(", ", topStudents));

    // d) Find the average GPA
    double sum = 0;
    for (double gpa : students.values()) {
        sum += gpa;
    }
    double averageGpa = sum / students.size();

    System.out.println("\nAverage GPA: " + String.format("%.2f", averageGpa));

    // e) Find number of students with GPA less than the average
    int countBelowAverage = 0;
    for (double gpa : students.values()) {
        if (gpa < averageGpa) {
            countBelowAverage++;
        }
    }

    System.out.println("\nNumber of students below average GPA: " + countBelowAverage);
}
