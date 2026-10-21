package ua.opnu;

public class Main2 {
   public static void main(){

      Person p1 = new Person("Коваленко", "Іван", 45);
      Student s1 = new Student("Петренко", "Анна", 19, "КН-21", "КВ12345");
      Student s2 = new Student("Шевченко", "Олег", 20, "КН-21", "КВ12345");
      Lecturer l1 = new Lecturer("Мельник", "Олена", 35, "ІПЗ", 25000.50);

      Person[] people = {p1, s1, s2, l1};

      System.out.println("Список людей");
      for (Person person : people){
         System.out.println(person.toString());
      }

   }


}
