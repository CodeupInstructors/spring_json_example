# Using Json Example

This application is an example of using json responses in Spring.

There is a class, `Computer`, that represents an object that might come
from the database, in this application we will just be using hardcoded objects.

The two controllers, `ExapmleController` and `JsonController`, have almost the
exact same functionality, but achieved in two different ways with two different
sets of routes.

See the comments in the individual classes for more details.

After running the application, you will be able to visit the following routes
and see json responses:

- `/computers` or `/machines`: a list of `Computer` objects
- `/computers/1` or `/machines/42`: a single `Computer` object
