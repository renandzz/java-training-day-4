import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question7 {
  public static void main(String[] args){
    System.out.println("7. Write a program that reads all Employee data from a CSV (comma-separated values) file and represents every record as an instance of Employee class. The file contains the following data:\n"
        + "   EMP_ID,EMP_NAME,GENDER,BIRTHDATE,ADDRESS,CITY\n"
        + "   1,Abraham,M,1990-02-18,Jl. Banceuy No. 41,TANGERANG\n"
        + "   2,Pamela,F,1990-05-22,Jl. Moh. Thoha No. 51,BEKASI\n"
        + "   3,Alexander,M,1987-10-07,Jl. Barata No. 78,TANGERANG\n"
        + "   4,William,M,1989-03-17,Jl. Moh. Thoha No. 86,TANGERANG\n"
        + "   5,George,M,1985-09-09,Jl. Cendana No. 98,BEKASI\n"
        + "   6,Emily,F,1981-11-30,Jl. Karangarum No. 68,BEKASI\n"
        + "   7,Kaylee,F,1983-07-12,Jl. Sirnagalih No. 57,TANGERANG\n"
        + "   8,Jayden,M,1982-06-30,Jl. Barata No. 68,TANGERANG\n"
        + "   9,Oliver,M,1982-11-18,Jl. Alun-Alun Timur No. 98,TANGERANG\n"
        + "   10,Emma,F,1983-04-29,Jl. Ranggagading No. 42,BEKASI\n"
        + "The program should have some functionalities that:\n"
        + "a. Show all employees ordered by their names\n"
        + "b. Show all employees ordered by their birthdate beginning from the oldest c. Show all employees that live in Bekasi, ordered by their names");

    File file1 = new File("/Users/rheist/Documents/GitHub/java-training-day-4/src/api.txt");
    List<Employee> employees= new ArrayList<>();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    try {
      BufferedReader in = (new BufferedReader(new FileReader(file1)));
      String strLine;
      in.readLine();
      while ((strLine = in.readLine())!= null){
        String[] words = strLine.split(",");
        Date dates= new Date();
        try {
          dates = df.parse(words[3]);
        } catch (ParseException e) {
          e.printStackTrace();
        }
        Employee employee = new Employee(Integer.parseInt(words[0]),words[1],words[2],dates,words[4],words[5]);
        employees.add(employee);
      }

      in.close();
    } catch (IOException e) {
      System.out.println(e.toString());
    }

      System.out.println("");
      System.out.println("sort employee by name :");
      employees.sort(Comparator.comparing(Employee::getEmp_name));
      for (Employee emp: employees) {
        System.out.println(emp.toString());
      }

      System.out.println("");
      System.out.println("sort employee by birthdate :");
      employees.sort(Comparator.comparing(Employee::getBirthdate));
      for (Employee emp: employees) {
        System.out.println(emp.toString());
      }

      System.out.println("");
      System.out.println("show Bekasi employee sorted by name :");
      List<Employee> bekasiemployee = employees.stream().filter(p -> p.getCity().equals("BEKASI")).collect(Collectors.toList());
      bekasiemployee.sort(Comparator.comparing(Employee::getEmp_name));
      for (Employee emp: bekasiemployee) {
        System.out.println(emp.toString());
      }
  }
}
