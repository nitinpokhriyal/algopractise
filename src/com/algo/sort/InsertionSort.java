package com.algo.sort;

public class InsertionSort {

	
	public Employee[] sort(Employee[] employeeArray){
		
		int size= employeeArray.length;
		
		for(int i =0; i < size;i++){
			Employee currEmployee =employeeArray[i];
			int j = i-1;
			while(j>=0 && employeeArray[j].getEmployeeId()>=currEmployee.getEmployeeId()){
				employeeArray[j+1]=employeeArray[j];
				j--;
			}
			employeeArray[j+1]=currEmployee;
		}
		return employeeArray;
	}
	
	public static void main(String[] args){
		Employee employee =new Employee(3000L);
		Employee employee1 =new Employee(2000L);
		Employee employee2 =new Employee(1000L);
		Employee[] array={employee,employee1,employee2};
		InsertionSort sort=new InsertionSort();
		Employee[] sortedArray=sort.sort(array);
		for(Employee employeevar:sortedArray){
			System.out.println(employeevar.getEmployeeId());
		}
		
	}
}
