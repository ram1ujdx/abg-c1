import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
class Employee {

    String name;
    int salary;
    public Employee(){
    }
    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
    return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {
        BYNAME, BYSALARY
    };

    List<Employee>  sort(List<Employee> emps, final SortMethod method){
        switch(method){
            case BYNAME:
                Collections.sort(emps,(e1,e2)->e1.getName().compareTo(e2.getName()));
                break;
             case BYSALARY:
                Collections.sort(emps,(e1,e2)->e1.getSalary()-e2.getSalary()==0?e1.getName().compareTo(e2.getName()):e1.getSalary()-e2.getSalary());
                break;

        }
        return emps;
    }

public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
      long total= entities.stream().filter(emp->emp.getName().toLowerCase().contains(character.toLowerCase())).count();
      return total==entities.size();
 }

}

class Source{
    public static void main(String []args){
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Mickey", 100000));
        emps.add(new Employee("Timmy", 50000));
        emps.add(new Employee("Annny", 40000));
        EmployeeInfo info=new EmployeeInfo();
        System.out.println(info.isCharacterPresentInAllNames(emps, "E"));
        info.sort(emps, EmployeeInfo.SortMethod.BYSALARY).forEach(System.out::println);

    }
}