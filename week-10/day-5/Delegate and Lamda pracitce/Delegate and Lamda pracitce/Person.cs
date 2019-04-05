using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Delegate_and_Lamda_pracitce
{
    class Person
    {

        private string firstName;
        public string lastName { get; set; }
        private int age;
        private string gender;

        public Person(String firstName, String lastName,int age, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
        }

        

    }
}
