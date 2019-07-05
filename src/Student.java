public class Student {
    private int knowledge;
    private int practice;
    private String name;
    private boolean isHasLaptop;

    public Student(boolean isHasLaptop, String name) {
        this.isHasLaptop = isHasLaptop;
        this.name = name;
    }

    public void getKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public void getPractice(int practice) {
        this.practice = practice;
    }

    public String getName() {
        return name;
    }

}
