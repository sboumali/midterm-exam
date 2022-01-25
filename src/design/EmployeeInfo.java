package design;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class EmployeeInfo extends AbstractEmployee {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private String name;

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	private int employeeId;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public static String getCompanyName() {
		return companyName;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getSsn() {
		return ssn;
	}

	public String getEmail() {
		return email;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	private double salary;
	private String ssn;
	private String email;
	private String date_of_birth;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.name=name;
		this.employeeId= employeeId;


	}
	public EmployeeInfo(String name, int employeeId){
		this.name=name;
		this.employeeId=employeeId;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static int calculateEmployeeBonus(double salary, String performance) {
		int total = 0;
		if (performance == "best") {
			total = (int) (salary * 0.1);
		} else if (performance == "average") {
			total = (int) (salary * 0.08);
		} else if (performance == "bad") {
			total = (int) (salary * 0.02);
		}

		return total;
	}
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static int calculateEmployeePension( int yearWithCompany, double salary) throws ParseException {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);
		yearWithCompany = getDifferenceYears(convertedJoiningDate, convertedTodaysDate);
		if (yearWithCompany < 2) {
			total = (int) (salary * 0.05);
		}
		if (yearWithCompany == 2) {
			total = (int) (salary * 0.1);
		}
		else if(yearWithCompany >3 && yearWithCompany<=5){
			total = (int) (salary * 0.15);
		}
		if (yearWithCompany > 5) {
			total = (int) (salary * 0.2);
		}

		return total;
	}
	//implement numbers of year from above two dates
	//Calculate pension
	public static int getDifferenceYears(String firstDay, String lastDay) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("MM/YYYY");
		String date1 = firstDay;
		String date2 = lastDay;
		Date newDate1 = format.parse(date1);
		Date newDate2 = format.parse(date2);
		Calendar a = getTheCalendar(newDate1);
		Calendar b = getTheCalendar(newDate2);
		int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
		if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
				(a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
			diff--;
		}
		return diff;
	}

	public static Calendar getTheCalendar(Date date) {
		Calendar cal = Calendar.getInstance(Locale.CANADA);
		cal.setTime(date);
		return cal;
	}
	@Override
	public void printInfo(){
		System.out.println("youe company  is "+ companyName);
		System.out.println("employeeId is "+ employeeId);
		System.out.println("name is "+ name);
		System.out.println("date_of_birth is "+ date_of_birth);
		System.out.println("ssn is "+ ssn);
		System.out.println("email is "+ email);
		System.out.println("salary is "+ salary);
	}
	@Override
	public int employeeId() {
		return employeeId;
	}

	@Override
	public String employeeName() {
		return name;
	}

	@Override
	public void assignDepartment() {
		System.out.print("You are assigned to the management department");
	}

	@Override
	public int calculateSalary() {
		return (int) salary;
	}

	@Override
	public void benefitLayout() {
		System.out.println("As a full time employee, you are eligible for full benefit");
	}

	@Override
	public void printEmployeeInfo() {

	}

	@Override
	public void giveInstructions() {

	}

	@Override
	public void travelTheWorld() {

	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
