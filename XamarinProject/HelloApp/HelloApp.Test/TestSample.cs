using System;
using NUnit.Framework;


namespace HelloApp.Test
{
    [TestFixture]
    public class TestsSample
    {
        MainActivity obj;

        [SetUp]
        public void Setup() {
            obj = new MainActivity();
        }


        [TearDown]
        public void Tear() { }

        [Test]
        public void AdditionTest()
        {
            //Console.WriteLine("test1");
            //obj = new MainActivity();
            string a = "50", b="20";
            int c = obj.Addition(a, b);

            Assert.AreEqual(70, c);
            //Assert.True(true);
        }

        [Test]
        public void SubtractionTest()
        {
            //obj = new MainActivity();
            string a = "30", b = "10";
            int c = obj.Subtraction(a, b);

            Assert.AreEqual(20, c);
            //Assert.False(true);
        }

        //[Test]
        //[Ignore("another time")]
        //public void Ignore()
        //{
        //    Assert.True(false);
        //}

        //[Test]
        //public void Inconclusive()
        //{
        //    Assert.Inconclusive("Inconclusive");
        //}
    }
}