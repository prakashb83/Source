using System;
using System.IO;
using System.Linq;
using NUnit.Framework;
using Xamarin.UITest;
using Xamarin.UITest.Queries;
using Xamarin.UITest.Android;
//using my_app;

namespace my_app.Tests
{
    [TestFixture]
    public class Tests
    {
        AndroidApp app;

        [SetUp]
        public void BeforeEachTest()
        {
            // TODO: If the Android app being tested is included in the solution then open
            // the Unit Tests window, right click Test Apps, select Add App Project
            // and select the app projects that should be tested.
            app = ConfigureApp
                .Android
                // TODO: Update this path to point to your Android app and uncomment the
                // code if the app is not included in the solution.
                .ApkFile("../../../my_app/bin/Debug/my_app.my_app.apk")
                .EnableLocalScreenshots()
                .StartApp();
        }

        [Test]
        public void AppLaunches()
        {           
            app.Screenshot("Hello World, Click Me!");
            app.Tap("MyButton");
            // app.Repl();


        }
        [Test]
        public void ButtonClicked()

        {

            app.Tap(c => c.Marked("MyButton"));

            //MainActivity mact = new MainActivity();

            //AppResult[] results = app.Query(MyButton);

            //app.Screenshot("Button clicked twice.");
            ////int n = mact.GetValue(1);
            //Assert.AreEqual(1, 3);
            app.Screenshot("Hello World, Click Me!");

            //app.Tap("MyButton");
            app.Screenshot("1 clicks");

            //Assert.IsNotNull(app.Query("").Single());
            app.Screenshot("2 clicks");

        }
    }
}


