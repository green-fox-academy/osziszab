using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplication1.Models
{
    public class BankAccounts
    {
        public List<BankAccount> bankAccounts { get; set; }
         

        public BankAccounts() {
            this.bankAccounts =  new List<BankAccount>();
            bankAccounts.Add(new BankAccount("Bug", 60, "bug"));
            bankAccounts.Add(new BankAccount("Simba", 600, "lion"));
            bankAccounts.Add(new BankAccount("Scar", 700, "lion"));
            bankAccounts.Add(new BankAccount("Timon", 60, "surikata"));
            bankAccounts.Add(new BankAccount("Mufasa", 100, "lion"));
        }
    }
}
