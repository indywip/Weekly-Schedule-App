package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

// Represents an account having an owner name and weekly class schedule
public class WeeklyClasses {
    private String name;                   // the account owner name
    private ArrayList<MyClass> monday;     // arraylist of daily classes
    private ArrayList<MyClass> tuesday;
    private ArrayList<MyClass> wednesday;
    private ArrayList<MyClass> thursday;
    private ArrayList<MyClass> friday;

    /*
     * REQUIRES: accountName has a non-zero length
     * EFFECTS: name on account is set to accountName;
     *          each arraylist is a day of the week and is initialized as empty;
     */
    public WeeklyClasses(String accountName) {
        // ArrayList<String> initialSchedule
        name = accountName;
        monday = new ArrayList<>();
        tuesday = new ArrayList<>();
        wednesday = new ArrayList<>();
        thursday = new ArrayList<>();
        friday = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSchedule() {
        return toString();
    }

    /*
     * REQUIRES: inputClass is a Class that contains a String
     * MODIFIES: this
     * EFFECTS: inputted class is added to day of the week and updated schedule is returned
     */
    public void addClassMonday(String inputClass) {
        MyClass classClass = new MyClass();
        classClass.setClass(inputClass);
        monday.add(classClass);
    }

    public void addClassTuesday(String inputClass) {
        MyClass classClass = new MyClass();
        classClass.setClass(inputClass);
        tuesday.add(classClass);
    }

    public void addClassWednesday(String inputClass) {
        MyClass classClass = new MyClass();
        classClass.setClass(inputClass);
        wednesday.add(classClass);
    }

    public void addClassThursday(String inputClass) {
        MyClass classClass = new MyClass();
        classClass.setClass(inputClass);
        thursday.add(classClass);
    }

    public void addClassFriday(String inputClass) {
        MyClass classClass = new MyClass();
        classClass.setClass(inputClass);
        friday.add(classClass);
    }

    /*
     * REQUIRES: inputClass is a Class that contains a String and is found in getSchedule()
     * MODIFIES: this
     * EFFECTS: class inputed is removed from day of the week and updated schedule is returned
     */
    public void removeClassMonday(String inputClass) {
        Predicate<MyClass> condition = employee -> employee.retrieveClass().equals(inputClass);
        monday.removeIf(condition);
    }

    public void removeClassTuesday(String inputClass) {
        Predicate<MyClass> condition = employee -> employee.retrieveClass().equals(inputClass);
        tuesday.removeIf(condition);
    }

    public void removeClassWednesday(String inputClass) {
        Predicate<MyClass> condition = employee -> employee.retrieveClass().equals(inputClass);
        wednesday.removeIf(condition);
    }

    public void removeClassThursday(String inputClass) {
        Predicate<MyClass> condition = employee -> employee.retrieveClass().equals(inputClass);
        thursday.removeIf(condition);
    }

    public void removeClassFriday(String inputClass) {
        Predicate<MyClass> condition = employee -> employee.retrieveClass().equals(inputClass);
        friday.removeIf(condition);
    }

    /*
     * EFFECTS: returns a string representation of schedule
     */
    @Override
    public String toString() {
        ArrayList<String> mondayStrings = new ArrayList<>();
        for (int i = 0; i < monday.size(); i++) {
            mondayStrings.add(monday.get(i).retrieveClass());
        }

        ArrayList<String> tuesdayStrings = new ArrayList<>();
        for (int i = 0; i < tuesday.size(); i++) {
            tuesdayStrings.add(tuesday.get(i).retrieveClass());
        }

        ArrayList<String> wednesdayStrings = new ArrayList<>();
        for (int i = 0; i < wednesday.size(); i++) {
            wednesdayStrings.add(wednesday.get(i).retrieveClass());
        }

        ArrayList<String> thursdayStrings = new ArrayList<>();
        for (int i = 0; i < thursday.size(); i++) {
            thursdayStrings.add(thursday.get(i).retrieveClass());
        }

        ArrayList<String> fridayStrings = new ArrayList<>();
        for (int i = 0; i < friday.size(); i++) {
            fridayStrings.add(friday.get(i).retrieveClass());
        }

        return "[ Monday: " + mondayStrings + "\n Tuesday: " + tuesdayStrings
                + "\n Wednesday: " + wednesdayStrings + "\n Thursday: " + thursdayStrings
                + "\n Friday: " + fridayStrings + "]";
    }
}

