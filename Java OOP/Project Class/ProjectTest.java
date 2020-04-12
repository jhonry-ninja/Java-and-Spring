public class ProjectTest{
    public static void main(String[] args){
        Project testProject = new Project("Let's get it!", "Foothills in Fremont, CA", 99.99);
        testProject.setName("Coding Dojo");
        testProject.setDescription("Code all day, code all night...");
        testProject.setCost(99.99);
        
        System.out.println(testProject.elevatorPitch());
        
    }
}