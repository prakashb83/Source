from distutils.core import setup
import setuptools

setup(
    name='AreaCalculator',
    version='0.1dev',
    license='Creative Commons Attribution-Noncommercial-Share Alike license',
	packages=setuptools.find_packages(),
    long_description=open('README.txt').read(),
	# setup_requires=['nexus_uploader'],
)