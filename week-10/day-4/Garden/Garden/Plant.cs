using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Garden
{
    abstract class Plant{

        protected String color;
        protected double waterNeed;
        protected double waterAbsorbtion;

        public Plant(String color, double waterNeed, double waterAbsorbtion) {
            this.color = color;
        }

        public abstract void Status();

        public void SetWaterNeed(double newWaterNeed) {
            this.waterNeed=newWaterNeed;
        }

        public double GetWaterNeed() {
            return waterNeed;
        }

        public double GetWaterAbsorption() {
            return waterAbsorbtion;
        }
    }

}
