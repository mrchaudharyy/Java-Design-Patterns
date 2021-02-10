What is Builder Design Pattern?
 -> If we have a complex logic to build an object that involve multiple objects creation steps.

    Assume, our User object has following 5 attributes i.e. firstName, lastName, age, phone and address.

    In normal practice, if you want to make a immutable User class,
    then you must pass all five information as parameters to constructor.

    Now what if only firstName and lastName are mandatory and rest 3 fields are optional.
    Problem !! We need more constructors.

    We will need some more like above. Still can manage? Now let’s introduce our sixth attribute i.e. salary.
    Now it is problem.

    One way it to create more constructors, and another is to loose the immutability and introduce setter methods.
    You choose any of both options, you loose something, right?

    Here, builder pattern will help you to consume additional attributes while retaining the immutability of User class.
