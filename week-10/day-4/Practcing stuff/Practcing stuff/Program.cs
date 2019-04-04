using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practcing_stuff
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = 3;
            int[] arr = { 0, 1, 5, 4 };
            int[] test1 = giveNMaximumValue(n, arr);
            test1.ToList().ForEach(Console.WriteLine);
            int[] arr1 = { 0, 3, 5, 4, 3, 6 };
            int n1 = 2;
            int[] test2 = giveNMaximumValue(n1, arr1);
            Console.WriteLine();
            test2.ToList().ForEach(Console.WriteLine);
        }

        public static int[] giveNMaximumValue(int n, int[] arr)
        {
            int[] result = new int[arr.Length];
            int max = 0;
            int temp = n - 1;
            for (int i = 0; i < arr.Length; i++)
            {
                if (max < arr[i])
                {
                    max = arr[i];
                }
            }
            for (int i = 0; i < arr.Length; i++)
            {
                if (i % temp == 0 && temp != 1)
                {
                    result[i] = arr[i];
                    result[i] *= max;
                }
                else
                {
                    result[i] = arr[i];
                }
                if (temp == 1 && i % 2 == 1)
                {
                    result[i] = arr[i];
                    result[i] *= max;
                }
            }
            return result;
        }
    }
    
}
