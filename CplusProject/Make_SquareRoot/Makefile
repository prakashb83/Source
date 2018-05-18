CC=g++
CFLAGS=-c -Wall
CFLAG = $(CPPSTD) -Wall -g -DLINUX -DSYSTEM_TYPE_LINUX -fPIC 

SRCS = $(wildcard ./*.cpp)

OBJS = $(SRCS:.cpp=.o)

LDFLAGS := -lpthread -lgtest -L/usr/include

# Standard all target
all: Squareroot

Squareroot : Squarerootfunc.o test.o main.o execute testexecute

main.o: src/main.cpp
	  $(CC) $(CFLAGS) src/main.cpp
	  
Squarerootfunc.o: src/Squarerootfunc.cpp
	  $(CC) $(CFLAGS) src/Squarerootfunc.cpp
	 
test.o: src/test.cpp
	  $(CC) $(CFLAGS) src/test.cpp

execute: main.o
	$(CC) $(CFLAG)  -o SquareRootPackage/executable main.o
	
testexecute: test.o
	$(CC) $(CFLAG)  -o Utest test.o $(LDFLAGS)

.PHONY: CodeAnalysis

.PHONY: UnitTest
	
CodeAnalysis:
	mkdir Reports/BuildsStaticCodeAnalysisReport
	cppcheck --enable=all --inconclusive --xml-version=2  src  ./ 2> ./cppcheck.xml
	cppcheck-htmlreport --file=cppcheck.xml --report-dir=Reports/BuildsStaticCodeAnalysisReport --source-dir=.
	cp cppcheck.xml Reports/BuildsStaticCodeAnalysisReport
	touch  Reports/BuildsStaticCodeAnalysisReport/CodeAnalysisReport.html
	cp  Reports/BuildsStaticCodeAnalysisReport/index.html Reports/BuildsStaticCodeAnalysisReport/CodeAnalysisReport.html
	
UnitTest:
	mkdir Reports
	mkdir Reports/BuildsUTCResults
	./UTest --gtest_output="xml:Reports/BuildsUTCResults/report.xml"
	chmod 777 CPPTestReportsToHtml/scripts/genHtmlReportFromGtest.py
	chmod 777 CPPTestReportsToHtml/scripts/traverseCollection.py
	./CPPTestReportsToHtml/scripts/genHtmlReportFromGtest.py  "Reports/BuildsUTCResults/index.html" "Reports/BuildsUTCResults/report.xml"
	cp CPPTestReportsToHtml/html_resources/*.* Reports/BuildsUTCResults
	
 

#clean: 
#	rm -rf *o Squareroot
	
	


