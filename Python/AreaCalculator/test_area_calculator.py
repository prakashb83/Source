import unittest
from pyunitreport import HTMLTestRunner
from math import pi
from area_calculator import Area
 
class TestCalc(unittest.TestCase):
    def setUp(self):
        self.a1 = Area()
		
    def test_square(self):
       self.assertAlmostEqual(self.a1.square(5), 25)
	  
    def test_rectangle(self):
       self.assertAlmostEqual(self.a1.rectangle(5, 5), 25)	  
	   
    def test_triangle(self):
       self.assertAlmostEqual(self.a1.triangle(5, 5), 12.5)

    def test_parallelogram(self):
       self.assertAlmostEqual(self.a1.parallelogram(5 ,5), 25)

    def test_trapezoid(self):
       self.assertAlmostEqual(self.a1.trapezoid(5 ,5 ,2), 10)

    def test_circle(self):
       self.assertAlmostEqual(self.a1.circle(5), pi*5**2)	   
	   
if __name__ == '__main__':
    unittest.main(testRunner=HTMLTestRunner(output='UnitTest'))
