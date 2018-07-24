import sys
from math import pi

class Area():
	def square(self, a):
		self.a = a
		return self.a**2

	def rectangle(self, l, w):
		self.l = l
		self.w = w
		return self.l*self.w

	def triangle(self, b, h):
		self.b = b
		self.h = h
		return 0.5*self.b*self.h

	def parallelogram(self, b, h):
		self.b = b
		self.h = h
		return self.b*self.h
		
	def trapezoid(self, b1, b2, h):
		self.b1 = b1
		self.b2 = b2
		self.h = h
		return 0.5*(self.b1+self.b2)*self.h
		
	def circle(self, r):
		self.r = r
		return pi* self.r**2


		
if __name__ == "__main__":
	choice = int(sys.argv[1])

	a1 = Area()
	are = 4
	if choice == 1:       
		a = int(sys.argv[2])
		A = a1.square(a)
		print("Area of Square : ", A)
	elif choice == 2:
		l = int(sys.argv[2])
		w = int(sys.argv[3])
		A = a1.rectangle(l, w) 
		print("Area of Rectangle : ", A)	
	elif choice == 3:
		b = int(sys.argv[2])
		h = int(sys.argv[3])
		A = a1.triangle(b, h) 
		print("Area of Triangle : ", A)	
	elif choice == 4:
		b = int(sys.argv[2])
		h = int(sys.argv[3])
		A = a1.parallelogram(b, h)
		print("Area of Parallelogram : ", A)
	elif choice == 5:
		b1 = int(sys.argv[2])
		b2 = int(sys.argv[3])
		h = int(sys.argv[4])
		A = a1.trapezoid(b1, b2, h) 
		print("Area of Trapezoid : ", A)	
	elif choice == 6:
		r = int(sys.argv[2])
		A = a1.circle(r)  
		print("Area of Circle : ", A)



