        >10:00 -  11:00 ->  Set interface
        > 11:00 - 11:25 -> Breakout+break
        > 11:25 - 12:30 -> Alerts
        > 12:30 - 12:50 -> Breakout
        > 12:50 - 1:00 -> Recap
        

        

List:
{2,5,4,6,2,7,8,1,6}
get(4)=>2
index value get()

SET:
input :{2,5,4,6,2,7,8,1,6}

output : {2,5,4,6,7,8,1} 
get(4)=>7

index value change so we cannot use get()


Collection: Set
Definition:
The Set interface in Java is a part of the Java Collections Framework.
It represents a collection that cannot contain duplicate elements.
Properties of Set:
No Duplicate Elements: Ensures that each element in the Set is unique.
Unordered Collection: Except for some specific implementations like LinkedHashSet or TreeSet, the Set does not guarantee the order of its elements.
Implementation Classes:
HashSet:
Maintains a random order
LinkedHashSet:
Maintains insertion order of elements.
TreeSet:
Ascii value
Maintains sorted order


collections.sort()=> sameFunction in SET we can get from TreeSET
Why There is No get() in Set:
The Set interface does not have a get() method, and this is by design, due to the following reasons:

Uniqueness Over Indexing: The Set is designed to ensure uniqueness rather than maintain an index-based system like List. Elements in a Set are not accessed by an index.
Undefined Ordering: In most implementations of Set, the order of elements is not fixed. Therefore, retrieving an element by a specific index or position does not make sense.


What is an Alert in Selenium?
An Alert in Selenium WebDriver is a small message box that appears on the screen to give the user information or ask for permission to perform an operation.
It's typically a JavaScript-based window that can show warnings, ask for confirmations, or prompt for information.

Why are Alerts Used?
Alerts are used in web applications to:

Notify users: Provide important information or warnings.
Get confirmations: Confirm user actions before proceeding.
Collect input: Gather information or feedback from users.

Types of Alerts
Modal Alerts: These are traditional JavaScript alerts that are not part of the HTML DOM.
Simple Alert: Displays an information message with an OK button.
Confirmation Alert: Presents a message with OK and Cancel buttons to accept or reject an option.
Prompt Alert: Offers an input field along with OK and Cancel buttons, allowing user input.
Non-Modal Alert (Sweet Alert): These are more modern, customizable alerts that are part of the HTML DOM and can be inspected.
Handling Alerts in Selenium

Focus Transfer: To interact with an alert, Selenium transfers focus to the alert box using driver.switchTo().alert().
Return Type: The return type for this operation is the Alert interface.
Implementation Class: Selenium implements this functionality through the RemoteAlert class.

Alert Interface Actions
accept(): Clicks the 'OK' button on the alert.
dismiss(): Clicks the 'Cancel' button, used for dismissing the alert.
getText(): Retrieves the text displayed on the alert box.
sendKeys(String keysToSend): Sends a string input to the alert, used in prompt alerts.
Special Case: Handling Sweet Alerts
Sweet Alerts are part of the HTML content and can be handled like any other web element. They require standard methods for interacting with web elements, unlike traditional JavaScript alerts.

Exceptions Related to Alerts in Selenium:
NoAlertPresentException: This exception is thrown when an operation is attempted on an alert, but there is no alert present.
UnhandledAlertException: This exception is thrown when there is an alert that Selenium is unable to handle, either because it wasn’t expected, or because the driver cannot interact with it.