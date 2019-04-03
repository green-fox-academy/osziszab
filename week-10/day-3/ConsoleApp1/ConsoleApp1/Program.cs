using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.IO;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            String Path = @"C:\Users\Szabi\greenfox\osziszab\week-10\day-3\ConsoleApp1\ConsoleApp1\SW.txt";
            bool isSucces = CopyFileToAnother(Path);
            Console.WriteLine("Result of copying: " + isSucces);
        }

        public static bool CopyFileToAnother(String originalPath) {
            bool result;
            string targetPath = @"C:\Users\Szabi\greenfox\osziszab\week-10\day-3\ConsoleApp1\ConsoleApp1\newFile.txt";
            List<string> lines = new List<string>();
            List<string> newFilesLines = new List<string>();
            try{
                lines = File.ReadAllLines(originalPath).ToList<string>();
                File.WriteAllLines(targetPath, lines);
                newFilesLines = File.ReadAllLines(targetPath).ToList<string>();                
            }

            catch (Exception ex){
                Console.WriteLine(ex.Message);
            }

            if (newFilesLines != null){
                result = true;
            }else{
                result = false;
            }
            //lines.ForEach(Console.WriteLine);       
            return result;
        }

       public static void PlayMainTheme()
        {
            Console.Beep(300, 500);
            Thread.Sleep(50);
            Console.Beep(300, 500);
            Thread.Sleep(50);
            Console.Beep(300, 500);
            Thread.Sleep(50);
            Console.Beep(250, 500);
            Thread.Sleep(50);
            Console.Beep(350, 250);
            Console.Beep(300, 500);
            Thread.Sleep(50);
            Console.Beep(250, 500);
            Thread.Sleep(50);
            Console.Beep(350, 250);
            Console.Beep(300, 500);
            Thread.Sleep(50);
        }
    }
}

