using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using WebApplication.Models;

namespace WebApplication
{
    public class ApplicationContext : DbContext
    {

        public DbSet<Todo>Todos { get; set; }
        public ApplicationContext(DbContextOptions options) : base(options)
        {

        }
    }
}
