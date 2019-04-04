using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pirates
{
    class Ship {

        private List<Pirate> pirates;

        public Ship() {
            this.pirates = new List<Pirate>();
        }

        public void FillShip(Pirate pirate) {
            int captains = CaptainCounter();
            while (captains == 1) {
                pirates.Add(pirate);          
            }
            if (captains == 1 && pirate.GetCaptain().Equals(false)) {
                pirates.Add(pirate);
            }     
        }

        public int CaptainCounter() {
            int result = 0;
            foreach(Pirate pirate in pirates){
                if (pirate.GetCaptain().Equals(true)) {
                    result++;
                }
            }
            return result;
        }

        public int CaptainStatus() {
            int drunkLevel = 0;
            foreach (Pirate pirate in pirates){
                if (pirate.GetCaptain().Equals(true)){
                    pirate.HowsItGoingMate();
                    drunkLevel = pirate.GetSoberLevel();
                }
            }            
            return drunkLevel;
        }

        public int GetAlivePirates() {
            int aliveCounter = 0;
            foreach (Pirate pirate in pirates {
                if (pirate.GetIsDead().Equals(false)) {
                    aliveCounter++;
                }
            }
            Console.WriteLine(aliveCounter + "Pirates found alive");
            return aliveCounter;
        }

        public bool Battle(Ship otherShip) {
            Random r = new Random();
            int fortune = r.Next(1, 4);
            bool win;
            int ourLosses = r.Next(1, pirates.Count);
            int theirLosses = r.Next(1, otherShip.GetPirates().Count);
            int ourScore = this.GetAlivePirates() - this.CaptainStatus();
            int TheirScore = otherShip.GetAlivePirates() - otherShip.CaptainStatus();

            if (ourScore > TheirScore){
                win = true;
                for (int i = 0; i < theirLosses; i++){
                    otherShip.GetPirates()[i].Die();
                }
            }
            else {
                win = false;
                for (int i = 0; i < theirLosses; i++){
                    pirates[i].Die();
                }
            }
            return win;
        }

        public List<Pirate> GetPirates() {
            return pirates;
        }
    }
}
