using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] s = { 1, 2, 3, 8, 5, 6 };
            ChangeprintOutFourthElem(s);
            String first = Console.ReadLine();
            String second = Console.ReadLine();
            AnagramCehcker(first, second);

            Dictionary<string, int> products = new Dictionary<string, int>();
            products.Add("Eggs", 200);
            products.Add("Milk", 200);
            products.Add("Fish", 400);
            products.Add("Apples", 150);
            products.Add("Bread", 50);
            products.Add("Chicken", 550);

            HowMuchIsTheFish(products);
            MostExpensive(products);
            AvragePrice(products);
            Cheapest(products);
            PriceEquals(products, 150);
            BelowNumber(products, 300);

            Console.Read();
        }

        public static void HowMuchIsTheFish(Dictionary<string, int> valami){
            if (valami.ContainsKey("Fish"))
            {
                int value = valami["Fish"];
                Console.WriteLine("Fish's price: "+ value);
            }
        }

        public static void MostExpensive(Dictionary<string, int> valami) {
            var maxValue = valami.Values.Max();
            Console.WriteLine(maxValue);
        }

        public static void AvragePrice(Dictionary<string, int> valami) {
            var averageScore = valami.Values.Average();
            Console.WriteLine(averageScore);
        }

        public static void PriceEquals(Dictionary<string, int> valami, int number) {
            if (valami.Values.Contains(number))
            {
                var myKey = valami.FirstOrDefault(x => x.Value == number).Key;
                Console.WriteLine(myKey);
            }else {
                Console.WriteLine("There is no product with this price");
            }
        }

        public static void Cheapest(Dictionary<string, int> valami) {
            var cheapest = valami.Values.Min();
            var myKey = valami.FirstOrDefault(x => x.Value == cheapest).Key;
            Console.WriteLine(myKey);
        }

        public static void BelowNumber(Dictionary<string, int> valami, int number) {
            int priceCounter = 0;
            foreach (var item in valami.Values){
                if (item < number) {
                    priceCounter++;
                }
            }
            Console.WriteLine(priceCounter);
        }

        public static void ChangeprintOutFourthElem(int[]s) {
                s[3] = 4;
            Console.WriteLine(s[3]);
        }

        public static Boolean AnagramCehcker(String a, String b) {
            Boolean result;
            Char[] aArray = a.ToCharArray();
            Char[] bArray = b.ToCharArray();
            Array.Sort(aArray);
            Array.Sort(bArray);

            if (Enumerable.SequenceEqual(aArray, bArray)) {
                result = true;
                Console.WriteLine("It's anagram!");
            }else {
                result = false;
                Console.WriteLine("Not anagram");
            }
            return result;
        }        
    }
}
