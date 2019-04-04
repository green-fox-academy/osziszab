using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Garden
{
    class Garden{

        List<Plant> palnts;

        public Garden() {
            this.palnts = new List<Plant>();
            Flower flower1 = new Flower("yellow",0,0.75);
            Flower flower2 = new Flower("blue", 0, 0.75);
            Tree tree1 = new Tree("purple", 0, 0.40);
            Tree tree2 = new Tree("orange", 0, 0.40);
            palnts.Add(flower1);
            palnts.Add(flower2);
            palnts.Add(tree1);
            palnts.Add(tree2);
        }

        public void GiveWater(int water) {
            Console.WriteLine("Watering with " + water);
            int amountWater = water / palnts.Count;
            foreach (Plant plant in palnts){
                plant.SetWaterNeed(plant.GetWaterNeed() + amountWater * plant.GetWaterAbsorption());
            }
        }

        public void PlantStatus(){
            foreach (Plant plant in palnts){
                plant.Status();
            }
        }
    }
}
