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
add_executable(SquareRootPackage/main  src/main.cpp)
add_executable(UnitTest src/test.cpp)
target_link_libraries(UnitTest ${GTEST_LIBRARIES} pthread)
file(MAKE_DIRECTORY Reports)
ADD_CUSTOM_TARGET (UnitTest1 
                COMMAND  mkdir Reports/BuildsUnittestReport
		COMMAND ./UnitTest --gtest_output="xml:Reports/BuildsUnittestReport/report.xml"
)
         

ADD_CUSTOM_TARGET(CodeAnalysis
                 COMMAND  mkdir Reports/BuildsStaticCodeAnalysisReport
                 COMMAND  cppcheck --xml --xml-version=2 --check-config --check-library --enable=style,all,warning --report-progress    src/*.cpp  2>cppcheck.xml
                  COMMAND cppcheck-htmlreport --file=cppcheck.xml --report-dir=Reports/BuildsStaticCodeAnalysisReport  --source-dir=.

 

)
ADD_CUSTOM_TARGET(CodeCoverage
                COMMAND  mkdir Reports/BuildsCodeCoverage
                COMMAND g++ -o utest -fprofile-arcs -ftest-coverage src/test.cpp -L /usr/lib  -I/usr/include -lgtest -lgtest_main
                COMMAND   ./utest 
                COMMAND gcov  test.cpp
		COMMAND cat   test.cpp.gcov
		COMMAND lcov --capture --directory . --output-file main.info
		COMMAND  genhtml main.info --output-directory Reports/BuildsCodeCoverage


)

