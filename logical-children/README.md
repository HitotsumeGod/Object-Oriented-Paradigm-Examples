An issue that comes up constantly for the object-oriented designer is that of how to construct and maintain a containing class.
A containing class is one that encapsulates within it the logic of another class (an 'exterior class').
Here we illustrate two different paradigms of designing containing classes:
1. Inheritance: Implement the exterior class as non-final, and then implement the containing class as extending the former. With this paradigm, the containing class might be more appropriately termed a descendant class, as it obtains the logic in a manner not demanding any particular state from the exterior class.
2. Containment: Furnish within the containing class an object of the exterior class, and direct all logical calls required to said object.
