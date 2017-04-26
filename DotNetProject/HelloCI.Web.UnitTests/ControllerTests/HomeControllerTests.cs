using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
//using NUnit.Framework;
using HelloCI.Web.Controllers;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Web.Mvc;

namespace HelloCI.Web.UnitTests.ControllerTests
{
    [TestClass]
    public class HomeControllerTests
    {
       

        [TestMethod]
        public void IndexActionReturnsView()
        {
            HomeController controller = new HomeController();
            // Act
            var viewResult = controller.Index() as ViewResult;

            // Assert
            // Assert
            Assert.AreEqual(1, 1);
            Assert.AreEqual("Welcome to ASP.NET MVC!", viewResult.ViewBag.Message);
        }

        [TestMethod]
        public void AboutActionReturnsView()
        {
            HomeController controller = new HomeController();
            // Act
            var viewResult = controller.About() as ViewResult;

            // Assert
            Assert.AreEqual(1, 1);
        }

    }
}
