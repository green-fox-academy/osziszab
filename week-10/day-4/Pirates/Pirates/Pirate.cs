using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pirates
{
    class Pirate{

        private int soberLevel;
        private bool isDead;
        private bool isSleep;
        private bool hasParrot;
        private bool captain;

        public Pirate() {
            this.soberLevel = 0;
            this.isDead = false;
            this.isSleep = false;
            this.hasParrot = false;
            this.captain = false;

        }

        public void DrinkSomeRum() {
            if (isDead == false && isSleep == false)
            {
                soberLevel++;
            }
            else if (isDead == true)
            {
                Console.WriteLine("He is dead");
            }
            else {
                Console.WriteLine("He is passed out");
            }                    
        }

        public void HowsItGoingMate() {
            if (soberLevel <= 4 && isSleep==false && isDead== false){
                Console.WriteLine("Pour me anudder!");
            }
            else {
                Console.WriteLine("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                isSleep = true;
            }
        }

        public void Die() {
            if (isDead == false) {
                isDead = true;
            }            
        }

        public void Brawl(Pirate enemy) {
            Random r = new Random();
            int fortune = r.Next(1, 4);

            switch (fortune){
                case 1:
                    if (this.isDead == false && enemy.isDead == false)
                        this.Die();
                        Console.WriteLine("Your pirate died in brawl");
                    break;
                case 2:
                    if (this.isDead == false && enemy.isDead == false)
                        enemy.Die();
                        Console.WriteLine("The other pirate died in brawl");                   
                    break;
                case 3:
                    if (this.isDead == false && enemy.isDead == false)
                        enemy.Die();
                        this.Die();
                        Console.WriteLine("Both of the pirates are dead");
                    break;
            }
        }

        public bool GetCaptain() {
            return captain;
        }

        public int GetSoberLevel() {
            return soberLevel;
        }

        public bool GetIsDead() {
            return isDead;
        }
    }
}
