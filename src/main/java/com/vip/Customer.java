
package com.vip;

import java.util.List;

/**
 * Customer information.
 */
public class Customer
{
    private long customerNumber;
    
    /** Personal name. */
    private String firstName;
    
    /** Family name. */
    private String lastName;
    
    /** Middle name(s), if any. */
    private List<String> middleNames;
    
    private transient String a;
    
    private static String b;
    
    private final String c = "C";

    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerId) {
        this.customerNumber = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public List<String> getMiddleNames() {
        return middleNames;
    }

    public void setMiddleNames(List<String> middleNames) {
        this.middleNames = middleNames;
    }

    private String getX() {
        return null;
    }
    
    private void setX(String x) {
    }
    
    public static String getY() {
        return null;
    }
    
    public static void setY(String y) {
    }
    
    public String getZ1() {
        return null;
    }
    
    public static void setZ2(String z) {
    }
}