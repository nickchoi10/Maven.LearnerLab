package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.*;

 abstract class People <E extends Person> implements Iterable<E>{
    List<E> personList;
    Person person;

//    public People(Person person){
//    this.person = person;
//    }

    public void add(E person){
        personList.add(person);
    }

    public Person findByID(long id){
        for(E base: personList)
            if(base.getId()==id){
                return base;
        }
        return null;
    }

    public Boolean containsPerson(Person person){
        return personList.contains(person);
    }

    public Boolean removePerson(){
        return personList.remove(person);
    }

    public Person removePersonById(long id){
       for(int i=0; i < personList.size(); i++){
           if(personList.get(i).getId()==id){
               return personList.remove(i);
           }
       }
       return null;
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

//    public ArrayList toArray(){
//        ArrayList<Person> newList = new ArrayList<Person>((Collection<? extends Person>) Arrays.asList(personList));
//        return newList;
//    }

    public abstract E[] toArray();


    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
