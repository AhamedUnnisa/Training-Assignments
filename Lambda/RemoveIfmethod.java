package LambdaDemo;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee implements Comparable<Employee>{
	int Id;
	String Name;
	int salary;
	public Employee (int id,String name,int salary) {
		this.Id=id;
		this.Name=name;
		this.salary=salary;
				
	}
	public int compareTo(Employee e) {
		if(Id>e.Id) {
			return 1;
			}
		else if(Id<e.Id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public String getName()
	{
		return Name;
	}
	
}
public class RemoveIfmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Employee>employees=new ArrayList<Employee>();
       employees.add(new Employee(101,"ahamed",1000));
       employees.add(new Employee(102,"unnisa",2000));
       employees.add(new Employee(103,"rahima",3000));
       employees.add(new Employee(104,"shaima",4000));
       employees.add(new Employee(105,"sufia",5000));
       Predicate<Employee>condition=employee->employee.getName().startsWith("p");
       employees.removeIf(condition);
       System.out.println(employees);
	}

}




