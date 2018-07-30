@ECHO off    
if /I %1 == unittest goto :unittest
if /I %1 == codecoverage goto :codecoverage
if /I %1 == codeanalysis goto :codeanalysis
if /I %1 == securityanalysis goto :securityanalysis
if /I %1 == sonar goto :sonar

:unittest
python AreaCalculator\test_area_calculator.py
goto :eof

:codecoverage
coverage run AreaCalculator\test_area_calculator.py
coverage html
goto :eof

:codeanalysis
pylint AreaCalculator\area_calculator.py --output-format=json > %2\area_calculator_ca.json
pylint AreaCalculator\test_area_calculator.py --output-format=json > %2\test_area_calculator_ca.json
cd %2
pylint-json2html -o area_calculator_ca.html area_calculator_ca.json
pylint-json2html -o test_area_calculator_ca.html test_area_calculator_ca.json
copy /b *.html CodeAnalysisReport.html
goto :eof

:securityanalysis
bandit AreaCalculator\area_calculator.py -f html> %2\area_calculator_sa.html
bandit AreaCalculator\test_area_calculator.py -f html > %2\test_area_calculator_sa.html
cd %2
copy /b *.html Report.html
goto :eof

:sonar 
cd %2
xcopy  %2\sonar-project.properties %2\%3
cd %3
nosetests --with-xunit
coverage run test_area_calculator.py
coverage xml
goto :eof 


