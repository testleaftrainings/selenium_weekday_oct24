
        >10:00 -  10:30 ->  Screenshotshot
        > 10:30 - 10:45 -> Breakout+break
        > 10:45 - 11:15 -> Constructor
        > 11:15 - 11:45 -> Encapsulation
        > 11:45 - 12:00 -> Breakout+break
        > 12:00-   12:45-->POM Introduction
        >12:45-1:00     ->Breakout



        CONSTRUCTOR:
        -----------
        *A Constructor is a special type of method used to initialize newly created objects.
        *It is called automatically at the time of object creation and can be used to set initial values for object attributes.

        Types
        -----
        Default Constructor:
        -------------------
        *Automatically provided by the compiler if no constructors are defined.
        *initialize member variables to default values(0,null,false,etc).
        *Has no parameters.
        Parameterized Constructors:
        --------------------------
        *defined by the programmer
        *Allows passing the parameters to set initial values for object attributes.
        *Helps in creating objects with specific states.

        ConstructorOverloading
        ----------------------
        *Refers to define the multiple constructors within the same class with different parameters.
        *Enables creating objectsin different was ,depending on the information available at object creation.

        Constructor chaining
        --------------------
        * process of calling one constructor from another constructor within the class.
        *Acheived using this() and super()calls.

        ENCAPSULATION:
        --------------
        *To hide the datamembers of the class.
        *it is also called as data binding,it binds the fields and methods together.

        PageObjectModel-Introduction
        -----------------------------
        LOgin page
            enterusernam
            enterpassword
            click LOgin
        welcomepage
             click on crmsfalink
        myhomepage
            click LinkedHashSet
        my leads
            click createlead
            findsleads
            mergeleads
        cerateleadpage
            enter companyname
            enterfirstname
            enterlastname
            click createlead
        viewleads
           verify leads


           steps to start with thePOM:
           1.create a new project
           2.create 3 packages 1)base--->psm class--->make the driver to be static,annaotate with before and after methods
                                2)page--->6pages--->provide methods for each page
                                3)testcases-->create metod and calling the methods of the pages,annaotate with the @test

