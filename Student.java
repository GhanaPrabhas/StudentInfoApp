import java.util.*;
public class Student{
    private int Roll_no , Marks;
    private String Branch, Name;
    public  Student(int marks,int roll_no,String branch,String name)
    {
        Marks = marks;
        Roll_no = roll_no;
        Branch = branch;
        Name = name;
    }
    public String getName()
    {
        return Name;
    }
    public int getMarks ()
    {
        return Marks;
    }
    public String getBranch()
        {
            return Branch;
        }
    public int getRollno()
        {
            return Roll_no;
        }
    public void displayinfo()
    {
        System.out.println("NAME:    "+Name+", ROLL_NO:  " +Roll_no+", BRANCH  "+Branch+", MARKS  "+Marks); 
    }
    
    public static void main(String[] args)
    {
        ArrayList<Student> student = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("==========STUDENT INFO SYSTEM=============");
            System.out.println("====1. Add student info====");
            System.out.println("====2. View student info====");
            System.out.println("====3. Enter Roll_no to see student info====");
            System.out.println("====4. Enter Roll_no to delete the student info====");
            System.out.println("====5. Exit===");
            System.out.println("Plz enter our choice");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter your name:");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter our Roll_no:");
                    int roll = sc.nextInt();
                    System.out.println("Enter our Branch:");
                    sc.nextLine();
                    String branch = sc.nextLine();
                    System.out.println("Enter our obtaind marks:");
                    int marks = sc.nextInt();
                    student.add(new Student(marks,roll,branch,name));
                    break;

                case 2:
                    if(student.size()==0)
                    {
                        System.out.println("NO students data was registerd tillnow !!!");

                    }
                    else 
                    {
                        for(Student s : student)
                        {
                            s.displayinfo();
                        }
                    }
                break;
                case 3:
                    System.out.println("Enter the ROLL-NO to search the Student info:");
                    int sroll=sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                    for(Student s : student)
                    {
                        if(s.getRollno()==sroll)
                        {
                          s.displayinfo();
                          found = true;
                          
                          break;
                        }
                        
                    }
                    if(found == false)
                    {
                        System.out.println("THE ENTERD ROLL_NO WAS NOT UPDATED! PLZ ENTER VALID ROLL_NO:");
                    }
                break;
                case 4:
                    System.out.println("ENter ROLL_NO to delete the student information");
                    int scroll = sc.nextInt();
                    sc.nextLine();
                    boolean creat = false;
                    for(Student s : student)
                    {
                        if(s.getRollno()==scroll)
                        {
                            student.remove(s);
                            creat = true;
                            System.out.println("Roll_no "+scroll+" was deleted");
                            break;
                        }
                    } 
                    if(creat==false)
                    {
                        System.out.println("PLZ ENTER THE VALID ROLL_NO:");
                    }
                break;
                case 5:
                    System.out.println("======EXISTING========");
                    return;
                default :
                System.out.println("ENTER VALID OPTION");
            }
        }
    }
}