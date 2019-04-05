using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegate_and_Lamda_pracitce
{
    class Program
    {

        static void Main(string[] args)
        {

            List<Person> persons = new List<Person>();

            persons.Add(new Person("laza", "fasza", 65, "male"));
            persons.Add(new Person("aZE", "faa", 5, "male"));
            persons.Add(new Person("sZAROS", "Lázár", 75, "male"));
            persons.Add(new Person("Hurka", "Gyurka", 15, "male"));
            persons.Add(new Person("Dickrider", "Anna", 25, "female"));
           
            var result6 = persons.Where(x => x.lastName.Equals("fasza")).Select(x => x).ToList();
            
            foreach(var asd in result6)
            {
                Console.WriteLine(asd.lastName);
            }
          
            int[] numbers = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            var result = from n in numbers
                         where n % 2 == 0
                         select n;

            foreach (int i in result)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine();

            var result1 = from n in numbers
                          where n % 2 == 1 || n % 2 == -1
                          select n;
            Console.WriteLine(result1.Average());
            Console.WriteLine();

            var result2 = from n in numbers
                          where n > 0
                          select Math.Pow(n, 2);
            foreach (int i in result2)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine();

            int[] numbers1 = new[] { 3, 9, 2, 8, 6, 5 };

            var result3 = numbers1.Where(x => Math.Pow(x, 2) > 20).Select(x => x);
            foreach (int i in result3)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine();

            string[] cities = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };

            var result4 = cities.Where(x => x.StartsWith("A") && x.EndsWith("I")).Select(x => x);
            foreach (String i in result4)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine();

            String city = "BudaPEST";
            Char[] cityArray = city.ToCharArray();
            Char[] result5 = cityArray.Where(x => char.IsUpper(x)).Select(x => x).ToArray();          
            Console.WriteLine(result5);
            Console.WriteLine();
            String s = new string(result5);
            Console.WriteLine(s);
            Console.WriteLine();

            Console.Read();
        }
    }
}
