using System;
using System.IO;
using System.Linq;
using System.Reflection;
using Android.App;
using Android.OS;
using Xamarin.Android.NUnitLite;

namespace HelloApp.Test
{
    [Activity(Label = "HelloApp.Test", MainLauncher = true, Icon = "@drawable/icon")]
    public class MainActivity : TestSuiteActivity
    {
        protected override void OnCreate(Bundle bundle)
        {
            // tests can be inside the main assembly
            //AddTest(Assembly.GetExecutingAssembly());
            // or in any reference assemblies
            // AddTest (typeof (Your.Library.TestClass).Assembly);

            AddTest(typeof(HelloApp.Test.TestsSample).Assembly);

            // Once you called base.OnCreate(), you cannot add more assemblies.
            base.OnCreate(bundle);
        }

        public int Addition(string txt1, string txt2)
        {
            int result;
            result = (Convert.ToInt32(txt1) + Convert.ToInt32(txt2));

            return result;
        }

        public int Subtraction(string txt1, string txt2)
        {
            int result;
            result = (Convert.ToInt32(txt1) - Convert.ToInt32(txt2));

            return result;
        }
    }
}

