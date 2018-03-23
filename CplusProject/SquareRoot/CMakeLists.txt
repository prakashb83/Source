cmake_minimum_required(VERSION 2.6)

project(SquareRoot)
set(CMAKE_BUILD_TYPE Release)
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY SquareRootPackage)
set(CMAKE_ARCHIVE_OUTPUT_DIRECTORY SquareRootPackage)
set(CMAKE_RUNTIME_OUTPUT_DIRCTORY SquareRootPackage)
include_directories(include Package)
file(GLOB SOURCES "src/main.cpp")
#file(GLOB SOURCES1 )
add_library(SquareRootMainS SHARED ${SOURCES})

add_library(SquareRootMainA STATIC ${SOURCES})

install(TARGETS SquareRootMainS DESTINATION /usr/lib)

install(TARGETS SquareRootMainA DESTINATION /usr/lib)

add_library(SquareRootS SHARED src/Squarerootfunc.cpp)

add_library(SquareRootA STATIC src/Squarerootfunc.cpp)

install(TARGETS SquareRootS DESTINATION /usr/lib)

install(TARGETS SquareRootA DESTINATION /usr/lib)

# Locate GTest
find_package(GTest REQUIRED)
include_directories(${GTEST_INCLUDE_DIRS})

# Link runTests with what we want to test and the GTest and pthread library
add_executable(SquareRootPackage/executable  src/main.cpp)
add_executable(UTest src/test.cpp)
target_link_libraries(UTest ${GTEST_LIBRARIES} pthread)
file(MAKE_DIRECTORY Reports)
ADD_CUSTOM_TARGET (UnitTest 
                COMMAND  mkdir Reports/BuildsUTCResults
		COMMAND ./UTest --gtest_output="xml:Reports/BuildsUTCResults/report.xml"
                COMMAND chmod 777 CPPTestReportsToHtml/scripts/genHtmlReportFromGtest.py
                COMMAND chmod 777 CPPTestReportsToHtml/scripts/traverseCollection.py
                COMMAND  ./CPPTestReportsToHtml/scripts/genHtmlReportFromGtest.py  "Reports/BuildsUTCResults/index.html" "Reports/BuildsUTCResults/report.xml"
                COMMAND cp CPPTestReportsToHtml/html_resources/*.* Reports/BuildsUTCResults
)
         

ADD_CUSTOM_TARGET(CodeAnalysis
                 COMMAND  mkdir Reports/BuildsStaticCodeAnalysisReport
                 COMMAND  cppcheck --enable=all --inconclusive --xml-version=2  src  ./ 2> ./cppcheck.xml
                 COMMAND cppcheck-htmlreport --file=cppcheck.xml --report-dir=Reports/BuildsStaticCodeAnalysisReport --source-dir=.
                 COMMAND touch  Reports/BuildsStaticCodeAnalysisReport/checkstyle_report.html
		 COMMAND cp  Reports/BuildsStaticCodeAnalysisReport/index.html Reports/BuildsStaticCodeAnalysisReport/checkstyle_report.html


 

)
ADD_CUSTOM_TARGET(CodeCoverage
                COMMAND  mkdir Reports/BuildsCodeCoverage
                COMMAND g++ -o CCtest -fprofile-arcs -ftest-coverage src/test.cpp -L /usr/lib  -I/usr/include -lgtest -lgtest_main
                COMMAND   ./CCtest 
                COMMAND gcov  test.cpp
		COMMAND cat   test.cpp.gcov
		COMMAND lcov --capture --directory . --output-file main.info
		COMMAND  genhtml main.info --output-directory Reports/BuildsCodeCoverage


)
