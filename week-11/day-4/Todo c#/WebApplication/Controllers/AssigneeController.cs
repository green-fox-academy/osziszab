using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using WebApplication.Models;

namespace WebApplication.Controllers
{
    [Route("todo")]
    public class AssigneeController : Controller
    {
        private readonly ApplicationContext applicationContext;

        public AssigneeController(ApplicationContext application)
        {
            applicationContext = application;
        }

        [HttpGet("assigneeLsit")]
        public IActionResult AssigneeList()
        {
            var assignees = applicationContext.Assignees.ToList();
            return View(assignees);
        }

        [HttpGet("addAssignee")]
        public IActionResult CreateAssignee()
        {
            return View();
        }

        [HttpPost("addAssignee")]
        public IActionResult CreateNew(Assignee assignee)
        {
            applicationContext.Add(assignee);
            applicationContext.SaveChanges();
            return Redirect("assigneeLsit");
        }

        [HttpPost("{id}/deleteAssignee")]
        public IActionResult DeleteAssignee(long id)
        {
           Assignee deleteAssignee = applicationContext.Assignees.FirstOrDefault(i => i.Id.Equals(id));
            applicationContext.Remove(deleteAssignee);
            applicationContext.SaveChanges();
            return RedirectToAction("assigneeLsit");
        }

        [HttpGet("{id}/updateAssignee")]
        public IActionResult UpdateAssigneePage(long id)
        {
            Assignee updatingAssignee = applicationContext.Assignees.FirstOrDefault(i => i.Id.Equals(id));
            return View("UpdateAssignee", updatingAssignee);
        }

        [HttpPost("{id}/updateAssignee")]
        public IActionResult UpdateAssginee(Assignee assignee)
        {
            applicationContext.Update(assignee);
            applicationContext.SaveChanges();
            return RedirectToAction("assigneeLsit");
        }
    }
}