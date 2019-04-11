using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplication.Models
{
    public class Assignee
    {
        public long Id { get; set; }
        public string Email  { get; set; }
        public string Name { get; set; }

        public Assignee(string eamil, string name) {
            this.Email = eamil;
            this.Name = name;
        }

        public Assignee() {

        }
    }
}
