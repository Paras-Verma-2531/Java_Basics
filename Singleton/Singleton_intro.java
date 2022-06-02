package Singleton;
public class Singleton_intro {
    /*
    Singleton class can be defined as a class for which we are allowed to create only one object. These classes have private
    constructor and public factory method which are used for temporary purpose.
    some examples are::
    Runtime class
    ServiceLocator
    BusinessDelegate
    ::Need of Singleton class---->
    if several people have the same requirement, no need to create separate object, better to create one and use its reference for all.
    ::better memory management
    ::performance is improved
             ----this is the central idea for Singleton classes---
             Singleton classes can't be created using public constructor[becoz if one can call cons. he can create as many objects he wants]
             therefore factory methods are used to create object for singleton class
             eg:getRuntime()[factory method]

     */
}
