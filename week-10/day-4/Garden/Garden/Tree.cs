using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Garden
{
    class Tree : Plant
    {

        public Tree(String color, double waterNeed, double waterAbsorbtion) : base(color, waterNeed, waterAbsorbtion)
        {
        }
        public override void Status()
        {
            if (waterNeed < 10)
            {
                Console.WriteLine("The " + color + " " + this.GetType().Name + " needs water.");
            }
            else
            {
                Console.WriteLine("The " + color + " " + this.GetType().Name + " doesn't needs water.");
            }
        }
    }
}
