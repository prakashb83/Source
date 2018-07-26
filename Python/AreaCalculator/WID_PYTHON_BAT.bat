@ECHO off    
if /I %1 == unittest goto :unittest
if /I %1 == codecoverage goto :codecoverage
if /I %1 == codeanalysis goto :codeanalysis
if /I %1 == securityanalysis goto :securityanalysis


:unittest
python test_area_calculator.py
goto :eof

:codecoverage
coverage run test_area_calculator.py
coverage html
goto :eof

:codeanalysis
pylint area_calculator.py --output-format=json > %2\area_calculator.json
pylint test_area_calculator.py --output-format=json > %2\test_area_calculator.json
cd %2
pylint-json2html -o area_calculator.html area_calculator.json
pylint-json2html -o test_area_calculator.html test_area_calculator.json
copy /b *.html codeanalysis.html
goto :eof

:securityanalysis
bandit area_calculator.py -f html> %2\area_calculator.html
bandit test_area_calculator.py -f html > %2\test_area_calculator.html
cd %2
copy /b *.html securityanalysis.html
goto :eof




