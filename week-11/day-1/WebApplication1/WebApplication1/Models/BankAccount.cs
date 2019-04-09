using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplication1.Models
{
    public class BankAccount
    {
        public string Name { get; set; }
        public double Balance { get; set; }
        public string AnimalType { get; set; }

        public BankAccount(string name, double balance, string anmimalType) {
            this.Name = name;
            this.Balance = Math.Round(balance, 2); 
            this.AnimalType = anmimalType;
        }

    }
}
