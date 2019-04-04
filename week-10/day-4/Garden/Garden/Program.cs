using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Garden
{
    class Program
    {
        static void Main(string[] args)
        {
            Garden garden = new Garden();
            garden.PlantStatus();
            garden.GiveWater(40);
            garden.PlantStatus();
            garden.GiveWater(70);
            garden.PlantStatus();

            Console.ReadKey();
        }
    }
}
