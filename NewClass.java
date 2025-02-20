public class NewClass {
    private String name;
    private int id;

    public NewClass(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayInfo(){
        System.out.println("Class Name: " + name + ", ID: " + id);
    }
}