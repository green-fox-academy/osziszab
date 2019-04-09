using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    [Route("")]
    public class BankAccountController : Controller
    {
        [HttpGet("show")]
        public IActionResult Account() {
            BankAccount bankAccount = new BankAccount("Pumba",100,"pig");
            return View(bankAccount);
        }

        [HttpGet("enjoy")]
        public IActionResult Enjoy() {
            return View();
        }

        [HttpGet("allAccount")]
        public IActionResult AllAccount() {
            BankAccounts bankAccounts = new BankAccounts();
            return View(bankAccounts);
        }
      
    }
}