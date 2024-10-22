
   10:00 to 10:30 -> Absolute Xpath
 > 10.30 to 11.30 -> Relative Xpath
 > 11:30 to 11.50 -> Breakout+Break 
 > 11.50 to 12:30 -> Advanced Xpath
 > 12:30 to 12:40 -> Breakout
 > 12.40 to  1.00 -> Implicit wait,thread.sleep




Definition and Structure:

Absolute XPath: It starts from the root (html) and traverses down to the desired element, detailing every single element in the hierarchy. The path starts with a single forward slash /, indicating the root. For example: /html/body/div[2]/div[2]/div/form/p[1]/input. `.
Relative XPath: It starts from anywhere within the document and typically focuses on identifying elements based on attributes, indexes, or specific tags, not necessarily detailing the entire path from the root. It starts with a double forward slash //, indicating the search can begin anywhere. For example: //input[@id=‘username’].
Robustness:

Absolute XPath: It is less robust because if there are any changes in the path or structure of the web page, the XPath would break, leading to failed element location.
Relative XPath: It is more robust as it usually focuses on specific attributes or elements, making it less susceptible to changes in the overall structure of the webpage.
Length and Complexity:

Absolute XPath: These tend to be longer . They map the entire path from the root to the element, making them more complex.
Relative XPath: They are generally shorter and more concise, targeting specific elements directly without detailing the entire path, reducing complexity.
Flexibility and Use Cases:

Absolute XPath: It's less commonly used in dynamic web environments where page structures can change frequently.
Relative XPath: More commonly used in web automation and scraping because of its adaptability to web page changes and ability to precisely target elements.
Performance:

Absolute XPath: It can be slower in performance as it requires traversing the entire hierarchy of the DOM (Document Object Model) from the root.
Relative XPath: Generally offers better performance as it allows for more direct queries and doesn't necessarily traverse from the root.
Relative Xpath:

a.Basic xpath

Attribute based xPath: Syntax: //tagname[@attributename='attributeValue'] 

Text based xPath: Syntax: //tagname[text()='textvalue'] 

Partial Attribute based xpath: Syntax: //tagname[contains(@attributename,'partialattributevalue')] 

Partial Text based xpath:
Syntax: //tagname[contains(text(),'partialtextvalue')]  

Index based xpath: Syntax: (//tagname[@attributename='attributeValue'])[2]

b.Advanced xPath(Axes based xPath)

Parent to Child: Syntax: BasicRelativeXpathforParent/childTagname Example: (//form[@id='login']/p)[2] 

Child to Parent: Syntax:  BasicRelativeXpathforChild/parent::parenttagname Example:  //label[text()='Password']/parent::p //p[@class='top']/parent::form

GrandParent to GrandChild: Syntax: BasicRelativeXpathforGrandParent//grandchildTagname Example: (//form[@id='login']//input)[3] 

GrandChild to GrandParent: Syntax:  BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname
Example: //input[@class='decorativeSubmit']/ancestor::form

ElderCousin to YoungerCousin: Syntax: BasicRelativeXpathforElderCousin/following::youngerCousintagname
Example: `//span[text()='Company Name']/following::input

YoungerCousin to ElderCousin: Syntax: BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname
Example: //input[@id='createLeadForm_firstName']/preceding::input[2] 

ElderSibling to YoungerSibling: Syntax:
BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname Example: //label[text()='Username']/following-sibling::input

YoungerSibling to ElderSibling: Syntax: BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname Example:
//input[@id='username']/preceding-sibling::label
`

Exceptions:
InvalidSelectorException
Definition:
This exception occurs when the format of a given selector is incorrect or unsupported.
Common Causes:
Syntax errors in the selector string.
Handling Tips:
Double-check the syntax of your selector.
NoSuchElementException
Definition:
This exception is thrown when an element could not be found on the page.
It indicates that the search operation did not locate the element within the current webpage.
Common Causes:
The element does not exist on the page at the time of search.
The selector used does not correctly identify the desired element.
The element is not loaded yet due to web page's dynamic loading or delays.
Handling Tips:
Ensure the correctness of the selector.
Use waits ( implicit) to allow time for the element to load.

