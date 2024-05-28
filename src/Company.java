import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Eployee> eployees;

    public Company() {
        eployees = new ArrayList<>();
    }

    public void addEmployee(Eployee eployee){
        eployees.add(eployee);
    }
    public void fireEmployee(Eployee eployee){
        eployees.remove(eployee);
    }
    public double getTotalSalary(){
        double total = 0;
        for (Eployee eployee:eployees){
            total += eployee.getSalary();
        }
        return total;
    }

    public static double getAverageSalary(List<Eployee> eployees){
        if (eployees.isEmpty()){
            return 0;
        }
        double total = 0;
        for (Eployee eployee:eployees){
            total += eployee.getSalary();
        }
        return total / eployees.size();
    }
    public void printEmployee(){
        for (int i = 0; i < eployees.size(); i++) {
            System.out.println("name: "+eployees.get(i).getName()+" , salary: "+eployees.get(i).getSalary()+" , department "+eployees.get(i).getDepartment());
        }
    }

    public List<Eployee> getEmployees() {
        return eployees;
    }
}
