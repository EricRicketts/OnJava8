package org.example.pastry;

import org.example.dessert.Cookie;

public class ChocolateChipCookie extends Cookie {

    public String chomp() {
        return "Chomping the Chocolate Chip Cookie and " + bite();
    }
}
/*
    this is important to understand I can get a grasp of how protected works.  I made the method bite() in Cookie
    to have protected access.  What the developer is communicating with this access modifier is that any class
    that extends the Cookie class has access to the bite method.  So the developer grants this access because
    other developers may want to create a subclass of Cookie in packages outside the dessert package.
*/
