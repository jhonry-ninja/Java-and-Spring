/*
Project Class

You have been asked by a serial entrepreneur to create a class that 
she can use to create projects easily. She asks that each project has 
a name and a description. She needs to be able to create empty 
projects that she can add a name and description to later; projects 
with just a name; and projects with both. Every single project should 
be able to get and set both properties.

She also needs each project to be able to give an elevator pitch that 
will return the name and description separated by a colon.

Of course, you will also need to demo its capabilities for her, so 
make a ProjectTest class to do this.

Objectives:
    • Practice overloading methods such as constructors.
    • Implement getter and setters.

Tasks:
    • Create a Project class that has the fields of name and 
      description.
    • Create an instance method called elevatorPitch that will 
      return the name and description separated by a colon.
    • Overload the constructor method in three different ways.
        public Project() {}
        public Project(String name) {}
        public Project(String name, String description) {}
    • Create getter and setters for each field

    • Create a ProjectTest file that will test all the functionality.

Optional Challenges:
• Add an additional initialCost member variable that is of type double 
  and has both getters and setters
• Add this to the elevator pitch in parentheses after the name, e.g.: 
  name (cost): description
• Create a Portfolio class that will keep an ArrayList of Projects in 
  the field projects. Use generics to ensure these are Project objects.
• Add the appropriate getters/setters/constructors for this class to 
  work
• Add the getPortfolioCost method that calculates and returns the cost 
  to buy the entire portfolio.
• Add the showPortfolio method that will print all the project elevator 
  pitches, followed by the total cost.
*/

public class Project{
  private String name;
  private String description;
  private Double cost;
  
  public String elevatorPitch(){
      return(this.getName() + " ($" +Double.toString(getCost()) + ")" + " : " + this.getDescription());
  }

  //Constructors
  public Project(){
      this.name = "";
      this.description = "";
      this.cost = 0.00;
  }
  public Project(String projectName){
      this.name = projectName;
      this.description = "";
      this.cost = 0.00;  
  }
  public Project(String projectName, String projectDescription){
      this.name = projectName;
      this.description = projectDescription;
      this.cost = 0.00;
  }
  public Project(String projectName, String projectDescription, Double projectCost){
      this.name = projectName;
      this.description = projectDescription;
      this.cost = projectCost;        
  }

  //Setters
  public void setName(String newName){
      this.name = newName;
  }
  public void setDescription(String newDescription){
      this.description = newDescription;
  }
  public void setCost(Double projectCost){
      this.cost = projectCost;
  }

  //Getters
  public String getName() {
      return (name);
  }
  public String getDescription(){
      return (description);
  }
  public Double getCost(){
      return (cost);
  }
}