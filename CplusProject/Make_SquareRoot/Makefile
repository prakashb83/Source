CC=g++
CFLAGS=-c -Wall

# Standard all target
all: Squareroot

Squareroot : Squarerootfunc.o test.o main.o

main.o: src/main.cpp
	  $(CC) $(CFLAGS) src/main.cpp
	  
Squarerootfunc.o: src/Squarerootfunc.cpp
	  $(CC) $(CFLAGS) src/Squarerootfunc.cpp
	 
test.o: src/test.cpp
	  $(CC) $(CFLAGS) src/test.cpp
	  
#clean: 
#	rm -rf *o Squareroot
	
	


