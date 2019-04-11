using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebApplication.Models;

namespace WebApplication.Controllers
{
    [Route("todo")]
    public class TodoController : Controller{

        private readonly ApplicationContext applicationContext;

        public TodoController(ApplicationContext application) {
            applicationContext = application;
        }
        
        [HttpGet]
        [Route("")]
        [Route("list")]
        public IActionResult List([FromQuery] string input = "")
        {
            bool done;
            var todos = applicationContext.Todos.ToList();

            if (input.Equals("true", StringComparison.InvariantCultureIgnoreCase))
            {
                done = true;
                return View(todos.Where(i => !i.IsDone).ToList());
            };

            if (input.Equals("false", StringComparison.InvariantCultureIgnoreCase))
            {
                done = false;
                return View(todos.Where(i => i.IsDone).ToList());

            };
            return View(todos);
        }

        [HttpGet("add")]
        public IActionResult Create() {
            return View();
        }

        [HttpPost("add")]
        public IActionResult CreateNew(Todo todo) {
            applicationContext.Add(todo);
            applicationContext.SaveChanges();
            return Redirect("list");
        }

        [HttpPost("{id}/delete")]
        public IActionResult DeleteTodo(long id) {
            Todo deleting = applicationContext.Todos.FirstOrDefault(i => i.Id.Equals(id));
            applicationContext.Remove(deleting);
            applicationContext.SaveChanges();
           return RedirectToAction("List");
        }

        [HttpGet("{id}/update")]
        public IActionResult UpdateTodoPage(long id) {
            Todo updating = applicationContext.Todos.FirstOrDefault(i => i.Id.Equals(id));
            return View("UpdateTodoPage",updating);
        }

        [HttpPost("{id}/update")]
        public IActionResult UpdateTodo(Todo todo) {
            applicationContext.Update(todo);
            applicationContext.SaveChanges();
            return RedirectToAction("List");
        }

        [HttpPost]
        [Route("")]
        [Route("list")]
        public IActionResult SerachBar(string szar) {
            List<Todo> result = applicationContext.Todos.Where(i => i.Description.Equals(szar) || i.Title.Equals(szar)).ToList();
            return View("SearchBarResult",result);
        }
    }
}