using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplication.Models
{
    public class Todo
    {
        public long Id { get; set; }
        public string Title { get; set; }
        public bool IsUrgent { get; set; }
        public bool IsDone { get; set; }

        public Todo(string Title,bool IsUrgent,bool IsDone) {
            this.Title = Title;
            this.IsUrgent = false;
            this.IsDone = false;
        }

        public Todo() {
        }
    }
}
