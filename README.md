# Shape Hierarchy

## Author

Rodolfo Lopez

## Date

Fall 2021

## Overview

This project implements a shape hierarchy in Java, consisting of various geometric shapes: Circle, Rectangle, and Triangle. These shapes are derived from abstract classes that define common properties and methods.

## Classes

- **Shape**: An abstract base class for all shapes, containing common properties like `name` and methods for area and perimeter.
- **Polygon**: An abstract class extending `Shape`, serving as a base for polygon shapes.
- **Oval**: An abstract class extending `Shape`, serving as a base for oval shapes.
- **Circle**: A concrete class extending `Oval`, representing a circle with methods to calculate area and perimeter.
- **Rectangle**: A concrete class extending `Polygon`, representing a rectangle with methods to calculate area and perimeter.
- **Triangle**: A concrete class extending `Polygon`, representing a triangle with methods to calculate area and perimeter.
- **TestShapes**: A class containing the `main` method to test the functionality of the shape classes.

## Usage

To run the tests, compile all Java files and execute the `TestShapes` class. It will create instances of each shape and print their details, area, and perimeter.
