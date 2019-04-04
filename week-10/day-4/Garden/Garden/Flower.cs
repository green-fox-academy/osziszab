using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Garden 
{
    class Flower : Plant {

        public Flower(String color, double waterNeed, double waterAbsorbtion) : base(color, waterNeed, waterAbsorbtion) { 
        }

        public override void Status(){
            if (waterNeed < 5){
                Console.WriteLine("The " + color + " " + this.GetType().Name + " needs water.");
            }
            else {
                Console.WriteLine("The " + color + " " + this.GetType().Name + " doesn't needs water.");
            }

            
        }
    }
}
